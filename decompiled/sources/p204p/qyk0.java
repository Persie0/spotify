package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qyk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f193919a;

    /* JADX INFO: renamed from: b */
    public int f193920b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v1a f193921c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyk0(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f193921c = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f193919a = obj;
        this.f193920b |= Integer.MIN_VALUE;
        return this.f193921c.emit(null, this);
    }
}
