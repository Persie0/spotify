package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hh60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f91296a;

    /* JADX INFO: renamed from: b */
    public int f91297b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f91298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh60(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f91298c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f91296a = obj;
        this.f91297b |= Integer.MIN_VALUE;
        return this.f91298c.emit(null, this);
    }
}
