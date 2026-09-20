package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class glp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f81126a;

    /* JADX INFO: renamed from: b */
    public int f81127b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f81128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glp(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f81128c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f81126a = obj;
        this.f81127b |= Integer.MIN_VALUE;
        return this.f81128c.emit(null, this);
    }
}
