package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jfv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f111974a;

    /* JADX INFO: renamed from: b */
    public int f111975b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kfv f111976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfv(kfv kfvVar, ibk ibkVar) {
        super(ibkVar);
        this.f111976c = kfvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f111974a = obj;
        this.f111975b |= Integer.MIN_VALUE;
        return this.f111976c.mo15629a(null, null, this);
    }
}
