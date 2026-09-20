package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qdp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f187730a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sdp f187731b;

    /* JADX INFO: renamed from: c */
    public int f187732c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdp(sdp sdpVar, ibk ibkVar) {
        super(ibkVar);
        this.f187731b = sdpVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f187730a = obj;
        this.f187732c |= Integer.MIN_VALUE;
        Object objM77876a = sdp.m77876a(this.f187731b, null, this);
        return objM77876a == yuk.f276404a ? objM77876a : new s6x0(objM77876a);
    }
}
