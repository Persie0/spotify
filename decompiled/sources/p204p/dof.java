package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dof extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f51028a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gof f51029b;

    /* JADX INFO: renamed from: c */
    public int f51030c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dof(gof gofVar, ibk ibkVar) {
        super(ibkVar);
        this.f51029b = gofVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f51028a = obj;
        this.f51030c |= Integer.MIN_VALUE;
        return this.f51029b.m45344b(null, this);
    }
}
