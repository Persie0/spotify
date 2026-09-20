package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m8n0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f141098a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f141099b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s8n0 f141100c;

    public /* synthetic */ m8n0(niz nizVar, s8n0 s8n0Var, int i) {
        this.f141098a = i;
        this.f141099b = nizVar;
        this.f141100c = s8n0Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        l8n0 l8n0Var;
        o8n0 o8n0Var;
        q8n0 q8n0Var;
        switch (this.f141098a) {
            case 0:
                if (fbkVar instanceof l8n0) {
                    l8n0Var = (l8n0) fbkVar;
                    int i = l8n0Var.f130898b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        l8n0Var.f130898b = i - Integer.MIN_VALUE;
                    } else {
                        l8n0Var = new l8n0(this, fbkVar);
                    }
                } else {
                    l8n0Var = new l8n0(this, fbkVar);
                }
                Object obj2 = l8n0Var.f130897a;
                int i2 = l8n0Var.f130898b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    x8n0 x8n0Var = (x8n0) obj;
                    qou0 qou0Var = new qou0(wj50.m88271j(x8n0Var.f259188a, this.f141100c.f206686a.f246009a) && x8n0Var.f259189b == 2);
                    l8n0Var.f130898b = 1;
                    Object objEmit = this.f141099b.emit(qou0Var, l8n0Var);
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
                if (fbkVar instanceof o8n0) {
                    o8n0Var = (o8n0) fbkVar;
                    int i3 = o8n0Var.f162838b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        o8n0Var.f162838b = i3 - Integer.MIN_VALUE;
                    } else {
                        o8n0Var = new o8n0(this, fbkVar);
                    }
                } else {
                    o8n0Var = new o8n0(this, fbkVar);
                }
                Object obj3 = o8n0Var.f162837a;
                int i4 = o8n0Var.f162838b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    x8n0 x8n0Var2 = (x8n0) obj;
                    if (wj50.m88271j(x8n0Var2.f259188a, this.f141100c.f206686a.f246009a) && x8n0Var2.f259189b == 3) {
                        o8n0Var.f162838b = 1;
                        Object objEmit2 = this.f141099b.emit(obj, o8n0Var);
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
                if (fbkVar instanceof q8n0) {
                    q8n0Var = (q8n0) fbkVar;
                    int i5 = q8n0Var.f186347b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        q8n0Var.f186347b = i5 - Integer.MIN_VALUE;
                    } else {
                        q8n0Var = new q8n0(this, fbkVar);
                    }
                } else {
                    q8n0Var = new q8n0(this, fbkVar);
                }
                Object obj4 = q8n0Var.f186346a;
                int i6 = q8n0Var.f186347b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    x8n0 x8n0Var3 = (x8n0) obj;
                    if (wj50.m88271j(x8n0Var3.f259188a, this.f141100c.f206686a.f246009a) && x8n0Var3.f259189b == 3) {
                        q8n0Var.f186347b = 1;
                        Object objEmit3 = this.f141099b.emit(obj, q8n0Var);
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
