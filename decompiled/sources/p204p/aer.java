package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class aer extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14941a;

    /* JADX INFO: renamed from: b */
    public int f14942b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f14943c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aer(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f14943c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f14941a = obj;
        this.f14942b |= Integer.MIN_VALUE;
        return this.f14943c.emit(null, this);
    }
}
