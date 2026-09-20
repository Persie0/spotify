package p204p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a3i0 {

    /* JADX INFO: renamed from: a */
    public static final float f11967a = 16;

    /* JADX INFO: renamed from: a */
    public static final long m24629a(String str) {
        byte[] bArr = a7j0.m24943A(str).f106178a;
        if (bArr.length == 8) {
            return ByteBuffer.wrap(bArr).asReadOnlyBuffer().asLongBuffer().get();
        }
        throw new IllegalArgumentException("Invalid folderId, ".concat(str).toString());
    }
}
