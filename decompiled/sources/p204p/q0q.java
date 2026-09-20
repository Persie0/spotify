package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q0q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f184056a;

    /* JADX INFO: renamed from: b */
    public int f184057b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f184058c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0q(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f184058c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f184056a = obj;
        this.f184057b |= Integer.MIN_VALUE;
        return this.f184058c.emit(null, this);
    }
}
