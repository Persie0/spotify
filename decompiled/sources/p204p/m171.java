package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class m171 {

    /* JADX INFO: renamed from: a */
    public final j15 f138858a;

    /* JADX INFO: renamed from: b */
    public j15 f138859b;

    /* JADX INFO: renamed from: c */
    public boolean f138860c = false;

    /* JADX INFO: renamed from: d */
    public c7i0 f138861d = null;

    public m171(j15 j15Var, j15 j15Var2) {
        this.f138858a = j15Var;
        this.f138859b = j15Var2;
    }

    /* JADX INFO: renamed from: a */
    public final c7i0 m60530a() {
        return this.f138861d;
    }

    /* JADX INFO: renamed from: b */
    public final j15 m60531b() {
        return this.f138859b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m60532c() {
        return this.f138860c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m171)) {
            return false;
        }
        m171 m171Var = (m171) obj;
        return wj50.m88271j(this.f138858a, m171Var.f138858a) && wj50.m88271j(this.f138859b, m171Var.f138859b) && this.f138860c == m171Var.f138860c && wj50.m88271j(this.f138861d, m171Var.f138861d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f138859b.hashCode() + (this.f138858a.hashCode() * 31)) * 31, 31, this.f138860c);
        c7i0 c7i0Var = this.f138861d;
        return iM77245d + (c7i0Var == null ? 0 : c7i0Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f138858a) + ", substitution=" + ((Object) this.f138859b) + ", isShowingSubstitution=" + this.f138860c + ", layoutCache=" + this.f138861d + ')';
    }
}
