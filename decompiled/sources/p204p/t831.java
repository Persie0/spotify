package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t831 extends ibk {

    /* JADX INFO: renamed from: a */
    public c931 f217952a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f217953b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u831 f217954c;

    /* JADX INFO: renamed from: d */
    public int f217955d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t831(u831 u831Var, fbk fbkVar) {
        super(fbkVar);
        this.f217954c = u831Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f217953b = obj;
        this.f217955d |= Integer.MIN_VALUE;
        return this.f217954c.m82550b(false, this);
    }
}
