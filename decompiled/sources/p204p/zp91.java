package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class zp91 {

    /* JADX INFO: renamed from: a */
    public final String f285027a;

    /* JADX INFO: renamed from: b */
    public final String[] f285028b;

    /* JADX INFO: renamed from: c */
    public final short[] f285029c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceArray f285030d;

    public zp91(String str, String[] strArr, short[] sArr, AtomicReferenceArray atomicReferenceArray) {
        this.f285030d = atomicReferenceArray;
        this.f285027a = str;
        this.f285028b = strArr;
        this.f285029c = sArr;
    }

    public final String toString() {
        return this.f285027a;
    }
}
