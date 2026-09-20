package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class l130 {

    /* JADX INFO: renamed from: a */
    public final r300 f128610a;

    /* JADX INFO: renamed from: b */
    public final String f128611b;

    /* JADX INFO: renamed from: c */
    public final String f128612c;

    public l130(r300 r300Var, String str, String str2) {
        p300 p300VarM74564a = r300Var.m74564a();
        p300VarM74564a.f173513a = null;
        p300VarM74564a.f173524l = null;
        this.f128610a = new r300(p300VarM74564a);
        this.f128611b = str;
        this.f128612c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l130)) {
            return false;
        }
        l130 l130Var = (l130) obj;
        return Objects.equals(this.f128610a, l130Var.f128610a) && Objects.equals(this.f128611b, l130Var.f128611b) && Objects.equals(this.f128612c, l130Var.f128612c);
    }

    public final int hashCode() {
        return Objects.hash(this.f128610a, this.f128611b, this.f128612c);
    }
}
