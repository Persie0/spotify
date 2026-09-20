package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class aoi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17694a;

    /* JADX INFO: renamed from: b */
    public int f17695b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f17696c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f17696c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f17694a = obj;
        this.f17695b |= Integer.MIN_VALUE;
        return this.f17696c.emit(null, this);
    }
}
