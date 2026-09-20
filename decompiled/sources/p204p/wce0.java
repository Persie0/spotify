package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class wce0 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f250026a;

    /* JADX INFO: renamed from: b */
    public List f250027b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f250028c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mab0 f250029d;

    /* JADX INFO: renamed from: e */
    public int f250030e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wce0(mab0 mab0Var, ibk ibkVar) {
        super(ibkVar);
        this.f250029d = mab0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f250028c = obj;
        this.f250030e |= Integer.MIN_VALUE;
        return this.f250029d.m61286r(null, this);
    }
}
