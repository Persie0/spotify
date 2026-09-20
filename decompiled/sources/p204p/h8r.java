package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h8r extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88775a;

    /* JADX INFO: renamed from: b */
    public int f88776b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f88777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8r(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f88777c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88775a = obj;
        this.f88776b |= Integer.MIN_VALUE;
        return this.f88777c.emit(null, this);
    }
}
