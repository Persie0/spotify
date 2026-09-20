package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ljw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134157a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mjw0 f134158b;

    /* JADX INFO: renamed from: c */
    public int f134159c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljw0(mjw0 mjw0Var, ibk ibkVar) {
        super(ibkVar);
        this.f134158b = mjw0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134157a = obj;
        this.f134159c |= Integer.MIN_VALUE;
        return mjw0.m61995g(this.f134158b, null, this);
    }
}
