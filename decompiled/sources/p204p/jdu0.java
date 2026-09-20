package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jdu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f111397a;

    /* JADX INFO: renamed from: b */
    public int f111398b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f111399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f111399c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f111397a = obj;
        this.f111398b |= Integer.MIN_VALUE;
        return this.f111399c.emit(null, this);
    }
}
