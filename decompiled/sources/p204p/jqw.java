package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jqw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f115011a;

    /* JADX INFO: renamed from: b */
    public int f115012b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f115013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqw(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f115013c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f115011a = obj;
        this.f115012b |= Integer.MIN_VALUE;
        return this.f115013c.emit(null, this);
    }
}
