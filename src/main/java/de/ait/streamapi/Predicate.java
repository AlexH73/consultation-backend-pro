package de.ait.streamapi;

/**
 * ----------------------------------------------------------------------------
 * Author  : Alexander Hermann
 * Created : 18.01.2026
 * Project : Consultation59
 * ----------------------------------------------------------------------------
 */
@FunctionalInterface
public interface Predicate <T> {
    boolean test(T t);
}
