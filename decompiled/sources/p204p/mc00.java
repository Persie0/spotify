package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mc00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f142003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nc00 f142004b;

    /* JADX INFO: renamed from: c */
    public int f142005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc00(nc00 nc00Var, ibk ibkVar) {
        super(ibkVar);
        this.f142004b = nc00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f142003a = obj;
        this.f142005c |= Integer.MIN_VALUE;
        return this.f142004b.m64105b(null, this);
    }
}
