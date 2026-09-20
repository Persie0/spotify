package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iql extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104799a;

    /* JADX INFO: renamed from: b */
    public int f104800b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f104801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iql(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f104801c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104799a = obj;
        this.f104800b |= Integer.MIN_VALUE;
        return this.f104801c.emit(null, this);
    }
}
