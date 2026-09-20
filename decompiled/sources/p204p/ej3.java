package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ej3 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60114a;

    /* JADX INFO: renamed from: b */
    public int f60115b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f60116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej3(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f60116c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60114a = obj;
        this.f60115b |= Integer.MIN_VALUE;
        return this.f60116c.emit(null, this);
    }
}
