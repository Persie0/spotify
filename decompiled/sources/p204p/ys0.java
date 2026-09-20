package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class ys0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f275627a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zs0 f275628b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys0(int i, zs0 zs0Var) {
        super(0);
        this.f275627a = i;
        this.f275628b = zs0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f275627a) {
            case 0:
                zs0.m96791h(this.f275628b, true);
                break;
            case 1:
                zs0.m96791h(this.f275628b, true);
                break;
            case 2:
                zs0 zs0Var = this.f275628b;
                ((View) zs0Var.f285799f).setVisibility(8);
                zs0.m96792i(zs0Var);
                break;
            default:
                zs0 zs0Var2 = this.f275628b;
                zs0.m96791h(zs0Var2, false);
                zs0.m96792i(zs0Var2);
                break;
        }
        return w2a1.f247311a;
    }
}
