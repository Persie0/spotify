package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kyz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f127954a;

    /* JADX INFO: renamed from: b */
    public int f127955b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f127956c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f127956c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f127954a = obj;
        this.f127955b |= Integer.MIN_VALUE;
        return this.f127956c.emit(null, this);
    }
}
