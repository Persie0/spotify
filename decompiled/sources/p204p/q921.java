package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q921 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186461a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r921 f186462b;

    /* JADX INFO: renamed from: c */
    public int f186463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q921(r921 r921Var, ibk ibkVar) {
        super(ibkVar);
        this.f186462b = r921Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186461a = obj;
        this.f186463c |= Integer.MIN_VALUE;
        return this.f186462b.m75009d(null, this);
    }
}
