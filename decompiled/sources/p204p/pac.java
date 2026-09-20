package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pac extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175468a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qac f175469b;

    /* JADX INFO: renamed from: c */
    public int f175470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pac(qac qacVar, ibk ibkVar) {
        super(ibkVar);
        this.f175469b = qacVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175468a = obj;
        this.f175470c |= Integer.MIN_VALUE;
        return this.f175469b.mo66545a(this);
    }
}
