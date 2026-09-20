package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qry0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191925a;

    /* JADX INFO: renamed from: b */
    public int f191926b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rry0 f191927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qry0(rry0 rry0Var, fbk fbkVar) {
        super(fbkVar);
        this.f191927c = rry0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191925a = obj;
        this.f191926b |= Integer.MIN_VALUE;
        return this.f191927c.emit(null, this);
    }
}
