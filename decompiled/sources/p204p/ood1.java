package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ood1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f167568a;

    /* JADX INFO: renamed from: b */
    public int f167569b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pod1 f167570c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ood1(pod1 pod1Var, ibk ibkVar) {
        super(ibkVar);
        this.f167570c = pod1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f167568a = obj;
        this.f167569b |= Integer.MIN_VALUE;
        return this.f167570c.mo15629a(null, null, this);
    }
}
