package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class scp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f207781a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tcp f207782b;

    /* JADX INFO: renamed from: c */
    public int f207783c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scp(tcp tcpVar, ibk ibkVar) {
        super(ibkVar);
        this.f207782b = tcpVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f207781a = obj;
        this.f207783c |= Integer.MIN_VALUE;
        return this.f207782b.m80480b(null, null, this);
    }
}
