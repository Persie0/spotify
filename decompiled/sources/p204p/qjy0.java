package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qjy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f189381a;

    /* JADX INFO: renamed from: b */
    public int f189382b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o8x f189383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjy0(o8x o8xVar, fbk fbkVar) {
        super(fbkVar);
        this.f189383c = o8xVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f189381a = obj;
        this.f189382b |= Integer.MIN_VALUE;
        return this.f189383c.emit(null, this);
    }
}
