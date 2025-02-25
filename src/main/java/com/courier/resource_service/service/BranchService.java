package com.courier.resource_service.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.courier.resource_service.objects.dto.BranchBaseDto;
import com.courier.resource_service.objects.dto.BranchDto;

public interface BranchService {

  Page<BranchDto> getBranches(Pageable pageable);

  List<BranchBaseDto> getBranchesWithoutPagination();

  List<BranchBaseDto> getBranchesByOfficeId(Long officeId);

  BranchDto getBranchById(Long id);

  BranchDto createBranch(BranchDto branchDto);

  BranchDto updateBranch(Long id, BranchDto branchDto);

  void disabledBranch(Long id);

  Page<BranchDto> searchBranches(String searchQuery, Pageable pageable);
}
