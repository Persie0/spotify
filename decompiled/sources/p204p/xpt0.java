package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xpt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f264723a;

    /* JADX INFO: renamed from: b */
    public int f264724b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f264725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpt0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f264725c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f264723a = obj;
        this.f264724b |= Integer.MIN_VALUE;
        return this.f264725c.emit(null, this);
    }
}
