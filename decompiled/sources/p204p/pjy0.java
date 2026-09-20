package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pjy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f178326a;

    /* JADX INFO: renamed from: b */
    public int f178327b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f178328c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjy0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f178328c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f178326a = obj;
        this.f178327b |= Integer.MIN_VALUE;
        return this.f178328c.emit(null, this);
    }
}
