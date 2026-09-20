package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p17 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f172961a;

    /* JADX INFO: renamed from: b */
    public int f172962b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q17 f172963c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p17(q17 q17Var, fbk fbkVar) {
        super(fbkVar);
        this.f172963c = q17Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f172961a = obj;
        this.f172962b |= Integer.MIN_VALUE;
        return this.f172963c.emit(null, this);
    }
}
