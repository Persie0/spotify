package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sok extends ibk {

    /* JADX INFO: renamed from: a */
    public String f211202a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f211203b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bpk f211204c;

    /* JADX INFO: renamed from: d */
    public int f211205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f211204c = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f211203b = obj;
        this.f211205d |= Integer.MIN_VALUE;
        return this.f211204c.m30127B(null, this);
    }
}
