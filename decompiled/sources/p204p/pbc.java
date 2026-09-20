package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pbc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175767a;

    /* JADX INFO: renamed from: b */
    public int f175768b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f175769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbc(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f175769c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175767a = obj;
        this.f175768b |= Integer.MIN_VALUE;
        return this.f175769c.emit(null, this);
    }
}
