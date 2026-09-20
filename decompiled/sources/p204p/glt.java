package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class glt extends w1h1 {

    /* JADX INFO: renamed from: b */
    public final int f81168b;

    /* JADX INFO: renamed from: c */
    public final String f81169c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f81170d;

    /* JADX INFO: renamed from: e */
    public final sbb0 f81171e;

    /* JADX INFO: renamed from: f */
    public final String f81172f;

    public glt(int i, String str, ArrayList arrayList, sbb0 sbb0Var, String str2) {
        this.f81168b = i;
        this.f81169c = str;
        this.f81170d = arrayList;
        this.f81171e = sbb0Var;
        this.f81172f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glt)) {
            return false;
        }
        glt gltVar = (glt) obj;
        return this.f81168b == gltVar.f81168b && wj50.m88271j(this.f81169c, gltVar.f81169c) && this.f81170d.equals(gltVar.f81170d) && this.f81171e.equals(gltVar.f81171e) && wj50.m88271j(this.f81172f, gltVar.f81172f);
    }

    public final int hashCode() {
        int iHashCode = (this.f81171e.hashCode() + lq51.m59700f(this.f81170d, s571.m77243b(Integer.hashCode(this.f81168b) * 31, 31, this.f81169c), 31)) * 31;
        String str = this.f81172f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
