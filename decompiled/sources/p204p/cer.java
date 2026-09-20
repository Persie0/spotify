package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cer extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f37168a;

    /* JADX INFO: renamed from: b */
    public int f37169b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f37170c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cer(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f37170c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f37168a = obj;
        this.f37169b |= Integer.MIN_VALUE;
        return this.f37170c.emit(null, this);
    }
}
