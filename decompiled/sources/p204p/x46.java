package p204p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public final class x46 implements ctx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f257989a;

    /* JADX INFO: renamed from: b */
    public final qwf f257990b;

    public /* synthetic */ x46(qwf qwfVar, int i) {
        this.f257989a = i;
        this.f257990b = qwfVar;
    }

    @Override // p204p.ctx0
    /* JADX INFO: renamed from: a */
    public final dtx0 mo33851a(ViewGroup viewGroup) {
        switch (this.f257989a) {
            case 0:
                return new g73(((C2098lp) this.f257990b).mo26174a(null), 1);
            default:
                return new g73(((nju) this.f257990b).mo26174a(null), 4);
        }
    }

    @Override // p204p.ctx0
    /* JADX INFO: renamed from: b */
    public final Class mo33852b() {
        switch (this.f257989a) {
            case 0:
                return wpx0.class;
            default:
                return qqx0.class;
        }
    }

    @Override // p204p.ctx0
    /* JADX INFO: renamed from: c */
    public final int mo33853c() {
        switch (this.f257989a) {
            case 0:
                return 4;
            default:
                return 1;
        }
    }
}
