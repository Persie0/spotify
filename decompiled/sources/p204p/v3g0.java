package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v3g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f236879a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f236880b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z3g0 f236881c;

    /* JADX INFO: renamed from: d */
    public int f236882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3g0(z3g0 z3g0Var, ibk ibkVar) {
        super(ibkVar);
        this.f236881c = z3g0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f236880b = obj;
        this.f236882d |= Integer.MIN_VALUE;
        return this.f236881c.m95278c(null, this);
    }
}
