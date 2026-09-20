package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bdy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26233a;

    /* JADX INFO: renamed from: b */
    public int f26234b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f26235c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdy0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f26235c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f26233a = obj;
        this.f26234b |= Integer.MIN_VALUE;
        return this.f26235c.emit(null, this);
    }
}
