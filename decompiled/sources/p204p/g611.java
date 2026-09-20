package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g611 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f76828a;

    /* JADX INFO: renamed from: b */
    public String f76829b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f76830c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ h611 f76831d;

    /* JADX INFO: renamed from: e */
    public int f76832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g611(h611 h611Var, ibk ibkVar) {
        super(ibkVar);
        this.f76831d = h611Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f76830c = obj;
        this.f76832e |= Integer.MIN_VALUE;
        return this.f76831d.m46702c(null, null, this);
    }
}
