package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ujq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231077a;

    /* JADX INFO: renamed from: b */
    public int f231078b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f231079c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f231079c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231077a = obj;
        this.f231078b |= Integer.MIN_VALUE;
        return this.f231079c.emit(null, this);
    }
}
