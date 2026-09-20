package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rcp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f197908a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tcp f197909b;

    /* JADX INFO: renamed from: c */
    public int f197910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcp(tcp tcpVar, ibk ibkVar) {
        super(ibkVar);
        this.f197909b = tcpVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197908a = obj;
        this.f197910c |= Integer.MIN_VALUE;
        return this.f197909b.m80479a(null, null, this);
    }
}
