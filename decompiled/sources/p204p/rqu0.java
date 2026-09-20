package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rqu0 extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public int f201888a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mb61 f201889b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f201890c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f201891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rqu0(vh00 vh00Var, long j, long j2, fbk fbkVar) {
        super(1, fbkVar);
        this.f201889b = (mb61) vh00Var;
        this.f201890c = j;
        this.f201891d = j2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.mb61, p.vh00] */
    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        return new rqu0(this.f201889b, this.f201890c, this.f201891d, fbkVar);
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        return ((rqu0) create((fbk) obj)).invokeSuspend(w2a1.f247311a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [p.mb61, p.vh00] */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        int i = this.f201888a;
        if (i == 0) {
            bga.m29073P(obj);
            Long l = new Long(this.f201890c);
            Long l2 = new Long(this.f201891d);
            this.f201888a = 1;
            Object objMo24510D0 = this.f201889b.mo24510D0(l, l2, this);
            yuk yukVar = yuk.f276404a;
            if (objMo24510D0 == yukVar) {
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
