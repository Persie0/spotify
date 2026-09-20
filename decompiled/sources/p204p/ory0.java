package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ory0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f168674a;

    /* JADX INFO: renamed from: b */
    public int f168675b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pry0 f168676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ory0(pry0 pry0Var, ibk ibkVar) {
        super(ibkVar);
        this.f168676c = pry0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168674a = obj;
        this.f168675b |= Integer.MIN_VALUE;
        return this.f168676c.mo15629a(null, null, this);
    }
}
