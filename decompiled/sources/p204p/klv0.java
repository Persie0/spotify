package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class klv0 {

    /* JADX INFO: renamed from: a */
    public final et71 f123964a;

    /* JADX INFO: renamed from: b */
    public final List f123965b;

    public klv0(et71 et71Var, List list) {
        this.f123964a = et71Var;
        this.f123965b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klv0)) {
            return false;
        }
        klv0 klv0Var = (klv0) obj;
        return wj50.m88271j(this.f123964a, klv0Var.f123964a) && wj50.m88271j(this.f123965b, klv0Var.f123965b);
    }

    public final int hashCode() {
        return this.f123965b.hashCode() + (this.f123964a.hashCode() * 31);
    }

    public /* synthetic */ klv0(et71 et71Var) {
        this(et71Var, lau.f131415a);
    }
}
