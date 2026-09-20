package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tpp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f222571a;

    /* JADX INFO: renamed from: b */
    public int f222572b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f222573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpp(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f222573c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222571a = obj;
        this.f222572b |= Integer.MIN_VALUE;
        return this.f222573c.emit(null, this);
    }
}
