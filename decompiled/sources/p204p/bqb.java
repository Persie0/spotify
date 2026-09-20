package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bqb extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public int f29770a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xbk0 f29771b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f29772c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bqz0 f29773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqb(xbk0 xbk0Var, Object obj, bqz0 bqz0Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f29771b = xbk0Var;
        this.f29772c = obj;
        this.f29773d = bqz0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        return new bqb(this.f29771b, this.f29772c, this.f29773d, fbkVar);
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        return ((bqb) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        int i = this.f29770a;
        if (i == 0) {
            bga.m29073P(obj);
            this.f29770a = 1;
            Object objMo15629a = this.f29771b.mo15629a(this.f29772c, this.f29773d, this);
            yuk yukVar = yuk.f276404a;
            if (objMo15629a == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }
}
