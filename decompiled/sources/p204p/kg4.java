package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kg4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f122295a;

    /* JADX INFO: renamed from: b */
    public int f122296b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f122297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg4(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f122297c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f122295a = obj;
        this.f122296b |= Integer.MIN_VALUE;
        return this.f122297c.emit(null, this);
    }
}
