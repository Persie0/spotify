package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class x971 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259291a;

    /* JADX INFO: renamed from: b */
    public int f259292b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ y971 f259293c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x971(y971 y971Var, fbk fbkVar) {
        super(fbkVar);
        this.f259293c = y971Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259291a = obj;
        this.f259292b |= Integer.MIN_VALUE;
        return this.f259293c.emit(null, this);
    }
}
