package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ca21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35707a;

    /* JADX INFO: renamed from: b */
    public int f35708b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f35709c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca21(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f35709c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f35707a = obj;
        this.f35708b |= Integer.MIN_VALUE;
        return this.f35709c.emit(null, this);
    }
}
