package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class azv0 {

    /* JADX INFO: renamed from: a */
    public final rzd1 f21695a;

    /* JADX INFO: renamed from: b */
    public final List f21696b;

    public azv0(rzd1 rzd1Var, List list) {
        this.f21695a = rzd1Var;
        this.f21696b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azv0)) {
            return false;
        }
        azv0 azv0Var = (azv0) obj;
        return this.f21695a.equals(azv0Var.f21695a) && wj50.m88271j(this.f21696b, azv0Var.f21696b);
    }

    public final int hashCode() {
        return this.f21696b.hashCode() + ((this.f21695a.hashCode() - 218614113) * 31);
    }
}
