package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t3u0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f216839a;

    /* JADX INFO: renamed from: b */
    public int f216840b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f216841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3u0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f216841c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f216839a = obj;
        this.f216840b |= Integer.MIN_VALUE;
        return this.f216841c.emit(null, this);
    }
}
