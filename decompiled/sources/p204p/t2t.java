package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t2t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f216620a;

    /* JADX INFO: renamed from: b */
    public int f216621b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f216622c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2t(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f216622c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f216620a = obj;
        this.f216621b |= Integer.MIN_VALUE;
        return this.f216622c.emit(null, this);
    }
}
