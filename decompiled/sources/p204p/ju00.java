package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ju00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f116003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ku00 f116004b;

    /* JADX INFO: renamed from: c */
    public int f116005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju00(ku00 ku00Var, ibk ibkVar) {
        super(ibkVar);
        this.f116004b = ku00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116003a = obj;
        this.f116005c |= Integer.MIN_VALUE;
        return this.f116004b.m57371f(null, this);
    }
}
