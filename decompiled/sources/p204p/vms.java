package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vms extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f242924a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xms f242925b;

    /* JADX INFO: renamed from: c */
    public int f242926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vms(xms xmsVar, ibk ibkVar) {
        super(ibkVar);
        this.f242925b = xmsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f242924a = obj;
        this.f242926c |= Integer.MIN_VALUE;
        xms.m91473g(this.f242925b, null, this);
        return yuk.f276404a;
    }
}
