package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pdp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f176529a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sdp f176530b;

    /* JADX INFO: renamed from: c */
    public int f176531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdp(sdp sdpVar, fbk fbkVar) {
        super(fbkVar);
        this.f176530b = sdpVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f176529a = obj;
        this.f176531c |= Integer.MIN_VALUE;
        return this.f176530b.invoke(null, this);
    }
}
