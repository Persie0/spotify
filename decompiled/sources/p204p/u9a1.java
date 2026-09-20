package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u9a1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f228116a;

    /* JADX INFO: renamed from: b */
    public int f228117b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b9s f228118c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9a1(b9s b9sVar, fbk fbkVar) {
        super(fbkVar);
        this.f228118c = b9sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228116a = obj;
        this.f228117b |= Integer.MIN_VALUE;
        return this.f228118c.emit(null, this);
    }
}
