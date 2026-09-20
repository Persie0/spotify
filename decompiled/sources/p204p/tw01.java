package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tw01 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f224291a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f224292b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wpx f224293c;

    /* JADX INFO: renamed from: d */
    public int f224294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw01(wpx wpxVar, ibk ibkVar) {
        super(ibkVar);
        this.f224293c = wpxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224292b = obj;
        this.f224294d |= Integer.MIN_VALUE;
        return this.f224293c.m88728d(null, this);
    }
}
