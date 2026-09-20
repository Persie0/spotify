package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j311 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f108262a;

    /* JADX INFO: renamed from: b */
    public int f108263b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f108264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j311(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f108264c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f108262a = obj;
        this.f108263b |= Integer.MIN_VALUE;
        return this.f108264c.emit(null, this);
    }
}
