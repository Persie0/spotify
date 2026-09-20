package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class p881 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f174897a;

    /* JADX INFO: renamed from: b */
    public final q881 f174898b;

    public p881(ArrayList arrayList, q881 q881Var) {
        this.f174897a = arrayList;
        this.f174898b = q881Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p881)) {
            return false;
        }
        p881 p881Var = (p881) obj;
        return this.f174897a.equals(p881Var.f174897a) && this.f174898b.equals(p881Var.f174898b);
    }

    public final int hashCode() {
        return this.f174898b.hashCode() + (this.f174897a.hashCode() * 31);
    }
}
