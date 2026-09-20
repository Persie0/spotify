package p204p;

/* JADX INFO: renamed from: p.a5 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1655a5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f12357a;

    /* JADX INFO: renamed from: b */
    public int f12358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1692b5 f12359c;

    /* JADX INFO: renamed from: d */
    public bqz0 f12360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1655a5(C1692b5 c1692b5, ibk ibkVar) {
        super(ibkVar);
        this.f12359c = c1692b5;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f12357a = obj;
        this.f12358b |= Integer.MIN_VALUE;
        return this.f12359c.mo15629a(null, null, this);
    }
}
