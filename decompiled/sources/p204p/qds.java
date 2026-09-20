package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qds extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f187746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uds f187747b;

    /* JADX INFO: renamed from: c */
    public int f187748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qds(uds udsVar, ibk ibkVar) {
        super(ibkVar);
        this.f187747b = udsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f187746a = obj;
        this.f187748c |= Integer.MIN_VALUE;
        return uds.m82851K1(this.f187747b, this);
    }
}
