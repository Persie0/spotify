package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b9s implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24990a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f24991b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f24992c;

    public /* synthetic */ b9s(niz nizVar, gh00 gh00Var, int i) {
        this.f24990a = i;
        this.f24991b = nizVar;
        this.f24992c = gh00Var;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x0138  */
    /* JADX WARN: Code duplicated, block: B:94:0x0180  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        a9s a9sVar;
        ici0 ici0Var;
        fpj0 fpj0Var;
        cf61 cf61Var;
        u9a1 u9a1Var;
        x9a1 x9a1Var;
        daa1 daa1Var;
        switch (this.f24990a) {
            case 0:
                if (fbkVar instanceof a9s) {
                    a9sVar = (a9s) fbkVar;
                    int i = a9sVar.f13633b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        a9sVar.f13633b = i - Integer.MIN_VALUE;
                    } else {
                        a9sVar = new a9s(this, fbkVar);
                    }
                } else {
                    a9sVar = new a9s(this, fbkVar);
                }
                Object obj2 = a9sVar.f13632a;
                int i2 = a9sVar.f13633b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    Object objInvoke = this.f24992c.invoke((pe01) obj);
                    a9sVar.f13633b = 1;
                    Object objEmit = this.f24991b.emit(objInvoke, a9sVar);
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
                if (fbkVar instanceof ici0) {
                    ici0Var = (ici0) fbkVar;
                    int i3 = ici0Var.f100825b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ici0Var.f100825b = i3 - Integer.MIN_VALUE;
                    } else {
                        ici0Var = new ici0(this, fbkVar);
                    }
                } else {
                    ici0Var = new ici0(this, fbkVar);
                }
                Object obj3 = ici0Var.f100824a;
                int i4 = ici0Var.f100825b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    Object objInvoke2 = this.f24992c.invoke((pe01) obj);
                    ici0Var.f100825b = 1;
                    Object objEmit2 = this.f24991b.emit(objInvoke2, ici0Var);
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
            case 2:
                if (fbkVar instanceof fpj0) {
                    fpj0Var = (fpj0) fbkVar;
                    int i5 = fpj0Var.f71889b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        fpj0Var.f71889b = i5 - Integer.MIN_VALUE;
                    } else {
                        fpj0Var = new fpj0(this, fbkVar);
                    }
                } else {
                    fpj0Var = new fpj0(this, fbkVar);
                }
                Object obj4 = fpj0Var.f71888a;
                int i6 = fpj0Var.f71889b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    Object objInvoke3 = this.f24992c.invoke((pe01) obj);
                    fpj0Var.f71889b = 1;
                    Object objEmit3 = this.f24991b.emit(objInvoke3, fpj0Var);
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
            case 3:
                if (fbkVar instanceof cf61) {
                    cf61Var = (cf61) fbkVar;
                    int i7 = cf61Var.f37278b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        cf61Var.f37278b = i7 - Integer.MIN_VALUE;
                    } else {
                        cf61Var = new cf61(this, fbkVar);
                    }
                } else {
                    cf61Var = new cf61(this, fbkVar);
                }
                Object obj5 = cf61Var.f37277a;
                int i8 = cf61Var.f37278b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    Object objInvoke4 = this.f24992c.invoke((pe01) obj);
                    cf61Var.f37278b = 1;
                    Object objEmit4 = this.f24991b.emit(objInvoke4, cf61Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof u9a1) {
                    u9a1Var = (u9a1) fbkVar;
                    int i9 = u9a1Var.f228117b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        u9a1Var.f228117b = i9 - Integer.MIN_VALUE;
                    } else {
                        u9a1Var = new u9a1(this, fbkVar);
                    }
                } else {
                    u9a1Var = new u9a1(this, fbkVar);
                }
                Object obj6 = u9a1Var.f228116a;
                int i10 = u9a1Var.f228117b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    Object objInvoke5 = this.f24992c.invoke((pe01) obj);
                    u9a1Var.f228117b = 1;
                    Object objEmit5 = this.f24991b.emit(objInvoke5, u9a1Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof x9a1) {
                    x9a1Var = (x9a1) fbkVar;
                    int i11 = x9a1Var.f259309b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        x9a1Var.f259309b = i11 - Integer.MIN_VALUE;
                    } else {
                        x9a1Var = new x9a1(this, fbkVar);
                    }
                } else {
                    x9a1Var = new x9a1(this, fbkVar);
                }
                Object obj7 = x9a1Var.f259308a;
                int i12 = x9a1Var.f259309b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    Object objInvoke6 = this.f24992c.invoke((pe01) obj);
                    x9a1Var.f259309b = 1;
                    Object objEmit6 = this.f24991b.emit(objInvoke6, x9a1Var);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof daa1) {
                    daa1Var = (daa1) fbkVar;
                    int i13 = daa1Var.f47011b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        daa1Var.f47011b = i13 - Integer.MIN_VALUE;
                    } else {
                        daa1Var = new daa1(this, fbkVar);
                    }
                } else {
                    daa1Var = new daa1(this, fbkVar);
                }
                Object obj8 = daa1Var.f47010a;
                int i14 = daa1Var.f47011b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    Object objInvoke7 = this.f24992c.invoke((pe01) obj);
                    daa1Var.f47011b = 1;
                    Object objEmit7 = this.f24991b.emit(objInvoke7, daa1Var);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit7 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
        }
    }
}
