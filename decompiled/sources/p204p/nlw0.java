package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nlw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public xmy0 f155175a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f155176b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ulw0 f155177c;

    /* JADX INFO: renamed from: d */
    public int f155178d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlw0(ulw0 ulw0Var, ibk ibkVar) {
        super(ibkVar);
        this.f155177c = ulw0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f155176b = obj;
        this.f155178d |= Integer.MIN_VALUE;
        return ulw0.m83405a(this.f155177c, null, this);
    }
}
