package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class p7b1 {

    /* JADX INFO: renamed from: a */
    public final ue20 f174639a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f174640b;

    /* JADX INFO: renamed from: c */
    public final e9b1 f174641c;

    /* JADX INFO: renamed from: d */
    public final bq8 f174642d;

    public p7b1(ue20 ue20Var, ArrayList arrayList, e9b1 e9b1Var, bq8 bq8Var) {
        this.f174639a = ue20Var;
        this.f174640b = arrayList;
        this.f174641c = e9b1Var;
        this.f174642d = bq8Var;
    }

    /* JADX INFO: renamed from: a */
    public static p7b1 m69252a(p7b1 p7b1Var, e9b1 e9b1Var, bq8 bq8Var, int i) {
        ue20 ue20Var = p7b1Var.f174639a;
        ArrayList arrayList = p7b1Var.f174640b;
        if ((i & 4) != 0) {
            e9b1Var = p7b1Var.f174641c;
        }
        if ((i & 8) != 0) {
            bq8Var = p7b1Var.f174642d;
        }
        p7b1Var.getClass();
        return new p7b1(ue20Var, arrayList, e9b1Var, bq8Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7b1)) {
            return false;
        }
        p7b1 p7b1Var = (p7b1) obj;
        return this.f174639a.equals(p7b1Var.f174639a) && this.f174640b.equals(p7b1Var.f174640b) && wj50.m88271j(this.f174641c, p7b1Var.f174641c) && wj50.m88271j(this.f174642d, p7b1Var.f174642d);
    }

    public final int hashCode() {
        return this.f174642d.hashCode() + ((this.f174641c.hashCode() + lq51.m59700f(this.f174640b, this.f174639a.hashCode() * 31, 31)) * 31);
    }
}
