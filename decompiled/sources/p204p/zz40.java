package p204p;

import java.io.UnsupportedEncodingException;
import p196j$.net.URLDecoder;

/* JADX INFO: loaded from: classes5.dex */
public final class zz40 implements yz40 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f287886a;

    @Override // p204p.yz40
    /* JADX INFO: renamed from: a */
    public final String mo24321a(String str) throws UnsupportedEncodingException {
        switch (this.f287886a) {
            case 0:
                return zag1.m95788j(str, "adjust_campaign");
            default:
                String strDecode = URLDecoder.decode(zag1.m95788j(str, "_branch_link"), vuc.f244913a.name());
                wj50.m88279p(strDecode);
                return zag1.m95788j(strDecode, "~campaign");
        }
    }

    @Override // p204p.yz40
    /* JADX INFO: renamed from: b */
    public final boolean mo24322b(String str) {
        switch (this.f287886a) {
            case 0:
                return wl51.m88496t0(str, "adjust_campaign", false);
            default:
                return wl51.m88496t0(str, "_branch_link", false) && wl51.m88496t0(str, "~campaign", false);
        }
    }
}
