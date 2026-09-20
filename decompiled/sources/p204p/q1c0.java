package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q1c0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f184289a;

    /* JADX INFO: renamed from: b */
    public int f184290b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r1c0 f184291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1c0(r1c0 r1c0Var, ibk ibkVar) {
        super(ibkVar);
        this.f184291c = r1c0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f184289a = obj;
        this.f184290b |= Integer.MIN_VALUE;
        return this.f184291c.mo15629a(null, null, this);
    }
}
