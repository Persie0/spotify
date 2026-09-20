package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class d4e1 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45148a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f45149b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g4e1 f45150c;

    public /* synthetic */ d4e1(niz nizVar, g4e1 g4e1Var, int i) {
        this.f45148a = i;
        this.f45149b = nizVar;
        this.f45150c = g4e1Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        c4e1 c4e1Var;
        f4e1 f4e1Var;
        Object objM44506m;
        switch (this.f45148a) {
            case 0:
                if (fbkVar instanceof c4e1) {
                    c4e1Var = (c4e1) fbkVar;
                    int i = c4e1Var.f33932b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c4e1Var.f33932b = i - Integer.MIN_VALUE;
                    } else {
                        c4e1Var = new c4e1(this, fbkVar);
                    }
                } else {
                    c4e1Var = new c4e1(this, fbkVar);
                }
                Object obj2 = c4e1Var.f33931a;
                int i2 = c4e1Var.f33932b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    uj81 uj81Var = this.f45150c.f76404c;
                    Boolean boolValueOf = Boolean.valueOf(((p3e1) uj81Var.f230941c).m69001a(((ty80) obj).f224877f.f271272q));
                    c4e1Var.f33932b = 1;
                    Object objEmit = this.f45149b.emit(boolValueOf, c4e1Var);
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
            default:
                if (fbkVar instanceof f4e1) {
                    f4e1Var = (f4e1) fbkVar;
                    int i3 = f4e1Var.f65772b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        f4e1Var.f65772b = i3 - Integer.MIN_VALUE;
                    } else {
                        f4e1Var = new f4e1(this, fbkVar);
                    }
                } else {
                    f4e1Var = new f4e1(this, fbkVar);
                }
                Object obj3 = f4e1Var.f65771a;
                int i4 = f4e1Var.f65772b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    ArrayList arrayListM51790n = this.f45150c.f76403b.m51790n(((t5a0) obj).f217256b);
                    if (arrayListM51790n.isEmpty()) {
                        objM44506m = lau.f131415a;
                    } else {
                        ifz0 ifz0Var = (ifz0) g6f.m43741q0(arrayListM51790n);
                        ifz0 ifz0Var2 = (ifz0) g6f.m43687A0(arrayListM51790n);
                        ArrayList<ifz0> arrayListM51786l = iw3.m51786l(arrayListM51790n);
                        ro80 ro80VarM44508o = geg1.m44508o();
                        if (ifz0Var.f101846c.f218567a != null) {
                            ro80VarM44508o.add(Integer.valueOf(ifz0Var.f101844a));
                        }
                        for (ifz0 ifz0Var3 : arrayListM51786l) {
                            if (ifz0Var3.f101846c.f218567a != null) {
                                ro80VarM44508o.add(Integer.valueOf(ifz0Var3.f101844a));
                            }
                        }
                        if (!ro80VarM44508o.isEmpty()) {
                            ro80VarM44508o.add(Integer.valueOf(ifz0Var2.f101844a + 1));
                        }
                        objM44506m = geg1.m44506m(ro80VarM44508o);
                    }
                    f4e1Var.f65772b = 1;
                    Object objEmit2 = this.f45149b.emit(objM44506m, f4e1Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
