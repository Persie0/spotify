package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rif0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f199535a;

    /* JADX INFO: renamed from: b */
    public int f199536b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f199537c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rif0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f199537c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f199535a = obj;
        this.f199536b |= Integer.MIN_VALUE;
        return this.f199537c.emit(null, this);
    }
}
