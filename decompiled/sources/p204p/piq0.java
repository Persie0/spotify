package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class piq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f178003a;

    /* JADX INFO: renamed from: b */
    public int f178004b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f178005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public piq0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f178005c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f178003a = obj;
        this.f178004b |= Integer.MIN_VALUE;
        return this.f178005c.emit(null, this);
    }
}
