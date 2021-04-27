package com.zhang.springboot.service.impl;

import com.zhang.springboot.entity.Blog;
import com.zhang.springboot.mapper.BlogMapper;
import com.zhang.springboot.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaozhang
 * @since 2021-04-27
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
