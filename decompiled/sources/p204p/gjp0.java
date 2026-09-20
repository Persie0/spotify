package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gjp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f80516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kjp0 f80517b;

    /* JADX INFO: renamed from: c */
    public int f80518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjp0(kjp0 kjp0Var, ibk ibkVar) {
        super(ibkVar);
        this.f80517b = kjp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f80516a = obj;
        this.f80518c |= Integer.MIN_VALUE;
        return this.f80517b.m56618f(null, this);
    }
}
