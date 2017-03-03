package com.example.util;

import org.junit.Test;

public class PaginationTests {
	
	@Test
	public void test01() {
		Pagination paging = new Pagination();
		
		paging.setTotalItem(4079);
		
		for (int i=1; i<=paging.getTotalPage(); i++) {
			paging.setPageNo(i);
			System.out.println("pageNo=" + paging.getPageNo() +
							   ", isFistGroup=" + paging.isFirstGroup() +
							   ", isLastGroup=" + paging.isLastGroup() +
							   ", firstPage=" + paging.getFirstPage() +
							   ", lastPage=" + paging.getLastPage() +
							   ", firstItem=" + paging.getFirstItem() +
							   ", lastItem=" + paging.getLastItem()
					
					);
		}
	}

	@Test
	public void test02() {
		Pagination paging = new Pagination();
		
		paging.setTotalItem(4079);
		
		for (int i=1; i<=paging.getTotalPage(); i++) {
			paging.setPageNo(i);
			System.out.println(paging);
		}
		
	}
}
