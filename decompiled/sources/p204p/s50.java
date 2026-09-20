package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s50 {

    /* JADX INFO: renamed from: a */
    public final List f205670a;

    /* JADX INFO: renamed from: b */
    public final gn80 f205671b;

    /* JADX INFO: renamed from: c */
    public final boolean f205672c;

    /* JADX INFO: renamed from: d */
    public final f93 f205673d;

    /* JADX INFO: renamed from: e */
    public final boolean f205674e;

    public s50(List list, gn80 gn80Var, boolean z, f93 f93Var, boolean z2) {
        this.f205670a = list;
        this.f205671b = gn80Var;
        this.f205672c = z;
        this.f205673d = f93Var;
        this.f205674e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s50)) {
            return false;
        }
        s50 s50Var = (s50) obj;
        return wj50.m88271j(this.f205670a, s50Var.f205670a) && this.f205671b == s50Var.f205671b && this.f205672c == s50Var.f205672c && wj50.m88271j(this.f205673d, s50Var.f205673d) && this.f205674e == s50Var.f205674e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205674e) + ((this.f205673d.hashCode() + s571.m77245d((this.f205671b.hashCode() + (this.f205670a.hashCode() * 31)) * 31, 31, this.f205672c)) * 31);
    }
}
