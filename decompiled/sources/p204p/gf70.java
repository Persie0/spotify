package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gf70 {

    /* JADX INFO: renamed from: a */
    public final String f79289a;

    /* JADX INFO: renamed from: b */
    public final String f79290b;

    /* JADX INFO: renamed from: c */
    public final boolean f79291c;

    public gf70(String str, String str2, boolean z) {
        this.f79289a = str;
        this.f79290b = str2;
        this.f79291c = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m44581a() {
        return this.f79290b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf70)) {
            return false;
        }
        gf70 gf70Var = (gf70) obj;
        return wj50.m88271j(this.f79289a, gf70Var.f79289a) && wj50.m88271j(this.f79290b, gf70Var.f79290b) && this.f79291c == gf70Var.f79291c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79291c) + s571.m77243b(this.f79289a.hashCode() * 31, 31, this.f79290b);
    }
}
