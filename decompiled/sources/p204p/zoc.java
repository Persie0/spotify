package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zoc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284758a;

    /* JADX INFO: renamed from: b */
    public int f284759b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ apc f284760c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoc(apc apcVar, ibk ibkVar) {
        super(ibkVar);
        this.f284760c = apcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284758a = obj;
        this.f284759b |= Integer.MIN_VALUE;
        return this.f284760c.mo15629a(null, null, this);
    }
}
