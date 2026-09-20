package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ve10 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f240545a;

    /* JADX INFO: renamed from: b */
    public Object f240546b;

    /* JADX INFO: renamed from: c */
    public Serializable f240547c;

    /* JADX INFO: renamed from: d */
    public lsi0 f240548d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f240549e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ye10 f240550f;

    /* JADX INFO: renamed from: g */
    public int f240551g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve10(ye10 ye10Var, ibk ibkVar) {
        super(ibkVar);
        this.f240550f = ye10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f240549e = obj;
        this.f240551g |= Integer.MIN_VALUE;
        return this.f240550f.m93516b(null, null, null, this);
    }
}
