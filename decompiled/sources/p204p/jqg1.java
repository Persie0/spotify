package p204p;

import com.google.android.recaptcha.internal.zzhg;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class jqg1 {

    /* JADX INFO: renamed from: a */
    public final UrlResponseInfo f114913a;

    /* JADX INFO: renamed from: b */
    public final byte[] f114914b;

    public jqg1(UrlResponseInfo urlResponseInfo, byte[] bArr) {
        this.f114913a = urlResponseInfo;
        this.f114914b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m54090a() {
        zz11 zz11Var = zz11.f287787O0;
        zz11 zz11Var2 = zz11.f287842k2;
        zz11 zz11Var3 = zz11.f287826e2;
        try {
            int httpStatusCode = this.f114913a.getHttpStatusCode();
            if (httpStatusCode != 200) {
                int i = 12;
                String str = null;
                if (httpStatusCode == 400) {
                    throw new zzhg(zz11Var3, zz11.f287839j1, str, i);
                }
                if (httpStatusCode == 503 || httpStatusCode == 403) {
                    zzhg zzhgVar = new zzhg(zz11Var2, zz11Var, str, i);
                    throw zzhgVar;
                }
                if (httpStatusCode == 404) {
                }
            }
        } catch (Exception e) {
            throw new zzhg(zz11Var3, zz11.f287803W0, e.getMessage(), 8);
        }
    }

    /* JADX INFO: renamed from: b */
    public final k9f1 m54091b(laf1 laf1Var) throws zzhg {
        zz11 zz11Var = zz11.f287826e2;
        m54090a();
        byte[] bArr = this.f114914b;
        if (bArr.length == 0) {
            throw new zzhg(zz11Var, zz11.f287837i1, (String) null, 12);
        }
        try {
            return ((kaf1) ((obf1) laf1Var.mo25248u(7))).m55905a(bArr);
        } catch (Exception e) {
            throw new zzhg(zz11Var, zz11.f287783M0, e.getMessage(), 8);
        }
    }
}
