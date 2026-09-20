package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class oa4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f163205a;

    /* JADX INFO: renamed from: b */
    public final bji f163206b;

    /* JADX INFO: renamed from: c */
    public final wg61 f163207c = new wg61(new ga4(this, 7));

    public oa4(boolean z, bji bjiVar) {
        this.f163205a = z;
        this.f163206b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m66517a() {
        oa4 oa4Var = (oa4) this.f163207c.getValue();
        return oa4Var != null ? oa4Var.m66517a() : this.f163205a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_bluetooth_voice_input", "android-libs-audio-record-impl", m66517a()));
    }
}
