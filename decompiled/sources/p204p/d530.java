package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class d530 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f45316a;

    /* JADX INFO: renamed from: b */
    public boolean f45317b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f45318c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ j530 f45319d;

    /* JADX INFO: renamed from: e */
    public int f45320e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d530(j530 j530Var, ibk ibkVar) {
        super(ibkVar);
        this.f45319d = j530Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f45318c = obj;
        this.f45320e |= Integer.MIN_VALUE;
        return j530.m52432d(this.f45319d, null, false, null, false, false, null, this);
    }
}
