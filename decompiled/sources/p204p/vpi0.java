package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vpi0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f243697a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wpi0 f243698b;

    /* JADX INFO: renamed from: c */
    public int f243699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpi0(wpi0 wpi0Var, fbk fbkVar) {
        super(fbkVar);
        this.f243698b = wpi0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243697a = obj;
        this.f243699c |= Integer.MIN_VALUE;
        this.f243698b.mo26212b(null, this);
        return yuk.f276404a;
    }
}
