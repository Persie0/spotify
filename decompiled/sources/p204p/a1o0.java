package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a1o0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11448a;

    /* JADX INFO: renamed from: b */
    public int f11449b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f11450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1o0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f11450c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f11448a = obj;
        this.f11449b |= Integer.MIN_VALUE;
        return this.f11450c.emit(null, this);
    }
}
