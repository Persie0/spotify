package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class u7i0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f227707a;

    /* JADX INFO: renamed from: b */
    public int f227708b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f227709c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7i0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f227709c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f227707a = obj;
        this.f227708b |= Integer.MIN_VALUE;
        return this.f227709c.emit(null, this);
    }
}
