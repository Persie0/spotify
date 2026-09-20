package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cl0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39133a;

    /* JADX INFO: renamed from: b */
    public niz f39134b;

    /* JADX INFO: renamed from: c */
    public int f39135c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f39136d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ mb61 f39137e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f39138f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cl0(th00 th00Var, Object obj, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f39133a = i;
        switch (i) {
            case 1:
                this.f39137e = (mb61) th00Var;
                this.f39138f = obj;
                super(2, fbkVar);
                break;
            default:
                this.f39137e = (mb61) th00Var;
                this.f39138f = obj;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r3v1, types: [p.mb61, p.th00] */
    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f39133a) {
            case 0:
                cl0 cl0Var = new cl0(this.f39137e, this.f39138f, fbkVar, 0);
                cl0Var.f39136d = obj;
                return cl0Var;
            default:
                cl0 cl0Var2 = new cl0(this.f39137e, this.f39138f, fbkVar, 1);
                cl0Var2.f39136d = obj;
                return cl0Var2;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        niz nizVar = (niz) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f39133a) {
            case 0:
                break;
        }
        return ((cl0) create(nizVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r7v6, types: [p.mb61, p.th00] */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f39133a) {
            case 0:
                niz nizVar = (niz) this.f39136d;
                int i = this.f39135c;
                yuk yukVar = yuk.f276404a;
                if (i != 0) {
                    if (i == 1) {
                        nizVar = this.f39134b;
                        bga.m29073P(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                this.f39136d = null;
                this.f39134b = nizVar;
                this.f39135c = 1;
                obj = this.f39137e.invoke(this.f39138f, this);
                if (obj == yukVar) {
                    return yukVar;
                }
                this.f39136d = null;
                this.f39134b = null;
                this.f39135c = 2;
                if (nizVar.emit(obj, this) == yukVar) {
                    return yukVar;
                }
                return w2a1.f247311a;
            default:
                niz nizVar2 = (niz) this.f39136d;
                int i2 = this.f39135c;
                yuk yukVar2 = yuk.f276404a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        nizVar2 = this.f39134b;
                        bga.m29073P(obj);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                this.f39136d = null;
                this.f39134b = nizVar2;
                this.f39135c = 1;
                obj = this.f39137e.invoke(this.f39138f, this);
                if (obj == yukVar2) {
                    return yukVar2;
                }
                this.f39136d = null;
                this.f39134b = null;
                this.f39135c = 2;
                if (nizVar2.emit(obj, this) == yukVar2) {
                    return yukVar2;
                }
                return w2a1.f247311a;
        }
    }
}
