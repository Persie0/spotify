package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class av8 extends ibk {

    /* JADX INFO: renamed from: a */
    public fw8 f20121a;

    /* JADX INFO: renamed from: b */
    public d0r0 f20122b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f20123c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fv8 f20124d;

    /* JADX INFO: renamed from: e */
    public int f20125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av8(fv8 fv8Var, ibk ibkVar) {
        super(ibkVar);
        this.f20124d = fv8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20123c = obj;
        this.f20125e |= Integer.MIN_VALUE;
        return fv8.m42772a(this.f20124d, null, null, this);
    }
}
