package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class m6l implements p6l {

    /* JADX INFO: renamed from: a */
    public final String f140536a;

    /* JADX INFO: renamed from: b */
    public final String f140537b;

    /* JADX INFO: renamed from: c */
    public final d850 f140538c;

    /* JADX INFO: renamed from: d */
    public final xcl0 f140539d;

    public m6l(String str, String str2, d850 d850Var, xcl0 xcl0Var) {
        this.f140536a = str;
        this.f140537b = str2;
        this.f140538c = d850Var;
        this.f140539d = xcl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6l)) {
            return false;
        }
        m6l m6lVar = (m6l) obj;
        return wj50.m88271j(this.f140536a, m6lVar.f140536a) && wj50.m88271j(this.f140537b, m6lVar.f140537b) && wj50.m88271j(this.f140538c, m6lVar.f140538c) && wj50.m88271j(this.f140539d, m6lVar.f140539d);
    }

    public final int hashCode() {
        String str = this.f140536a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f140537b);
        d850 d850Var = this.f140538c;
        return this.f140539d.hashCode() + ((iM77243b + (d850Var != null ? d850Var.hashCode() : 0)) * 31);
    }
}
