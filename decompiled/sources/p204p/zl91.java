package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zl91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f283954a;

    /* JADX INFO: renamed from: b */
    public int f283955b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f283956c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl91(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f283956c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f283954a = obj;
        this.f283955b |= Integer.MIN_VALUE;
        return this.f283956c.emit(null, this);
    }
}
