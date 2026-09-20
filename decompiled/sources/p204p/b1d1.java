package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class b1d1 implements f1d1 {

    /* JADX INFO: renamed from: a */
    public final byte[] f22299a;

    public b1d1(byte[] bArr) {
        this.f22299a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1d1) && wj50.m88271j(this.f22299a, ((b1d1) obj).f22299a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22299a);
    }
}
