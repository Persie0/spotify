package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class r540 implements rsy {

    /* JADX INFO: renamed from: a */
    public final p340 f195962a;

    /* JADX INFO: renamed from: b */
    public final boolean f195963b;

    /* JADX INFO: renamed from: c */
    public final int f195964c;

    public r540(p340 p340Var, boolean z, int i) {
        this.f195962a = p340Var;
        this.f195963b = z;
        this.f195964c = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m74797a() {
        return this.f195964c;
    }

    /* JADX INFO: renamed from: b */
    public final p340 m74798b() {
        return this.f195962a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m74799c() {
        return this.f195963b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r540)) {
            return false;
        }
        r540 r540Var = (r540) obj;
        return this.f195962a.equals(r540Var.f195962a) && this.f195963b == r540Var.f195963b && this.f195964c == r540Var.f195964c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f195964c) + s571.m77245d(this.f195962a.hashCode() * 31, 31, this.f195963b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.f195962a + ", isSampled=" + this.f195963b + ", dataSource=" + adn.m25613y(this.f195964c) + ')';
    }
}
