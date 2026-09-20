package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fu80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f73437a;

    /* JADX INFO: renamed from: b */
    public int f73438b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fwj f73439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu80(fwj fwjVar, fbk fbkVar) {
        super(fbkVar);
        this.f73439c = fwjVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f73437a = obj;
        this.f73438b |= Integer.MIN_VALUE;
        return this.f73439c.emit(null, this);
    }
}
