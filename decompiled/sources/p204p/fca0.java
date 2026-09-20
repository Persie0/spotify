package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fca0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f68043a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ica0 f68044b;

    /* JADX INFO: renamed from: c */
    public int f68045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fca0(ica0 ica0Var, ibk ibkVar) {
        super(ibkVar);
        this.f68044b = ica0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f68043a = obj;
        this.f68045c |= Integer.MIN_VALUE;
        return this.f68044b.m50247e(null, this);
    }
}
