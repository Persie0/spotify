package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class spq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f212913a;

    /* JADX INFO: renamed from: b */
    public int f212914b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f212915c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f212915c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f212913a = obj;
        this.f212914b |= Integer.MIN_VALUE;
        return this.f212915c.emit(null, this);
    }
}
