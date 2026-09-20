package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class r9s0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f197117a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s9s0 f197118b;

    /* JADX INFO: renamed from: c */
    public int f197119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9s0(s9s0 s9s0Var, ibk ibkVar) {
        super(ibkVar);
        this.f197118b = s9s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197117a = obj;
        this.f197119c |= Integer.MIN_VALUE;
        return this.f197118b.m77591a(this);
    }
}
