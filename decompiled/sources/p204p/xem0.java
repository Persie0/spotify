package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class xem0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Set f260741a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f260742b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zem0 f260743c;

    /* JADX INFO: renamed from: d */
    public int f260744d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xem0(zem0 zem0Var, ibk ibkVar) {
        super(ibkVar);
        this.f260743c = zem0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f260742b = obj;
        this.f260744d |= Integer.MIN_VALUE;
        return this.f260743c.m95986a(null, this);
    }
}
