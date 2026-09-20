package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c4e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33931a;

    /* JADX INFO: renamed from: b */
    public int f33932b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ d4e1 f33933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4e1(d4e1 d4e1Var, fbk fbkVar) {
        super(fbkVar);
        this.f33933c = d4e1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f33931a = obj;
        this.f33932b |= Integer.MIN_VALUE;
        return this.f33933c.emit(null, this);
    }
}
