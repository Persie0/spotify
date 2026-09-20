package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k090 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f117935a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f117936b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n090 f117937c;

    /* JADX INFO: renamed from: d */
    public int f117938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k090(n090 n090Var, ibk ibkVar) {
        super(ibkVar);
        this.f117937c = n090Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f117936b = obj;
        this.f117938d |= Integer.MIN_VALUE;
        return this.f117937c.m63316m(null, this);
    }
}
