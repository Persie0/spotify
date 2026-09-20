package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jmb extends ibk {

    /* JADX INFO: renamed from: a */
    public lmb f113809a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f113810b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmb f113811c;

    /* JADX INFO: renamed from: d */
    public int f113812d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f113811c = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113810b = obj;
        this.f113812d |= Integer.MIN_VALUE;
        return this.f113811c.m59326E(null, null, this, false);
    }
}
