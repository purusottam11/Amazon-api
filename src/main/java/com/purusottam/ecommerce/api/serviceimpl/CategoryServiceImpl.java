package com.purusottam.ecommerce.api.serviceimpl;

import com.purusottam.ecommerce.api.dto.CategoryRequestDto;
import com.purusottam.ecommerce.api.dto.CategoryResponseDto;
import com.purusottam.ecommerce.api.dto.SubCategoryRequestDto;
import com.purusottam.ecommerce.api.dto.SubCategoryResponseDto;
import com.purusottam.ecommerce.api.exception.BusinessException;
import com.purusottam.ecommerce.api.exception.ErrorCode;
import com.purusottam.ecommerce.api.model.Category;
import com.purusottam.ecommerce.api.model.User;
import com.purusottam.ecommerce.api.repository.CategoryRepository;
import com.purusottam.ecommerce.api.service.CategoryService;
import com.purusottam.ecommerce.api.util.CopyUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public CategoryResponseDto addCategory(CategoryRequestDto categoryRequestDto) {
        categoryRepository.findByName(categoryRequestDto.getName()).ifPresent(
                i -> {
                    throw new BusinessException(ErrorCode.CATEGORY_IS_EXIST + " with the name : " + i.getName());
                }
        );
        Category category = new Category();
        CopyUtils.copySafe(categoryRequestDto, category);
        CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
        CopyUtils.copySafe(categoryRepository.save(category), categoryResponseDto);
        return categoryResponseDto;
    }

    @Override
    public CategoryResponseDto updateCategory(Long categoryId, CategoryRequestDto categoryRequestDto) {
        Category category = categoryRepository.findById(categoryId).orElseThrow(
                () -> new BusinessException(ErrorCode.CATEGORY_NOT_FOUND));
        categoryRepository.findByName(categoryRequestDto.getName()).ifPresent(
                i -> {
                    throw new BusinessException("Category is exist with the category name : " + i.getName());
                }
        );
        CopyUtils.copySafe(categoryRequestDto, category);
        CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
        CopyUtils.copySafe(categoryRepository.save(category), categoryResponseDto);
        return categoryResponseDto;
    }

    @Override
    public CategoryResponseDto getCategory(Long categoryId) {
        Category category = categoryRepository.findById(categoryId).orElseThrow(
                () -> new BusinessException(ErrorCode.CATEGORY_NOT_FOUND));
        CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
        CopyUtils.copySafe(category, categoryResponseDto);
        return categoryResponseDto;
    }

    @Override
    public CategoryResponseDto deleteCategory(Long categoryId) {
        Category category = categoryRepository.findById(categoryId).orElseThrow(
                () -> new BusinessException(ErrorCode.CATEGORY_NOT_FOUND));
        CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
        CopyUtils.copySafe(category, categoryResponseDto);
        categoryRepository.deleteById(categoryId);
        return categoryResponseDto;
    }

    @Override
    public List<CategoryResponseDto> getCategories() {
        List<CategoryResponseDto> list = CopyUtils.copySafe(categoryRepository.findAll(), CategoryResponseDto.class);
        return list;
    }

    @Override
    public SubCategoryResponseDto addSubCategory(SubCategoryRequestDto subCategoryRequestDto) {
        categoryRepository.findByName(subCategoryRequestDto.getName()).ifPresent(
                i -> {
                    throw new BusinessException(ErrorCode.SUB_CATEGORY_IS_EXIST);
                }
        );
        Category category = categoryRepository.findById(subCategoryRequestDto.getParentId()).orElseThrow(
                () -> new BusinessException(ErrorCode.CATEGORY_NOT_FOUND));
        Category subCategory = new Category();
        CopyUtils.copySafe(subCategoryRequestDto, subCategory);
        SubCategoryResponseDto subCategoryResponseDto = new SubCategoryResponseDto();
        CopyUtils.copySafe(categoryRepository.save(subCategory), subCategoryResponseDto);
        return subCategoryResponseDto;
    }

    @Override
    public SubCategoryResponseDto updateSubCategory(Long subCategoryId, SubCategoryRequestDto subCategoryRequestDto) {
        Category subCategory = categoryRepository.findById(subCategoryId).orElseThrow(
                () -> new BusinessException(ErrorCode.CATEGORY_NOT_FOUND));
        categoryRepository.findByName(subCategoryRequestDto.getName()).ifPresent(
                i -> {
                    throw new BusinessException("Sub Category is exist with the name : " + i.getName());
                }
        );
        CopyUtils.copySafe(subCategoryRequestDto, subCategory);
        SubCategoryResponseDto subCategoryResponseDto = new SubCategoryResponseDto();
        CopyUtils.copySafe(categoryRepository.save(subCategory), subCategoryResponseDto);
        return subCategoryResponseDto;
    }

    @Override
    public SubCategoryResponseDto getSubCategory(Long subCategoryId) {
        return null;
    }

    @Override
    public SubCategoryResponseDto deleteSubCategory(Long subCategoryId) {
        return null;
    }

    @Override
    public List<SubCategoryResponseDto> getSubCategories(Long categoryId) {

        return null;
    }


}
