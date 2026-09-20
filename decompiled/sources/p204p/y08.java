package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class y08 {

    /* JADX INFO: renamed from: a */
    public final String f267926a;

    /* JADX INFO: renamed from: b */
    public final String f267927b;

    /* JADX INFO: renamed from: c */
    public final String f267928c;

    /* JADX INFO: renamed from: d */
    public final String f267929d;

    public y08(String str, String str2, String str3, String str4) {
        this.f267926a = str;
        this.f267927b = str2;
        this.f267928c = str3;
        this.f267929d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y08) {
            y08 y08Var = (y08) obj;
            if (this.f267926a.equals(y08Var.f267926a) && this.f267927b.equals(y08Var.f267927b) && this.f267928c.equals(y08Var.f267928c) && this.f267929d.equals(y08Var.f267929d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f267926a.hashCode() ^ 1000003) * 1000003) ^ this.f267927b.hashCode()) * 1000003) ^ this.f267928c.hashCode()) * 1000003) ^ this.f267929d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.f267926a);
        sb.append(", eglVersion=");
        sb.append(this.f267927b);
        sb.append(", glExtensions=");
        sb.append(this.f267928c);
        sb.append(", eglExtensions=");
        return dq60.m36616p(this.f267929d, "}", sb);
    }
}
