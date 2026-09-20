package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ruf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f202839a;

    /* JADX INFO: renamed from: b */
    public int f202840b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f202841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ruf0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f202841c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202839a = obj;
        this.f202840b |= Integer.MIN_VALUE;
        return this.f202841c.emit(null, this);
    }
}
