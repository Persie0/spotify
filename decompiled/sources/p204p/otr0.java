package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class otr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f170084a;

    /* JADX INFO: renamed from: b */
    public int f170085b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f170086c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f170086c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f170084a = obj;
        this.f170085b |= Integer.MIN_VALUE;
        return this.f170086c.emit(null, this);
    }
}
