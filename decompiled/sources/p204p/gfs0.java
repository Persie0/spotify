package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class gfs0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final String f79464a;

    /* JADX INFO: renamed from: b */
    public final String f79465b;

    /* JADX INFO: renamed from: c */
    public final String f79466c;

    /* JADX INFO: renamed from: d */
    public final Set f79467d;

    /* JADX INFO: renamed from: e */
    public final Set f79468e;

    public gfs0(String str, String str2, String str3, Set set, Set set2) {
        this.f79464a = str;
        this.f79465b = str2;
        this.f79466c = str3;
        this.f79467d = set;
        this.f79468e = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfs0)) {
            return false;
        }
        gfs0 gfs0Var = (gfs0) obj;
        return wj50.m88271j(this.f79464a, gfs0Var.f79464a) && wj50.m88271j(this.f79465b, gfs0Var.f79465b) && wj50.m88271j(this.f79466c, gfs0Var.f79466c) && wj50.m88271j(this.f79467d, gfs0Var.f79467d) && wj50.m88271j(this.f79468e, gfs0Var.f79468e);
    }

    public final int hashCode() {
        return this.f79468e.hashCode() + klh.m56830b(s571.m77243b(s571.m77243b(this.f79464a.hashCode() * 31, 31, this.f79465b), 31, this.f79466c), 31, this.f79467d);
    }
}
