package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class pw81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f181938a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tw81 f181939b;

    /* JADX INFO: renamed from: c */
    public int f181940c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw81(tw81 tw81Var, ibk ibkVar) {
        super(ibkVar);
        this.f181939b = tw81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f181938a = obj;
        this.f181940c |= Integer.MIN_VALUE;
        return this.f181939b.m81663c(null, this);
    }
}
