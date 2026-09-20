package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ksb0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125923a;

    /* JADX INFO: renamed from: b */
    public int f125924b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lsb0 f125925c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksb0(lsb0 lsb0Var, ibk ibkVar) {
        super(ibkVar);
        this.f125925c = lsb0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125923a = obj;
        this.f125924b |= Integer.MIN_VALUE;
        return this.f125925c.mo15629a(null, null, this);
    }
}
