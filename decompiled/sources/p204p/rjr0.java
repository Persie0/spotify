package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rjr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f199899a;

    /* JADX INFO: renamed from: b */
    public int f199900b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f199901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f199901c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f199899a = obj;
        this.f199900b |= Integer.MIN_VALUE;
        return this.f199901c.emit(null, this);
    }
}
