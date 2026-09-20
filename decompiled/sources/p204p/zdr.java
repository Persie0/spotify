package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zdr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f281782a;

    /* JADX INFO: renamed from: b */
    public int f281783b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f281784c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdr(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f281784c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f281782a = obj;
        this.f281783b |= Integer.MIN_VALUE;
        return this.f281784c.emit(null, this);
    }
}
