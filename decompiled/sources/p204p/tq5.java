package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class tq5 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f222708a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f222709b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zq5 f222710c;

    /* JADX INFO: renamed from: d */
    public int f222711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq5(zq5 zq5Var, ibk ibkVar) {
        super(ibkVar);
        this.f222710c = zq5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222709b = obj;
        this.f222711d |= Integer.MIN_VALUE;
        return zq5.m96718l(this.f222710c, null, this);
    }
}
