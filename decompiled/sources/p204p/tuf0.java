package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tuf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f223851a;

    /* JADX INFO: renamed from: b */
    public int f223852b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f223853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tuf0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f223853c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f223851a = obj;
        this.f223852b |= Integer.MIN_VALUE;
        return this.f223853c.emit(null, this);
    }
}
