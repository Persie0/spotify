package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ux4 extends ibk {

    /* JADX INFO: renamed from: a */
    public nlv0 f234818a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f234819b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yx4 f234820c;

    /* JADX INFO: renamed from: d */
    public int f234821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux4(yx4 yx4Var, ibk ibkVar) {
        super(ibkVar);
        this.f234820c = yx4Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234819b = obj;
        this.f234821d |= Integer.MIN_VALUE;
        return this.f234820c.mo39812a(this);
    }
}
