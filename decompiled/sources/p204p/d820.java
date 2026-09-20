package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d820 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46332a;

    /* JADX INFO: renamed from: b */
    public int f46333b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f46334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d820(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f46334c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46332a = obj;
        this.f46333b |= Integer.MIN_VALUE;
        return this.f46334c.emit(null, this);
    }
}
