package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class czb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f43520a;

    /* JADX INFO: renamed from: b */
    public int f43521b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f43522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f43522c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f43520a = obj;
        this.f43521b |= Integer.MIN_VALUE;
        return this.f43522c.emit(null, this);
    }
}
