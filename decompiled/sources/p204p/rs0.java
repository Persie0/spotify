package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rs0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f202151a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ss0 f202152b;

    /* JADX INFO: renamed from: c */
    public int f202153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(ss0 ss0Var, ibk ibkVar) {
        super(ibkVar);
        this.f202152b = ss0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202151a = obj;
        this.f202153c |= Integer.MIN_VALUE;
        return this.f202152b.m79169a(null, this);
    }
}
