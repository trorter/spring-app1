package io.ledovskikh.andrey;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Andrey Ledovskikh
 */
public abstract class AbstractMusic implements Music{

    @Override
    @PostConstruct
    public void init() {
//        System.out.println("init " + this.getClass());
    }

    @Override
    @PreDestroy
    public void destroy() {
//        System.out.println("destroy " + this.getClass());
    }

}
