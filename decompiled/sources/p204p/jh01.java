package p204p;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class jh01 implements pmj {

    /* JADX INFO: renamed from: a */
    public final boolean f112303a;

    /* JADX INFO: renamed from: b */
    public final Path.FillType f112304b;

    /* JADX INFO: renamed from: c */
    public final String f112305c;

    /* JADX INFO: renamed from: d */
    public final hw4 f112306d;

    /* JADX INFO: renamed from: e */
    public final hw4 f112307e;

    /* JADX INFO: renamed from: f */
    public final boolean f112308f;

    public jh01(String str, boolean z, Path.FillType fillType, hw4 hw4Var, hw4 hw4Var2, boolean z2) {
        this.f112305c = str;
        this.f112303a = z;
        this.f112304b = fillType;
        this.f112306d = hw4Var;
        this.f112307e = hw4Var2;
        this.f112308f = z2;
    }

    @Override // p204p.pmj
    /* JADX INFO: renamed from: a */
    public final hej mo26175a(r9b0 r9b0Var, u8b0 u8b0Var, oz8 oz8Var) {
        return new rxy(r9b0Var, oz8Var, this);
    }

    public final String toString() {
        return s571.m77253l(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f112303a, '}');
    }
}
