package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class jjt0 extends fmg1 {

    /* JADX INFO: renamed from: c */
    public final String f113102c;

    /* JADX INFO: renamed from: d */
    public final String f113103d;

    /* JADX INFO: renamed from: e */
    public final String f113104e;

    /* JADX INFO: renamed from: f */
    public final List f113105f;

    public jjt0(String str, List list, String str2, String str3) {
        this.f113102c = str;
        this.f113103d = str2;
        this.f113104e = str3;
        this.f113105f = list;
    }

    @Override // p204p.fmg1
    /* JADX INFO: renamed from: N */
    public final String mo42155N() {
        return this.f113102c;
    }

    @Override // p204p.fmg1
    /* JADX INFO: renamed from: O */
    public final String mo42156O() {
        return this.f113103d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjt0)) {
            return false;
        }
        jjt0 jjt0Var = (jjt0) obj;
        return wj50.m88271j(this.f113102c, jjt0Var.f113102c) && wj50.m88271j(this.f113103d, jjt0Var.f113103d) && wj50.m88271j(this.f113104e, jjt0Var.f113104e) && wj50.m88271j(this.f113105f, jjt0Var.f113105f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f113102c.hashCode() * 31, 31, this.f113103d);
        String str = this.f113104e;
        return this.f113105f.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
