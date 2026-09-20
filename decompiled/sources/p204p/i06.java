package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class i06 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f97140a;

    /* JADX INFO: renamed from: b */
    public int f97141b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f97142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i06(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f97142c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f97140a = obj;
        this.f97141b |= Integer.MIN_VALUE;
        return this.f97142c.emit(null, this);
    }
}
