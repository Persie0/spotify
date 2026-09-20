package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class wjm0 implements dkm0, fkm0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f251987a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f251988b;

    public wjm0(ArrayList arrayList, gkm0 gkm0Var) {
        this.f251987a = arrayList;
        this.f251988b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjm0)) {
            return false;
        }
        wjm0 wjm0Var = (wjm0) obj;
        return this.f251987a.equals(wjm0Var.f251987a) && this.f251988b.equals(wjm0Var.f251988b);
    }

    public final int hashCode() {
        return this.f251988b.hashCode() + (this.f251987a.hashCode() * 31);
    }
}
