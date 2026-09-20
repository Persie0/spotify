package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a841 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13191a;

    /* JADX INFO: renamed from: b */
    public int f13192b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f13193c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a841(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f13193c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13191a = obj;
        this.f13192b |= Integer.MIN_VALUE;
        return this.f13193c.emit(null, this);
    }
}
