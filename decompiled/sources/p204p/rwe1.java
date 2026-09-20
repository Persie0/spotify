package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rwe1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f203334a;

    /* JADX INFO: renamed from: b */
    public int f203335b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f203336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwe1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f203336c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203334a = obj;
        this.f203335b |= Integer.MIN_VALUE;
        return this.f203336c.emit(null, this);
    }
}
