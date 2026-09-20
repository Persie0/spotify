package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ihq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f102345a;

    /* JADX INFO: renamed from: b */
    public int f102346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f102347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f102347c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f102345a = obj;
        this.f102346b |= Integer.MIN_VALUE;
        return this.f102347c.emit(null, this);
    }
}
