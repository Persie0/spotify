package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f611 extends ibk {

    /* JADX INFO: renamed from: a */
    public i611 f66229a;

    /* JADX INFO: renamed from: b */
    public Object f66230b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66231c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ h611 f66232d;

    /* JADX INFO: renamed from: e */
    public int f66233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f611(h611 h611Var, ibk ibkVar) {
        super(ibkVar);
        this.f66232d = h611Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66231c = obj;
        this.f66233e |= Integer.MIN_VALUE;
        return this.f66232d.m46701b(null, null, this);
    }
}
