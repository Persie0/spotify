package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class da2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46959a;

    /* JADX INFO: renamed from: b */
    public int f46960b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f46961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f46961c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46959a = obj;
        this.f46960b |= Integer.MIN_VALUE;
        return this.f46961c.emit(null, this);
    }
}
