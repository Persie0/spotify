package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mjz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f144429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2470ut f144430b;

    /* JADX INFO: renamed from: c */
    public int f144431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjz(C2470ut c2470ut, fbk fbkVar) {
        super(fbkVar);
        this.f144430b = c2470ut;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144429a = obj;
        this.f144431c |= Integer.MIN_VALUE;
        return this.f144430b.emit(null, this);
    }
}
