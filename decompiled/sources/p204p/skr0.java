package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class skr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210186a;

    /* JADX INFO: renamed from: b */
    public int f210187b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f210188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f210188c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210186a = obj;
        this.f210187b |= Integer.MIN_VALUE;
        return this.f210188c.emit(null, this);
    }
}
