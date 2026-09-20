package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iym0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f107006a;

    /* JADX INFO: renamed from: b */
    public int f107007b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jym0 f107008c;

    /* JADX INFO: renamed from: d */
    public bqz0 f107009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iym0(jym0 jym0Var, ibk ibkVar) {
        super(ibkVar);
        this.f107008c = jym0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107006a = obj;
        this.f107007b |= Integer.MIN_VALUE;
        return this.f107008c.mo15629a(null, null, this);
    }
}
