package com.ironyard.repo;

import com.ironyard.data.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by wailm.yousif on 2/27/17.
 */
public interface PersonRepo extends PagingAndSortingRepository<Person, String> {
}
