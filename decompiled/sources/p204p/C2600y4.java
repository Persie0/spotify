package p204p;

/* JADX INFO: renamed from: p.y4 */
/* JADX INFO: loaded from: classes8.dex */
public final class C2600y4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f269041a;

    /* JADX INFO: renamed from: b */
    public int f269042b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2637z4 f269043c;

    /* JADX INFO: renamed from: d */
    public int f269044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2600y4(C2637z4 c2637z4, ibk ibkVar) {
        super(ibkVar);
        this.f269043c = c2637z4;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f269041a = obj;
        this.f269042b |= Integer.MIN_VALUE;
        return this.f269043c.mo15629a(null, null, this);
    }
}
