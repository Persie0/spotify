package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bmb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28487a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lmb f28488b;

    /* JADX INFO: renamed from: c */
    public int f28489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f28488b = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f28487a = obj;
        this.f28489c |= Integer.MIN_VALUE;
        return this.f28488b.m59342s(null, 0, null, null, null, this);
    }
}
