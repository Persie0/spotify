package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ukr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231354a;

    /* JADX INFO: renamed from: b */
    public int f231355b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f231356c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f231356c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231354a = obj;
        this.f231355b |= Integer.MIN_VALUE;
        return this.f231356c.emit(null, this);
    }
}
