package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u6w extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f227438a;

    /* JADX INFO: renamed from: b */
    public int f227439b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f227440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6w(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f227440c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f227438a = obj;
        this.f227439b |= Integer.MIN_VALUE;
        return this.f227440c.emit(null, this);
    }
}
