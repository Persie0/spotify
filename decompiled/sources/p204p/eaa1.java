package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eaa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57610a;

    /* JADX INFO: renamed from: b */
    public int f57611b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f57612c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaa1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f57612c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57610a = obj;
        this.f57611b |= Integer.MIN_VALUE;
        return this.f57612c.emit(null, this);
    }
}
