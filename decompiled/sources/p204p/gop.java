package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gop extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f82989a;

    /* JADX INFO: renamed from: b */
    public int f82990b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f82991c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gop(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f82991c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f82989a = obj;
        this.f82990b |= Integer.MIN_VALUE;
        return this.f82991c.emit(null, this);
    }
}
