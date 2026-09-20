package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lqc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f136004a;

    /* JADX INFO: renamed from: b */
    public int f136005b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f136006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqc(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f136006c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f136004a = obj;
        this.f136005b |= Integer.MIN_VALUE;
        return this.f136006c.emit(null, this);
    }
}
