package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rzz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f204264a;

    /* JADX INFO: renamed from: b */
    public int f204265b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f204266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzz0(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f204266c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204264a = obj;
        this.f204265b |= Integer.MIN_VALUE;
        return this.f204266c.emit(null, this);
    }
}
