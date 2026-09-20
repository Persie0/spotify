package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yio extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f273174a;

    /* JADX INFO: renamed from: b */
    public int f273175b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f273176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yio(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f273176c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f273174a = obj;
        this.f273175b |= Integer.MIN_VALUE;
        return this.f273176c.emit(null, this);
    }
}
