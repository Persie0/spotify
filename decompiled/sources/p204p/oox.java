package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class oox implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167710a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f167711b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f167712c;

    public oox(int i, gh00 gh00Var) {
        this.f167710a = 3;
        this.f167712c = i;
        this.f167711b = gh00Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        nox noxVar;
        asc0 asc0Var;
        jx11 jx11Var;
        switch (this.f167710a) {
            case 0:
                if (fbkVar instanceof nox) {
                    noxVar = (nox) fbkVar;
                    int i = noxVar.f156803b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        noxVar.f156803b = i - Integer.MIN_VALUE;
                    } else {
                        noxVar = new nox(this, fbkVar);
                    }
                } else {
                    noxVar = new nox(this, fbkVar);
                }
                Object obj2 = noxVar.f156802a;
                int i2 = noxVar.f156803b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    niz nizVar = (niz) this.f167711b;
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    pqm0 pqm0Var = new pqm0(new Integer(this.f167712c), bool);
                    noxVar.f156803b = 1;
                    Object objEmit = nizVar.emit(pqm0Var, noxVar);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof asc0) {
                    asc0Var = (asc0) fbkVar;
                    int i3 = asc0Var.f19388b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        asc0Var.f19388b = i3 - Integer.MIN_VALUE;
                    } else {
                        asc0Var = new asc0(this, fbkVar);
                    }
                } else {
                    asc0Var = new asc0(this, fbkVar);
                }
                Object obj3 = asc0Var.f19387a;
                int i4 = asc0Var.f19388b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    niz nizVar2 = (niz) this.f167711b;
                    List list = (List) obj;
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((tw70) it.next()).f224325a == this.f167712c) {
                                asc0Var.f19388b = 1;
                                Object objEmit2 = nizVar2.emit(obj, asc0Var);
                                yuk yukVar2 = yuk.f276404a;
                                if (objEmit2 == yukVar2) {
                                    return yukVar2;
                                }
                            }
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof jx11) {
                    jx11Var = (jx11) fbkVar;
                    int i5 = jx11Var.f116766b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        jx11Var.f116766b = i5 - Integer.MIN_VALUE;
                    } else {
                        jx11Var = new jx11(this, fbkVar);
                    }
                } else {
                    jx11Var = new jx11(this, fbkVar);
                }
                Object obj4 = jx11Var.f116765a;
                int i6 = jx11Var.f116766b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    niz nizVar3 = (niz) this.f167711b;
                    xx11 xx11Var = (xx11) obj;
                    pqm0 pqm0Var2 = xx11Var != null ? new pqm0(new Integer(this.f167712c), xx11Var) : null;
                    jx11Var.f116766b = 1;
                    Object objEmit3 = nizVar3.emit(pqm0Var2, jx11Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            default:
                ((gh00) this.f167711b).invoke(new Float(1.0f - n0e1.m63436m(((Number) obj).floatValue() / this.f167712c, 0.0f, 1.0f)));
                return w2a1.f247311a;
        }
    }

    public /* synthetic */ oox(niz nizVar, int i, int i2) {
        this.f167710a = i2;
        this.f167711b = nizVar;
        this.f167712c = i;
    }
}
