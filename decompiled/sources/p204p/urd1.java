package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class urd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f233333a;

    /* JADX INFO: renamed from: b */
    public String f233334b;

    /* JADX INFO: renamed from: c */
    public List f233335c;

    /* JADX INFO: renamed from: d */
    public String f233336d;

    /* JADX INFO: renamed from: e */
    public List f233337e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f233338f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ vrd1 f233339g;

    /* JADX INFO: renamed from: h */
    public int f233340h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urd1(vrd1 vrd1Var, ibk ibkVar) {
        super(ibkVar);
        this.f233339g = vrd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f233338f = obj;
        this.f233340h |= Integer.MIN_VALUE;
        return vrd1.m86293c(this.f233339g, false, null, this);
    }
}
