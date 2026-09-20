package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class opi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f167939a;

    /* JADX INFO: renamed from: b */
    public int f167940b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f167941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f167941c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f167939a = obj;
        this.f167940b |= Integer.MIN_VALUE;
        return this.f167941c.emit(null, this);
    }
}
