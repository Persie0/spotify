package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m50 extends ibk {

    /* JADX INFO: renamed from: a */
    public k35 f140059a;

    /* JADX INFO: renamed from: b */
    public Object f140060b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f140061c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ n50 f140062d;

    /* JADX INFO: renamed from: e */
    public int f140063e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(n50 n50Var, ibk ibkVar) {
        super(ibkVar);
        this.f140062d = n50Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f140061c = obj;
        this.f140063e |= Integer.MIN_VALUE;
        return n50.m63693g(this.f140062d, null, null, this);
    }
}
