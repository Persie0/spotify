package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wbf implements ubf {

    /* JADX INFO: renamed from: a */
    public final String f249747a;

    /* JADX INFO: renamed from: b */
    public final String f249748b;

    /* JADX INFO: renamed from: c */
    public final d850 f249749c;

    public wbf(String str, String str2, d850 d850Var) {
        this.f249747a = str;
        this.f249748b = str2;
        this.f249749c = d850Var;
    }

    @Override // p204p.ubf
    /* JADX INFO: renamed from: a */
    public final String mo80393a() {
        return this.f249748b;
    }

    @Override // p204p.zbf
    /* JADX INFO: renamed from: b */
    public final d850 mo77730b() {
        return this.f249749c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbf)) {
            return false;
        }
        wbf wbfVar = (wbf) obj;
        return wj50.m88271j(this.f249747a, wbfVar.f249747a) && wj50.m88271j(this.f249748b, wbfVar.f249748b) && wj50.m88271j(this.f249749c, wbfVar.f249749c);
    }

    @Override // p204p.ubf
    public final String getContextUri() {
        return this.f249747a;
    }

    public final int hashCode() {
        return this.f249749c.hashCode() + s571.m77243b(this.f249747a.hashCode() * 31, 31, this.f249748b);
    }
}
