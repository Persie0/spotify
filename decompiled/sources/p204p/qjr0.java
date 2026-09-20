package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qjr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f189296a;

    /* JADX INFO: renamed from: b */
    public int f189297b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f189298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f189298c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f189296a = obj;
        this.f189297b |= Integer.MIN_VALUE;
        return this.f189298c.emit(null, this);
    }
}
