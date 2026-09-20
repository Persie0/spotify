package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ntr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f158134a;

    /* JADX INFO: renamed from: b */
    public int f158135b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f158136c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f158136c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f158134a = obj;
        this.f158135b |= Integer.MIN_VALUE;
        return this.f158136c.emit(null, this);
    }
}
