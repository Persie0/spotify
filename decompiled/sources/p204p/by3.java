package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class by3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f32051a;

    /* JADX INFO: renamed from: b */
    public final bji f32052b;

    /* JADX INFO: renamed from: c */
    public final wg61 f32053c = new wg61(new ju3(this, 29));

    public by3(boolean z, bji bjiVar) {
        this.f32051a = z;
        this.f32052b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m30864a() {
        by3 by3Var = (by3) this.f32053c.getValue();
        return by3Var != null ? by3Var.m30864a() : this.f32051a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("log_audio_amplitude", "android-cal-audio-recording", m30864a()));
    }
}
