package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f96 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f67176a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f67177b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g96 f67178c;

    /* JADX INFO: renamed from: d */
    public int f67179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f96(g96 g96Var, ibk ibkVar) {
        super(ibkVar);
        this.f67178c = g96Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f67177b = obj;
        this.f67179d |= Integer.MIN_VALUE;
        return this.f67178c.m44008a(null, this);
    }
}
