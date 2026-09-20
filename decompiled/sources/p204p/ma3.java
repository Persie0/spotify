package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ma3 extends ibk {

    /* JADX INFO: renamed from: a */
    public ya3 f141440a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f141441b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ya3 f141442c;

    /* JADX INFO: renamed from: d */
    public int f141443d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma3(ya3 ya3Var, ibk ibkVar) {
        super(ibkVar);
        this.f141442c = ya3Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141441b = obj;
        this.f141443d |= Integer.MIN_VALUE;
        return this.f141442c.m93173f(null, this);
    }
}
