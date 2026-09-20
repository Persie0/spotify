package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rx71 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f203518a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f203519b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sx71 f203520c;

    /* JADX INFO: renamed from: d */
    public int f203521d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx71(sx71 sx71Var, ibk ibkVar) {
        super(ibkVar);
        this.f203520c = sx71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203519b = obj;
        this.f203521d |= Integer.MIN_VALUE;
        return this.f203520c.m79584a(null, null, this, false);
    }
}
