package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mqr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146345a;

    /* JADX INFO: renamed from: b */
    public int f146346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f146347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f146347c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146345a = obj;
        this.f146346b |= Integer.MIN_VALUE;
        return this.f146347c.emit(null, this);
    }
}
