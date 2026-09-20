package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class i80 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f99654b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f99655c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f99656d;

    public /* synthetic */ i80(niz nizVar, String str, boolean z, int i) {
        this.f99653a = i;
        this.f99654b = nizVar;
        this.f99655c = str;
        this.f99656d = z;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        h80 h80Var;
        cbf0 cbf0VarM35556a;
        pad1 pad1Var;
        x51 x51Var;
        l71 l71Var;
        k1c0 k1c0Var;
        c2c0 c2c0Var;
        switch (this.f99653a) {
            case 0:
                if (fbkVar instanceof h80) {
                    h80Var = (h80) fbkVar;
                    int i = h80Var.f88583b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        h80Var.f88583b = i - Integer.MIN_VALUE;
                    } else {
                        h80Var = new h80(this, fbkVar);
                    }
                } else {
                    h80Var = new h80(this, fbkVar);
                }
                Object obj2 = h80Var.f88582a;
                int i2 = h80Var.f88583b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    dbf0 dbf0VarM38368c = ((ebf0) obj).m38368c(pad1.class, this.f99655c);
                    Boolean boolValueOf = Boolean.valueOf((((dbf0VarM38368c == null || (cbf0VarM35556a = dbf0VarM38368c.m35556a()) == null || (pad1Var = (pad1) cbf0VarM35556a.f36107a) == null) ? null : pad1Var.f175509a) instanceof iad1) == this.f99656d);
                    h80Var.f88583b = 1;
                    Object objEmit = this.f99654b.emit(boolValueOf, h80Var);
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
                if (fbkVar instanceof x51) {
                    x51Var = (x51) fbkVar;
                    int i3 = x51Var.f258240b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        x51Var.f258240b = i3 - Integer.MIN_VALUE;
                    } else {
                        x51Var = new x51(this, fbkVar);
                    }
                } else {
                    x51Var = new x51(this, fbkVar);
                }
                Object obj3 = x51Var.f258239a;
                int i4 = x51Var.f258240b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    r631 r631Var = (r631) obj;
                    if (r631Var instanceof q631) {
                        l71Var = new l71(this.f99655c, !this.f99656d, false);
                    } else {
                        if (!(r631Var instanceof p631)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        l71Var = null;
                    }
                    if (l71Var != null) {
                        x51Var.f258240b = 1;
                        Object objEmit2 = this.f99654b.emit(l71Var, x51Var);
                        yuk yukVar2 = yuk.f276404a;
                        if (objEmit2 == yukVar2) {
                            return yukVar2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof k1c0) {
                    k1c0Var = (k1c0) fbkVar;
                    int i5 = k1c0Var.f118276b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        k1c0Var.f118276b = i5 - Integer.MIN_VALUE;
                    } else {
                        k1c0Var = new k1c0(this, fbkVar);
                    }
                } else {
                    k1c0Var = new k1c0(this, fbkVar);
                }
                Object obj4 = k1c0Var.f118275a;
                int i6 = k1c0Var.f118276b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    r631 r631Var2 = (r631) obj;
                    if (r631Var2 instanceof q631) {
                        c2c0Var = new c2c0(this.f99655c, !this.f99656d, false);
                    } else {
                        if (!(r631Var2 instanceof p631)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2c0Var = null;
                    }
                    if (c2c0Var != null) {
                        k1c0Var.f118276b = 1;
                        Object objEmit3 = this.f99654b.emit(c2c0Var, k1c0Var);
                        yuk yukVar3 = yuk.f276404a;
                        if (objEmit3 == yukVar3) {
                            return yukVar3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
        }
    }
}
