package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d7m0 {

    /* JADX INFO: renamed from: a */
    public final String f46240a;

    /* JADX INFO: renamed from: b */
    public final List f46241b;

    public d7m0(String str, List list) {
        this.f46240a = str;
        this.f46241b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7m0)) {
            return false;
        }
        d7m0 d7m0Var = (d7m0) obj;
        return wj50.m88271j(this.f46240a, d7m0Var.f46240a) && wj50.m88271j(this.f46241b, d7m0Var.f46241b);
    }

    public final int hashCode() {
        return this.f46241b.hashCode() + (this.f46240a.hashCode() * 31);
    }
}
