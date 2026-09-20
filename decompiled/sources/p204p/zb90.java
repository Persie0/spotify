package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zb90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f281282a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gc90 f281283b;

    /* JADX INFO: renamed from: c */
    public int f281284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb90(gc90 gc90Var, ibk ibkVar) {
        super(ibkVar);
        this.f281283b = gc90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f281282a = obj;
        this.f281284c |= Integer.MIN_VALUE;
        return this.f281283b.m44305e(null, this);
    }
}
