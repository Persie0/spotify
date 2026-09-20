package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hix0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f91892a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iix0 f91893b;

    /* JADX INFO: renamed from: c */
    public int f91894c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hix0(iix0 iix0Var, ibk ibkVar) {
        super(ibkVar);
        this.f91893b = iix0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f91892a = obj;
        this.f91894c |= Integer.MIN_VALUE;
        return this.f91893b.mo27271a(null, this);
    }
}
