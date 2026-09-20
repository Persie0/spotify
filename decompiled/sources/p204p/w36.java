package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class w36 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f247494a;

    /* JADX INFO: renamed from: b */
    public int f247495b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f247496c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f247497d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ j8y0 f247498e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w36(Object obj, fbk fbkVar, j8y0 j8y0Var, int i) {
        super(2, fbkVar);
        this.f247494a = i;
        this.f247497d = obj;
        this.f247498e = j8y0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f247494a) {
            case 0:
                w36 w36Var = new w36(this.f247497d, fbkVar, this.f247498e, 0);
                w36Var.f247496c = obj;
                return w36Var;
            default:
                w36 w36Var2 = new w36(this.f247497d, fbkVar, this.f247498e, 1);
                w36Var2.f247496c = obj;
                return w36Var2;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        niz nizVar = (niz) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f247494a) {
            case 0:
                break;
        }
        return ((w36) create(nizVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        Object objM96565n;
        switch (this.f247494a) {
            case 0:
                int i = this.f247495b;
                w2a1 w2a1Var = w2a1.f247311a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                bga.m29073P(obj);
                av5 av5Var = (av5) this.f247497d;
                this.f247496c = null;
                this.f247495b = 1;
                av5Var.getClass();
                Object objM96565n2 = zn91.m96565n(j8y0.m52715b(this.f247498e, av5Var.f20103e), this);
                yuk yukVar = yuk.f276404a;
                if (objM96565n2 != yukVar) {
                    objM96565n2 = w2a1Var;
                }
                return objM96565n2 == yukVar ? yukVar : w2a1Var;
            default:
                int i2 = this.f247495b;
                w2a1 w2a1Var2 = w2a1.f247311a;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var2;
                }
                bga.m29073P(obj);
                d4i d4iVar = (d4i) this.f247497d;
                this.f247496c = null;
                this.f247495b = 1;
                int i3 = d4iVar.f45167b;
                String str = d4iVar.f45168c;
                int iM38547C = edb.m38547C(i3);
                yuk yukVar2 = yuk.f276404a;
                j8y0 j8y0Var = this.f247498e;
                if (iM38547C == 0) {
                    objM96565n = zn91.m96565n(j8y0.m52715b(j8y0Var, str), this);
                    if (objM96565n != yukVar2) {
                        objM96565n = w2a1Var2;
                    }
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objM96565n = zn91.m96565n(j8y0.m52714a(j8y0Var, str), this);
                    if (objM96565n != yukVar2) {
                        objM96565n = w2a1Var2;
                    }
                }
                return objM96565n == yukVar2 ? yukVar2 : w2a1Var2;
        }
    }
}
