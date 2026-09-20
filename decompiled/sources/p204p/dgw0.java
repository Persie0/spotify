package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dgw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f48904a;

    /* JADX INFO: renamed from: b */
    public st91 f48905b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f48906c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mzp0 f48907d;

    /* JADX INFO: renamed from: e */
    public int f48908e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgw0(mzp0 mzp0Var, ibk ibkVar) {
        super(ibkVar);
        this.f48907d = mzp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f48906c = obj;
        this.f48908e |= Integer.MIN_VALUE;
        return this.f48907d.mo36073a(null, null, null, this);
    }
}
