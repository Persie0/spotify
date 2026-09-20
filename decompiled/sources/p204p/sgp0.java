package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sgp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f208921a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kt9 f208922b;

    /* JADX INFO: renamed from: c */
    public int f208923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgp0(kt9 kt9Var, ibk ibkVar) {
        super(ibkVar);
        this.f208922b = kt9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f208921a = obj;
        this.f208923c |= Integer.MIN_VALUE;
        return this.f208922b.m57311b(this);
    }
}
