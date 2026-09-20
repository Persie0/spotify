package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zp80 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285015a;

    /* JADX INFO: renamed from: b */
    public int f285016b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f285017c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e7a1 f285018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp80(e7a1 e7a1Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f285015a = i;
        this.f285018d = e7a1Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f285015a) {
            case 0:
                zp80 zp80Var = new zp80(this.f285018d, fbkVar, 0);
                zp80Var.f285017c = obj;
                return zp80Var;
            default:
                zp80 zp80Var2 = new zp80(this.f285018d, fbkVar, 1);
                zp80Var2.f285017c = obj;
                return zp80Var2;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        niz nizVar = (niz) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f285015a) {
            case 0:
                break;
        }
        return ((zp80) create(nizVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f285015a) {
            case 0:
                niz nizVar = (niz) this.f285017c;
                int i = this.f285016b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f285017c = null;
                    this.f285016b = 1;
                    Object objEmit = nizVar.emit(this.f285018d, this);
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
                return w2a1.f247311a;
            default:
                niz nizVar2 = (niz) this.f285017c;
                int i2 = this.f285016b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f285017c = null;
                    this.f285016b = 1;
                    Object objEmit2 = nizVar2.emit(this.f285018d, this);
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
                return w2a1.f247311a;
        }
    }
}
