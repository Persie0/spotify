package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o87 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f162726a;

    /* JADX INFO: renamed from: b */
    public int f162727b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f162728c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o87(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f162728c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f162726a = obj;
        this.f162727b |= Integer.MIN_VALUE;
        return this.f162728c.emit(null, this);
    }
}
