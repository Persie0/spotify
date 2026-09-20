package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class em6 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f60829a;

    /* JADX INFO: renamed from: b */
    public czz f60830b;

    /* JADX INFO: renamed from: c */
    public int f60831c;

    /* JADX INFO: renamed from: d */
    public int f60832d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f60833e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ gm6 f60834f;

    /* JADX INFO: renamed from: g */
    public int f60835g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em6(gm6 gm6Var, ibk ibkVar) {
        super(ibkVar);
        this.f60834f = gm6Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60833e = obj;
        this.f60835g |= Integer.MIN_VALUE;
        return this.f60834f.m45218a(this);
    }
}
