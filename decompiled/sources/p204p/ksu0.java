package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ksu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f126019a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nsu0 f126020b;

    /* JADX INFO: renamed from: c */
    public int f126021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksu0(nsu0 nsu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f126020b = nsu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f126019a = obj;
        this.f126021c |= Integer.MIN_VALUE;
        return this.f126020b.m65588a(null, this);
    }
}
