package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tbf implements ubf {

    /* JADX INFO: renamed from: a */
    public final String f218839a;

    /* JADX INFO: renamed from: b */
    public final String f218840b;

    /* JADX INFO: renamed from: c */
    public final String f218841c;

    /* JADX INFO: renamed from: d */
    public final d850 f218842d;

    /* JADX INFO: renamed from: e */
    public final Long f218843e;

    public tbf(String str, String str2, String str3, d850 d850Var, Long l) {
        this.f218839a = str;
        this.f218840b = str2;
        this.f218841c = str3;
        this.f218842d = d850Var;
        this.f218843e = l;
    }

    @Override // p204p.ubf
    /* JADX INFO: renamed from: a */
    public final String mo80393a() {
        return this.f218841c;
    }

    @Override // p204p.zbf
    /* JADX INFO: renamed from: b */
    public final d850 mo77730b() {
        return this.f218842d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbf)) {
            return false;
        }
        tbf tbfVar = (tbf) obj;
        return wj50.m88271j(this.f218839a, tbfVar.f218839a) && wj50.m88271j(this.f218840b, tbfVar.f218840b) && wj50.m88271j(this.f218841c, tbfVar.f218841c) && wj50.m88271j(this.f218842d, tbfVar.f218842d) && wj50.m88271j(this.f218843e, tbfVar.f218843e);
    }

    @Override // p204p.ubf
    public final String getContextUri() {
        return this.f218839a;
    }

    public final int hashCode() {
        int iHashCode = this.f218839a.hashCode() * 31;
        String str = this.f218840b;
        int iHashCode2 = (this.f218842d.hashCode() + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f218841c)) * 31;
        Long l = this.f218843e;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }
}
