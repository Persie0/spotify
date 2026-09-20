package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes6.dex */
public final class fvx extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f73891a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ olv0 f73892b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fvx(olv0 olv0Var, int i) {
        super(2);
        this.f73891a = i;
        this.f73892b = olv0Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f73891a) {
            case 0:
                long j = ((Offset) obj2).f493a;
                ((k6q0) obj).m55602a();
                olv0 olv0Var = this.f73892b;
                olv0Var.f166933a = Float.intBitsToFloat((int) (j & 4294967295L)) + olv0Var.f166933a;
                break;
            default:
                float fFloatValue = ((Number) obj2).floatValue();
                ((k6q0) obj).m55602a();
                this.f73892b.f166933a = fFloatValue;
                break;
        }
        return w2a1.f247311a;
    }
}
