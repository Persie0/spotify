package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class py21 extends bz21 {

    /* JADX INFO: renamed from: a */
    public final String f183322a;

    /* JADX INFO: renamed from: b */
    public final boolean f183323b;

    /* JADX INFO: renamed from: c */
    public final boolean f183324c;

    /* JADX INFO: renamed from: d */
    public final boolean f183325d;

    /* JADX INFO: renamed from: e */
    public final boolean f183326e;

    public py21(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f183322a = str;
        this.f183323b = z;
        this.f183324c = z2;
        this.f183325d = z3;
        this.f183326e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py21)) {
            return false;
        }
        py21 py21Var = (py21) obj;
        return wj50.m88271j(this.f183322a, py21Var.f183322a) && this.f183323b == py21Var.f183323b && this.f183324c == py21Var.f183324c && this.f183325d == py21Var.f183325d && this.f183326e == py21Var.f183326e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f183326e) + s571.m77245d(s571.m77245d(s571.m77245d(this.f183322a.hashCode() * 31, 31, this.f183323b), 31, this.f183324c), 31, this.f183325d);
    }

    public /* synthetic */ py21(String str, boolean z, boolean z2) {
        this(str, z, z2, false, true);
    }
}
