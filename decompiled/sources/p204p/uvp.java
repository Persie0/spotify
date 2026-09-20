package p204p;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class uvp implements ddz0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vvp f234487a;

    public uvp(vvp vvpVar) {
        this.f234487a = vvpVar;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: b */
    public final cdz0 mo25847b(long j) {
        vvp vvpVar = this.f234487a;
        long j2 = (((long) vvpVar.f245267d.f165707i) * j) / 1000000;
        long j3 = vvpVar.f245265b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        long j4 = vvpVar.f245266c;
        ndz0 ndz0Var = new ndz0(j, h0b1.m46319k((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(vvpVar.f245269f)).longValue() + j3) - 30000, vvpVar.f245265b, j4 - 1));
        return new cdz0(ndz0Var, ndz0Var);
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: d */
    public final boolean mo25849d() {
        return true;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: g */
    public final long mo25852g() {
        vvp vvpVar = this.f234487a;
        return (vvpVar.f245269f * 1000000) / ((long) vvpVar.f245267d.f165707i);
    }
}
