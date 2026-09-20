package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class n461 {

    /* JADX INFO: renamed from: a */
    public final byte[] f150222a;

    public n461(byte[] bArr) {
        this.f150222a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n461) {
            return Arrays.equals(this.f150222a, ((n461) obj).f150222a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f150222a);
    }
}
