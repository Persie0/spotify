package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pm2 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f178865a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f178866b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sm2 f178867c;

    /* JADX INFO: renamed from: d */
    public int f178868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm2(sm2 sm2Var, fbk fbkVar) {
        super(fbkVar);
        this.f178867c = sm2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f178866b = obj;
        this.f178868d |= Integer.MIN_VALUE;
        return this.f178867c.m78509b(null, this);
    }
}
