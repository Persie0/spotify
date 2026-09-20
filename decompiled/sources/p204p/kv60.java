package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kv60 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f126786b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ov60 f126787c;

    public /* synthetic */ kv60(niz nizVar, ov60 ov60Var, int i) {
        this.f126785a = i;
        this.f126786b = nizVar;
        this.f126787c = ov60Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        jv60 jv60Var;
        mv60 mv60Var;
        switch (this.f126785a) {
            case 0:
                if (fbkVar instanceof jv60) {
                    jv60Var = (jv60) fbkVar;
                    int i = jv60Var.f116271b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        jv60Var.f116271b = i - Integer.MIN_VALUE;
                    } else {
                        jv60Var = new jv60(this, fbkVar);
                    }
                } else {
                    jv60Var = new jv60(this, fbkVar);
                }
                Object obj2 = jv60Var.f116270a;
                int i2 = jv60Var.f116271b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    long jMo48712g = ((hv31) obj).mo48712g(ov60.f170425e, 0L);
                    ((wy3) this.f126787c.f170429c).getClass();
                    Boolean boolValueOf = Boolean.valueOf(jMo48712g == 0 || System.currentTimeMillis() - jMo48712g > ov60.f170426f);
                    jv60Var.f116271b = 1;
                    Object objEmit = this.f126786b.emit(boolValueOf, jv60Var);
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
                if (fbkVar instanceof mv60) {
                    mv60Var = (mv60) fbkVar;
                    int i3 = mv60Var.f147518b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        mv60Var.f147518b = i3 - Integer.MIN_VALUE;
                    } else {
                        mv60Var = new mv60(this, fbkVar);
                    }
                } else {
                    mv60Var = new mv60(this, fbkVar);
                }
                Object obj3 = mv60Var.f147517a;
                int i4 = mv60Var.f147518b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    ov60 ov60Var = this.f126787c;
                    hv31 hv31VarMo35842b = ov60Var.f170428b.mo35842b(ov60Var.f170427a, ((e301) obj).f55571a);
                    mv60Var.f147518b = 1;
                    Object objEmit2 = this.f126786b.emit(hv31VarMo35842b, mv60Var);
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
