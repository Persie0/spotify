package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zio0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f283212a;

    /* JADX INFO: renamed from: b */
    public int f283213b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f283214c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zio0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f283214c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f283212a = obj;
        this.f283213b |= Integer.MIN_VALUE;
        return this.f283214c.emit(null, this);
    }
}
