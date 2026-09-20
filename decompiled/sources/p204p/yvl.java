package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yvl extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276695a;

    /* JADX INFO: renamed from: b */
    public int f276696b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f276697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvl(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f276697c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276695a = obj;
        this.f276696b |= Integer.MIN_VALUE;
        return this.f276697c.emit(null, this);
    }
}
