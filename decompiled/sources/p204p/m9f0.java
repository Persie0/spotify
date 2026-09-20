package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class m9f0 {

    /* JADX INFO: renamed from: a */
    public final i7f0 f141290a;

    /* JADX INFO: renamed from: b */
    public final i7f0 f141291b;

    /* JADX INFO: renamed from: c */
    public final i7f0 f141292c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f141293d;

    /* JADX INFO: renamed from: e */
    public final i7f0 f141294e;

    /* JADX INFO: renamed from: f */
    public final i7f0 f141295f;

    /* JADX INFO: renamed from: g */
    public final i7f0 f141296g;

    /* JADX INFO: renamed from: h */
    public final h7f0 f141297h;

    /* JADX INFO: renamed from: i */
    public final boolean f141298i;

    /* JADX INFO: renamed from: j */
    public final i7f0 f141299j;

    public m9f0(h7f0 h7f0Var, h7f0 h7f0Var2, h7f0 h7f0Var3, ArrayList arrayList, h7f0 h7f0Var4, h7f0 h7f0Var5, h7f0 h7f0Var6, h7f0 h7f0Var7, boolean z, h7f0 h7f0Var8) {
        this.f141290a = h7f0Var;
        this.f141291b = h7f0Var2;
        this.f141292c = h7f0Var3;
        this.f141293d = arrayList;
        this.f141294e = h7f0Var4;
        this.f141295f = h7f0Var5;
        this.f141296g = h7f0Var6;
        this.f141297h = h7f0Var7;
        this.f141298i = z;
        this.f141299j = h7f0Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9f0)) {
            return false;
        }
        m9f0 m9f0Var = (m9f0) obj;
        return wj50.m88271j(this.f141290a, m9f0Var.f141290a) && wj50.m88271j(this.f141291b, m9f0Var.f141291b) && wj50.m88271j(this.f141292c, m9f0Var.f141292c) && this.f141293d.equals(m9f0Var.f141293d) && wj50.m88271j(this.f141294e, m9f0Var.f141294e) && wj50.m88271j(this.f141295f, m9f0Var.f141295f) && wj50.m88271j(this.f141296g, m9f0Var.f141296g) && this.f141297h.equals(m9f0Var.f141297h) && this.f141298i == m9f0Var.f141298i && wj50.m88271j(this.f141299j, m9f0Var.f141299j);
    }

    public final int hashCode() {
        i7f0 i7f0Var = this.f141290a;
        int iHashCode = (i7f0Var == null ? 0 : i7f0Var.hashCode()) * 31;
        i7f0 i7f0Var2 = this.f141291b;
        int iHashCode2 = (iHashCode + (i7f0Var2 == null ? 0 : i7f0Var2.hashCode())) * 31;
        i7f0 i7f0Var3 = this.f141292c;
        int iM59700f = lq51.m59700f(this.f141293d, (iHashCode2 + (i7f0Var3 == null ? 0 : i7f0Var3.hashCode())) * 31, 31);
        i7f0 i7f0Var4 = this.f141294e;
        int iHashCode3 = (iM59700f + (i7f0Var4 == null ? 0 : i7f0Var4.hashCode())) * 31;
        i7f0 i7f0Var5 = this.f141295f;
        int iHashCode4 = (iHashCode3 + (i7f0Var5 == null ? 0 : i7f0Var5.hashCode())) * 31;
        i7f0 i7f0Var6 = this.f141296g;
        int iM77245d = s571.m77245d((this.f141297h.hashCode() + ((iHashCode4 + (i7f0Var6 == null ? 0 : i7f0Var6.hashCode())) * 31)) * 31, 961, this.f141298i);
        i7f0 i7f0Var7 = this.f141299j;
        return iM77245d + (i7f0Var7 != null ? i7f0Var7.hashCode() : 0);
    }
}
