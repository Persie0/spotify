package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pbi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175847a;

    /* JADX INFO: renamed from: b */
    public int f175848b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qbi f175849c;

    /* JADX INFO: renamed from: d */
    public bqz0 f175850d;

    /* JADX INFO: renamed from: e */
    public int f175851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbi(qbi qbiVar, ibk ibkVar) {
        super(ibkVar);
        this.f175849c = qbiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175847a = obj;
        this.f175848b |= Integer.MIN_VALUE;
        return this.f175849c.mo15629a(null, null, this);
    }
}
