package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xui extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f266118a;

    /* JADX INFO: renamed from: b */
    public int f266119b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f266120c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xui(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f266120c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266118a = obj;
        this.f266119b |= Integer.MIN_VALUE;
        return this.f266120c.emit(null, this);
    }
}
