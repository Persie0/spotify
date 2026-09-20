package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ber extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26420a;

    /* JADX INFO: renamed from: b */
    public int f26421b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f26422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f26422c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f26420a = obj;
        this.f26421b |= Integer.MIN_VALUE;
        return this.f26422c.emit(null, this);
    }
}
