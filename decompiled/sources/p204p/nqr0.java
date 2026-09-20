package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nqr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f157324a;

    /* JADX INFO: renamed from: b */
    public int f157325b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f157326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f157326c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157324a = obj;
        this.f157325b |= Integer.MIN_VALUE;
        return this.f157326c.emit(null, this);
    }
}
