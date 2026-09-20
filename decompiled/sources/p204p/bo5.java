package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bo5 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29015a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f29016b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ io5 f29017c;

    public /* synthetic */ bo5(niz nizVar, io5 io5Var, int i) {
        this.f29015a = i;
        this.f29016b = nizVar;
        this.f29017c = io5Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        ao5 ao5Var;
        do5 do5Var;
        eo5 eo5Var;
        switch (this.f29015a) {
            case 0:
                if (fbkVar instanceof ao5) {
                    ao5Var = (ao5) fbkVar;
                    int i = ao5Var.f17577b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ao5Var.f17577b = i - Integer.MIN_VALUE;
                    } else {
                        ao5Var = new ao5(this, fbkVar);
                    }
                } else {
                    ao5Var = new ao5(this, fbkVar);
                }
                Object obj2 = ao5Var.f17576a;
                int i2 = ao5Var.f17577b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    fn5 fn5Var = new fn5((rey) obj, this.f29017c.f104129c.mo29037f());
                    ao5Var.f17577b = 1;
                    Object objEmit = this.f29016b.emit(fn5Var, ao5Var);
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
                yn5 yn5Var = this.f29017c.f104129c;
                if (fbkVar instanceof do5) {
                    do5Var = (do5) fbkVar;
                    int i3 = do5Var.f50946b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        do5Var.f50946b = i3 - Integer.MIN_VALUE;
                    } else {
                        do5Var = new do5(this, fbkVar);
                    }
                } else {
                    do5Var = new do5(this, fbkVar);
                }
                Object obj3 = do5Var.f50945a;
                int i4 = do5Var.f50946b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    zm5 zm5Var = new zm5(((Boolean) obj).booleanValue(), yn5Var.mo29033b(), new xu00(yn5Var.mo29037f(), "generate", 1));
                    do5Var.f50946b = 1;
                    Object objEmit2 = this.f29016b.emit(zm5Var, do5Var);
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
                if (fbkVar instanceof eo5) {
                    eo5Var = (eo5) fbkVar;
                    int i5 = eo5Var.f61295b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        eo5Var.f61295b = i5 - Integer.MIN_VALUE;
                    } else {
                        eo5Var = new eo5(this, fbkVar);
                    }
                } else {
                    eo5Var = new eo5(this, fbkVar);
                }
                Object obj4 = eo5Var.f61294a;
                int i6 = eo5Var.f61295b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    mn5 mn5Var = new mn5(this.f29017c.f104130d.m92208a(), ((Boolean) obj).booleanValue());
                    eo5Var.f61295b = 1;
                    Object objEmit3 = this.f29016b.emit(mn5Var, eo5Var);
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
        }
    }
}
