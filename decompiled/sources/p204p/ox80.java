package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ox80 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f170907a;

    /* JADX INFO: renamed from: b */
    public ipm0 f170908b;

    /* JADX INFO: renamed from: c */
    public Set f170909c;

    /* JADX INFO: renamed from: d */
    public boolean f170910d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f170911e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ vx80 f170912f;

    /* JADX INFO: renamed from: g */
    public int f170913g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox80(vx80 vx80Var, ibk ibkVar) {
        super(ibkVar);
        this.f170912f = vx80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f170911e = obj;
        this.f170913g |= Integer.MIN_VALUE;
        return this.f170912f.m86645c(null, false, null, this);
    }
}
