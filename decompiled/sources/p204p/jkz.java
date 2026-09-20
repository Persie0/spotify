package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jkz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f113438a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kkz f113439b;

    /* JADX INFO: renamed from: c */
    public int f113440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkz(kkz kkzVar, fbk fbkVar) {
        super(fbkVar);
        this.f113439b = kkzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113438a = obj;
        this.f113440c |= Integer.MIN_VALUE;
        return this.f113439b.emit(null, this);
    }
}
