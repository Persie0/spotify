package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class e101 extends ibk {

    /* JADX INFO: renamed from: a */
    public f101 f55078a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55079b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f101 f55080c;

    /* JADX INFO: renamed from: d */
    public int f55081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e101(f101 f101Var, ibk ibkVar) {
        super(ibkVar);
        this.f55080c = f101Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f55079b = obj;
        this.f55081d |= Integer.MIN_VALUE;
        return f101.m40515a(this.f55080c, this);
    }
}
