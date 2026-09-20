package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class udy implements kg51 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f229347a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f229348b;

    public /* synthetic */ udy(Object obj, int i) {
        this.f229347a = i;
        this.f229348b = obj;
    }

    @Override // p204p.kg51
    /* JADX INFO: renamed from: a */
    public final Object mo56307a(Parcelable parcelable, mg51 mg51Var) {
        switch (this.f229347a) {
            case 0:
                return m82873b((no01) parcelable, mg51Var);
            default:
                dc31 dc31VarM28778k = ((bco) this.f229348b).m28778k();
                return x0h1.m89557A((luk) dc31VarM28778k.f47418e, new lee1((qee1) parcelable, dc31VarM28778k, null), mg51Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m82873b(no01 no01Var, ibk ibkVar) throws Throwable {
        tdy tdyVar;
        if (ibkVar instanceof tdy) {
            tdyVar = (tdy) ibkVar;
            int i = tdyVar.f219528c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tdyVar.f219528c = i - Integer.MIN_VALUE;
            } else {
                tdyVar = new tdy(this, ibkVar);
            }
        } else {
            tdyVar = new tdy(this, ibkVar);
        }
        Object objM89557A = tdyVar.f219526a;
        int i2 = tdyVar.f219528c;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            oo01 oo01Var = (oo01) this.f229348b;
            tdyVar.f219528c = 1;
            objM89557A = x0h1.m89557A(tlp.f221498c, new xay0(oo01Var, no01Var, null, 28), tdyVar);
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
        return ((zr01) objM89557A).f285503a;
    }
}
