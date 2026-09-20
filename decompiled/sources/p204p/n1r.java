package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class n1r {

    /* JADX INFO: renamed from: a */
    public final String f149485a;

    /* JADX INFO: renamed from: b */
    public final String f149486b;

    /* JADX INFO: renamed from: c */
    public final String f149487c;

    /* JADX INFO: renamed from: d */
    public final n6f f149488d;

    /* JADX INFO: renamed from: e */
    public final xv41 f149489e;

    /* JADX INFO: renamed from: f */
    public final s1r f149490f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f149491g;

    public n1r(String str, String str2, String str3, n6f n6fVar, xv41 xv41Var, s1r s1rVar, ArrayList arrayList) {
        this.f149485a = str;
        this.f149486b = str2;
        this.f149487c = str3;
        this.f149488d = n6fVar;
        this.f149489e = xv41Var;
        this.f149490f = s1rVar;
        this.f149491g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1r)) {
            return false;
        }
        n1r n1rVar = (n1r) obj;
        return wj50.m88271j(this.f149485a, n1rVar.f149485a) && wj50.m88271j(this.f149486b, n1rVar.f149486b) && wj50.m88271j(this.f149487c, n1rVar.f149487c) && wj50.m88271j(this.f149488d, n1rVar.f149488d) && wj50.m88271j(this.f149489e, n1rVar.f149489e) && this.f149490f.equals(n1rVar.f149490f) && this.f149491g.equals(n1rVar.f149491g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f149485a.hashCode() * 31, 31, this.f149486b), 31, this.f149487c);
        n6f n6fVar = this.f149488d;
        return this.f149491g.hashCode() + s571.m77245d((this.f149490f.hashCode() + ((this.f149489e.hashCode() + ((iM77243b + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31)) * 31)) * 31, 31, false);
    }
}
