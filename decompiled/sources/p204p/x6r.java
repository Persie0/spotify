package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class x6r {

    /* JADX INFO: renamed from: e */
    public static final x6r f258724e = new gx8(0).m46029c();

    /* JADX INFO: renamed from: f */
    public static final String f258725f;

    /* JADX INFO: renamed from: g */
    public static final String f258726g;

    /* JADX INFO: renamed from: h */
    public static final String f258727h;

    /* JADX INFO: renamed from: i */
    public static final String f258728i;

    /* JADX INFO: renamed from: a */
    public final int f258729a;

    /* JADX INFO: renamed from: b */
    public final int f258730b;

    /* JADX INFO: renamed from: c */
    public final int f258731c;

    /* JADX INFO: renamed from: d */
    public final String f258732d;

    static {
        String str = h0b1.f86200a;
        f258725f = Integer.toString(0, 36);
        f258726g = Integer.toString(1, 36);
        f258727h = Integer.toString(2, 36);
        f258728i = Integer.toString(3, 36);
    }

    public x6r(gx8 gx8Var) {
        this.f258729a = gx8Var.f85218b;
        this.f258730b = gx8Var.f85219c;
        this.f258731c = gx8Var.f85220d;
        this.f258732d = (String) gx8Var.f85221e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6r)) {
            return false;
        }
        x6r x6rVar = (x6r) obj;
        return this.f258729a == x6rVar.f258729a && this.f258730b == x6rVar.f258730b && this.f258731c == x6rVar.f258731c && Objects.equals(this.f258732d, x6rVar.f258732d);
    }

    public final int hashCode() {
        int i = (((((527 + this.f258729a) * 31) + this.f258730b) * 31) + this.f258731c) * 31;
        String str = this.f258732d;
        return i + (str == null ? 0 : str.hashCode());
    }
}
