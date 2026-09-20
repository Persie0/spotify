package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vtn0 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f244734a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f244735b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xtn0 f244736c;

    /* JADX INFO: renamed from: d */
    public int f244737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtn0(xtn0 xtn0Var, ibk ibkVar) {
        super(ibkVar);
        this.f244736c = xtn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f244735b = obj;
        this.f244737d |= Integer.MIN_VALUE;
        return xtn0.m92106c(this.f244736c, null, this);
    }
}
