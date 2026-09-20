package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class l3x {

    /* JADX INFO: renamed from: a */
    public final String f129448a;

    /* JADX INFO: renamed from: b */
    public final String f129449b;

    /* JADX INFO: renamed from: c */
    public final int f129450c;

    /* JADX INFO: renamed from: d */
    public final jev f129451d;

    /* JADX INFO: renamed from: e */
    public final boolean f129452e;

    public l3x(String str, String str2, int i, jev jevVar, boolean z) {
        this.f129448a = str;
        this.f129449b = str2;
        this.f129450c = i;
        this.f129451d = jevVar;
        this.f129452e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3x)) {
            return false;
        }
        l3x l3xVar = (l3x) obj;
        return wj50.m88271j(this.f129448a, l3xVar.f129448a) && wj50.m88271j(this.f129449b, l3xVar.f129449b) && this.f129450c == l3xVar.f129450c && this.f129451d == l3xVar.f129451d && this.f129452e == l3xVar.f129452e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129452e) + ((this.f129451d.hashCode() + s571.m77245d(mt60.m62800g(this.f129450c, s571.m77243b(this.f129448a.hashCode() * 31, 31, this.f129449b), 31), 31, false)) * 31);
    }
}
