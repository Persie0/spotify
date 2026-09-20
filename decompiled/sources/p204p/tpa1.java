package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class tpa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f222471a;

    /* JADX INFO: renamed from: b */
    public nlv0 f222472b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f222473c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zpa1 f222474d;

    /* JADX INFO: renamed from: e */
    public int f222475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpa1(zpa1 zpa1Var, ibk ibkVar) {
        super(ibkVar);
        this.f222474d = zpa1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222473c = obj;
        this.f222475e |= Integer.MIN_VALUE;
        return zpa1.m96680h(this.f222474d, null, null, this);
    }
}
