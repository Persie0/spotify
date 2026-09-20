package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mgr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f143612a;

    /* JADX INFO: renamed from: b */
    public int f143613b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f143614c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f143614c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f143612a = obj;
        this.f143613b |= Integer.MIN_VALUE;
        return this.f143614c.emit(null, this);
    }
}
