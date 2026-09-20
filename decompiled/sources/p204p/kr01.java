package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kr01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125487a;

    /* JADX INFO: renamed from: b */
    public int f125488b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f125489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr01(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f125489c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125487a = obj;
        this.f125488b |= Integer.MIN_VALUE;
        return this.f125489c.emit(null, this);
    }
}
