package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ojr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f166113a;

    /* JADX INFO: renamed from: b */
    public int f166114b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f166115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f166115c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f166113a = obj;
        this.f166114b |= Integer.MIN_VALUE;
        return this.f166115c.emit(null, this);
    }
}
