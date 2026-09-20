package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tnu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f222079a;

    /* JADX INFO: renamed from: b */
    public int f222080b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f222081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tnu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f222081c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222079a = obj;
        this.f222080b |= Integer.MIN_VALUE;
        return this.f222081c.emit(null, this);
    }
}
