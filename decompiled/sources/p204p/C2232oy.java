package p204p;

import java.util.List;

/* JADX INFO: renamed from: p.oy */
/* JADX INFO: loaded from: classes7.dex */
public final class C2232oy implements i10 {

    /* JADX INFO: renamed from: a */
    public final tvi0 f171630a;

    /* JADX INFO: renamed from: b */
    public final List f171631b;

    public C2232oy(tvi0 tvi0Var, List list) {
        this.f171630a = tvi0Var;
        this.f171631b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2232oy)) {
            return false;
        }
        C2232oy c2232oy = (C2232oy) obj;
        return wj50.m88271j(this.f171630a, c2232oy.f171630a) && wj50.m88271j(this.f171631b, c2232oy.f171631b);
    }

    public final int hashCode() {
        return this.f171631b.hashCode() + (this.f171630a.hashCode() * 31);
    }
}
