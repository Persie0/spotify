package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class f1d0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f64872a;

    /* JADX INFO: renamed from: b */
    public List f64873b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f64874c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ h1d0 f64875d;

    /* JADX INFO: renamed from: e */
    public int f64876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1d0(h1d0 h1d0Var, ibk ibkVar) {
        super(ibkVar);
        this.f64875d = h1d0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f64874c = obj;
        this.f64876e |= Integer.MIN_VALUE;
        Object objM46426j = this.f64875d.m46426j(null, null, this);
        return objM46426j == yuk.f276404a ? objM46426j : new s6x0(objM46426j);
    }
}
