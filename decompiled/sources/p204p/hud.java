package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hud extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f95369a;

    /* JADX INFO: renamed from: b */
    public int f95370b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f95371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hud(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f95371c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f95369a = obj;
        this.f95370b |= Integer.MIN_VALUE;
        return this.f95371c.emit(null, this);
    }
}
