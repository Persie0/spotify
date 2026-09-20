package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zoe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284772a;

    /* JADX INFO: renamed from: b */
    public int f284773b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ape f284774c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoe(ape apeVar, ibk ibkVar) {
        super(ibkVar);
        this.f284774c = apeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284772a = obj;
        this.f284773b |= Integer.MIN_VALUE;
        return this.f284774c.mo15629a(null, null, this);
    }
}
