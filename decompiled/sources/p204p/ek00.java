package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class ek00 {

    /* JADX INFO: renamed from: a */
    public final fr50[] f60327a;

    public ek00(fr50[] fr50VarArr) {
        this.f60327a = fr50VarArr;
    }

    /* JADX INFO: renamed from: a */
    public final fr50[] m39244a() {
        return this.f60327a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return ek00.class.equals(obj != null ? obj.getClass() : null) && Arrays.equals(this.f60327a, ((ek00) obj).f60327a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f60327a);
    }
}
