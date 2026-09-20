package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fbc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67780a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nbc f67781b;

    /* JADX INFO: renamed from: c */
    public int f67782c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbc(nbc nbcVar, ibk ibkVar) {
        super(ibkVar);
        this.f67781b = nbcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f67780a = obj;
        this.f67782c |= Integer.MIN_VALUE;
        return this.f67781b.m64068a(null, this);
    }
}
