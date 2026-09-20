package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cic extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f38276a;

    /* JADX INFO: renamed from: b */
    public int f38277b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f38278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cic(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f38278c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38276a = obj;
        this.f38277b |= Integer.MIN_VALUE;
        return this.f38278c.emit(null, this);
    }
}
