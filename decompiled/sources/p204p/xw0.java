package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f266548a;

    /* JADX INFO: renamed from: b */
    public int f266549b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f266550c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw0(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f266550c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266548a = obj;
        this.f266549b |= Integer.MIN_VALUE;
        return this.f266550c.emit(null, this);
    }
}
