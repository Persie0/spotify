package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u3l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f226404a;

    /* JADX INFO: renamed from: b */
    public int f226405b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wk8 f226406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3l0(wk8 wk8Var, fbk fbkVar) {
        super(fbkVar);
        this.f226406c = wk8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226404a = obj;
        this.f226405b |= Integer.MIN_VALUE;
        return this.f226406c.emit(null, this);
    }
}
