package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class wce {

    /* JADX INFO: renamed from: a */
    public final Object f250024a;

    /* JADX INFO: renamed from: b */
    public final int[] f250025b;

    public wce(List list) {
        this.f250024a = list;
        int[] iArr = new int[list.size() + 1];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            iArr[i2] = iArr[i] + ((rce) it.next()).f197852b;
            i = i2;
        }
        this.f250025b = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final b450 m87723a(int i, b450 b450Var) {
        int i2 = this.f250025b[i];
        return new b450(b450Var.f278778a - i2, b450Var.f278779b - i2, 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final List m87724b() {
        return this.f250024a;
    }

    /* JADX INFO: renamed from: c */
    public final int m87725c() {
        int[] iArr = this.f250025b;
        return iArr[iArr.length - 1];
    }

    /* JADX INFO: renamed from: d */
    public final vce m87726d(int i) {
        if (i < 0 || i >= m87725c()) {
            return null;
        }
        int[] iArr = this.f250025b;
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int iM38556e = edb.m38556e(length, i2, 2, i2);
            if (iArr[iM38556e] > i) {
                length = iM38556e;
            } else {
                i2 = iM38556e + 1;
            }
        }
        int i3 = i2 - 1;
        return new vce(i3, i - iArr[i3]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wce) && this.f250024a.equals(((wce) obj).f250024a);
    }

    public final int hashCode() {
        return this.f250024a.hashCode();
    }
}
