package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class by50 {

    /* JADX INFO: renamed from: a */
    public final String f32075a;

    /* JADX INFO: renamed from: b */
    public final String f32076b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f32077c;

    /* JADX INFO: renamed from: d */
    public final xx50 f32078d;

    /* JADX INFO: renamed from: e */
    public final rx50 f32079e;

    /* JADX INFO: renamed from: f */
    public final ay50 f32080f;

    /* JADX INFO: renamed from: g */
    public final zx50 f32081g;

    /* JADX INFO: renamed from: h */
    public final zx50 f32082h;

    public by50(String str, String str2, ArrayList arrayList, xx50 xx50Var, rx50 rx50Var, ay50 ay50Var, zx50 zx50Var) {
        this.f32075a = str;
        this.f32076b = str2;
        this.f32077c = arrayList;
        this.f32078d = xx50Var;
        this.f32079e = rx50Var;
        this.f32080f = ay50Var;
        this.f32081g = zx50Var;
        this.f32082h = zx50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by50)) {
            return false;
        }
        by50 by50Var = (by50) obj;
        return wj50.m88271j(this.f32075a, by50Var.f32075a) && sx50.m79579b(this.f32076b, by50Var.f32076b) && this.f32077c.equals(by50Var.f32077c) && this.f32078d.equals(by50Var.f32078d) && wj50.m88271j(this.f32079e, by50Var.f32079e) && wj50.m88271j(this.f32080f, by50Var.f32080f) && this.f32081g.equals(by50Var.f32081g);
    }

    public final int hashCode() {
        int iHashCode = (this.f32078d.hashCode() + lq51.m59700f(this.f32077c, (sx50.m79580c(this.f32076b) + (this.f32075a.hashCode() * 31)) * 31, 31)) * 31;
        rx50 rx50Var = this.f32079e;
        int iHashCode2 = (iHashCode + (rx50Var == null ? 0 : rx50Var.hashCode())) * 31;
        ay50 ay50Var = this.f32080f;
        return this.f32081g.hashCode() + ((iHashCode2 + (ay50Var != null ? ay50Var.hashCode() : 0)) * 31);
    }
}
