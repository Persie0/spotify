package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dvk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53476a;

    /* JADX INFO: renamed from: b */
    public int f53477b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f53478c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvk0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f53478c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53476a = obj;
        this.f53477b |= Integer.MIN_VALUE;
        return this.f53478c.emit(null, this);
    }
}
