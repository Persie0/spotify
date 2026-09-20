package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jsp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f115527a;

    /* JADX INFO: renamed from: b */
    public int f115528b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksp f115529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsp(ksp kspVar, fbk fbkVar) {
        super(fbkVar);
        this.f115529c = kspVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f115527a = obj;
        this.f115528b |= Integer.MIN_VALUE;
        return this.f115529c.emit(null, this);
    }
}
