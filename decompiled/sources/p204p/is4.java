package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class is4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f105126a;

    /* JADX INFO: renamed from: b */
    public final boolean f105127b;

    /* JADX INFO: renamed from: c */
    public final boolean f105128c;

    /* JADX INFO: renamed from: d */
    public final boolean f105129d;

    /* JADX INFO: renamed from: e */
    public final boolean f105130e;

    /* JADX INFO: renamed from: f */
    public final bji f105131f;

    /* JADX INFO: renamed from: g */
    public final wg61 f105132g;

    public is4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f105126a = z;
        this.f105127b = z2;
        this.f105128c = z3;
        this.f105129d = z4;
        this.f105130e = z5;
        this.f105131f = bjiVar;
        this.f105132g = new wg61(new zr4(this, 7));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m51488a() {
        is4 is4Var = (is4) this.f105132g.getValue();
        return is4Var != null ? is4Var.m51488a() : this.f105126a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m51489b() {
        is4 is4Var = (is4) this.f105132g.getValue();
        return is4Var != null ? is4Var.m51489b() : this.f105127b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m51490c() {
        is4 is4Var = (is4) this.f105132g.getValue();
        return is4Var != null ? is4Var.m51490c() : this.f105128c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m51491d() {
        is4 is4Var = (is4) this.f105132g.getValue();
        return is4Var != null ? is4Var.m51491d() : this.f105129d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m51492e() {
        is4 is4Var = (is4) this.f105132g.getValue();
        return is4Var != null ? is4Var.m51492e() : this.f105130e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_action_chips", "android-transcript-read-along", m51488a()), new k8a("enable_audio_language_translation", "android-transcript-read-along", m51489b()), new k8a("enable_passthrough", "android-transcript-read-along", m51490c()), new k8a("enable_translation", "android-transcript-read-along", m51491d()), new k8a("use_compose_page", "android-transcript-read-along", m51492e()));
    }

    public is4(bji bjiVar) {
        this(false, false, false, false, false, bjiVar);
    }
}
