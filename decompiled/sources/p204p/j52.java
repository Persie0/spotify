package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j52 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f108839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k52 f108840b;

    /* JADX INFO: renamed from: c */
    public int f108841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j52(k52 k52Var, ibk ibkVar) {
        super(ibkVar);
        this.f108840b = k52Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f108839a = obj;
        this.f108841c |= Integer.MIN_VALUE;
        return this.f108840b.m55418c(null, this);
    }
}
