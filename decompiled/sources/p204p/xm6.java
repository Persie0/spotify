package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xm6 extends ibk {

    /* JADX INFO: renamed from: a */
    public vb40 f263296a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f263297b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ym6 f263298c;

    /* JADX INFO: renamed from: d */
    public int f263299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm6(ym6 ym6Var, ibk ibkVar) {
        super(ibkVar);
        this.f263298c = ym6Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263297b = obj;
        this.f263299d |= Integer.MIN_VALUE;
        return this.f263298c.m94184a(null, null, this);
    }
}
