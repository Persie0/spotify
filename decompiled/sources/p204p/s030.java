package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class s030 {

    /* JADX INFO: renamed from: a */
    public final String f204292a;

    /* JADX INFO: renamed from: b */
    public final int f204293b;

    /* JADX INFO: renamed from: c */
    public final double f204294c;

    /* JADX INFO: renamed from: d */
    public final String f204295d;

    public s030(String str, double d) {
        this.f204292a = str;
        this.f204293b = 2;
        this.f204294c = d;
        this.f204295d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s030)) {
            return false;
        }
        s030 s030Var = (s030) obj;
        return this.f204293b == s030Var.f204293b && Double.compare(this.f204294c, s030Var.f204294c) == 0 && Objects.equals(this.f204292a, s030Var.f204292a) && Objects.equals(this.f204295d, s030Var.f204295d);
    }

    public final int hashCode() {
        return Objects.hash(this.f204292a, Integer.valueOf(this.f204293b), Double.valueOf(this.f204294c), this.f204295d);
    }

    public s030(String str, String str2, int i) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        c95.m31855u(z);
        this.f204292a = str;
        this.f204293b = i;
        this.f204295d = str2;
        this.f204294c = 0.0d;
    }
}
