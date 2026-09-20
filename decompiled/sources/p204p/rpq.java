package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rpq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f201623a;

    /* JADX INFO: renamed from: b */
    public int f201624b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f201625c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f201625c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201623a = obj;
        this.f201624b |= Integer.MIN_VALUE;
        return this.f201625c.emit(null, this);
    }
}
