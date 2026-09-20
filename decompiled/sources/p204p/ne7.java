package p204p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public final class ne7 implements ctx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152940a;

    /* JADX INFO: renamed from: b */
    public final Object f152941b;

    /* JADX INFO: renamed from: c */
    public final qwf f152942c;

    public /* synthetic */ ne7(Object obj, qwf qwfVar, int i) {
        this.f152940a = i;
        this.f152941b = obj;
        this.f152942c = qwfVar;
    }

    @Override // p204p.ctx0
    /* JADX INFO: renamed from: a */
    public final dtx0 mo33851a(ViewGroup viewGroup) {
        switch (this.f152940a) {
            case 0:
                return new pe7(((C2098lp) this.f152942c).mo26174a(null), (iyp) this.f152941b);
            default:
                return new g73((Context) this.f152941b, ((gju) this.f152942c).mo26174a(null));
        }
    }

    @Override // p204p.ctx0
    /* JADX INFO: renamed from: b */
    public final Class mo33852b() {
        switch (this.f152940a) {
            case 0:
                return xpx0.class;
            default:
                return oqx0.class;
        }
    }

    @Override // p204p.ctx0
    /* JADX INFO: renamed from: c */
    public final int mo33853c() {
        switch (this.f152940a) {
            case 0:
                return 7;
            default:
                return 8;
        }
    }
}
