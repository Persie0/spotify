package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kts extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f126388a;

    /* JADX INFO: renamed from: b */
    public int f126389b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f126390c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kts(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f126390c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f126388a = obj;
        this.f126389b |= Integer.MIN_VALUE;
        return this.f126390c.emit(null, this);
    }
}
