package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class eyo0 extends ibk {

    /* JADX INFO: renamed from: a */
    public wtc0 f64130a;

    /* JADX INFO: renamed from: b */
    public Object f64131b;

    /* JADX INFO: renamed from: c */
    public Serializable f64132c;

    /* JADX INFO: renamed from: d */
    public Object f64133d;

    /* JADX INFO: renamed from: e */
    public Object f64134e;

    /* JADX INFO: renamed from: f */
    public r891 f64135f;

    /* JADX INFO: renamed from: g */
    public Object f64136g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f64137h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ iyo0 f64138i;

    /* JADX INFO: renamed from: t */
    public int f64139t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyo0(iyo0 iyo0Var, fbk fbkVar) {
        super(fbkVar);
        this.f64138i = iyo0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f64137h = obj;
        this.f64139t |= Integer.MIN_VALUE;
        return this.f64138i.invoke(null, this);
    }
}
