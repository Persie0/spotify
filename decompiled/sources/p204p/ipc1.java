package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ipc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104470a;

    /* JADX INFO: renamed from: b */
    public int f104471b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f104472c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipc1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f104472c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104470a = obj;
        this.f104471b |= Integer.MIN_VALUE;
        return this.f104472c.emit(null, this);
    }
}
