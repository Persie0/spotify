package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class fu50 extends ibk {

    /* JADX INFO: renamed from: a */
    public vs50 f73407a;

    /* JADX INFO: renamed from: b */
    public Iterator f73408b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f73409c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dn10 f73410d;

    /* JADX INFO: renamed from: e */
    public int f73411e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu50(dn10 dn10Var, fbk fbkVar) {
        super(fbkVar);
        this.f73410d = dn10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f73409c = obj;
        this.f73411e |= Integer.MIN_VALUE;
        return this.f73410d.m36443c(null, this);
    }
}
