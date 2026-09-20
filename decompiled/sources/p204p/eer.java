package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eer extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58840a;

    /* JADX INFO: renamed from: b */
    public int f58841b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f58842c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eer(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f58842c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58840a = obj;
        this.f58841b |= Integer.MIN_VALUE;
        return this.f58842c.emit(null, this);
    }
}
