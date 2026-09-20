package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vbs extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f239568a;

    /* JADX INFO: renamed from: b */
    public int f239569b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f239570c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbs(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f239570c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f239568a = obj;
        this.f239569b |= Integer.MIN_VALUE;
        return this.f239570c.emit(null, this);
    }
}
