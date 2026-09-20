package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class upv0 implements k330, hsr {

    /* JADX INFO: renamed from: a */
    public final String f232834a;

    /* JADX INFO: renamed from: b */
    public final String f232835b;

    /* JADX INFO: renamed from: c */
    public final un20 f232836c;

    /* JADX INFO: renamed from: d */
    public final t3x0 f232837d;

    /* JADX INFO: renamed from: e */
    public final ypv0 f232838e;

    public upv0(String str, String str2, un20 un20Var, t3x0 t3x0Var, ypv0 ypv0Var) {
        this.f232834a = str;
        this.f232835b = str2;
        this.f232836c = un20Var;
        this.f232837d = t3x0Var;
        this.f232838e = ypv0Var;
    }

    @Override // p204p.hsr
    /* JADX INFO: renamed from: b */
    public final String mo24933b() {
        return this.f232834a;
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: d */
    public final List mo24934d(b250 b250Var) {
        String str = this.f232838e.f275084a;
        String str2 = this.f232834a;
        return Collections.singletonList(new tpv0(str2, b250Var, new aqv0(str2, this.f232835b, str), this.f232836c));
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: f */
    public final t3x0 mo24936f() {
        return this.f232837d;
    }

    @Override // p204p.k330
    public final String getId() {
        return this.f232834a;
    }
}
