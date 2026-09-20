package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j8n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f109971a;

    /* JADX INFO: renamed from: b */
    public long f109972b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f109973c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ k8n0 f109974d;

    /* JADX INFO: renamed from: e */
    public int f109975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8n0(k8n0 k8n0Var, ibk ibkVar) {
        super(ibkVar);
        this.f109974d = k8n0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f109973c = obj;
        this.f109975e |= Integer.MIN_VALUE;
        return this.f109974d.m55752a(0L, null, this);
    }
}
