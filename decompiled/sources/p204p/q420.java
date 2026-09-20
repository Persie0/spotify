package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q420 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f185028a;

    /* JADX INFO: renamed from: b */
    public int f185029b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f185030c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q420(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f185030c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f185028a = obj;
        this.f185029b |= Integer.MIN_VALUE;
        return this.f185030c.emit(null, this);
    }
}
