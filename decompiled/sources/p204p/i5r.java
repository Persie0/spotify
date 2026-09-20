package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i5r extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f99010a;

    /* JADX INFO: renamed from: b */
    public int f99011b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f99012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5r(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f99012c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99010a = obj;
        this.f99011b |= Integer.MIN_VALUE;
        return this.f99012c.emit(null, this);
    }
}
