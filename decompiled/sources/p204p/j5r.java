package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j5r extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f109070a;

    /* JADX INFO: renamed from: b */
    public int f109071b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f109072c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5r(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f109072c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f109070a = obj;
        this.f109071b |= Integer.MIN_VALUE;
        return this.f109072c.emit(null, this);
    }
}
