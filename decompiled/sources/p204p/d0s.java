package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d0s extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f44030a;

    /* JADX INFO: renamed from: b */
    public int f44031b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f44032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0s(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f44032c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f44030a = obj;
        this.f44031b |= Integer.MIN_VALUE;
        return this.f44032c.emit(null, this);
    }
}
