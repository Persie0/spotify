package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ysp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f275848a;

    /* JADX INFO: renamed from: b */
    public int f275849b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f275850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysp(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f275850c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f275848a = obj;
        this.f275849b |= Integer.MIN_VALUE;
        return this.f275850c.emit(null, this);
    }
}
