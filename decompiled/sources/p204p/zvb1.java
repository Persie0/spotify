package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zvb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f286679a;

    /* JADX INFO: renamed from: b */
    public int f286680b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f286681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f286681c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f286679a = obj;
        this.f286680b |= Integer.MIN_VALUE;
        return this.f286681c.emit(null, this);
    }
}
