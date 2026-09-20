package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class car0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35920a;

    /* JADX INFO: renamed from: b */
    public int f35921b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f35922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public car0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f35922c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f35920a = obj;
        this.f35921b |= Integer.MIN_VALUE;
        return this.f35922c.emit(null, this);
    }
}
