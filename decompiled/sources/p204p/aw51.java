package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class aw51 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f20402a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f20403b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ew51 f20404c;

    /* JADX INFO: renamed from: d */
    public int f20405d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw51(ew51 ew51Var, ibk ibkVar) {
        super(ibkVar);
        this.f20404c = ew51Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20403b = obj;
        this.f20405d |= Integer.MIN_VALUE;
        return this.f20404c.m40134b(null, this);
    }
}
