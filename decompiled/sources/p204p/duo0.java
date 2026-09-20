package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class duo0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53244a;

    /* JADX INFO: renamed from: b */
    public int f53245b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f53246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duo0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f53246c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53244a = obj;
        this.f53245b |= Integer.MIN_VALUE;
        return this.f53246c.emit(null, this);
    }
}
