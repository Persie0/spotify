package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class hl1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f92576a;

    /* JADX INFO: renamed from: b */
    public String f92577b;

    /* JADX INFO: renamed from: c */
    public Serializable f92578c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f92579d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kl1 f92580e;

    /* JADX INFO: renamed from: f */
    public int f92581f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl1(kl1 kl1Var, ibk ibkVar) {
        super(ibkVar);
        this.f92580e = kl1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f92579d = obj;
        this.f92581f |= Integer.MIN_VALUE;
        return this.f92580e.m56795a(null, this);
    }
}
