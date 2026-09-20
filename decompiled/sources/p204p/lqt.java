package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lqt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f136126a;

    /* JADX INFO: renamed from: b */
    public int f136127b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mqt f136128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqt(mqt mqtVar, ibk ibkVar) {
        super(ibkVar);
        this.f136128c = mqtVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f136126a = obj;
        this.f136127b |= Integer.MIN_VALUE;
        return this.f136128c.mo15629a(null, null, this);
    }
}
