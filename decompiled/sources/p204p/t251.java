package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t251 {

    /* JADX INFO: renamed from: a */
    public final String f216424a;

    /* JADX INFO: renamed from: b */
    public final boolean f216425b;

    /* JADX INFO: renamed from: c */
    public final eh00 f216426c;

    /* JADX INFO: renamed from: d */
    public final boolean f216427d;

    public /* synthetic */ t251(String str) {
        this(str, false, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t251)) {
            return false;
        }
        t251 t251Var = (t251) obj;
        return wj50.m88271j(this.f216424a, t251Var.f216424a) && this.f216425b == t251Var.f216425b && wj50.m88271j(this.f216426c, t251Var.f216426c) && this.f216427d == t251Var.f216427d;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f216424a.hashCode() * 31, 31, this.f216425b);
        eh00 eh00Var = this.f216426c;
        return Boolean.hashCode(this.f216427d) + ((iM77245d + (eh00Var == null ? 0 : eh00Var.hashCode())) * 31);
    }

    public t251(String str, boolean z, eh00 eh00Var, boolean z2) {
        this.f216424a = str;
        this.f216425b = z;
        this.f216426c = eh00Var;
        this.f216427d = z2;
    }
}
