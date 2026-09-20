package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g530 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f76572a;

    /* JADX INFO: renamed from: b */
    public boolean f76573b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f76574c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ j530 f76575d;

    /* JADX INFO: renamed from: e */
    public int f76576e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g530(j530 j530Var, ibk ibkVar) {
        super(ibkVar);
        this.f76575d = j530Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f76574c = obj;
        this.f76576e |= Integer.MIN_VALUE;
        return this.f76575d.mo28143a(null, false, null, null, this);
    }
}
