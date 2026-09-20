package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class it01 extends ibk {

    /* JADX INFO: renamed from: a */
    public ae50 f105384a;

    /* JADX INFO: renamed from: b */
    public Map f105385b;

    /* JADX INFO: renamed from: c */
    public boolean f105386c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f105387d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ot01 f105388e;

    /* JADX INFO: renamed from: f */
    public int f105389f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it01(ot01 ot01Var, ibk ibkVar) {
        super(ibkVar);
        this.f105388e = ot01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f105387d = obj;
        this.f105389f |= Integer.MIN_VALUE;
        return this.f105388e.m67754b(null, false, this);
    }
}
