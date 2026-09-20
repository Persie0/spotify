package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ymg1 extends ibk {

    /* JADX INFO: renamed from: a */
    public Iterator f274260a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f274261b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f7d1 f274262c;

    /* JADX INFO: renamed from: d */
    public int f274263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymg1(f7d1 f7d1Var, ibk ibkVar) {
        super(ibkVar);
        this.f274262c = f7d1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274261b = obj;
        this.f274263d |= Integer.MIN_VALUE;
        return f7d1.m40966m(this.f274262c, null, this);
    }
}
