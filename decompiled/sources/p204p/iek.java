package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes5.dex */
public final class iek extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uum0 f101430b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f101431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iek(uum0 uum0Var, kqi0 kqi0Var, int i) {
        super(1);
        this.f101429a = i;
        this.f101430b = uum0Var;
        this.f101431c = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f101429a) {
            case 0:
                long j = ((Offset) obj).f493a;
                uum0 uum0Var = this.f101430b;
                if (uum0Var.m84031v() > 1.0f) {
                    uum0Var.m84032w(1.0f);
                    ydj.m93453l(0L, this.f101431c);
                } else {
                    uum0Var.m84032w(2.0f);
                }
                break;
            default:
                fdx0 fdx0Var = (fdx0) obj;
                uum0 uum0Var2 = this.f101430b;
                fdx0Var.m41390m(uum0Var2.m84031v());
                fdx0Var.m41391o(uum0Var2.m84031v());
                kqi0 kqi0Var = this.f101431c;
                fdx0Var.m41396v(Float.intBitsToFloat((int) (((Offset) kqi0Var.getValue()).f493a >> 32)));
                fdx0Var.m41397w(Float.intBitsToFloat((int) (((Offset) kqi0Var.getValue()).f493a & 4294967295L)));
                break;
        }
        return w2a1.f247311a;
    }
}
