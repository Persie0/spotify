package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fm6 extends ibk {

    /* JADX INFO: renamed from: a */
    public czz f70962a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f70963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gm6 f70964c;

    /* JADX INFO: renamed from: d */
    public int f70965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm6(gm6 gm6Var, ibk ibkVar) {
        super(ibkVar);
        this.f70964c = gm6Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f70963b = obj;
        this.f70965d |= Integer.MIN_VALUE;
        return this.f70964c.m45219b(null, this);
    }
}
