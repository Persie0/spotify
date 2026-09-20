package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class g6a1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77004a;

    /* JADX INFO: renamed from: b */
    public int f77005b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f77006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6a1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f77006c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77004a = obj;
        this.f77005b |= Integer.MIN_VALUE;
        return this.f77006c.emit(null, this);
    }
}
