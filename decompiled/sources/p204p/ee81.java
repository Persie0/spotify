package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ee81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58712a;

    /* JADX INFO: renamed from: b */
    public int f58713b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f58714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee81(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f58714c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58712a = obj;
        this.f58713b |= Integer.MIN_VALUE;
        return this.f58714c.emit(null, this);
    }
}
