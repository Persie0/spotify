package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ped implements red {

    /* JADX INFO: renamed from: a */
    public final String f176731a;

    /* JADX INFO: renamed from: b */
    public final List f176732b;

    /* JADX INFO: renamed from: c */
    public final String f176733c;

    /* JADX INFO: renamed from: d */
    public final int f176734d;

    /* JADX INFO: renamed from: e */
    public final long f176735e;

    public ped(String str, ae50 ae50Var, String str2, int i, long j) {
        this.f176731a = str;
        this.f176732b = ae50Var;
        this.f176733c = str2;
        this.f176734d = i;
        this.f176735e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ped)) {
            return false;
        }
        ped pedVar = (ped) obj;
        return wj50.m88271j(this.f176731a, pedVar.f176731a) && wj50.m88271j(this.f176732b, pedVar.f176732b) && wj50.m88271j(this.f176733c, pedVar.f176733c) && this.f176734d == pedVar.f176734d && this.f176735e == pedVar.f176735e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f176735e) + f710.m40938f(this.f176734d, s571.m77243b(s571.m77244c(this.f176731a.hashCode() * 31, 31, this.f176732b), 31, this.f176733c), 31);
    }
}
