package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vpm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f243727a;

    /* JADX INFO: renamed from: b */
    public int f243728b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f243729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpm0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f243729c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243727a = obj;
        this.f243728b |= Integer.MIN_VALUE;
        return this.f243729c.emit(null, this);
    }
}
