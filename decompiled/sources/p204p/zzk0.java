package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zzk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f288020a;

    /* JADX INFO: renamed from: b */
    public int f288021b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f288022c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f288022c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f288020a = obj;
        this.f288021b |= Integer.MIN_VALUE;
        return this.f288022c.emit(null, this);
    }
}
