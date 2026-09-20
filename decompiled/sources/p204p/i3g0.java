package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i3g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f98173a;

    /* JADX INFO: renamed from: b */
    public Object f98174b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f98175c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ j3g0 f98176d;

    /* JADX INFO: renamed from: e */
    public int f98177e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3g0(j3g0 j3g0Var, ibk ibkVar) {
        super(ibkVar);
        this.f98176d = j3g0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f98175c = obj;
        this.f98177e |= Integer.MIN_VALUE;
        Object objM52261e = this.f98176d.m52261e(null, this);
        return objM52261e == yuk.f276404a ? objM52261e : new s6x0(objM52261e);
    }
}
