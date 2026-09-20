package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f221560a;

    /* JADX INFO: renamed from: b */
    public int f221561b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f221562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm0(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f221562c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221560a = obj;
        this.f221561b |= Integer.MIN_VALUE;
        return this.f221562c.emit(null, this);
    }
}
