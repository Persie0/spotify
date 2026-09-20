package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class a950 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13472a;

    /* JADX INFO: renamed from: b */
    public int f13473b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b950 f13474c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a950(b950 b950Var, ibk ibkVar) {
        super(ibkVar);
        this.f13474c = b950Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13472a = obj;
        this.f13473b |= Integer.MIN_VALUE;
        return this.f13474c.mo15629a(null, null, this);
    }
}
