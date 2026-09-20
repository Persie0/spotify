package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u2q0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f226139a;

    /* JADX INFO: renamed from: b */
    public Object f226140b;

    /* JADX INFO: renamed from: c */
    public long f226141c;

    /* JADX INFO: renamed from: d */
    public long f226142d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f226143e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ v2q0 f226144f;

    /* JADX INFO: renamed from: g */
    public int f226145g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2q0(v2q0 v2q0Var, ibk ibkVar) {
        super(ibkVar);
        this.f226144f = v2q0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226143e = obj;
        this.f226145g |= Integer.MIN_VALUE;
        return this.f226144f.m84524a(null, null, null, false, this);
    }
}
