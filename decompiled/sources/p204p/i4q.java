package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class i4q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f98571a;

    /* JADX INFO: renamed from: b */
    public int f98572b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j4q f98573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4q(j4q j4qVar, fbk fbkVar) {
        super(fbkVar);
        this.f98573c = j4qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f98571a = obj;
        this.f98572b |= Integer.MIN_VALUE;
        return this.f98573c.emit(null, this);
    }
}
