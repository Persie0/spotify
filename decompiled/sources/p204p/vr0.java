package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f244038a;

    /* JADX INFO: renamed from: b */
    public int f244039b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f244040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr0(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f244040c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f244038a = obj;
        this.f244039b |= Integer.MIN_VALUE;
        return this.f244040c.emit(null, this);
    }
}
