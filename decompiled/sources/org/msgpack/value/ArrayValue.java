package org.msgpack.value;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface ArrayValue extends Value, Iterable<Value> {
    Value get(int i);

    Value getOrNilValue(int i);

    @Override // java.lang.Iterable
    Iterator<Value> iterator();

    List<Value> list();

    int size();
}
