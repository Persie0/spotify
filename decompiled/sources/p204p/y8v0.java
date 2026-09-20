package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y8v0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f270391a;

    /* JADX INFO: renamed from: b */
    public int f270392b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f270393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8v0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f270393c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f270391a = obj;
        this.f270392b |= Integer.MIN_VALUE;
        return this.f270393c.emit(null, this);
    }
}
