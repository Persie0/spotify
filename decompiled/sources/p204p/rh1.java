package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rh1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f199080a;

    /* JADX INFO: renamed from: b */
    public int f199081b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sh1 f199082c;

    /* JADX INFO: renamed from: d */
    public bqz0 f199083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh1(sh1 sh1Var, ibk ibkVar) {
        super(ibkVar);
        this.f199082c = sh1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f199080a = obj;
        this.f199081b |= Integer.MIN_VALUE;
        return this.f199082c.mo15629a(null, null, this);
    }
}
