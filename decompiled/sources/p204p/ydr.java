package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ydr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f271806a;

    /* JADX INFO: renamed from: b */
    public int f271807b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f271808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydr(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f271808c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f271806a = obj;
        this.f271807b |= Integer.MIN_VALUE;
        return this.f271808c.emit(null, this);
    }
}
