package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vnv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f243254a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ynv0 f243255b;

    /* JADX INFO: renamed from: c */
    public int f243256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnv0(ynv0 ynv0Var, ibk ibkVar) {
        super(ibkVar);
        this.f243255b = ynv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243254a = obj;
        this.f243256c |= Integer.MIN_VALUE;
        return this.f243255b.m94260a(null, null, this);
    }
}
