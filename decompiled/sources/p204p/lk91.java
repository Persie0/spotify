package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lk91 extends ibk {

    /* JADX INFO: renamed from: a */
    public ivw f134294a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f134295b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jhz0 f134296c;

    /* JADX INFO: renamed from: d */
    public int f134297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk91(jhz0 jhz0Var, ibk ibkVar) {
        super(ibkVar);
        this.f134296c = jhz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134295b = obj;
        this.f134297d |= Integer.MIN_VALUE;
        return this.f134296c.m53432a(null, this);
    }
}
