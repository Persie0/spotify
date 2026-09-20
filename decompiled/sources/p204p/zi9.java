package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zi9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f283119a;

    /* JADX INFO: renamed from: b */
    public int f283120b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f283121c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi9(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f283121c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f283119a = obj;
        this.f283120b |= Integer.MIN_VALUE;
        return this.f283121c.emit(null, this);
    }
}
