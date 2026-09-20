package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vgm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f241275a;

    /* JADX INFO: renamed from: b */
    public int f241276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f241277c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgm0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f241277c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f241275a = obj;
        this.f241276b |= Integer.MIN_VALUE;
        return this.f241277c.emit(null, this);
    }
}
