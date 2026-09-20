package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class xd21 {

    /* JADX INFO: renamed from: a */
    public final dl31 f260365a;

    /* JADX INFO: renamed from: b */
    public final List f260366b;

    public xd21(dl31 dl31Var, List list) {
        this.f260365a = dl31Var;
        this.f260366b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd21)) {
            return false;
        }
        xd21 xd21Var = (xd21) obj;
        return wj50.m88271j(this.f260365a, xd21Var.f260365a) && wj50.m88271j(this.f260366b, xd21Var.f260366b);
    }

    public final int hashCode() {
        return this.f260366b.hashCode() + (this.f260365a.hashCode() * 31);
    }
}
