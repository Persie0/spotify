package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cxw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public lu01 f43109a;

    /* JADX INFO: renamed from: b */
    public lxw0 f43110b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f43111c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fxw0 f43112d;

    /* JADX INFO: renamed from: e */
    public int f43113e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxw0(fxw0 fxw0Var, ibk ibkVar) {
        super(ibkVar);
        this.f43112d = fxw0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f43111c = obj;
        this.f43113e |= Integer.MIN_VALUE;
        return this.f43112d.m43027b(null, this);
    }
}
