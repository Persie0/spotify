package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class t8l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Set f218102a;

    /* JADX INFO: renamed from: b */
    public Object f218103b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f218104c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ u8l0 f218105d;

    /* JADX INFO: renamed from: e */
    public int f218106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8l0(u8l0 u8l0Var, ibk ibkVar) {
        super(ibkVar);
        this.f218105d = u8l0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218104c = obj;
        this.f218106e |= Integer.MIN_VALUE;
        return this.f218105d.m82586a(null, this);
    }
}
