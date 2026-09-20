package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wvf implements e9y0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f255487b;

    public /* synthetic */ wvf(Object obj, int i) {
        this.f255486a = i;
        this.f255487b = obj;
    }

    @Override // p204p.e9y0
    /* JADX INFO: renamed from: f */
    public final Bundle mo25168f() {
        switch (this.f255486a) {
            case 0:
                cwf cwfVar = (cwf) this.f255487b;
                Bundle bundle = new Bundle();
                cwfVar.f42745i.m69852f(bundle);
                return bundle;
            case 1:
                return ((c700) this.f255487b).m31625d0();
            default:
                return x8y0.m90231a((x8y0) this.f255487b);
        }
    }
}
