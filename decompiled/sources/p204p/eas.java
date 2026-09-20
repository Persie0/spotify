package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eas extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57720a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fas f57721b;

    /* JADX INFO: renamed from: c */
    public int f57722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eas(fas fasVar, ibk ibkVar) {
        super(ibkVar);
        this.f57721b = fasVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57720a = obj;
        this.f57722c |= Integer.MIN_VALUE;
        return fas.m41191a(this.f57721b, null, this);
    }
}
