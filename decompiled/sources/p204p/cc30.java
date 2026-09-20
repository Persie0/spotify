package p204p;

import com.comscore.android.ConnectivityType;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes16.dex */
public final class cc30 {

    /* JADX INFO: renamed from: a */
    public final String f36293a;

    /* JADX INFO: renamed from: b */
    public final boolean f36294b;

    /* JADX INFO: renamed from: c */
    public final String[] f36295c;

    /* JADX INFO: renamed from: d */
    public final boolean f36296d;

    /* JADX INFO: renamed from: e */
    public final boolean f36297e;

    /* JADX INFO: renamed from: f */
    public final long f36298f;

    /* JADX INFO: renamed from: g */
    public final pyi f36299g = new pyi();

    public cc30(String str, String str2, ClientOptions clientOptions) throws AblyException {
        String str3;
        this.f36297e = clientOptions.fallbackHostsUseDefault;
        boolean z = true;
        boolean z2 = (str == null || str.equalsIgnoreCase(str2)) ? false : true;
        String[] strArr = clientOptions.fallbackHosts;
        if (clientOptions.fallbackHostsUseDefault) {
            if (strArr != null) {
                throw AblyException.fromErrorInfo(new ErrorInfo("fallbackHosts and fallbackHostsUseDefault cannot both be set", ConnectivityType.UNKNOWN, 400));
            }
            if (clientOptions.port != 0 || clientOptions.tlsPort != 0) {
                throw AblyException.fromErrorInfo(new ErrorInfo("fallbackHostsUseDefault cannot be set when port or tlsPort are set", ConnectivityType.UNKNOWN, 400));
            }
            strArr = ejq.f60272a;
        }
        String str4 = clientOptions.environment;
        if (str4 != null && !str4.isEmpty() && !"production".equalsIgnoreCase(clientOptions.environment)) {
            z = false;
        }
        if (!z2 && strArr == null && clientOptions.port == 0 && clientOptions.tlsPort == 0) {
            if (z) {
                strArr = ejq.f60272a;
            } else {
                String str5 = clientOptions.environment;
                String[] strArr2 = ejq.f60272a;
                strArr = new String[]{str5 + "-a-fallback.ably-realtime.com", str5 + "-b-fallback.ably-realtime.com", str5 + "-c-fallback.ably-realtime.com", str5 + "-d-fallback.ably-realtime.com", str5 + "-e-fallback.ably-realtime.com"};
            }
        }
        if (z2) {
            this.f36293a = str;
            if (clientOptions.environment != null) {
                throw AblyException.fromErrorInfo(new ErrorInfo("cannot set both restHost/realtimeHost and environment options", ConnectivityType.UNKNOWN, 400));
            }
        } else {
            if (z) {
                str3 = str2;
            } else {
                str3 = clientOptions.environment + "-" + str2;
            }
            this.f36293a = str3;
        }
        this.f36294b = this.f36293a.equalsIgnoreCase(str2);
        this.f36296d = Arrays.equals(ejq.f60272a, strArr);
        String[] strArr3 = strArr == null ? new String[0] : (String[]) strArr.clone();
        this.f36295c = strArr3;
        Collections.shuffle(Arrays.asList(strArr3));
        this.f36298f = clientOptions.fallbackRetryTimeout;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m32202a(String str) {
        int i;
        if (this.f36295c == null) {
            return null;
        }
        if (!str.equals(this.f36293a)) {
            pyi pyiVar = this.f36299g;
            long j = pyiVar.f183409a;
            if (j > 0 && j <= System.currentTimeMillis()) {
                pyiVar.f183410b = null;
                pyiVar.f183409a = 0L;
            }
            if (str.equals((String) pyiVar.f183410b)) {
                pyi pyiVar2 = this.f36299g;
                pyiVar2.f183410b = null;
                pyiVar2.f183409a = 0L;
                return this.f36293a;
            }
            int iIndexOf = Arrays.asList(this.f36295c).indexOf(str);
            if (iIndexOf < 0) {
                return null;
            }
            i = iIndexOf + 1;
        } else {
            if (!this.f36294b && !this.f36297e && this.f36296d) {
                return null;
            }
            i = 0;
        }
        String[] strArr = this.f36295c;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m32203b(String str) {
        boolean zEquals;
        try {
            String str2 = (String) this.f36299g.f183410b;
            if (str2 == null) {
                zEquals = str == null;
            } else {
                zEquals = str2.equals(str);
            }
            if (zEquals) {
                return;
            }
            if (str.equals(this.f36293a)) {
                pyi pyiVar = this.f36299g;
                pyiVar.f183410b = null;
                pyiVar.f183409a = 0L;
            } else {
                pyi pyiVar2 = this.f36299g;
                long jCurrentTimeMillis = System.currentTimeMillis() + this.f36298f;
                pyiVar2.f183410b = str;
                pyiVar2.f183409a = jCurrentTimeMillis;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
