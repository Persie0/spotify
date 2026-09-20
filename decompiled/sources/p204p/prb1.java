package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class prb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f180546a;

    /* JADX INFO: renamed from: b */
    public int f180547b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f180548c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f180548c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f180546a = obj;
        this.f180547b |= Integer.MIN_VALUE;
        return this.f180548c.emit(null, this);
    }
}
