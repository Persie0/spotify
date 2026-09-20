package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m3e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139618a;

    /* JADX INFO: renamed from: b */
    public int f139619b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f139620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3e(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f139620c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139618a = obj;
        this.f139619b |= Integer.MIN_VALUE;
        return this.f139620c.emit(null, this);
    }
}
