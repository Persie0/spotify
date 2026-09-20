package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class h801 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88586a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i801 f88587b;

    /* JADX INFO: renamed from: c */
    public int f88588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h801(i801 i801Var, ibk ibkVar) {
        super(ibkVar);
        this.f88587b = i801Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88586a = obj;
        this.f88588c |= Integer.MIN_VALUE;
        return this.f88587b.m49901c(null, this);
    }
}
