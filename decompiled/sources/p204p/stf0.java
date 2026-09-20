package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class stf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f213901a;

    /* JADX INFO: renamed from: b */
    public mtf0 f213902b;

    /* JADX INFO: renamed from: c */
    public d850 f213903c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f213904d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ttf0 f213905e;

    /* JADX INFO: renamed from: f */
    public int f213906f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stf0(ttf0 ttf0Var, ibk ibkVar) {
        super(ibkVar);
        this.f213905e = ttf0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213904d = obj;
        this.f213906f |= Integer.MIN_VALUE;
        return this.f213905e.m81504c(null, null, null, this);
    }
}
