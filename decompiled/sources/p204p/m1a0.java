package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m1a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f138910a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n1a0 f138911b;

    /* JADX INFO: renamed from: c */
    public int f138912c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1a0(n1a0 n1a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f138911b = n1a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f138910a = obj;
        this.f138912c |= Integer.MIN_VALUE;
        return this.f138911b.invoke(this);
    }
}
