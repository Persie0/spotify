package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fhj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public rlv0 f69674a;

    /* JADX INFO: renamed from: b */
    public rlv0 f69675b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f69676c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ jhj0 f69677d;

    /* JADX INFO: renamed from: e */
    public int f69678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhj0(jhj0 jhj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f69677d = jhj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f69676c = obj;
        this.f69678e |= Integer.MIN_VALUE;
        return this.f69677d.mo25711a(this);
    }
}
