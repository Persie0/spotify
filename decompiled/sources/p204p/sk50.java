package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sk50 extends ibk {

    /* JADX INFO: renamed from: a */
    public al50 f210017a;

    /* JADX INFO: renamed from: b */
    public String f210018b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f210019c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tk50 f210020d;

    /* JADX INFO: renamed from: e */
    public int f210021e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk50(tk50 tk50Var, fbk fbkVar) {
        super(fbkVar);
        this.f210020d = tk50Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210019c = obj;
        this.f210021e |= Integer.MIN_VALUE;
        return tk50.m80999a(this.f210020d, this);
    }
}
