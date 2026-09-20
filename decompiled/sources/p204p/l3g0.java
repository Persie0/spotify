package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l3g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f129330a;

    /* JADX INFO: renamed from: b */
    public int f129331b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f129332c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3g0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f129332c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f129330a = obj;
        this.f129331b |= Integer.MIN_VALUE;
        return this.f129332c.emit(null, this);
    }
}
