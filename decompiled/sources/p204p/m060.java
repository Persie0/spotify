package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m060 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f138542a;

    /* JADX INFO: renamed from: b */
    public int f138543b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f138544c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m060(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f138544c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f138542a = obj;
        this.f138543b |= Integer.MIN_VALUE;
        return this.f138544c.emit(null, this);
    }
}
