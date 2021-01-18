package com.purusottam.ecommerce.api.service;

import com.purusottam.ecommerce.api.dto.CategoryRequestDto;
import com.purusottam.ecommerce.api.dto.CategoryResponseDto;
import com.purusottam.ecommerce.api.dto.SubCategoryRequestDto;
import com.purusottam.ecommerce.api.dto.SubCategoryResponseDto;
import com.purusottam.ecommerce.api.model.Category;

import java.util.List;

public interface CategoryService {

    CategoryResponseDto addCategory(CategoryRequestDto categoryRequestDto);

    CategoryResponseDto updateCategory(Long categoryId, CategoryRequestDto categoryRequestDto);

    CategoryResponseDto getCategory(Long categoryId);

    CategoryResponseDto deleteCategory(Long categoryId);

    List<CategoryResponseDto> getCategories();

    SubCategoryResponseDto addSubCategory(SubCategoryRequestDto subCategoryRequestDto);

    SubCategoryResponseDto updateSubCategory(Long subCategoryId, SubCategoryRequestDto subCategoryRequestDto);

    SubCategoryResponseDto getSubCategory(Long subCategoryId);

    SubCategoryResponseDto deleteSubCategory(Long subCategoryId);

    List<SubCategoryResponseDto> getSubCategories(Long categoryId);

}
