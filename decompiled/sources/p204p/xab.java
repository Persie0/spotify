package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class xab extends ibk {

    /* JADX INFO: renamed from: a */
    public sir0 f259639a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f259640b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yab f259641c;

    /* JADX INFO: renamed from: d */
    public int f259642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xab(yab yabVar, ibk ibkVar) {
        super(ibkVar);
        this.f259641c = yabVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259640b = obj;
        this.f259642d |= Integer.MIN_VALUE;
        return this.f259641c.mo39486g(null, this);
    }
}
