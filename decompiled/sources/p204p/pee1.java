package p204p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes.dex */
public final class pee1 {

    /* JADX INFO: renamed from: a */
    public final Single f176742a;

    public pee1(Single single) {
        this.f176742a = single;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m69722a(String str, ibk ibkVar) {
        oee1 oee1Var;
        if (ibkVar instanceof oee1) {
            oee1Var = (oee1) ibkVar;
            int i = oee1Var.f164411d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oee1Var.f164411d = i - Integer.MIN_VALUE;
            } else {
                oee1Var = new oee1(this, ibkVar);
            }
        } else {
            oee1Var = new oee1(this, ibkVar);
        }
        Object objM96567o = oee1Var.f164409b;
        int i2 = oee1Var.f164411d;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            oee1Var.f164408a = str;
            oee1Var.f164411d = 1;
            objM96567o = zn91.m96567o(this.f176742a, oee1Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = oee1Var.f164408a;
            bga.m29073P(objM96567o);
        }
        return ((hv31) objM96567o).mo48707b(fv31.f73628b.m78181M(str), null);
    }
}
