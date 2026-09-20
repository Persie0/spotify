package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zck0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f281534a;

    /* JADX INFO: renamed from: b */
    public int f281535b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f281536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zck0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f281536c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f281534a = obj;
        this.f281535b |= Integer.MIN_VALUE;
        return this.f281536c.emit(null, this);
    }
}
