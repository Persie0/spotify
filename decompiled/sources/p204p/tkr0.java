package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tkr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f221210a;

    /* JADX INFO: renamed from: b */
    public int f221211b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f221212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f221212c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221210a = obj;
        this.f221211b |= Integer.MIN_VALUE;
        return this.f221212c.emit(null, this);
    }
}
