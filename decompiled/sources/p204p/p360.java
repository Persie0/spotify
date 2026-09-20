package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class p360 extends r360 {

    /* JADX INFO: renamed from: a */
    public final String f173566a;

    /* JADX INFO: renamed from: b */
    public final by50 f173567b;

    /* JADX INFO: renamed from: c */
    public final List f173568c;

    /* JADX INFO: renamed from: d */
    public final boolean f173569d;

    /* JADX INFO: renamed from: e */
    public final o360 f173570e;

    public p360(String str, by50 by50Var, qf40 qf40Var, boolean z, o360 o360Var) {
        this.f173566a = str;
        this.f173567b = by50Var;
        this.f173568c = qf40Var;
        this.f173569d = z;
        this.f173570e = o360Var;
    }

    @Override // p204p.r360
    /* JADX INFO: renamed from: a */
    public final boolean mo63586a() {
        return this.f173569d;
    }

    @Override // p204p.r360
    /* JADX INFO: renamed from: b */
    public final by50 mo63587b() {
        return this.f173567b;
    }

    @Override // p204p.r360
    /* JADX INFO: renamed from: c */
    public final List mo63588c() {
        return this.f173568c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p360)) {
            return false;
        }
        p360 p360Var = (p360) obj;
        return wj50.m88271j(this.f173566a, p360Var.f173566a) && wj50.m88271j(this.f173567b, p360Var.f173567b) && wj50.m88271j(this.f173568c, p360Var.f173568c) && this.f173569d == p360Var.f173569d && wj50.m88271j(this.f173570e, p360Var.f173570e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77244c((this.f173567b.hashCode() + (this.f173566a.hashCode() * 31)) * 31, 31, this.f173568c), 31, this.f173569d);
        o360 o360Var = this.f173570e;
        return iM77245d + (o360Var == null ? 0 : o360Var.hashCode());
    }
}
