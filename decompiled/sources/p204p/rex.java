package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rex extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f198446a;

    /* JADX INFO: renamed from: b */
    public int f198447b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sex f198448c;

    /* JADX INFO: renamed from: d */
    public bqz0 f198449d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rex(sex sexVar, ibk ibkVar) {
        super(ibkVar);
        this.f198448c = sexVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f198446a = obj;
        this.f198447b |= Integer.MIN_VALUE;
        return this.f198448c.mo15629a(null, null, this);
    }
}
