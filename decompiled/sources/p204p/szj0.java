package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class szj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f215603a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c0k0 f215604b;

    /* JADX INFO: renamed from: c */
    public int f215605c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szj0(c0k0 c0k0Var, ibk ibkVar) {
        super(ibkVar);
        this.f215604b = c0k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f215603a = obj;
        this.f215605c |= Integer.MIN_VALUE;
        return c0k0.m31183a(this.f215604b, null, this);
    }
}
