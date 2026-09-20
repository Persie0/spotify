package p204p;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class yzo0 implements zed0 {

    /* JADX INFO: renamed from: a */
    public final l1p0 f277859a;

    /* JADX INFO: renamed from: b */
    public final String f277860b;

    /* JADX INFO: renamed from: c */
    public final String f277861c;

    /* JADX INFO: renamed from: d */
    public final String f277862d = bm51.m29801l0(UUID.randomUUID().toString(), "-", "");

    public yzo0(l1p0 l1p0Var, String str, String str2) {
        this.f277859a = l1p0Var;
        this.f277860b = str;
        this.f277861c = str2;
    }

    @Override // p204p.zed0
    /* JADX INFO: renamed from: a */
    public final String mo43762a() {
        return this.f277859a.f128765a;
    }

    @Override // p204p.zed0
    /* JADX INFO: renamed from: b */
    public final String mo43763b() {
        return this.f277862d;
    }

    /* JADX INFO: renamed from: c */
    public final String m94989c() {
        String str = (String) this.f277859a.f128768d.get("betamax_override_feature_identifier");
        return str == null ? this.f277861c : str;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m94990d() {
        return this.f277859a.f128766b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m94991e() {
        String str = (String) this.f277859a.f128768d.get("endvideo_track_uri");
        boolean z = false;
        if (str != null && wl51.m88496t0(str, "track", false)) {
            z = true;
        }
        return !z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzo0)) {
            return false;
        }
        yzo0 yzo0Var = (yzo0) obj;
        return wj50.m88271j(this.f277862d, yzo0Var.f277862d) && wj50.m88271j(this.f277859a, yzo0Var.f277859a) && wj50.m88271j(m94989c(), yzo0Var.m94989c()) && wj50.m88271j(this.f277860b, yzo0Var.f277860b);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m94992f() {
        return this.f277859a.f128767c;
    }

    public final int hashCode() {
        return this.f277862d.hashCode() + ((m94989c().hashCode() + s571.m77243b(this.f277859a.hashCode() * 31, 31, this.f277860b)) * 31);
    }

    @Override // p204p.zed0
    public final Map metadata() {
        return this.f277859a.f128768d;
    }
}
