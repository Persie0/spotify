package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class mc41 extends ibk {

    /* JADX INFO: renamed from: a */
    public nc41 f142058a;

    /* JADX INFO: renamed from: b */
    public List f142059b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f142060c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ nc41 f142061d;

    /* JADX INFO: renamed from: e */
    public int f142062e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc41(nc41 nc41Var, ibk ibkVar) {
        super(ibkVar);
        this.f142061d = nc41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f142060c = obj;
        this.f142062e |= Integer.MIN_VALUE;
        return nc41.m64118F(this.f142061d, null, this);
    }
}
