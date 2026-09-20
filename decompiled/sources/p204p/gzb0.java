package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class gzb0 {

    /* JADX INFO: renamed from: a */
    public final int f85878a;

    /* JADX INFO: renamed from: b */
    public final voc1 f85879b;

    /* JADX INFO: renamed from: c */
    public final List f85880c;

    /* JADX INFO: renamed from: d */
    public final wwu f85881d;

    /* JADX INFO: renamed from: e */
    public final String f85882e;

    /* JADX INFO: renamed from: f */
    public final String f85883f;

    /* JADX INFO: renamed from: g */
    public String f85884g;

    public gzb0(int i, voc1 voc1Var, List list, wwu wwuVar, String str, String str2) {
        this.f85878a = i;
        this.f85879b = voc1Var;
        this.f85880c = list;
        this.f85881d = wwuVar;
        this.f85882e = str;
        this.f85883f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzb0)) {
            return false;
        }
        gzb0 gzb0Var = (gzb0) obj;
        return this.f85878a == gzb0Var.f85878a && wj50.m88271j(this.f85879b, gzb0Var.f85879b) && wj50.m88271j(this.f85880c, gzb0Var.f85880c) && wj50.m88271j(this.f85881d, gzb0Var.f85881d) && wj50.m88271j(this.f85882e, gzb0Var.f85882e) && wj50.m88271j(this.f85883f, gzb0Var.f85883f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f85881d.hashCode() + s571.m77244c(s571.m77243b(edb.m38547C(this.f85878a) * 31, 31, this.f85879b.f243453a), 31, this.f85880c)) * 31, 31, this.f85882e);
        String str = this.f85883f;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
