package com.github.lonelylockley.archinsight.parse;

import com.github.lonelylockley.archinsight.model.elements.Element;

public interface BuilderBase<T extends Element, K> extends HasType {
    public T build();
    public K withName(String name);
    public K withDescription(String description);
    public K withTechnology(String technology);
}
