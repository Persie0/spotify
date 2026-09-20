package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nov extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f156798a;

    /* JADX INFO: renamed from: b */
    public int f156799b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lov f156800c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nov(lov lovVar, fbk fbkVar) {
        super(fbkVar);
        this.f156800c = lovVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f156798a = obj;
        this.f156799b |= Integer.MIN_VALUE;
        return this.f156800c.emit(null, this);
    }
}
