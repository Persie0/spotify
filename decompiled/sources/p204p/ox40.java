package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ox40 implements nx40 {

    /* JADX INFO: renamed from: a */
    public final String f170879a;

    /* JADX INFO: renamed from: b */
    public final sed f170880b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f170881c;

    /* JADX INFO: renamed from: d */
    public final String f170882d;

    /* JADX INFO: renamed from: e */
    public final int f170883e;

    public ox40(String str, sed sedVar, ArrayList arrayList, String str2, int i) {
        this.f170879a = str;
        this.f170880b = sedVar;
        this.f170881c = arrayList;
        this.f170882d = str2;
        this.f170883e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox40)) {
            return false;
        }
        ox40 ox40Var = (ox40) obj;
        return wj50.m88271j(this.f170879a, ox40Var.f170879a) && wj50.m88271j(this.f170880b, ox40Var.f170880b) && this.f170881c.equals(ox40Var.f170881c) && wj50.m88271j(this.f170882d, ox40Var.f170882d) && this.f170883e == ox40Var.f170883e;
    }

    @Override // p204p.nx40
    public final String getEntityUri() {
        return this.f170882d;
    }

    @Override // p204p.sx40
    public final String getId() {
        return this.f170879a;
    }

    public final int hashCode() {
        int iHashCode = this.f170879a.hashCode() * 31;
        sed sedVar = this.f170880b;
        return edb.m38547C(this.f170883e) + s571.m77243b(lq51.m59700f(this.f170881c, (iHashCode + (sedVar == null ? 0 : sedVar.hashCode())) * 31, 31), 31, this.f170882d);
    }
}
