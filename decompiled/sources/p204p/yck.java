package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yck extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f271507a;

    /* JADX INFO: renamed from: b */
    public int f271508b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wk8 f271509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yck(wk8 wk8Var, fbk fbkVar) {
        super(fbkVar);
        this.f271509c = wk8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f271507a = obj;
        this.f271508b |= Integer.MIN_VALUE;
        return this.f271509c.emit(null, this);
    }
}
