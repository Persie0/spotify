package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c0x0 {

    /* JADX INFO: renamed from: a */
    public final String f32901a;

    /* JADX INFO: renamed from: b */
    public final String f32902b;

    /* JADX INFO: renamed from: c */
    public final String f32903c;

    public c0x0(String str, String str2, String str3) {
        this.f32901a = str;
        this.f32902b = str2;
        this.f32903c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0x0)) {
            return false;
        }
        c0x0 c0x0Var = (c0x0) obj;
        return wj50.m88271j(this.f32901a, c0x0Var.f32901a) && wj50.m88271j(this.f32902b, c0x0Var.f32902b) && wj50.m88271j(this.f32903c, c0x0Var.f32903c);
    }

    public final int hashCode() {
        return this.f32903c.hashCode() + s571.m77243b(this.f32901a.hashCode() * 31, 31, this.f32902b);
    }
}
