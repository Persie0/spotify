package p204p;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class cw51 extends ibk {

    /* JADX INFO: renamed from: a */
    public Locale f42649a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f42650b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ew51 f42651c;

    /* JADX INFO: renamed from: d */
    public int f42652d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw51(ew51 ew51Var, ibk ibkVar) {
        super(ibkVar);
        this.f42651c = ew51Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f42650b = obj;
        this.f42652d |= Integer.MIN_VALUE;
        return this.f42651c.m40136d(null, null, this);
    }
}
