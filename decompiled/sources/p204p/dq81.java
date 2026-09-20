package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class dq81 {

    /* JADX INFO: renamed from: a */
    public final String f51896a;

    /* JADX INFO: renamed from: b */
    public final String f51897b;

    /* JADX INFO: renamed from: c */
    public final List f51898c;

    /* JADX INFO: renamed from: d */
    public final w9s f51899d;

    /* JADX INFO: renamed from: e */
    public final qsj f51900e;

    /* JADX INFO: renamed from: f */
    public final boolean f51901f;

    /* JADX INFO: renamed from: g */
    public final boolean f51902g;

    /* JADX INFO: renamed from: h */
    public final boolean f51903h;

    /* JADX INFO: renamed from: i */
    public final boolean f51904i;

    /* JADX INFO: renamed from: j */
    public boolean f51905j = false;

    public dq81(String str, String str2, List list, w9s w9sVar, qsj qsjVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f51896a = str;
        this.f51897b = str2;
        this.f51898c = list;
        this.f51899d = w9sVar;
        this.f51900e = qsjVar;
        this.f51901f = z;
        this.f51902g = z2;
        this.f51903h = z3;
        this.f51904i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq81)) {
            return false;
        }
        dq81 dq81Var = (dq81) obj;
        return wj50.m88271j(this.f51896a, dq81Var.f51896a) && wj50.m88271j(this.f51897b, dq81Var.f51897b) && wj50.m88271j(this.f51898c, dq81Var.f51898c) && this.f51899d == dq81Var.f51899d && this.f51900e == dq81Var.f51900e && this.f51901f == dq81Var.f51901f && this.f51902g == dq81Var.f51902g && this.f51903h == dq81Var.f51903h && this.f51904i == dq81Var.f51904i && this.f51905j == dq81Var.f51905j;
    }

    public final int hashCode() {
        String str = this.f51896a;
        return Boolean.hashCode(this.f51905j) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(xl81.m91401j(this.f51900e, (this.f51899d.hashCode() + s571.m77244c(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f51897b), 31, this.f51898c)) * 31, 31), 31, this.f51901f), 31, this.f51902g), 31, this.f51903h), 31, this.f51904i);
    }
}
