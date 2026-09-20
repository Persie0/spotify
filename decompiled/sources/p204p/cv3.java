package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cv3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f42278a;

    /* JADX INFO: renamed from: b */
    public final bji f42279b;

    /* JADX INFO: renamed from: c */
    public final wg61 f42280c = new wg61(new ju3(this, 13));

    public cv3(boolean z, bji bjiVar) {
        this.f42278a = z;
        this.f42279b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m33956a() {
        cv3 cv3Var = (cv3) this.f42280c.getValue();
        return cv3Var != null ? cv3Var.m33956a() : this.f42278a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("check_audio_track_in_abandon_audio_focus", "android-audio-focus-audio-focus-impl", m33956a()));
    }
}
