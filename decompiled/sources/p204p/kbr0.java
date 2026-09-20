package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kbr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f121268a;

    /* JADX INFO: renamed from: b */
    public int f121269b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f121270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f121270c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f121268a = obj;
        this.f121269b |= Integer.MIN_VALUE;
        return this.f121270c.emit(null, this);
    }
}
