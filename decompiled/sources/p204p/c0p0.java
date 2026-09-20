package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class c0p0 implements jmk0 {

    /* JADX INFO: renamed from: a */
    public final otd0 f32840a;

    /* JADX INFO: renamed from: b */
    public final ibp0 f32841b;

    /* JADX INFO: renamed from: c */
    public final o4x f32842c;

    /* JADX INFO: renamed from: d */
    public final String f32843d;

    /* JADX INFO: renamed from: e */
    public final String f32844e;

    public c0p0(otd0 otd0Var, ibp0 ibp0Var, o4x o4xVar, String str, String str2) {
        this.f32840a = otd0Var;
        this.f32841b = ibp0Var;
        this.f32842c = o4xVar;
        this.f32843d = str;
        this.f32844e = str2;
    }

    /* JADX INFO: renamed from: a */
    public final o4x m31187a() {
        return this.f32842c;
    }

    /* JADX INFO: renamed from: b */
    public final otd0 m31188b() {
        return this.f32840a;
    }

    /* JADX INFO: renamed from: c */
    public final String m31189c() {
        return this.f32844e;
    }

    /* JADX INFO: renamed from: d */
    public final ibp0 m31190d() {
        return this.f32841b;
    }

    /* JADX INFO: renamed from: e */
    public final String m31191e() {
        return this.f32843d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0p0)) {
            return false;
        }
        c0p0 c0p0Var = (c0p0) obj;
        return wj50.m88271j(this.f32840a, c0p0Var.f32840a) && wj50.m88271j(this.f32841b, c0p0Var.f32841b) && wj50.m88271j(this.f32842c, c0p0Var.f32842c) && wj50.m88271j(this.f32843d, c0p0Var.f32843d) && wj50.m88271j(this.f32844e, c0p0Var.f32844e);
    }

    public final int hashCode() {
        return this.f32844e.hashCode() + s571.m77243b((this.f32842c.hashCode() + ((this.f32841b.hashCode() + (this.f32840a.hashCode() * 31)) * 31)) * 31, 31, this.f32843d);
    }
}
