package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class g4u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f76528a;

    /* JADX INFO: renamed from: b */
    public int f76529b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f76530c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4u(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f76530c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f76528a = obj;
        this.f76529b |= Integer.MIN_VALUE;
        return this.f76530c.emit(null, this);
    }
}
