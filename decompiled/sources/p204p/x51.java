package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f258239a;

    /* JADX INFO: renamed from: b */
    public int f258240b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i80 f258241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x51(i80 i80Var, fbk fbkVar) {
        super(fbkVar);
        this.f258241c = i80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f258239a = obj;
        this.f258240b |= Integer.MIN_VALUE;
        return this.f258241c.emit(null, this);
    }
}
