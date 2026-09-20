package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fjm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final List f70312a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f70313b;

    public fjm0(ArrayList arrayList, gkm0 gkm0Var) {
        this.f70312a = arrayList;
        this.f70313b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjm0)) {
            return false;
        }
        fjm0 fjm0Var = (fjm0) obj;
        return wj50.m88271j(this.f70312a, fjm0Var.f70312a) && wj50.m88271j(this.f70313b, fjm0Var.f70313b);
    }

    public final int hashCode() {
        return this.f70313b.hashCode() + (this.f70312a.hashCode() * 31);
    }
}
