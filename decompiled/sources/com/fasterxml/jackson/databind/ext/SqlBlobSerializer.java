package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.sql.Blob;

/* JADX INFO: loaded from: classes3.dex */
public class SqlBlobSerializer extends StdScalarSerializer<Blob> {
    public SqlBlobSerializer() {
        super(Blob.class);
    }
}
