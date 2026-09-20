package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pf6 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f176971a;

    /* JADX INFO: renamed from: b */
    public int f176972b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f176973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf6(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f176973c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f176971a = obj;
        this.f176972b |= Integer.MIN_VALUE;
        return this.f176973c.emit(null, this);
    }
}
