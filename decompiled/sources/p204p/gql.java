package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gql extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f83490a;

    /* JADX INFO: renamed from: b */
    public int f83491b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f83492c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gql(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f83492c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f83490a = obj;
        this.f83491b |= Integer.MIN_VALUE;
        return this.f83492c.emit(null, this);
    }
}
