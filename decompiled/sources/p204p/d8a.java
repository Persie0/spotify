package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class d8a extends vdr0 {

    /* JADX INFO: renamed from: a */
    public boolean[] f46414a;

    /* JADX INFO: renamed from: b */
    public int f46415b;

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: a */
    public final Object mo33759a() {
        return Arrays.copyOf(this.f46414a, this.f46415b);
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: b */
    public final void mo33760b(int i) {
        boolean[] zArr = this.f46414a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f46414a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: d */
    public final int mo33761d() {
        return this.f46415b;
    }
}
