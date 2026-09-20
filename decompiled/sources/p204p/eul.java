package p204p;

import java.util.Date;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class eul extends RequestFinishedInfo.Metrics {

    /* JADX INFO: renamed from: a */
    public final long f62995a = -1;

    /* JADX INFO: renamed from: b */
    public final long f62996b = -1;

    /* JADX INFO: renamed from: c */
    public final long f62997c = -1;

    /* JADX INFO: renamed from: d */
    public final long f62998d = -1;

    /* JADX INFO: renamed from: e */
    public final long f62999e = -1;

    /* JADX INFO: renamed from: f */
    public final long f63000f = -1;

    /* JADX INFO: renamed from: g */
    public final long f63001g = -1;

    /* JADX INFO: renamed from: h */
    public final long f63002h = -1;

    /* JADX INFO: renamed from: i */
    public final long f63003i = -1;

    /* JADX INFO: renamed from: j */
    public final long f63004j = -1;

    /* JADX INFO: renamed from: k */
    public final long f63005k = -1;

    /* JADX INFO: renamed from: l */
    public final long f63006l = -1;

    /* JADX INFO: renamed from: m */
    public final long f63007m = -1;

    /* JADX INFO: renamed from: p */
    public final Long f63010p = -1L;

    /* JADX INFO: renamed from: q */
    public final Long f63011q = -1L;

    /* JADX INFO: renamed from: n */
    public final Long f63008n = null;

    /* JADX INFO: renamed from: o */
    public final Long f63009o = null;

    /* JADX INFO: renamed from: a */
    public static Date m40077a(long j) {
        if (j != -1) {
            return new Date(j);
        }
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getConnectEnd() {
        return m40077a(this.f62999e);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getConnectStart() {
        return m40077a(this.f62998d);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getDnsEnd() {
        return m40077a(this.f62997c);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getDnsStart() {
        return m40077a(this.f62996b);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getPushEnd() {
        return m40077a(this.f63005k);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getPushStart() {
        return m40077a(this.f63004j);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getReceivedByteCount() {
        return this.f63011q;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getRequestEnd() {
        return m40077a(this.f63007m);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getRequestStart() {
        return m40077a(this.f62995a);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getResponseStart() {
        return m40077a(this.f63006l);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSendingEnd() {
        return m40077a(this.f63003i);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSendingStart() {
        return m40077a(this.f63002h);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getSentByteCount() {
        return this.f63010p;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final boolean getSocketReused() {
        return false;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSslEnd() {
        return m40077a(this.f63001g);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSslStart() {
        return m40077a(this.f63000f);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getTotalTimeMs() {
        return this.f63009o;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getTtfbMs() {
        return this.f63008n;
    }
}
