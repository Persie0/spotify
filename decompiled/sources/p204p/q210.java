package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class q210 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f184456a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x210 f184457b;

    /* JADX INFO: renamed from: c */
    public int f184458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q210(x210 x210Var, ibk ibkVar) {
        super(ibkVar);
        this.f184457b = x210Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f184456a = obj;
        this.f184458c |= Integer.MIN_VALUE;
        return this.f184457b.m89698a(null, this);
    }
}
