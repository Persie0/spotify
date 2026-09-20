package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class p7e0 {

    /* JADX INFO: renamed from: a */
    public final String f174657a;

    /* JADX INFO: renamed from: b */
    public final String f174658b;

    /* JADX INFO: renamed from: c */
    public final String f174659c;

    /* JADX INFO: renamed from: d */
    public final un20 f174660d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f174661e;

    /* JADX INFO: renamed from: f */
    public final f5u f174662f;

    /* JADX INFO: renamed from: g */
    public final String f174663g;

    public p7e0(String str, String str2, String str3, un20 un20Var, ArrayList arrayList, f5u f5uVar, String str4) {
        this.f174657a = str;
        this.f174658b = str2;
        this.f174659c = str3;
        this.f174660d = un20Var;
        this.f174661e = arrayList;
        this.f174662f = f5uVar;
        this.f174663g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7e0)) {
            return false;
        }
        p7e0 p7e0Var = (p7e0) obj;
        return wj50.m88271j(this.f174657a, p7e0Var.f174657a) && wj50.m88271j(this.f174658b, p7e0Var.f174658b) && wj50.m88271j(this.f174659c, p7e0Var.f174659c) && wj50.m88271j(this.f174660d, p7e0Var.f174660d) && this.f174661e.equals(p7e0Var.f174661e) && wj50.m88271j(this.f174662f, p7e0Var.f174662f) && wj50.m88271j(this.f174663g, p7e0Var.f174663g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f174657a.hashCode() * 31, 31, this.f174658b), 31, this.f174659c);
        un20 un20Var = this.f174660d;
        int iM59700f = lq51.m59700f(this.f174661e, (iM77243b + (un20Var == null ? 0 : un20Var.hashCode())) * 31, 31);
        f5u f5uVar = this.f174662f;
        int iHashCode = (iM59700f + (f5uVar == null ? 0 : f5uVar.hashCode())) * 31;
        String str = this.f174663g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
