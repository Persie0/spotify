package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class daa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47010a;

    /* JADX INFO: renamed from: b */
    public int f47011b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b9s f47012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daa1(b9s b9sVar, fbk fbkVar) {
        super(fbkVar);
        this.f47012c = b9sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f47010a = obj;
        this.f47011b |= Integer.MIN_VALUE;
        return this.f47012c.emit(null, this);
    }
}
