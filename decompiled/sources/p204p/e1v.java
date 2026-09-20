package p204p;

import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: classes6.dex */
public final class e1v extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55260a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rlv0 f55261b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rku f55262c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1v(rlv0 rlv0Var, rku rkuVar, int i) {
        super(1);
        this.f55260a = i;
        this.f55261b = rlv0Var;
        this.f55262c = rkuVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f55260a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                rlv0 rlv0Var = this.f55261b;
                we91 we91Var = (we91) rlv0Var.f200373a;
                if (we91Var.f250498h != 0) {
                    we91 we91VarM87873a = we91.m87873a(we91Var, false, !zBooleanValue, 1535);
                    rlv0Var.f200373a = we91VarM87873a;
                    this.f55262c.f200167e.mo2820d(we91VarM87873a);
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                rlv0 rlv0Var2 = this.f55261b;
                we91 we91VarM87873a2 = we91.m87873a((we91) rlv0Var2.f200373a, zBooleanValue2, false, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                rlv0Var2.f200373a = we91VarM87873a2;
                this.f55262c.f200167e.mo2820d(we91VarM87873a2);
                break;
        }
        return w2a1.f247311a;
    }
}
