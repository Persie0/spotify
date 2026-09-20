package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class uxb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f234881a;

    /* JADX INFO: renamed from: b */
    public int f234882b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f234883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxb(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f234883c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234881a = obj;
        this.f234882b |= Integer.MIN_VALUE;
        return this.f234883c.emit(null, this);
    }
}
