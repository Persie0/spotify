package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class hn21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f93158a;

    /* JADX INFO: renamed from: b */
    public int f93159b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f93160c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn21(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f93160c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93158a = obj;
        this.f93159b |= Integer.MIN_VALUE;
        return this.f93160c.emit(null, this);
    }
}
