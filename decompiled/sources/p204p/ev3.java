package p204p;

import com.comscore.util.crashreport.CrashReportManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ev3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f63130a;

    /* JADX INFO: renamed from: b */
    public final bji f63131b;

    /* JADX INFO: renamed from: c */
    public final wg61 f63132c;

    public ev3(int i, bji bjiVar) {
        this.f63130a = i;
        this.f63131b = bjiVar;
        this.f63132c = new wg61(new ju3(this, 15));
    }

    /* JADX INFO: renamed from: a */
    public final int m40086a() {
        ev3 ev3Var = (ev3) this.f63132c.getValue();
        return ev3Var != null ? ev3Var.m40086a() : this.f63130a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("fetch_copy_timeout_millis", "android-audiobook-ccbottomsheet", m40086a(), 1000, 60000));
    }

    public ev3(bji bjiVar) {
        this(CrashReportManager.TIME_WINDOW, bjiVar);
    }
}
