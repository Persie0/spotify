package org.msgpack.value;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public interface RawValue extends Value {
    byte[] asByteArray();

    ByteBuffer asByteBuffer();

    String asString();

    String toString();
}
