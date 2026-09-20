package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d0l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f43907a;

    /* JADX INFO: renamed from: b */
    public int f43908b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f43909c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0l0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f43909c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f43907a = obj;
        this.f43908b |= Integer.MIN_VALUE;
        return this.f43909c.emit(null, this);
    }
}
