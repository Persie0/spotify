package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vng1 implements w7f1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f243131a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k8f1 f243132b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f243133c;

    public /* synthetic */ vng1(k8f1 k8f1Var, Bundle bundle, int i) {
        this.f243131a = i;
        this.f243132b = k8f1Var;
        this.f243133c = bundle;
    }

    @Override // p204p.w7f1
    /* JADX INFO: renamed from: b */
    public final void mo29654b(gu30 gu30Var, ev61 ev61Var) {
        switch (this.f243131a) {
            case 0:
                gu30Var.mo40024u1(this.f243133c, new p6f1(this.f243132b, ev61Var, 1));
                break;
            default:
                gu30Var.mo40023j1(this.f243133c, new p6f1(this.f243132b, ev61Var, 2));
                break;
        }
    }
}
