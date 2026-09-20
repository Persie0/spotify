package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class y9r extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f270633a;

    /* JADX INFO: renamed from: b */
    public int f270634b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f270635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9r(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f270635c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f270633a = obj;
        this.f270634b |= Integer.MIN_VALUE;
        return this.f270635c.emit(null, this);
    }
}
