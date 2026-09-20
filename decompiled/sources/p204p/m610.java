package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m610 {

    /* JADX INFO: renamed from: a */
    public final luk f140332a;

    /* JADX INFO: renamed from: b */
    public final mby f140333b;

    public /* synthetic */ m610(luk lukVar, mby mbyVar) {
        this.f140332a = lukVar;
        this.f140333b = mbyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m60936a(String str, String str2, ibk ibkVar) {
        buw0 buw0Var;
        if (ibkVar instanceof buw0) {
            buw0Var = (buw0) ibkVar;
            int i = buw0Var.f31228c;
            if ((i & Integer.MIN_VALUE) != 0) {
                buw0Var.f31228c = i - Integer.MIN_VALUE;
            } else {
                buw0Var = new buw0(this, ibkVar);
            }
        } else {
            buw0Var = new buw0(this, ibkVar);
        }
        Object objM89557A = buw0Var.f31226a;
        int i2 = buw0Var.f31228c;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            ilw0 ilw0Var = new ilw0(this, str, str2, (fbk) null, 2);
            buw0Var.f31228c = 1;
            objM89557A = x0h1.m89557A(this.f140332a, ilw0Var, buw0Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89557A);
        }
        return ((cn3) objM89557A).f39876a;
    }
}
