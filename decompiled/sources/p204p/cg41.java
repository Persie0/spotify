package p204p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class cg41 implements fwz0, ag41 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f37552a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f37553b;

    /* JADX INFO: renamed from: c */
    public final i8g0 f37554c = new i8g0(10, (byte) 0);

    /* JADX INFO: renamed from: d */
    public final lwr f37555d = new lwr();

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f37556e;

    public cg41(i4t0 i4t0Var, i4t0 i4t0Var2) {
        this.f37552a = i4t0Var;
        this.f37553b = i4t0Var2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f37556e = atomicBoolean;
        atomicBoolean.set(true);
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f37555d.m60129c();
        this.f37556e.set(false);
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
