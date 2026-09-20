package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h530 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f87712a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f87713b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j530 f87714c;

    /* JADX INFO: renamed from: d */
    public int f87715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h530(j530 j530Var, ibk ibkVar) {
        super(ibkVar);
        this.f87714c = j530Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87713b = obj;
        this.f87715d |= Integer.MIN_VALUE;
        return this.f87714c.m52433e(false, null, this);
    }
}
