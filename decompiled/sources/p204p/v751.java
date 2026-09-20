package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v751 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f238062a;

    /* JADX INFO: renamed from: b */
    public long f238063b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f238064c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ x751 f238065d;

    /* JADX INFO: renamed from: e */
    public int f238066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v751(x751 x751Var, ibk ibkVar) {
        super(ibkVar);
        this.f238065d = x751Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f238064c = obj;
        this.f238066e |= Integer.MIN_VALUE;
        return this.f238065d.m90142d(null, null, this);
    }
}
