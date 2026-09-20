package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p010 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f172424a;

    /* JADX INFO: renamed from: b */
    public int f172425b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f172426c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p010(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f172426c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f172424a = obj;
        this.f172425b |= Integer.MIN_VALUE;
        return this.f172426c.emit(null, this);
    }
}
