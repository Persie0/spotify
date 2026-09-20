package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v7m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f238280a;

    /* JADX INFO: renamed from: b */
    public int f238281b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f238282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f238282c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f238280a = obj;
        this.f238281b |= Integer.MIN_VALUE;
        return this.f238282c.emit(null, this);
    }
}
