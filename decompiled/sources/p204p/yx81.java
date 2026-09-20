package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yx81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f277176a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zx81 f277177b;

    /* JADX INFO: renamed from: c */
    public int f277178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx81(zx81 zx81Var, ibk ibkVar) {
        super(ibkVar);
        this.f277177b = zx81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f277176a = obj;
        this.f277178c |= Integer.MIN_VALUE;
        zx81.m97167a(this.f277177b, this);
        return yuk.f276404a;
    }
}
