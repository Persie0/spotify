package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jvo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f116371a;

    /* JADX INFO: renamed from: b */
    public int f116372b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f116373c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvo(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f116373c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116371a = obj;
        this.f116372b |= Integer.MIN_VALUE;
        return this.f116373c.emit(null, this);
    }
}
