package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vm20 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f242682a;

    /* JADX INFO: renamed from: b */
    public int f242683b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f242684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm20(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f242684c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f242682a = obj;
        this.f242683b |= Integer.MIN_VALUE;
        return this.f242684c.emit(null, this);
    }
}
