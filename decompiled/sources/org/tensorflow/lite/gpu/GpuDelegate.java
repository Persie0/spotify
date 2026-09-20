package org.tensorflow.lite.gpu;

import java.io.Closeable;
import org.tensorflow.lite.annotations.UsedByReflection;
import p204p.dq10;

/* JADX INFO: loaded from: classes14.dex */
@UsedByReflection
public class GpuDelegate implements Closeable {

    /* JADX INFO: renamed from: a */
    public long f10965a;

    @UsedByReflection
    public GpuDelegate(dq10 dq10Var) {
        GpuDelegateNative.m24302a();
        dq10Var.getClass();
        this.f10965a = createDelegate(true, true, 0, null, null, 0);
    }

    private static native long createDelegate(boolean z, boolean z2, int i, String str, String str2, int i2);

    private static native void deleteDelegate(long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.f10965a;
        if (j != 0) {
            deleteDelegate(j);
            this.f10965a = 0L;
        }
    }

    @UsedByReflection
    public GpuDelegate() {
        this(new dq10());
    }
}
