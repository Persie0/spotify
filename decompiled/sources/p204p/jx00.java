package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jx00 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f116753a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f116754b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ px00 f116755c;

    /* JADX INFO: renamed from: d */
    public int f116756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx00(px00 px00Var, ibk ibkVar) {
        super(ibkVar);
        this.f116755c = px00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116754b = obj;
        this.f116756d |= Integer.MIN_VALUE;
        return this.f116755c.m71338b(null, this);
    }
}
