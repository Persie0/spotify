package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class dss0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52625a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f52626b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kss0 f52627c;

    public /* synthetic */ dss0(niz nizVar, kss0 kss0Var, int i) {
        this.f52625a = i;
        this.f52626b = nizVar;
        this.f52627c = kss0Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        css0 css0Var;
        Object peyVar;
        gss0 gss0Var;
        boolean z;
        iss0 iss0Var;
        boolean z2;
        switch (this.f52625a) {
            case 0:
                if (fbkVar instanceof css0) {
                    css0Var = (css0) fbkVar;
                    int i = css0Var.f41688b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        css0Var.f41688b = i - Integer.MIN_VALUE;
                    } else {
                        css0Var = new css0(this, fbkVar);
                    }
                } else {
                    css0Var = new css0(this, fbkVar);
                }
                Object obj2 = css0Var.f41687a;
                int i2 = css0Var.f41688b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    mey meyVar = (mey) ((Map) obj).get(aps0.f18006a);
                    if (meyVar instanceof ley) {
                        peyVar = new qey();
                    } else {
                        key keyVar = meyVar instanceof key ? (key) meyVar : null;
                        AbstractC1737cd abstractC1737cd = C1700bd.f25961a;
                        AbstractC1737cd abstractC1737cd2 = keyVar != null ? keyVar.f121991b : abstractC1737cd;
                        if (this.f52627c.f126006b.m58192a() || !(abstractC1737cd2 instanceof C2448uc)) {
                            abstractC1737cd = abstractC1737cd2;
                        }
                        peyVar = new pey("generate", abstractC1737cd, new lia1(kia1.f122903e));
                    }
                    css0Var.f41688b = 1;
                    Object objEmit = this.f52626b.emit(peyVar, css0Var);
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
                if (fbkVar instanceof gss0) {
                    gss0Var = (gss0) fbkVar;
                    int i3 = gss0Var.f84011b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gss0Var.f84011b = i3 - Integer.MIN_VALUE;
                    } else {
                        gss0Var = new gss0(this, fbkVar);
                    }
                } else {
                    gss0Var = new gss0(this, fbkVar);
                }
                Object obj3 = gss0Var.f84010a;
                int i4 = gss0Var.f84011b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    Map map = (Map) obj;
                    if (this.f52627c.f126006b.m58192a()) {
                        Object obj4 = map.get(aps0.f18006a);
                        key keyVar2 = obj4 instanceof key ? (key) obj4 : null;
                        if ((keyVar2 != null ? keyVar2.f121991b : null) instanceof C2448uc) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    gss0Var.f84011b = 1;
                    Object objEmit2 = this.f52626b.emit(boolValueOf, gss0Var);
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
            default:
                if (fbkVar instanceof iss0) {
                    iss0Var = (iss0) fbkVar;
                    int i5 = iss0Var.f105306b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        iss0Var.f105306b = i5 - Integer.MIN_VALUE;
                    } else {
                        iss0Var = new iss0(this, fbkVar);
                    }
                } else {
                    iss0Var = new iss0(this, fbkVar);
                }
                Object obj5 = iss0Var.f105305a;
                int i6 = iss0Var.f105306b;
                if (i6 == 0) {
                    bga.m29073P(obj5);
                    Map map2 = (Map) obj;
                    if (this.f52627c.f126006b.m58192a()) {
                        Object obj6 = map2.get(aps0.f18006a);
                        key keyVar3 = obj6 instanceof key ? (key) obj6 : null;
                        if ((keyVar3 != null ? keyVar3.f121991b : null) instanceof C2448uc) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z2);
                    iss0Var.f105306b = 1;
                    Object objEmit3 = this.f52626b.emit(boolValueOf2, iss0Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
        }
    }
}
