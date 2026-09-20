package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lb30 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f131539a;

    /* JADX INFO: renamed from: b */
    public int f131540b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f131541c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb30(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f131541c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f131539a = obj;
        this.f131540b |= Integer.MIN_VALUE;
        return this.f131541c.emit(null, this);
    }
}
