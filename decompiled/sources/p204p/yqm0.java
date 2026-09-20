package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class yqm0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f275263a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k79 f275264b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yqm0(k79 k79Var, int i) {
        super(1);
        this.f275263a = i;
        this.f275264b = k79Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f275263a) {
            case 0:
                ((k0p) ((View) obj).getTag()).mo2820d(this.f275264b);
                break;
            default:
                ((k0p) ((View) obj).getTag()).mo2820d(this.f275264b);
                break;
        }
        return w2a1.f247311a;
    }
}
