package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ku5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f126459a;

    /* JADX INFO: renamed from: b */
    public int f126460b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lu5 f126461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku5(lu5 lu5Var, fbk fbkVar) {
        super(fbkVar);
        this.f126461c = lu5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f126459a = obj;
        this.f126460b |= Integer.MIN_VALUE;
        return this.f126461c.emit(null, this);
    }
}
