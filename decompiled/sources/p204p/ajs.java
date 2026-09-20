package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ajs extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16348a;

    /* JADX INFO: renamed from: b */
    public int f16349b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f16350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajs(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f16350c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16348a = obj;
        this.f16349b |= Integer.MIN_VALUE;
        return this.f16350c.emit(null, this);
    }
}
