package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w7n0 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f248721a;

    /* JADX INFO: renamed from: b */
    public int f248722b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ niz f248723c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ tl0 f248724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7n0(int i) {
        super(3, null);
        this.f248721a = i;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        niz nizVar = (niz) obj;
        tl0 tl0Var = (tl0) obj2;
        fbk fbkVar = (fbk) obj3;
        switch (this.f248721a) {
            case 0:
                w7n0 w7n0Var = new w7n0(3, 0, fbkVar);
                w7n0Var.f248723c = nizVar;
                w7n0Var.f248724d = tl0Var;
                return w7n0Var.invokeSuspend(w2a1.f247311a);
            case 1:
                w7n0 w7n0Var2 = new w7n0(3, 1, fbkVar);
                w7n0Var2.f248723c = nizVar;
                w7n0Var2.f248724d = tl0Var;
                return w7n0Var2.invokeSuspend(w2a1.f247311a);
            default:
                w7n0 w7n0Var3 = new w7n0(3, 2, fbkVar);
                w7n0Var3.f248723c = nizVar;
                w7n0Var3.f248724d = tl0Var;
                return w7n0Var3.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f248721a) {
            case 0:
                niz nizVar = this.f248723c;
                tl0 tl0Var = this.f248724d;
                int i = this.f248722b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f248723c = null;
                    this.f248724d = tl0Var;
                    this.f248722b = 1;
                    Object objEmit = nizVar.emit(tl0Var, this);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return Boolean.valueOf(tl0Var.f221289g == 3);
            case 1:
                niz nizVar2 = this.f248723c;
                tl0 tl0Var2 = this.f248724d;
                int i2 = this.f248722b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f248723c = null;
                    this.f248724d = tl0Var2;
                    this.f248722b = 1;
                    Object objEmit2 = nizVar2.emit(tl0Var2, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return Boolean.valueOf(tl0Var2.f221289g == 3);
            default:
                niz nizVar3 = this.f248723c;
                tl0 tl0Var3 = this.f248724d;
                int i3 = this.f248722b;
                boolean z = true;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    this.f248723c = null;
                    this.f248724d = tl0Var3;
                    this.f248722b = 1;
                    Object objEmit3 = nizVar3.emit(tl0Var3, this);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                int i4 = tl0Var3.f221289g;
                if (i4 != 3 && i4 != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7n0(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f248721a = i2;
    }
}
