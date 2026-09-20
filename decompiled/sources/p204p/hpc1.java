package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hpc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f93748a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f93749b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kpc1 f93750c;

    /* JADX INFO: renamed from: d */
    public int f93751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpc1(kpc1 kpc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f93750c = kpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93749b = obj;
        this.f93751d |= Integer.MIN_VALUE;
        Object objM57025a = this.f93750c.m57025a(null, this);
        return objM57025a == yuk.f276404a ? objM57025a : new s6x0(objM57025a);
    }
}
