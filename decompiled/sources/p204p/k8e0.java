package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k8e0 {

    /* JADX INFO: renamed from: a */
    public final String f120312a;

    /* JADX INFO: renamed from: b */
    public final String f120313b;

    /* JADX INFO: renamed from: c */
    public final ipg1 f120314c;

    /* JADX INFO: renamed from: d */
    public final boolean f120315d;

    /* JADX INFO: renamed from: e */
    public final String f120316e;

    /* JADX INFO: renamed from: f */
    public final String f120317f;

    /* JADX INFO: renamed from: g */
    public final String f120318g;

    /* JADX INFO: renamed from: h */
    public final String f120319h;

    /* JADX INFO: renamed from: i */
    public final String f120320i;

    /* JADX INFO: renamed from: j */
    public final String f120321j;

    /* JADX INFO: renamed from: k */
    public final String f120322k;

    public k8e0(String str, String str2, ipg1 ipg1Var, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f120312a = str;
        this.f120313b = str2;
        this.f120314c = ipg1Var;
        this.f120315d = z;
        this.f120316e = str3;
        this.f120317f = str4;
        this.f120318g = str5;
        this.f120319h = str6;
        this.f120320i = str7;
        this.f120321j = str8;
        this.f120322k = str9;
    }

    public final boolean equals(Object obj) {
        Object obj2 = 0;
        if (this == obj) {
            return true;
        }
        if (obj instanceof k8e0) {
            k8e0 k8e0Var = (k8e0) obj;
            if (this.f120312a.equals(k8e0Var.f120312a) && this.f120313b.equals(k8e0Var.f120313b) && this.f120314c.equals(k8e0Var.f120314c) && this.f120315d == k8e0Var.f120315d && this.f120316e.equals(k8e0Var.f120316e) && this.f120317f.equals(k8e0Var.f120317f) && this.f120318g.equals(k8e0Var.f120318g) && obj2.equals(obj2) && this.f120319h.equals(k8e0Var.f120319h) && wj50.m88271j(this.f120320i, k8e0Var.f120320i) && this.f120321j.equals(k8e0Var.f120321j) && this.f120322k.equals(k8e0Var.f120322k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = 0;
        int iM77243b = s571.m77243b((num.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77245d((this.f120314c.hashCode() + s571.m77243b(this.f120312a.hashCode() * 31, 31, this.f120313b)) * 31, 31, this.f120315d), 31, this.f120316e), 31, this.f120317f), 31, this.f120318g)) * 31, 31, this.f120319h);
        String str = this.f120320i;
        return this.f120322k.hashCode() + s571.m77243b((iM77243b + (str != null ? str.hashCode() : 0)) * 31, 31, this.f120321j);
    }
}
