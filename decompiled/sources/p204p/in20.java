package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class in20 extends ln20 {

    /* JADX INFO: renamed from: a */
    public final boolean f103837a;

    /* JADX INFO: renamed from: b */
    public final String f103838b;

    /* JADX INFO: renamed from: c */
    public final jn20 f103839c;

    public in20(boolean z, String str, jn20 jn20Var) {
        this.f103837a = z;
        this.f103838b = str;
        this.f103839c = jn20Var;
    }

    @Override // p204p.ln20
    /* JADX INFO: renamed from: a */
    public final String mo45287a() {
        return this.f103838b;
    }

    @Override // p204p.ln20
    /* JADX INFO: renamed from: b */
    public final jn20 mo45288b() {
        return this.f103839c;
    }

    @Override // p204p.ln20
    /* JADX INFO: renamed from: c */
    public final String mo45289c() {
        return "";
    }

    @Override // p204p.ln20
    /* JADX INFO: renamed from: d */
    public final boolean mo45290d() {
        return this.f103837a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in20)) {
            return false;
        }
        in20 in20Var = (in20) obj;
        return this.f103837a == in20Var.f103837a && wj50.m88271j(this.f103838b, in20Var.f103838b) && this.f103839c == in20Var.f103839c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f103837a) * 31;
        String str = this.f103838b;
        return this.f103839c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
