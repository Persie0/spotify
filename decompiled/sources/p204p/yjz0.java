package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yjz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f273508a;

    /* JADX INFO: renamed from: b */
    public int f273509b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eyi f273510c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjz0(eyi eyiVar, fbk fbkVar) {
        super(fbkVar);
        this.f273510c = eyiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f273508a = obj;
        this.f273509b |= Integer.MIN_VALUE;
        return this.f273510c.emit(null, this);
    }
}
