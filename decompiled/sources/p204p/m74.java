package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class m74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f140637a;

    /* JADX INFO: renamed from: b */
    public final boolean f140638b;

    /* JADX INFO: renamed from: c */
    public final boolean f140639c;

    /* JADX INFO: renamed from: d */
    public final boolean f140640d;

    /* JADX INFO: renamed from: e */
    public final boolean f140641e;

    /* JADX INFO: renamed from: f */
    public final boolean f140642f;

    /* JADX INFO: renamed from: g */
    public final bji f140643g;

    /* JADX INFO: renamed from: h */
    public final wg61 f140644h;

    public m74(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, bji bjiVar) {
        this.f140637a = z;
        this.f140638b = z2;
        this.f140639c = z3;
        this.f140640d = z4;
        this.f140641e = z5;
        this.f140642f = z6;
        this.f140643g = bjiVar;
        this.f140644h = new wg61(new f74(this, 6));
    }

    /* JADX INFO: renamed from: a */
    public final m74 m61038a() {
        return (m74) this.f140644h.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m61039b() {
        m74 m74VarM61038a = m61038a();
        return m74VarM61038a != null ? m74VarM61038a.m61039b() : this.f140637a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m61040c() {
        m74 m74VarM61038a = m61038a();
        return m74VarM61038a != null ? m74VarM61038a.m61040c() : this.f140638b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m61041d() {
        m74 m74VarM61038a = m61038a();
        return m74VarM61038a != null ? m74VarM61038a.m61041d() : this.f140639c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m61042e() {
        m74 m74VarM61038a = m61038a();
        return m74VarM61038a != null ? m74VarM61038a.m61042e() : this.f140640d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m61043f() {
        m74 m74VarM61038a = m61038a();
        return m74VarM61038a != null ? m74VarM61038a.m61043f() : this.f140641e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m61044g() {
        m74 m74VarM61038a = m61038a();
        return m74VarM61038a != null ? m74VarM61038a.m61044g() : this.f140642f;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_canvas", "android-feature-transcript-npv", m61039b()), new k8a("enable_external_link", "android-feature-transcript-npv", m61040c()), new k8a("enable_passthrough", "android-feature-transcript-npv", m61041d()), new k8a("enable_static_transcript", "android-feature-transcript-npv", m61042e()), new k8a("enable_transcript_npv", "android-feature-transcript-npv", m61043f()), new k8a("enable_translation", "android-feature-transcript-npv", m61044g()));
    }

    public m74(bji bjiVar) {
        this(false, false, false, false, false, false, bjiVar);
    }
}
