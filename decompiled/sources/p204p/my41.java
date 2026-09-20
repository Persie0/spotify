package p204p;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class my41 implements dro {

    /* JADX INFO: renamed from: a */
    public final tpz0 f148306a;

    public my41(tpz0 tpz0Var) {
        this.f148306a = tpz0Var;
    }

    @Override // p204p.dro
    /* JADX INFO: renamed from: a */
    public final ero mo36737a(fu31 fu31Var, ivl0 ivl0Var) {
        ImageDecoder.Source sourceM36750e;
        Bitmap.Config configM95822a = zb40.m95822a(ivl0Var);
        if ((configM95822a == Bitmap.Config.ARGB_8888 || configM95822a == Bitmap.Config.HARDWARE) && (sourceM36750e = ds4.m36750e(fu31Var.f73394a, ivl0Var, false)) != null) {
            return new oy41(sourceM36750e, fu31Var.f73394a, ivl0Var, this.f148306a);
        }
        return null;
    }
}
