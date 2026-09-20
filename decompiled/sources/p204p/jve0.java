package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class jve0 extends ove0 {

    /* JADX INFO: renamed from: a */
    public final String f116337a;

    /* JADX INFO: renamed from: b */
    public final String f116338b;

    /* JADX INFO: renamed from: c */
    public final int f116339c;

    /* JADX INFO: renamed from: d */
    public final boolean f116340d;

    /* JADX INFO: renamed from: e */
    public final boolean f116341e;

    public jve0(int i, String str, String str2, boolean z, boolean z2) {
        this.f116337a = str;
        this.f116338b = str2;
        this.f116339c = i;
        this.f116340d = z;
        this.f116341e = z2;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: a */
    public final String mo54379a() {
        return this.f116338b;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: b */
    public final String mo54380b() {
        return this.f116337a;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: d */
    public final int mo54381d() {
        return this.f116339c;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: e */
    public final boolean mo54382e() {
        return this.f116340d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jve0)) {
            return false;
        }
        jve0 jve0Var = (jve0) obj;
        return wj50.m88271j(this.f116337a, jve0Var.f116337a) && wj50.m88271j(this.f116338b, jve0Var.f116338b) && this.f116339c == jve0Var.f116339c && this.f116340d == jve0Var.f116340d && this.f116341e == jve0Var.f116341e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116341e) + s571.m77245d(f710.m40938f(this.f116339c, s571.m77243b(this.f116337a.hashCode() * 31, 31, this.f116338b), 31), 31, this.f116340d);
    }
}
