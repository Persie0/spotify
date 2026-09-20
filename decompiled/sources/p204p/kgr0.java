package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kgr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f122440a;

    /* JADX INFO: renamed from: b */
    public int f122441b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f122442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f122442c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f122440a = obj;
        this.f122441b |= Integer.MIN_VALUE;
        return this.f122442c.emit(null, this);
    }
}
