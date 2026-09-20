package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class umx0 {

    /* JADX INFO: renamed from: a */
    public final List f231966a;

    /* JADX INFO: renamed from: b */
    public final gn80 f231967b;

    /* JADX INFO: renamed from: c */
    public final g3m f231968c;

    /* JADX INFO: renamed from: d */
    public final boolean f231969d;

    /* JADX INFO: renamed from: e */
    public final boolean f231970e;

    public umx0(List list, gn80 gn80Var, g3m g3mVar, boolean z, boolean z2) {
        this.f231966a = list;
        this.f231967b = gn80Var;
        this.f231968c = g3mVar;
        this.f231969d = z;
        this.f231970e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umx0)) {
            return false;
        }
        umx0 umx0Var = (umx0) obj;
        return wj50.m88271j(this.f231966a, umx0Var.f231966a) && this.f231967b == umx0Var.f231967b && wj50.m88271j(this.f231968c, umx0Var.f231968c) && this.f231969d == umx0Var.f231969d && this.f231970e == umx0Var.f231970e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f231970e) + s571.m77245d((this.f231968c.hashCode() + ((this.f231967b.hashCode() + (this.f231966a.hashCode() * 31)) * 31)) * 31, 31, this.f231969d);
    }
}
