package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class exd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f63743a;

    /* JADX INFO: renamed from: b */
    public float f63744b;

    /* JADX INFO: renamed from: c */
    public olv0 f63745c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f63746d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kxd1 f63747e;

    /* JADX INFO: renamed from: f */
    public int f63748f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exd1(kxd1 kxd1Var, ibk ibkVar) {
        super(ibkVar);
        this.f63747e = kxd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f63746d = obj;
        this.f63748f |= Integer.MIN_VALUE;
        return this.f63747e.m57595d(0L, 0.0f, false, this);
    }
}
