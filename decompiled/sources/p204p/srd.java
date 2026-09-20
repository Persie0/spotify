package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class srd extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f213301a;

    /* JADX INFO: renamed from: b */
    public int f213302b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f213303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srd(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f213303c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213301a = obj;
        this.f213302b |= Integer.MIN_VALUE;
        return this.f213303c.emit(null, this);
    }
}
