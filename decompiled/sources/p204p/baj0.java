package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class baj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public j1j0 f25226a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f25227b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ daj0 f25228c;

    /* JADX INFO: renamed from: d */
    public int f25229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baj0(daj0 daj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f25228c = daj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f25227b = obj;
        this.f25229d |= Integer.MIN_VALUE;
        return this.f25228c.m35486a(null, this);
    }
}
