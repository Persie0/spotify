package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class p050 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f172494a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f172495b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tm4 f172496c;

    /* JADX INFO: renamed from: d */
    public int f172497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p050(tm4 tm4Var, ibk ibkVar) {
        super(ibkVar);
        this.f172496c = tm4Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f172495b = obj;
        this.f172497d |= Integer.MIN_VALUE;
        return this.f172496c.m81104f(null, this);
    }
}
