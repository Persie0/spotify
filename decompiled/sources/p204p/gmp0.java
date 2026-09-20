package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gmp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f81441a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lmp0 f81442b;

    /* JADX INFO: renamed from: c */
    public int f81443c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmp0(lmp0 lmp0Var, ibk ibkVar) {
        super(ibkVar);
        this.f81442b = lmp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f81441a = obj;
        this.f81443c |= Integer.MIN_VALUE;
        return this.f81442b.m59457i(null, this);
    }
}
