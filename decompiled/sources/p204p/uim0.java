package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class uim0 implements dkm0, fkm0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f230734a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f230735b;

    public uim0(ArrayList arrayList, gkm0 gkm0Var) {
        this.f230734a = arrayList;
        this.f230735b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uim0)) {
            return false;
        }
        uim0 uim0Var = (uim0) obj;
        return this.f230734a.equals(uim0Var.f230734a) && this.f230735b.equals(uim0Var.f230735b);
    }

    public final int hashCode() {
        return this.f230735b.hashCode() + (this.f230734a.hashCode() * 31);
    }
}
