package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by RookieWangZhiWei on 2019/2/20.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {

    @Autowired
    private CmsPageRepository cmsPageRepository;

    @Test
    public void testFindPage() {
        int page = 0;
        int size = 10;
        Pageable pageable = PageRequest.of(page, size);
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);

        System.out.println(all);
    }

    @Test
    public void testFindAll() {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();

        exampleMatcher = exampleMatcher.withMatcher("pageAlise",
                ExampleMatcher.GenericPropertyMatchers.contains());

        CmsPage cmsPage = new CmsPage();

        cmsPage.setSiteId("5a751fab6abb5044e0d19ea1");

        cmsPage.setTemplateId("5a962c16b00ffc514038fafd");

        Example<CmsPage> example = Example.of(cmsPage, exampleMatcher);

        Pageable pageable = PageRequest.of(0,10);

        Page<CmsPage> all = cmsPageRepository.findAll(example, pageable);

        System.out.println("___________________" + all);
    }

}