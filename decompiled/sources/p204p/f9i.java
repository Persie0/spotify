package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class f9i extends nai {

    /* JADX INFO: renamed from: a */
    public final ArrayList f67274a;

    /* JADX INFO: renamed from: b */
    public final d850 f67275b;

    public f9i(ArrayList arrayList, d850 d850Var) {
        this.f67274a = arrayList;
        this.f67275b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9i)) {
            return false;
        }
        f9i f9iVar = (f9i) obj;
        return this.f67274a.equals(f9iVar.f67274a) && wj50.m88271j(this.f67275b, f9iVar.f67275b);
    }

    public final int hashCode() {
        int iHashCode = this.f67274a.hashCode() * 31;
        d850 d850Var = this.f67275b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
