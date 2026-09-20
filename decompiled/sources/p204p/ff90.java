package p204p;

import android.app.Application;

/* JADX INFO: loaded from: classes7.dex */
public final class ff90 extends ibk {

    /* JADX INFO: renamed from: a */
    public wb11 f68951a;

    /* JADX INFO: renamed from: b */
    public Application f68952b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f68953c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ jf90 f68954d;

    /* JADX INFO: renamed from: e */
    public int f68955e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff90(jf90 jf90Var, ibk ibkVar) {
        super(ibkVar);
        this.f68954d = jf90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f68953c = obj;
        this.f68955e |= Integer.MIN_VALUE;
        return this.f68954d.m53156a(this);
    }
}
