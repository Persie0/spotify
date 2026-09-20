package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class li20 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f133695a;

    /* JADX INFO: renamed from: b */
    public int f133696b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f133697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li20(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f133697c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133695a = obj;
        this.f133696b |= Integer.MIN_VALUE;
        return this.f133697c.emit(null, this);
    }
}
