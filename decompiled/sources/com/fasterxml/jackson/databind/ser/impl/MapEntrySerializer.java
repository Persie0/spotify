package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude$Include;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MapEntrySerializer extends ContainerSerializer<Map.Entry<?, ?>> {
    public static final Object MARKER_FOR_EMPTY = JsonInclude$Include.NON_EMPTY;
}
