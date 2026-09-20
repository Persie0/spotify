package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qk1 {

    /* JADX INFO: renamed from: a */
    public final String f189399a;

    /* JADX INFO: renamed from: b */
    public final int f189400b;

    /* JADX INFO: renamed from: c */
    public final boolean f189401c;

    /* JADX INFO: renamed from: d */
    public final agw f189402d;

    public qk1(String str, int i, boolean z, agw agwVar) {
        this.f189399a = str;
        this.f189400b = i;
        this.f189401c = z;
        this.f189402d = agwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk1)) {
            return false;
        }
        qk1 qk1Var = (qk1) obj;
        return wj50.m88271j(this.f189399a, qk1Var.f189399a) && this.f189400b == qk1Var.f189400b && this.f189401c == qk1Var.f189401c && wj50.m88271j(this.f189402d, qk1Var.f189402d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(mt60.m62800g(this.f189400b, this.f189399a.hashCode() * 31, 31), 31, this.f189401c);
        agw agwVar = this.f189402d;
        return iM77245d + (agwVar == null ? 0 : agwVar.hashCode());
    }
}
