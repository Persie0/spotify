package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class aqi0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18259a;

    /* JADX INFO: renamed from: b */
    public int f18260b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f18261c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqi0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f18261c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f18259a = obj;
        this.f18260b |= Integer.MIN_VALUE;
        return this.f18261c.emit(null, this);
    }
}
