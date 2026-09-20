package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rk20 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f199953a;

    /* JADX INFO: renamed from: b */
    public int f199954b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f199955c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk20(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f199955c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f199953a = obj;
        this.f199954b |= Integer.MIN_VALUE;
        return this.f199955c.emit(null, this);
    }
}
