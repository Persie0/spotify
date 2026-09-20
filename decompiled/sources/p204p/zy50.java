package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zy50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f287494a;

    /* JADX INFO: renamed from: b */
    public int f287495b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f287496c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy50(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f287496c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f287494a = obj;
        this.f287495b |= Integer.MIN_VALUE;
        return this.f287496c.emit(null, this);
    }
}
