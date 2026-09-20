package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ylr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f274077a;

    /* JADX INFO: renamed from: b */
    public int f274078b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f274079c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylr(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f274079c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274077a = obj;
        this.f274078b |= Integer.MIN_VALUE;
        return this.f274079c.emit(null, this);
    }
}
