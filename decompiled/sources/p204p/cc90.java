package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cc90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f36351a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gc90 f36352b;

    /* JADX INFO: renamed from: c */
    public int f36353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc90(gc90 gc90Var, ibk ibkVar) {
        super(ibkVar);
        this.f36352b = gc90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f36351a = obj;
        this.f36353c |= Integer.MIN_VALUE;
        return this.f36352b.m44308h(this);
    }
}
