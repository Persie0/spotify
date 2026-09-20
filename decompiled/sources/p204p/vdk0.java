package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vdk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f240415a;

    /* JADX INFO: renamed from: b */
    public int f240416b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f240417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdk0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f240417c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f240415a = obj;
        this.f240416b |= Integer.MIN_VALUE;
        return this.f240417c.emit(null, this);
    }
}
