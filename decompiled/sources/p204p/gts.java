package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gts extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f84264a;

    /* JADX INFO: renamed from: b */
    public int f84265b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f84266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gts(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f84266c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84264a = obj;
        this.f84265b |= Integer.MIN_VALUE;
        return this.f84266c.emit(null, this);
    }
}
