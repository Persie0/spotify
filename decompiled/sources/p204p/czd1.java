package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class czd1 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final ip20 f43536a;

    /* JADX INFO: renamed from: b */
    public final String f43537b;

    /* JADX INFO: renamed from: c */
    public final boolean f43538c;

    public czd1(ip20 ip20Var, String str, boolean z) {
        this.f43536a = ip20Var;
        this.f43537b = str;
        this.f43538c = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f43537b.compareTo(((czd1) obj).f43537b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czd1)) {
            return false;
        }
        czd1 czd1Var = (czd1) obj;
        return wj50.m88271j(this.f43536a, czd1Var.f43536a) && wj50.m88271j(this.f43537b, czd1Var.f43537b) && this.f43538c == czd1Var.f43538c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43538c) + s571.m77243b(this.f43536a.f104368a.hashCode() * 31, 31, this.f43537b);
    }
}
