package p204p;

import com.comscore.util.crashreport.CrashReportManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fhf implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f69649a;

    /* JADX INFO: renamed from: b */
    public final boolean f69650b;

    /* JADX INFO: renamed from: c */
    public final int f69651c;

    /* JADX INFO: renamed from: d */
    public final bji f69652d;

    /* JADX INFO: renamed from: e */
    public final wg61 f69653e;

    public fhf(int i, bji bjiVar, boolean z, boolean z2) {
        this.f69649a = z;
        this.f69650b = z2;
        this.f69651c = i;
        this.f69652d = bjiVar;
        this.f69653e = new wg61(new che(this, 13));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m41663a() {
        fhf fhfVar = (fhf) this.f69653e.getValue();
        return fhfVar != null ? fhfVar.m41663a() : this.f69649a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m41664b() {
        fhf fhfVar = (fhf) this.f69653e.getValue();
        return fhfVar != null ? fhfVar.m41664b() : this.f69650b;
    }

    /* JADX INFO: renamed from: c */
    public final int m41665c() {
        fhf fhfVar = (fhf) this.f69653e.getValue();
        return fhfVar != null ? fhfVar.m41665c() : this.f69651c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_timestamps_for_episodes", "comments-data", m41663a()), new k8a("enable_timestamps_for_passthrough_episodes", "comments-data", m41664b()), new k8a("passthrough_timestamp_mapping_timeout_ms", "comments-data", m41665c(), 100, 10000));
    }

    public fhf(bji bjiVar) {
        this(CrashReportManager.TIME_WINDOW, bjiVar, false, false);
    }
}
