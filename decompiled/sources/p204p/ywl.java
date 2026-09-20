package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class ywl {

    /* JADX INFO: renamed from: a */
    public final String f276981a;

    /* JADX INFO: renamed from: b */
    public final int f276982b;

    /* JADX INFO: renamed from: c */
    public final rcm0 f276983c;

    /* JADX INFO: renamed from: d */
    public final String f276984d;

    /* JADX INFO: renamed from: e */
    public final String f276985e;

    /* JADX INFO: renamed from: f */
    public final String f276986f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f276987g;

    public ywl(String str, int i, rcm0 rcm0Var, String str2, String str3, String str4, ArrayList arrayList) {
        this.f276981a = str;
        this.f276982b = i;
        this.f276983c = rcm0Var;
        this.f276984d = str2;
        this.f276985e = str3;
        this.f276986f = str4;
        this.f276987g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywl)) {
            return false;
        }
        ywl ywlVar = (ywl) obj;
        return wj50.m88271j(this.f276981a, ywlVar.f276981a) && this.f276982b == ywlVar.f276982b && this.f276983c.equals(ywlVar.f276983c) && wj50.m88271j(this.f276984d, ywlVar.f276984d) && wj50.m88271j(this.f276985e, ywlVar.f276985e) && wj50.m88271j(this.f276986f, ywlVar.f276986f) && this.f276987g.equals(ywlVar.f276987g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(yds.m93483m(this.f276983c, mt60.m62800g(this.f276982b, this.f276981a.hashCode() * 31, 31), 31), 31, this.f276984d);
        String str = this.f276985e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f276986f;
        return this.f276987g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
