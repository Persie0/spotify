package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class xhd1 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float[] f261530a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f261531b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f261532c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f261533d;

    public xhd1(float[] fArr, int i, boolean z, kqi0 kqi0Var) {
        this.f261530a = fArr;
        this.f261531b = i;
        this.f261532c = z;
        this.f261533d = kqi0Var;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        float fFloatValue = ((Number) obj).floatValue();
        float[] fArr = this.f261530a;
        bk5.m29637v0(fArr, fArr, 8);
        fArr[this.f261531b - 1] = fFloatValue;
        if (!this.f261532c) {
            this.f261533d.setValue(Arrays.copyOf(fArr, fArr.length));
        }
        return w2a1.f247311a;
    }
}
