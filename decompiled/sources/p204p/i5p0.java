package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i5p0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f99002a;

    /* JADX INFO: renamed from: b */
    public int f99003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f99004c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5p0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f99004c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99002a = obj;
        this.f99003b |= Integer.MIN_VALUE;
        return this.f99004c.emit(null, this);
    }
}
