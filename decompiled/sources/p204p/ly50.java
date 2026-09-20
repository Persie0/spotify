package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ly50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f137959a;

    /* JADX INFO: renamed from: b */
    public int f137960b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f137961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly50(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f137961c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f137959a = obj;
        this.f137960b |= Integer.MIN_VALUE;
        return this.f137961c.emit(null, this);
    }
}
