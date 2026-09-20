package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xxs extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f267056a;

    /* JADX INFO: renamed from: b */
    public int f267057b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f267058c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxs(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f267058c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f267056a = obj;
        this.f267057b |= Integer.MIN_VALUE;
        return this.f267058c.emit(null, this);
    }
}
