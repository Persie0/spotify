package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bjs extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27760a;

    /* JADX INFO: renamed from: b */
    public int f27761b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f27762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjs(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f27762c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27760a = obj;
        this.f27761b |= Integer.MIN_VALUE;
        return this.f27762c.emit(null, this);
    }
}
