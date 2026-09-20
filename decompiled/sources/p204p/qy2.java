package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qy2 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f193786a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f193787b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sy2 f193788c;

    /* JADX INFO: renamed from: d */
    public int f193789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy2(sy2 sy2Var, ibk ibkVar) {
        super(ibkVar);
        this.f193788c = sy2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f193787b = obj;
        this.f193789d |= Integer.MIN_VALUE;
        return this.f193788c.m79674c(null, null, this);
    }
}
