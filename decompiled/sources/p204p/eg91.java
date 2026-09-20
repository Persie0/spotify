package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eg91 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f59281a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f59282b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kg91 f59283c;

    /* JADX INFO: renamed from: d */
    public int f59284d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg91(kg91 kg91Var, ibk ibkVar) {
        super(ibkVar);
        this.f59283c = kg91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f59282b = obj;
        this.f59284d |= Integer.MIN_VALUE;
        return this.f59283c.m56319i(0L, this);
    }
}
