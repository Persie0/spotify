package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class par extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175600a;

    /* JADX INFO: renamed from: b */
    public int f175601b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f175602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public par(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f175602c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175600a = obj;
        this.f175601b |= Integer.MIN_VALUE;
        return this.f175602c.emit(null, this);
    }
}
