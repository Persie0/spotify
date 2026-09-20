package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fmd extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f71025a;

    /* JADX INFO: renamed from: b */
    public int f71026b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f71027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmd(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f71027c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f71025a = obj;
        this.f71026b |= Integer.MIN_VALUE;
        return this.f71027c.emit(null, this);
    }
}
