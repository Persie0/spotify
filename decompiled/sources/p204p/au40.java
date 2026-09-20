package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class au40 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f19836a;

    /* JADX INFO: renamed from: b */
    public d850 f19837b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f19838c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cu40 f19839d;

    /* JADX INFO: renamed from: e */
    public int f19840e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au40(cu40 cu40Var, ibk ibkVar) {
        super(ibkVar);
        this.f19839d = cu40Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19838c = obj;
        this.f19840e |= Integer.MIN_VALUE;
        return cu40.m33858b(this.f19839d, null, null, this);
    }
}
