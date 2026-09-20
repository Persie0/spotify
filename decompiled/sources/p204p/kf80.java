package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class kf80 extends ibk {

    /* JADX INFO: renamed from: a */
    public Set f122091a;

    /* JADX INFO: renamed from: b */
    public fw80 f122092b;

    /* JADX INFO: renamed from: c */
    public String f122093c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f122094d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ nf80 f122095e;

    /* JADX INFO: renamed from: f */
    public int f122096f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf80(nf80 nf80Var, ibk ibkVar) {
        super(ibkVar);
        this.f122095e = nf80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f122094d = obj;
        this.f122096f |= Integer.MIN_VALUE;
        return nf80.m64333i(this.f122095e, null, this);
    }
}
