package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class yel0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f272008a;

    /* JADX INFO: renamed from: b */
    public final String f272009b;

    /* JADX INFO: renamed from: c */
    public final d850 f272010c;

    public yel0(ArrayList arrayList, String str, d850 d850Var) {
        this.f272008a = arrayList;
        this.f272009b = str;
        this.f272010c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yel0)) {
            return false;
        }
        yel0 yel0Var = (yel0) obj;
        return this.f272008a.equals(yel0Var.f272008a) && wj50.m88271j(this.f272009b, yel0Var.f272009b) && wj50.m88271j(this.f272010c, yel0Var.f272010c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f272008a.hashCode() * 31, 31, this.f272009b);
        d850 d850Var = this.f272010c;
        return iM77243b + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
