package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uo7 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f232342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g96 f232343b;

    /* JADX INFO: renamed from: c */
    public int f232344c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo7(g96 g96Var, ibk ibkVar) {
        super(ibkVar);
        this.f232343b = g96Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f232342a = obj;
        this.f232344c |= Integer.MIN_VALUE;
        return this.f232343b.m44009b(null, this);
    }
}
