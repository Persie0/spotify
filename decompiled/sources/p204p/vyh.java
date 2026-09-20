package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class vyh implements k330 {

    /* JADX INFO: renamed from: a */
    public final String f246112a;

    /* JADX INFO: renamed from: b */
    public final t3x0 f246113b;

    /* JADX INFO: renamed from: c */
    public final String f246114c;

    static {
        fv31.f73628b.m78182S("debug_tools_concert_campaign_uri_override");
    }

    public vyh(String str, t3x0 t3x0Var, String str2) {
        this.f246112a = str;
        this.f246113b = t3x0Var;
        this.f246114c = str2;
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: d */
    public final List mo24934d(b250 b250Var) {
        return Collections.singletonList(new quh(new p1i(this.f246114c, null, 0, qrt.f191906a, 22), this.f246112a, b250Var));
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: f */
    public final t3x0 mo24936f() {
        return this.f246113b;
    }

    @Override // p204p.k330
    public final String getId() {
        return this.f246112a;
    }
}
