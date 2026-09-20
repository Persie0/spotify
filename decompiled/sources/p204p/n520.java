package p204p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class n520 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f150453a;

    /* JADX INFO: renamed from: b */
    public int f150454b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o520 f150455c;

    /* JADX INFO: renamed from: d */
    public bqz0 f150456d;

    /* JADX INFO: renamed from: e */
    public q520 f150457e;

    /* JADX INFO: renamed from: f */
    public String f150458f;

    /* JADX INFO: renamed from: g */
    public CancellationException f150459g;

    /* JADX INFO: renamed from: h */
    public String f150460h;

    /* JADX INFO: renamed from: i */
    public int f150461i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n520(o520 o520Var, ibk ibkVar) {
        super(ibkVar);
        this.f150455c = o520Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f150453a = obj;
        this.f150454b |= Integer.MIN_VALUE;
        return this.f150455c.mo15629a(null, null, this);
    }
}
