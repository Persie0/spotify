package io.reactivex.rxjava3.internal.util;

/* JADX INFO: loaded from: classes11.dex */
public abstract class Pow2 {
    /* JADX INFO: renamed from: a */
    public static int m23770a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
