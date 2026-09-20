package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yb90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f271110a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gc90 f271111b;

    /* JADX INFO: renamed from: c */
    public int f271112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb90(gc90 gc90Var, ibk ibkVar) {
        super(ibkVar);
        this.f271111b = gc90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f271110a = obj;
        this.f271112c |= Integer.MIN_VALUE;
        return this.f271111b.m44304d(null, this);
    }
}
