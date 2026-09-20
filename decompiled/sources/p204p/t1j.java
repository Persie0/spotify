package p204p;

import android.content.ClipData;
import android.graphics.Point;
import android.media.metrics.LogSessionId;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class t1j implements iij, kij {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216284a;

    /* JADX INFO: renamed from: b */
    public Object f216285b;

    public t1j(nn40 nn40Var) {
        this.f216284a = 0;
        this.f216285b = nn40Var;
    }

    @Override // p204p.kij
    /* JADX INFO: renamed from: a */
    public ContentInfo mo53451a() {
        return (ContentInfo) this.f216285b;
    }

    @Override // p204p.kij
    /* JADX INFO: renamed from: b */
    public Uri mo53452b() {
        return ((ContentInfo) this.f216285b).getLinkUri();
    }

    @Override // p204p.iij
    public lij build() {
        return new lij(new t1j(((ContentInfo.Builder) this.f216285b).build()));
    }

    @Override // p204p.iij
    /* JADX INFO: renamed from: c */
    public void mo50732c(Uri uri) {
        ((ContentInfo.Builder) this.f216285b).setLinkUri(uri);
    }

    @Override // p204p.iij
    /* JADX INFO: renamed from: d */
    public void mo50733d(ClipData clipData) {
        ((ContentInfo.Builder) this.f216285b).setClip(clipData);
    }

    @Override // p204p.kij
    /* JADX INFO: renamed from: e */
    public ClipData mo53453e() {
        return ((ContentInfo) this.f216285b).getClip();
    }

    /* JADX INFO: renamed from: f */
    public g0j m79878f(NetworkCapabilities networkCapabilities) {
        boolean z;
        g0j g0jVar = g0j.f75376f;
        if (networkCapabilities == null) {
            return g0jVar;
        }
        boolean zHasCapability = networkCapabilities.hasCapability(12);
        boolean zHasCapability2 = networkCapabilities.hasCapability(13);
        if (Build.VERSION.SDK_INT < 31) {
            z = false;
            break;
        }
        int[] capabilities = networkCapabilities.getCapabilities();
        int length = capabilities.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (capabilities[i] == 22) {
                z = true;
                break;
            }
            i++;
        }
        boolean zHasCapability3 = networkCapabilities.hasCapability(16);
        boolean z2 = ((nn40) this.f216285b).f156326b && networkCapabilities.hasTransport(0);
        if (!zHasCapability || ((!zHasCapability2 && !z) || (!zHasCapability3 && !z2))) {
            return g0jVar;
        }
        if (networkCapabilities.hasTransport(3)) {
            return g0j.f75373Y;
        }
        boolean zHasTransport = networkCapabilities.hasTransport(1);
        g0j g0jVar2 = g0j.f75372X;
        if (zHasTransport) {
            return g0jVar2;
        }
        boolean zHasTransport2 = networkCapabilities.hasTransport(2);
        g0j g0jVar3 = g0j.f75379i;
        if (zHasTransport2) {
            return networkCapabilities.hasCapability(11) ? g0jVar2 : g0jVar3;
        }
        if (!networkCapabilities.hasTransport(0)) {
            networkCapabilities.toString();
            return g0jVar3;
        }
        int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
        if (linkDownstreamBandwidthKbps > 10000) {
            return g0j.f75380t;
        }
        if (linkDownstreamBandwidthKbps > 100) {
            return g0jVar3;
        }
        return linkDownstreamBandwidthKbps > 50 ? g0j.f75378h : g0j.f75377g;
    }

    /* JADX INFO: renamed from: g */
    public boolean m79879g() {
        return ((Boolean) ((yum0) this.f216285b).getValue()).booleanValue();
    }

    @Override // p204p.kij
    public Bundle getExtras() {
        return ((ContentInfo) this.f216285b).getExtras();
    }

    @Override // p204p.kij
    public int getFlags() {
        return ((ContentInfo) this.f216285b).getFlags();
    }

    @Override // p204p.kij
    public int getSource() {
        return ((ContentInfo) this.f216285b).getSource();
    }

    /* JADX INFO: renamed from: h */
    public void m79880h(oz3 oz3Var, fpz0 fpz0Var, juk jukVar, Consumer consumer) {
        qqi0 qqi0Var = new qqi0(0, new iky0[16]);
        gyf1.m46133A(fpz0Var.m42388a(), 0, new hmv(1, qqi0Var, qqi0.class, "add", "add(Ljava/lang/Object;)Z", 8, 3));
        bk5.m29604a1(qqi0Var.f191608a, jlg1.m53700j(u4y0.f226842Y0, u4y0.f226844Z0), qqi0Var.f191610c);
        int i = qqi0Var.f191610c;
        iky0 iky0Var = (iky0) (i == 0 ? null : qqi0Var.f191608a[i - 1]);
        if (iky0Var == null) {
            return;
        }
        c450 c450Var = iky0Var.f103241c;
        cnh cnhVar = new cnh(iky0Var.f103239a, c450Var, kk40.m56661c(jukVar), this, oz3Var);
        tiv0 tiv0VarM71275j = pwg1.m71275j(iky0Var.f103242d);
        long jM31425c = c450Var.m31425c();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(oz3Var, yyg1.m94895F(xtm0.m92059F(tiv0VarM71275j)), new Point((int) (jM31425c >> 32), (int) (jM31425c & 4294967295L)), cnhVar);
        scrollCaptureTarget.setScrollBounds(yyg1.m94895F(c450Var));
        consumer.accept(scrollCaptureTarget);
    }

    /* JADX INFO: renamed from: i */
    public void m79881i(LogSessionId logSessionId) {
        c95.m31855u(((LogSessionId) this.f216285b).equals(LogSessionId.LOG_SESSION_ID_NONE));
        this.f216285b = logSessionId;
    }

    @Override // p204p.iij
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f216285b).setExtras(bundle);
    }

    @Override // p204p.iij
    public void setFlags(int i) {
        ((ContentInfo.Builder) this.f216285b).setFlags(i);
    }

    public String toString() {
        switch (this.f216284a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f216285b) + "}";
            default:
                return super.toString();
        }
    }

    public t1j(int i) {
        this.f216284a = i;
        switch (i) {
            case 4:
                this.f216285b = sam.m77645B(Boolean.FALSE);
                break;
            default:
                this.f216285b = LogSessionId.LOG_SESSION_ID_NONE;
                break;
        }
    }

    public t1j(ContentInfo contentInfo) {
        this.f216284a = 2;
        contentInfo.getClass();
        this.f216285b = contentInfo;
    }

    public t1j(ClipData clipData, int i) {
        this.f216284a = 1;
        this.f216285b = iwb.m51794b(clipData, i);
    }

    public t1j(lij lijVar) {
        this.f216284a = 1;
        iwb.m51797e();
        this.f216285b = iwb.m51795c(lijVar.m59098c());
    }
}
