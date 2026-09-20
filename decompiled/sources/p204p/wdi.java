package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class wdi {

    /* JADX INFO: renamed from: a */
    public final rl00 f250287a;

    /* JADX INFO: renamed from: b */
    public final List f250288b;

    /* JADX INFO: renamed from: c */
    public final ck90 f250289c;

    /* JADX INFO: renamed from: d */
    public final String f250290d;

    public wdi(rl00 rl00Var, List list, ck90 ck90Var, String str) {
        this.f250287a = rl00Var;
        this.f250288b = list;
        this.f250289c = ck90Var;
        this.f250290d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdi)) {
            return false;
        }
        wdi wdiVar = (wdi) obj;
        return wj50.m88271j(this.f250287a, wdiVar.f250287a) && wj50.m88271j(this.f250288b, wdiVar.f250288b) && wj50.m88271j(this.f250289c, wdiVar.f250289c) && wj50.m88271j(this.f250290d, wdiVar.f250290d);
    }

    public final int hashCode() {
        rl00 rl00Var = this.f250287a;
        int iHashCode = (this.f250289c.hashCode() + s571.m77244c((rl00Var == null ? 0 : rl00Var.hashCode()) * 31, 31, this.f250288b)) * 31;
        String str = this.f250290d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
