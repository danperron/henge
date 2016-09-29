package com.kenzan.henge.domain.legacy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.base.MoreObjects;

import java.util.Objects;

import org.junit.Before;
import org.junit.Test;


/**
 * Tests for the {@link LegacyPropertyScopedValue}
 *
 * @author wmatsushita
 */
public class LegacyPropertyScopedValueTest {

    private LegacyPropertyScopedValue entity;  
    
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        
        entity = LegacyPropertyScopedValue.builder("test-key", "test-value").build();
        
    }

    /**
     * Test method for {@link com.kenzan.henge.domain.legacy.LegacyPropertyScopedValue#hashCode()}.
     */
    @Test
    public void testHashCode() {
        
        assertEquals(Objects.hashCode(entity), entity.hashCode());
        
    }

    /**
     * Test method for {@link com.kenzan.henge.domain.legacy.LegacyPropertyScopedValue#getKey()}.
     */
    @Test
    public void testGetKey() {

        assertEquals("test-key", entity.getKey());
        
    }

    /**
     * Test method for {@link com.kenzan.henge.domain.legacy.LegacyPropertyScopedValue#getValue()}.
     */
    @Test
    public void testGetValue() {

        assertEquals("test-value", entity.getValue());
        
    }

    /**
     * Test method for {@link com.kenzan.henge.domain.legacy.LegacyPropertyScopedValue#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObject() {

        final LegacyPropertyScopedValue expectedEntity = LegacyPropertyScopedValue.builder("test-key", "test-value").build();
        
        assertTrue(entity.equals(expectedEntity));
        assertFalse(entity.equals(new Object()));
        assertFalse(entity.equals(null));
        assertFalse(entity.equals(LegacyPropertyScopedValue.builder("some other", "scoped value")));
        
    }

    /**
     * Test method for {@link com.kenzan.henge.domain.legacy.LegacyPropertyScopedValue#toString()}.
     */
    @Test
    public void testToString() {

        final String toString = MoreObjects.toStringHelper(entity)
                        .add("key", entity.getKey())
                        .add("value", entity.getValue())
                        .toString();
        assertEquals(toString, entity.toString());
        
    }

}
