package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e770 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56842a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h770 f56843b;

    /* JADX INFO: renamed from: c */
    public int f56844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e770(h770 h770Var, ibk ibkVar) {
        super(ibkVar);
        this.f56843b = h770Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56842a = obj;
        this.f56844c |= Integer.MIN_VALUE;
        return this.f56843b.m46761c(null, this);
    }
}
