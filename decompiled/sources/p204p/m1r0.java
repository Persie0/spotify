package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class m1r0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139058a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n1r0 f139059b;

    /* JADX INFO: renamed from: c */
    public int f139060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1r0(n1r0 n1r0Var, ibk ibkVar) {
        super(ibkVar);
        this.f139059b = n1r0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139058a = obj;
        this.f139060c |= Integer.MIN_VALUE;
        return this.f139059b.m63520l(this);
    }
}
