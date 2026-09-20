package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class na30 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151925a;

    /* JADX INFO: renamed from: b */
    public int f151926b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f151927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na30(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f151927c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151925a = obj;
        this.f151926b |= Integer.MIN_VALUE;
        return this.f151927c.emit(null, this);
    }
}
