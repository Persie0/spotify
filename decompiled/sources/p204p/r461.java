package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class r461 {

    /* JADX INFO: renamed from: a */
    public final byte[] f195668a;

    public r461(byte[] bArr) {
        this.f195668a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m74742a() {
        return this.f195668a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r461)) {
            return false;
        }
        return Arrays.equals(this.f195668a, ((r461) obj).f195668a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f195668a);
    }
}
