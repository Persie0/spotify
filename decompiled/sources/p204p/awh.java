package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class awh extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20537a;

    /* JADX INFO: renamed from: b */
    public int f20538b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bwh f20539c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awh(bwh bwhVar, ibk ibkVar) {
        super(ibkVar);
        this.f20539c = bwhVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20537a = obj;
        this.f20538b |= Integer.MIN_VALUE;
        return this.f20539c.mo15629a(null, null, this);
    }
}
