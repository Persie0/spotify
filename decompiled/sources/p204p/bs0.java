package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bs0 extends ibk {

    /* JADX INFO: renamed from: a */
    public fh0 f30201a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f30202b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ es0 f30203c;

    /* JADX INFO: renamed from: d */
    public int f30204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs0(es0 es0Var, ibk ibkVar) {
        super(ibkVar);
        this.f30203c = es0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f30202b = obj;
        this.f30204d |= Integer.MIN_VALUE;
        return this.f30203c.m39852b(this);
    }
}
