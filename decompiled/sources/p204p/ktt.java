package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ktt extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126395a;

    /* JADX INFO: renamed from: b */
    public int f126396b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ niz f126397c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Throwable f126398d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f126399e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ktt(String str, fbk fbkVar, int i) {
        super(3, fbkVar);
        this.f126395a = i;
        this.f126399e = str;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        niz nizVar = (niz) obj;
        Throwable th = (Throwable) obj2;
        fbk fbkVar = (fbk) obj3;
        switch (this.f126395a) {
            case 0:
                ktt kttVar = new ktt(this.f126399e, fbkVar, 0);
                kttVar.f126397c = nizVar;
                kttVar.f126398d = th;
                return kttVar.invokeSuspend(w2a1.f247311a);
            default:
                ktt kttVar2 = new ktt(this.f126399e, fbkVar, 1);
                kttVar2.f126397c = nizVar;
                kttVar2.f126398d = th;
                return kttVar2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f126395a) {
            case 0:
                niz nizVar = this.f126397c;
                Throwable th = this.f126398d;
                int i = this.f126396b;
                if (i == 0) {
                    bga.m29073P(obj);
                    na6.m63972t("Could not load progress for " + this.f126399e, th);
                    this.f126397c = null;
                    this.f126398d = null;
                    this.f126396b = 1;
                    Object objEmit = nizVar.emit(null, this);
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
                niz nizVar2 = this.f126397c;
                Throwable th2 = this.f126398d;
                int i2 = this.f126396b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    s6x0 s6x0Var = new s6x0(new c6x0(new RuntimeException(edb.m38564m("Failed to search for ", this.f126399e), th2)));
                    this.f126397c = null;
                    this.f126398d = null;
                    this.f126396b = 1;
                    Object objEmit2 = nizVar2.emit(s6x0Var, this);
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
