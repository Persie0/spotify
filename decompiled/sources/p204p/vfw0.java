package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vfw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f241043a;

    /* JADX INFO: renamed from: b */
    public int f241044b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f241045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfw0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f241045c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f241043a = obj;
        this.f241044b |= Integer.MIN_VALUE;
        return this.f241045c.emit(null, this);
    }
}
