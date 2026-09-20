package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class d0d1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f43850a;

    /* JADX INFO: renamed from: b */
    public String f43851b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f43852c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ f0d1 f43853d;

    /* JADX INFO: renamed from: e */
    public int f43854e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0d1(f0d1 f0d1Var, ibk ibkVar) {
        super(ibkVar);
        this.f43853d = f0d1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f43852c = obj;
        this.f43854e |= Integer.MIN_VALUE;
        return this.f43853d.m40473b(null, null, this);
    }
}
