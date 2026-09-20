package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uxd extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f234890a;

    /* JADX INFO: renamed from: b */
    public int f234891b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f234892c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxd(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f234892c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234890a = obj;
        this.f234891b |= Integer.MIN_VALUE;
        return this.f234892c.emit(null, this);
    }
}
