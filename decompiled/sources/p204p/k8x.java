package p204p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k8x {

    /* JADX INFO: renamed from: a */
    public String f120473a;

    /* JADX INFO: renamed from: b */
    public byte[] f120474b;

    /* JADX INFO: renamed from: c */
    public long f120475c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k8x.class == obj.getClass()) {
            k8x k8xVar = (k8x) obj;
            if (this.f120475c == k8xVar.f120475c && this.f120473a.equals(k8xVar.f120473a) && Arrays.equals(this.f120474b, k8xVar.f120474b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f120474b) + (Objects.hash(this.f120473a, Long.valueOf(this.f120475c)) * 31);
    }
}
