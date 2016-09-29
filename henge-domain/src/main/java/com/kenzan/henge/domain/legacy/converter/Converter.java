package com.kenzan.henge.domain.legacy.converter;


/**
 * Base interface for model converters. 
 *
 * @author wmatsushita
 */
@FunctionalInterface
public interface Converter<T1, T2> {
    
    public T2 convert(T1 model);
    
}
