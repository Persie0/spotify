package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class eiq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f59997a;

    /* JADX INFO: renamed from: b */
    public int f59998b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f59999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eiq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f59999c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f59997a = obj;
        this.f59998b |= Integer.MIN_VALUE;
        return this.f59999c.emit(null, this);
    }
}
