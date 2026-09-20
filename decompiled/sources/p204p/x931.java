package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class x931 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259269a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y931 f259270b;

    /* JADX INFO: renamed from: c */
    public int f259271c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x931(y931 y931Var, ibk ibkVar) {
        super(ibkVar);
        this.f259270b = y931Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259269a = obj;
        this.f259271c |= Integer.MIN_VALUE;
        return y931.m93139b(this.f259270b, null, 0.0f, 0.0f, null, this);
    }
}
