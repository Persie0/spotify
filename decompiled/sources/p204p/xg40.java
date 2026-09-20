package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xg40 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f261196a;

    /* JADX INFO: renamed from: b */
    public wg40 f261197b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f261198c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bh40 f261199d;

    /* JADX INFO: renamed from: e */
    public int f261200e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg40(bh40 bh40Var, ibk ibkVar) {
        super(ibkVar);
        this.f261199d = bh40Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f261198c = obj;
        this.f261200e |= Integer.MIN_VALUE;
        return this.f261199d.m29199a(null, this);
    }
}
