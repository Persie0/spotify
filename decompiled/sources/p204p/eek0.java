package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eek0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58809a;

    /* JADX INFO: renamed from: b */
    public int f58810b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dek0 f58811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eek0(dek0 dek0Var, fbk fbkVar) {
        super(fbkVar);
        this.f58811c = dek0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58809a = obj;
        this.f58810b |= Integer.MIN_VALUE;
        return this.f58811c.emit(null, this);
    }
}
