package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class rhz extends vdr0 {

    /* JADX INFO: renamed from: a */
    public float[] f199400a;

    /* JADX INFO: renamed from: b */
    public int f199401b;

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: a */
    public final Object mo33759a() {
        return Arrays.copyOf(this.f199400a, this.f199401b);
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: b */
    public final void mo33760b(int i) {
        float[] fArr = this.f199400a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f199400a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: d */
    public final int mo33761d() {
        return this.f199401b;
    }
}
