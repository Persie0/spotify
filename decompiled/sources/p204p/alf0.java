package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class alf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16872a;

    /* JADX INFO: renamed from: b */
    public int f16873b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ blf0 f16874c;

    /* JADX INFO: renamed from: d */
    public bqz0 f16875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alf0(blf0 blf0Var, ibk ibkVar) {
        super(ibkVar);
        this.f16874c = blf0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16872a = obj;
        this.f16873b |= Integer.MIN_VALUE;
        return this.f16874c.mo15629a(null, null, this);
    }
}
