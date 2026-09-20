package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hq61 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f94040a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f94041b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ iq61 f94042c;

    /* JADX INFO: renamed from: d */
    public int f94043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq61(iq61 iq61Var, ibk ibkVar) {
        super(ibkVar);
        this.f94042c = iq61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f94041b = obj;
        this.f94043d |= Integer.MIN_VALUE;
        return this.f94042c.mo50458d(null, this);
    }
}
