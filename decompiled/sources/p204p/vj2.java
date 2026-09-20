package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vj2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f241860a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ck2 f241861b;

    /* JADX INFO: renamed from: c */
    public int f241862c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj2(ck2 ck2Var, ibk ibkVar) {
        super(ibkVar);
        this.f241861b = ck2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f241860a = obj;
        this.f241862c |= Integer.MIN_VALUE;
        return this.f241861b.m33055L(this);
    }
}
