package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ie70 extends ibk {

    /* JADX INFO: renamed from: a */
    public lwf f101337a;

    /* JADX INFO: renamed from: b */
    public String f101338b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f101339c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ o310 f101340d;

    /* JADX INFO: renamed from: e */
    public int f101341e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie70(o310 o310Var, ibk ibkVar) {
        super(ibkVar);
        this.f101340d = o310Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f101339c = obj;
        this.f101341e |= Integer.MIN_VALUE;
        return o310.m66166e(this.f101340d, null, null, false, this);
    }
}
