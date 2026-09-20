package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m181 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f138872a;

    /* JADX INFO: renamed from: b */
    public int f138873b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f138874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m181(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f138874c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f138872a = obj;
        this.f138873b |= Integer.MIN_VALUE;
        return this.f138874c.emit(null, this);
    }
}
