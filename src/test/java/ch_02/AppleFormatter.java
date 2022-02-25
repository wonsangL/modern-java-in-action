package ch_02;

import common.Apple;

@FunctionalInterface
public interface AppleFormatter {
    String format(Apple apple);
}
