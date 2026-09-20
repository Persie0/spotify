package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class h0m {

    /* JADX INFO: renamed from: a */
    public final c3e1 f86313a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f86314b;

    public h0m(c3e1 c3e1Var, ArrayList arrayList) {
        this.f86313a = c3e1Var;
        this.f86314b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0m)) {
            return false;
        }
        h0m h0mVar = (h0m) obj;
        return wj50.m88271j(this.f86313a, h0mVar.f86313a) && this.f86314b.equals(h0mVar.f86314b);
    }

    public final int hashCode() {
        return this.f86314b.hashCode() + (this.f86313a.hashCode() * 31);
    }
}
