package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class nlb0 {

    /* JADX INFO: renamed from: a */
    public final String f155037a;

    /* JADX INFO: renamed from: b */
    public final long f155038b;

    /* JADX INFO: renamed from: c */
    public final String f155039c;

    /* JADX INFO: renamed from: d */
    public final List f155040d;

    public nlb0(String str, long j, String str2, List list) {
        this.f155037a = str;
        this.f155038b = j;
        this.f155039c = str2;
        this.f155040d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlb0)) {
            return false;
        }
        nlb0 nlb0Var = (nlb0) obj;
        return wj50.m88271j(this.f155037a, nlb0Var.f155037a) && this.f155038b == nlb0Var.f155038b && wj50.m88271j(this.f155039c, nlb0Var.f155039c) && wj50.m88271j(this.f155040d, nlb0Var.f155040d);
    }

    public final int hashCode() {
        return this.f155040d.hashCode() + s571.m77243b(dq60.m36605e(this.f155037a.hashCode() * 31, this.f155038b, 31), 31, this.f155039c);
    }
}
