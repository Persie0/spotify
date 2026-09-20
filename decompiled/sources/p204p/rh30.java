package p204p;

import io.ably.lib.types.Param;
import java.io.UnsupportedEncodingException;
import p196j$.net.URLEncoder;

/* JADX INFO: loaded from: classes15.dex */
public final class rh30 implements vg30 {

    /* JADX INFO: renamed from: a */
    public Param[] f199100a;

    @Override // p204p.vg30
    /* JADX INFO: renamed from: a */
    public final String mo43248a() {
        return "application/x-www-form-urlencoded";
    }

    @Override // p204p.vg30
    public final byte[] getEncoded() {
        Param[] paramArr = this.f199100a;
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < paramArr.length; i++) {
                if (i != 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(paramArr[i].key, "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode(paramArr[i].value, "UTF-8"));
            }
            return sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }
}
