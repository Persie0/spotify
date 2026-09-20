package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class kwd0 {

    /* JADX INFO: renamed from: a */
    public final long f127080a;

    /* JADX INFO: renamed from: b */
    public final long f127081b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f127082c;

    public kwd0(long j, long j2, ArrayList arrayList) {
        this.f127080a = j;
        this.f127081b = j2;
        this.f127082c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwd0)) {
            return false;
        }
        kwd0 kwd0Var = (kwd0) obj;
        return mu71.m62836c(this.f127080a, kwd0Var.f127080a) && mu71.m62836c(this.f127081b, kwd0Var.f127081b) && this.f127082c.equals(kwd0Var.f127082c);
    }

    public final int hashCode() {
        return this.f127082c.hashCode() + dq60.m36605e(Long.hashCode(this.f127080a) * 31, this.f127081b, 31);
    }
}
