package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class nmf0 implements rmf0 {

    /* JADX INFO: renamed from: a */
    public final String f155419a;

    /* JADX INFO: renamed from: b */
    public final String f155420b;

    /* JADX INFO: renamed from: c */
    public final String f155421c;

    /* JADX INFO: renamed from: d */
    public final List f155422d;

    public nmf0(String str, List list, String str2, String str3) {
        this.f155419a = str;
        this.f155420b = str2;
        this.f155421c = str3;
        this.f155422d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmf0)) {
            return false;
        }
        nmf0 nmf0Var = (nmf0) obj;
        return wj50.m88271j(this.f155419a, nmf0Var.f155419a) && wj50.m88271j(this.f155420b, nmf0Var.f155420b) && wj50.m88271j(this.f155421c, nmf0Var.f155421c) && wj50.m88271j(this.f155422d, nmf0Var.f155422d);
    }

    public final int hashCode() {
        return this.f155422d.hashCode() + s571.m77243b(s571.m77243b(this.f155419a.hashCode() * 31, 31, this.f155420b), 31, this.f155421c);
    }
}
