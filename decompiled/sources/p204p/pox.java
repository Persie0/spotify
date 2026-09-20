package p204p;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes7.dex */
public final class pox implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f179816a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f179817b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f179818c;

    public /* synthetic */ pox(fiz fizVar, int i, int i2) {
        this.f179816a = i2;
        this.f179817b = fizVar;
        this.f179818c = i;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        ikz ikzVar;
        AbortFlowException e;
        Object obj;
        switch (this.f179816a) {
            case 0:
                Object objCollect = this.f179817b.collect(new oox(nizVar, this.f179818c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                if (fbkVar instanceof ikz) {
                    ikzVar = (ikz) fbkVar;
                    int i = ikzVar.f103244b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ikzVar.f103244b = i - Integer.MIN_VALUE;
                    } else {
                        ikzVar = new ikz(this, fbkVar);
                    }
                } else {
                    ikzVar = new ikz(this, fbkVar);
                }
                Object obj2 = ikzVar.f103243a;
                int i2 = ikzVar.f103244b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = ikzVar.f103246d;
                    try {
                        bga.m29073P(obj2);
                    } catch (AbortFlowException e2) {
                        e = e2;
                        if (e.f10917a != obj) {
                            throw e;
                        }
                    }
                    break;
                } else {
                    bga.m29073P(obj2);
                    Object obj3 = new Object();
                    plv0 plv0Var = new plv0();
                    try {
                        fiz fizVar = this.f179817b;
                        kkz kkzVar = new kkz(plv0Var, this.f179818c, nizVar, obj3);
                        ikzVar.f103246d = obj3;
                        ikzVar.f103244b = 1;
                        Object objCollect2 = fizVar.collect(kkzVar, ikzVar);
                        yuk yukVar = yuk.f276404a;
                        if (objCollect2 == yukVar) {
                            return yukVar;
                        }
                    } catch (AbortFlowException e3) {
                        e = e3;
                        obj = obj3;
                        if (e.f10917a != obj) {
                            throw e;
                        }
                    }
                }
                return w2a1.f247311a;
        }
    }
}
