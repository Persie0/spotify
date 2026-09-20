package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vg4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f241113a;

    /* JADX INFO: renamed from: b */
    public int f241114b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f241115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg4(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f241115c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f241113a = obj;
        this.f241114b |= Integer.MIN_VALUE;
        return this.f241115c.emit(null, this);
    }
}
