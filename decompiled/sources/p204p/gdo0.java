package p204p;

import android.widget.Magnifier;

/* JADX INFO: loaded from: classes3.dex */
public final class gdo0 extends fdo0 {
    @Override // p204p.fdo0, p204p.ddo0
    /* JADX INFO: renamed from: a */
    public final void mo35753a(float f, long j, long j2) {
        if (!Float.isNaN(f)) {
            ((Magnifier) this.f68535a).setZoom(f);
        }
        if ((9223372034707292159L & j2) != 9205357640488583168L) {
            ((Magnifier) this.f68535a).show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            ((Magnifier) this.f68535a).show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
