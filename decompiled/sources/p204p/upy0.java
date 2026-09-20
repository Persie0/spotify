package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class upy0 {

    /* JADX INFO: renamed from: a */
    public final int f232843a;

    /* JADX INFO: renamed from: b */
    public final List f232844b;

    /* JADX INFO: renamed from: c */
    public final w2z0 f232845c;

    /* JADX INFO: renamed from: d */
    public final boolean f232846d;

    public upy0(int i, List list, w2z0 w2z0Var, boolean z) {
        this.f232843a = i;
        this.f232844b = list;
        this.f232845c = w2z0Var;
        this.f232846d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upy0)) {
            return false;
        }
        upy0 upy0Var = (upy0) obj;
        return this.f232843a == upy0Var.f232843a && wj50.m88271j(this.f232844b, upy0Var.f232844b) && wj50.m88271j(this.f232845c, upy0Var.f232845c) && this.f232846d == upy0Var.f232846d;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(Integer.hashCode(this.f232843a) * 31, 31, this.f232844b);
        w2z0 w2z0Var = this.f232845c;
        return Boolean.hashCode(this.f232846d) + ((iM77244c + (w2z0Var == null ? 0 : Integer.hashCode(w2z0Var.f247446a))) * 31);
    }
}
