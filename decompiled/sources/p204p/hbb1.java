package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class hbb1 implements jbb1 {

    /* JADX INFO: renamed from: a */
    public final String f89469a;

    /* JADX INFO: renamed from: b */
    public final List f89470b;

    /* JADX INFO: renamed from: c */
    public final gbb1 f89471c;

    /* JADX INFO: renamed from: d */
    public final String f89472d;

    /* JADX INFO: renamed from: e */
    public final long f89473e;

    public hbb1(String str, List list, gbb1 gbb1Var, String str2, long j) {
        this.f89469a = str;
        this.f89470b = list;
        this.f89471c = gbb1Var;
        this.f89472d = str2;
        this.f89473e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbb1)) {
            return false;
        }
        hbb1 hbb1Var = (hbb1) obj;
        return wj50.m88271j(this.f89469a, hbb1Var.f89469a) && wj50.m88271j(this.f89470b, hbb1Var.f89470b) && wj50.m88271j(this.f89471c, hbb1Var.f89471c) && wj50.m88271j(this.f89472d, hbb1Var.f89472d) && this.f89473e == hbb1Var.f89473e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89473e) + s571.m77243b((this.f89471c.hashCode() + s571.m77244c(this.f89469a.hashCode() * 31, 31, this.f89470b)) * 31, 31, this.f89472d);
    }
}
