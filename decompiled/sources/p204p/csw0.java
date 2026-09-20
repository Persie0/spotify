package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class csw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f41707a;

    /* JADX INFO: renamed from: b */
    public Map f41708b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f41709c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dsw0 f41710d;

    /* JADX INFO: renamed from: e */
    public int f41711e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csw0(dsw0 dsw0Var, ibk ibkVar) {
        super(ibkVar);
        this.f41710d = dsw0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f41709c = obj;
        this.f41711e |= Integer.MIN_VALUE;
        return dsw0.m36784b(this.f41710d, null, null, this);
    }
}
