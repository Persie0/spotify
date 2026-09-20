package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tjy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f221031a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2169nm f221032b;

    /* JADX INFO: renamed from: c */
    public int f221033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjy0(C2169nm c2169nm, ibk ibkVar) {
        super(ibkVar);
        this.f221032b = c2169nm;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221031a = obj;
        this.f221033c |= Integer.MIN_VALUE;
        return C2169nm.m64753a(this.f221032b, null, this);
    }
}
