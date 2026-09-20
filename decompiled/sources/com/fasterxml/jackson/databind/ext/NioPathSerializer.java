package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import p196j$.nio.file.Path;

/* JADX INFO: loaded from: classes3.dex */
public class NioPathSerializer extends StdScalarSerializer<Path> {
    public NioPathSerializer() {
        super(Path.class);
    }
}
