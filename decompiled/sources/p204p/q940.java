package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class q940 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f186484a;

    /* JADX INFO: renamed from: b */
    public jsi0 f186485b;

    /* JADX INFO: renamed from: c */
    public int f186486c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f186487d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ mpx f186488e;

    /* JADX INFO: renamed from: f */
    public int f186489f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q940(mpx mpxVar, ibk ibkVar) {
        super(ibkVar);
        this.f186488e = mpxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186487d = obj;
        this.f186489f |= Integer.MIN_VALUE;
        return this.f186488e.mo46765a(null, null, null, this);
    }
}
