package p204p;

import com.comscore.util.log.LogLevel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g94 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f77660a;

    /* JADX INFO: renamed from: b */
    public final boolean f77661b;

    /* JADX INFO: renamed from: c */
    public final boolean f77662c;

    /* JADX INFO: renamed from: d */
    public final f94 f77663d;

    /* JADX INFO: renamed from: e */
    public final int f77664e;

    /* JADX INFO: renamed from: f */
    public final int f77665f;

    /* JADX INFO: renamed from: g */
    public final boolean f77666g;

    /* JADX INFO: renamed from: h */
    public final bji f77667h;

    /* JADX INFO: renamed from: i */
    public final wg61 f77668i = new wg61(new f74(this, 23));

    public g94(int i, boolean z, boolean z2, f94 f94Var, int i2, int i3, boolean z3, bji bjiVar) {
        this.f77660a = i;
        this.f77661b = z;
        this.f77662c = z2;
        this.f77663d = f94Var;
        this.f77664e = i2;
        this.f77665f = i3;
        this.f77666g = z3;
        this.f77667h = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m43969a() {
        g94 g94VarM43970b = m43970b();
        return g94VarM43970b != null ? g94VarM43970b.m43969a() : this.f77660a;
    }

    /* JADX INFO: renamed from: b */
    public final g94 m43970b() {
        return (g94) this.f77668i.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m43971c() {
        g94 g94VarM43970b = m43970b();
        return g94VarM43970b != null ? g94VarM43970b.m43971c() : this.f77661b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m43972d() {
        g94 g94VarM43970b = m43970b();
        return g94VarM43970b != null ? g94VarM43970b.m43972d() : this.f77662c;
    }

    /* JADX INFO: renamed from: e */
    public final f94 m43973e() {
        f94 f94VarM43973e;
        g94 g94VarM43970b = m43970b();
        return (g94VarM43970b == null || (f94VarM43973e = g94VarM43970b.m43973e()) == null) ? this.f77663d : f94VarM43973e;
    }

    /* JADX INFO: renamed from: f */
    public final int m43974f() {
        g94 g94VarM43970b = m43970b();
        return g94VarM43970b != null ? g94VarM43970b.m43974f() : this.f77664e;
    }

    /* JADX INFO: renamed from: g */
    public final int m43975g() {
        g94 g94VarM43970b = m43970b();
        return g94VarM43970b != null ? g94VarM43970b.m43975g() : this.f77665f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m43976h() {
        g94 g94VarM43970b = m43970b();
        return g94VarM43970b != null ? g94VarM43970b.m43976h() : this.f77666g;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("coroutine_timeout_period_ms", "android-google-device-suggestions", m43969a(), 0, LogLevel.NONE);
        k8a k8aVar2 = new k8a("enable_feature", "android-google-device-suggestions", m43971c());
        k8a k8aVar3 = new k8a("enable_google_device_suggestions_source", "android-google-device-suggestions", m43972d());
        String str = m43973e().f67171a;
        f94[] f94VarArrValues = f94.values();
        ArrayList arrayList = new ArrayList(f94VarArrValues.length);
        for (f94 f94Var : f94VarArrValues) {
            arrayList.add(f94Var.f67171a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, new k8a("minimum_displayable_confidence_score", "android-google-device-suggestions", str, arrayList), new k8a("suggestion_cache_ttl_ms", "android-google-device-suggestions", m43974f(), 0, 600000), new k8a("suggestion_request_timeout_ms", "android-google-device-suggestions", m43975g(), 0, 50000), new k8a("use_spotify_device_suggestion_as_fallback", "android-google-device-suggestions", m43976h()));
    }
}
