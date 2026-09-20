package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vxs0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f245825a;

    /* JADX INFO: renamed from: b */
    public int f245826b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f245827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxs0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f245827c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f245825a = obj;
        this.f245826b |= Integer.MIN_VALUE;
        return this.f245827c.emit(null, this);
    }
}
