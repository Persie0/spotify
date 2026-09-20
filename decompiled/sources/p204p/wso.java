package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wso extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f254657a;

    /* JADX INFO: renamed from: b */
    public int f254658b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f254659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wso(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f254659c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f254657a = obj;
        this.f254658b |= Integer.MIN_VALUE;
        return this.f254659c.emit(null, this);
    }
}
