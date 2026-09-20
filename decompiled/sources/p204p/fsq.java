package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fsq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f72918a;

    /* JADX INFO: renamed from: b */
    public int f72919b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f72920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f72920c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f72918a = obj;
        this.f72919b |= Integer.MIN_VALUE;
        return this.f72920c.emit(null, this);
    }
}
