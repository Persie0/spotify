package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes9.dex */
public final class slw0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210505a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ulw0 f210506b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ slw0(ulw0 ulw0Var, int i) {
        super(1);
        this.f210505a = i;
        this.f210506b = ulw0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f210505a) {
            case 0:
                ((fdx0) obj).m41397w(Float.intBitsToFloat((int) (this.f210506b.m83409e() & 4294967295L)));
                break;
            case 1:
                ((fdx0) obj).m41396v(Float.intBitsToFloat((int) (this.f210506b.m83409e() >> 32)));
                break;
            case 2:
                ((fdx0) obj).m41397w(Float.intBitsToFloat((int) (((Offset) this.f210506b.f231675u.m45912e()).f493a & 4294967295L)));
                break;
            default:
                ((fdx0) obj).m41396v(Float.intBitsToFloat((int) (((Offset) this.f210506b.f231675u.m45912e()).f493a >> 32)));
                break;
        }
        return w2a1.f247311a;
    }
}
