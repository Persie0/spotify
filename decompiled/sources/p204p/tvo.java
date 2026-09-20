package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tvo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f224201a;

    /* JADX INFO: renamed from: b */
    public int f224202b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f224203c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvo(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f224203c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224201a = obj;
        this.f224202b |= Integer.MIN_VALUE;
        return this.f224203c.emit(null, this);
    }
}
