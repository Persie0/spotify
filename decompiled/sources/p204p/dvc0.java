package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dvc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53416a;

    /* JADX INFO: renamed from: b */
    public int f53417b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evc0 f53418c;

    /* JADX INFO: renamed from: d */
    public bqz0 f53419d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvc0(evc0 evc0Var, ibk ibkVar) {
        super(ibkVar);
        this.f53418c = evc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53416a = obj;
        this.f53417b |= Integer.MIN_VALUE;
        return this.f53418c.mo15629a(null, null, this);
    }
}
