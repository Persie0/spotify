package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rh81 extends vh81 {

    /* JADX INFO: renamed from: a */
    public final String f199172a;

    /* JADX INFO: renamed from: b */
    public final String f199173b;

    /* JADX INFO: renamed from: c */
    public final List f199174c;

    /* JADX INFO: renamed from: d */
    public final String f199175d;

    /* JADX INFO: renamed from: e */
    public final ph81 f199176e;

    public rh81(String str, String str2, List list, String str3, ph81 ph81Var) {
        this.f199172a = str;
        this.f199173b = str2;
        this.f199174c = list;
        this.f199175d = str3;
        this.f199176e = ph81Var;
    }

    @Override // p204p.vh81
    /* JADX INFO: renamed from: a */
    public final String mo75505a() {
        return this.f199172a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh81)) {
            return false;
        }
        rh81 rh81Var = (rh81) obj;
        return wj50.m88271j(this.f199172a, rh81Var.f199172a) && wj50.m88271j(this.f199173b, rh81Var.f199173b) && wj50.m88271j(this.f199174c, rh81Var.f199174c) && wj50.m88271j(this.f199175d, rh81Var.f199175d) && this.f199176e.equals(rh81Var.f199176e);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f199176e.hashCode() + s571.m77243b(s571.m77244c(s571.m77245d(s571.m77243b(this.f199172a.hashCode() * 31, 31, this.f199173b), 31, false), 31, this.f199174c), 31, this.f199175d)) * 31);
    }
}
