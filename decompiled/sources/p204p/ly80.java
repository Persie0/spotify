package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class ly80 extends ibk {

    /* JADX INFO: renamed from: a */
    public vhe0 f137983a;

    /* JADX INFO: renamed from: b */
    public pgo f137984b;

    /* JADX INFO: renamed from: c */
    public Iterator f137985c;

    /* JADX INFO: renamed from: d */
    public fiz f137986d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f137987e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ oy80 f137988f;

    /* JADX INFO: renamed from: g */
    public int f137989g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly80(oy80 oy80Var, ibk ibkVar) {
        super(ibkVar);
        this.f137988f = oy80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f137987e = obj;
        this.f137989g |= Integer.MIN_VALUE;
        return oy80.m68414a(this.f137988f, null, null, this);
    }
}
