package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vl20 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f242367a;

    /* JADX INFO: renamed from: b */
    public int f242368b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f242369c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl20(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f242369c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f242367a = obj;
        this.f242368b |= Integer.MIN_VALUE;
        return this.f242369c.emit(null, this);
    }
}
