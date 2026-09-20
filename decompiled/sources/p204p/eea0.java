package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class eea0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58727a;

    /* JADX INFO: renamed from: b */
    public int f58728b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f58729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eea0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f58729c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58727a = obj;
        this.f58728b |= Integer.MIN_VALUE;
        return this.f58729c.emit(null, this);
    }
}
