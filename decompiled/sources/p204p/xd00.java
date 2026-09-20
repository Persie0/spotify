package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xd00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f260340a;

    /* JADX INFO: renamed from: b */
    public int f260341b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f260342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd00(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f260342c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f260340a = obj;
        this.f260341b |= Integer.MIN_VALUE;
        return this.f260342c.emit(null, this);
    }
}
