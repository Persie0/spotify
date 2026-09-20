package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class jt41 extends zu41 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f115710a;

    /* JADX INFO: renamed from: b */
    public final String f115711b;

    /* JADX INFO: renamed from: c */
    public final un20 f115712c;

    public jt41(String str, ArrayList arrayList, un20 un20Var) {
        this.f115710a = arrayList;
        this.f115711b = str;
        this.f115712c = un20Var;
    }

    @Override // p204p.zu41
    /* JADX INFO: renamed from: a */
    public final un20 mo54269a() {
        return this.f115712c;
    }

    @Override // p204p.zu41
    /* JADX INFO: renamed from: b */
    public final String mo54270b() {
        return this.f115711b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt41)) {
            return false;
        }
        jt41 jt41Var = (jt41) obj;
        return this.f115710a.equals(jt41Var.f115710a) && wj50.m88271j(this.f115711b, jt41Var.f115711b) && wj50.m88271j(this.f115712c, jt41Var.f115712c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f115710a.hashCode() * 31, 31, this.f115711b);
        un20 un20Var = this.f115712c;
        return iM77243b + (un20Var == null ? 0 : un20Var.hashCode());
    }
}
