package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class oyd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f171746a;

    /* JADX INFO: renamed from: b */
    public String f171747b;

    /* JADX INFO: renamed from: c */
    public eyd0 f171748c;

    /* JADX INFO: renamed from: d */
    public yyd0 f171749d;

    /* JADX INFO: renamed from: e */
    public ArrayList f171750e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f171751f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ tyd0 f171752g;

    /* JADX INFO: renamed from: h */
    public int f171753h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyd0(tyd0 tyd0Var, ibk ibkVar) {
        super(ibkVar);
        this.f171752g = tyd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f171751f = obj;
        this.f171753h |= Integer.MIN_VALUE;
        return tyd0.m81959c(this.f171752g, null, null, null, null, this);
    }
}
