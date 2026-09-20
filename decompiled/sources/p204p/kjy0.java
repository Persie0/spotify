package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kjy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f123446a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f123447b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mjy0 f123448c;

    /* JADX INFO: renamed from: d */
    public int f123449d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjy0(mjy0 mjy0Var, ibk ibkVar) {
        super(ibkVar);
        this.f123448c = mjy0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f123447b = obj;
        this.f123449d |= Integer.MIN_VALUE;
        return this.f123448c.m62049a(this);
    }
}
