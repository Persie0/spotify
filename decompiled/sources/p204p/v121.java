package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v121 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f236224a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x121 f236225b;

    /* JADX INFO: renamed from: c */
    public int f236226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v121(x121 x121Var, ibk ibkVar) {
        super(ibkVar);
        this.f236225b = x121Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f236224a = obj;
        this.f236226c |= Integer.MIN_VALUE;
        return this.f236225b.m89618a(this);
    }
}
