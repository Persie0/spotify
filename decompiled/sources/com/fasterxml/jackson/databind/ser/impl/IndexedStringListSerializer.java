package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class IndexedStringListSerializer extends StaticListSerializerBase<List<String>> {
    public static final IndexedStringListSerializer instance = new IndexedStringListSerializer();

    public IndexedStringListSerializer() {
        super(List.class);
    }
}
