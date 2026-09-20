package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class siv0 {

    /* JADX INFO: renamed from: e */
    public static final siv0 f209669e = new siv0(15);

    /* JADX INFO: renamed from: a */
    public final float f209670a;

    /* JADX INFO: renamed from: b */
    public final float f209671b;

    /* JADX INFO: renamed from: c */
    public final float f209672c;

    /* JADX INFO: renamed from: d */
    public final float f209673d;

    public siv0(float f, float f2, float f3, float f4) {
        this.f209670a = f;
        this.f209671b = f2;
        this.f209672c = f3;
        this.f209673d = f4;
    }

    /* JADX INFO: renamed from: a */
    public static siv0 m78242a(siv0 siv0Var, float f) {
        return new siv0(siv0Var.f209670a, siv0Var.f209671b, siv0Var.f209672c, f);
    }

    /* JADX INFO: renamed from: b */
    public final int m78243b(siv0 siv0Var) {
        float f = this.f209672c;
        float f2 = this.f209670a;
        float f3 = this.f209673d;
        float f4 = this.f209671b;
        float f5 = 0.0f;
        if ((f3 - f4) * (f - f2) == 0.0f) {
            return 0;
        }
        float fMax = Math.max(f2, siv0Var.f209670a);
        float fMax2 = Math.max(f4, siv0Var.f209671b);
        float fMin = Math.min(f, siv0Var.f209672c);
        float fMin2 = Math.min(f3, siv0Var.f209673d);
        if (fMax < fMin && fMax2 < fMin2) {
            f5 = (fMin2 - fMax2) * (fMin - fMax);
        }
        return (int) ((f5 / ((f3 - f4) * (f - f2))) * 100);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof siv0)) {
            return false;
        }
        siv0 siv0Var = (siv0) obj;
        return Float.compare(this.f209670a, siv0Var.f209670a) == 0 && Float.compare(this.f209671b, siv0Var.f209671b) == 0 && Float.compare(this.f209672c, siv0Var.f209672c) == 0 && Float.compare(this.f209673d, siv0Var.f209673d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f209673d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f209670a) * 31, 31, this.f209671b), 31, this.f209672c);
    }

    public /* synthetic */ siv0(int i) {
        this(0.0f, 0.0f, (i & 4) != 0 ? 0.0f : 1000.0f, (i & 8) != 0 ? 0.0f : 1000.0f);
    }
}
