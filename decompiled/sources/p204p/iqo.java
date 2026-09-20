package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class iqo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104811a;

    /* JADX INFO: renamed from: b */
    public int f104812b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f104813c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqo(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f104813c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104811a = obj;
        this.f104812b |= Integer.MIN_VALUE;
        return this.f104813c.emit(null, this);
    }
}
