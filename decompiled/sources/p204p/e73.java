package p204p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public final class e73 implements ctx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56794a;

    /* JADX INFO: renamed from: b */
    public final C2098lp f56795b;

    public /* synthetic */ e73(C2098lp c2098lp, int i) {
        this.f56794a = i;
        this.f56795b = c2098lp;
    }

    @Override // p204p.ctx0
    /* JADX INFO: renamed from: a */
    public final dtx0 mo33851a(ViewGroup viewGroup) {
        switch (this.f56794a) {
            case 0:
                return new g73(this.f56795b.mo26174a(null), 0);
            default:
                return new g73(this.f56795b.mo26174a(null), 2);
        }
    }

    @Override // p204p.ctx0
    /* JADX INFO: renamed from: b */
    public final Class mo33852b() {
        switch (this.f56794a) {
            case 0:
                return vpx0.class;
            default:
                return hqx0.class;
        }
    }

    @Override // p204p.ctx0
    /* JADX INFO: renamed from: c */
    public final int mo33853c() {
        switch (this.f56794a) {
            case 0:
                return 3;
            default:
                return 6;
        }
    }
}
