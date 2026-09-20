package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ro51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f201083a;

    /* JADX INFO: renamed from: b */
    public int f201084b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vjy0 f201085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro51(vjy0 vjy0Var, fbk fbkVar) {
        super(fbkVar);
        this.f201085c = vjy0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201083a = obj;
        this.f201084b |= Integer.MIN_VALUE;
        return this.f201085c.emit(null, this);
    }
}
