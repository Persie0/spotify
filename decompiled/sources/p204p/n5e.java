package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n5e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f150529a;

    /* JADX INFO: renamed from: b */
    public int f150530b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i5e f150531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5e(i5e i5eVar, fbk fbkVar) {
        super(fbkVar);
        this.f150531c = i5eVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f150529a = obj;
        this.f150530b |= Integer.MIN_VALUE;
        return this.f150531c.emit(null, this);
    }
}
