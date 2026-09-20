package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class sq5 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f213014a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f213015b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zq5 f213016c;

    /* JADX INFO: renamed from: d */
    public int f213017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq5(zq5 zq5Var, ibk ibkVar) {
        super(ibkVar);
        this.f213016c = zq5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213015b = obj;
        this.f213017d |= Integer.MIN_VALUE;
        return zq5.m96717k(this.f213016c, null, this);
    }
}
