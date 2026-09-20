package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x9e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259342a;

    /* JADX INFO: renamed from: b */
    public int f259343b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f259344c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9e1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f259344c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259342a = obj;
        this.f259343b |= Integer.MIN_VALUE;
        return this.f259344c.emit(null, this);
    }
}
