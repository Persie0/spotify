package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qg91 {

    /* JADX INFO: renamed from: a */
    public final boolean f188410a;

    /* JADX INFO: renamed from: b */
    public final Integer f188411b;

    /* JADX INFO: renamed from: c */
    public final Long f188412c;

    /* JADX INFO: renamed from: d */
    public final boolean f188413d;

    public qg91(Integer num, Long l, boolean z, boolean z2) {
        this.f188410a = z;
        this.f188411b = num;
        this.f188412c = l;
        this.f188413d = z2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72731a() {
        return this.f188413d;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m72732b() {
        return this.f188411b;
    }

    /* JADX INFO: renamed from: c */
    public final Long m72733c() {
        return this.f188412c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m72734d() {
        return this.f188410a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg91)) {
            return false;
        }
        qg91 qg91Var = (qg91) obj;
        return this.f188410a == qg91Var.f188410a && wj50.m88271j(this.f188411b, qg91Var.f188411b) && wj50.m88271j(this.f188412c, qg91Var.f188412c) && this.f188413d == qg91Var.f188413d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f188410a) * 31;
        Integer num = this.f188411b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.f188412c;
        return Boolean.hashCode(this.f188413d) + ((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31);
    }
}
