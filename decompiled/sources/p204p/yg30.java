package p204p;

import com.comscore.android.ConnectivityType;
import com.google.gson.JsonParseException;
import io.ably.lib.http.HttpCore$AuthRequiredException;
import io.ably.lib.rest.Auth;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.ErrorResponse;
import io.ably.lib.types.Param;
import io.ably.lib.types.ProxyOptions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class yg30 {

    /* JADX INFO: renamed from: j */
    public static final String f272460j;

    /* JADX INFO: renamed from: a */
    public final String f272461a;

    /* JADX INFO: renamed from: b */
    public final int f272462b;

    /* JADX INFO: renamed from: c */
    public final ClientOptions f272463c;

    /* JADX INFO: renamed from: d */
    public final cc30 f272464d;

    /* JADX INFO: renamed from: e */
    public final Auth f272465e;

    /* JADX INFO: renamed from: f */
    public final ProxyOptions f272466f;

    /* JADX INFO: renamed from: g */
    public final qg30 f272467g;

    /* JADX INFO: renamed from: h */
    public final Proxy f272468h;

    /* JADX INFO: renamed from: i */
    public final C1761d0 f272469i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        int i;
        ?? r0;
        ?? field = 0;
        try {
            field = Class.forName("android.os.Build$VERSION").getField("SDK_INT");
            i = field.getInt(field);
            r0 = field;
        } catch (Exception unused) {
            i = 0;
            r0 = field;
        }
        if (r0 != 0 && i < 8) {
            System.setProperty("httpCore.keepAlive", "false");
        }
        f272460j = yg30.class.getName();
    }

    public yg30(ClientOptions clientOptions, Auth auth, C1761d0 c1761d0) throws AblyException {
        int i;
        this.f272468h = Proxy.NO_PROXY;
        this.f272463c = clientOptions;
        this.f272465e = auth;
        this.f272469i = c1761d0;
        boolean z = clientOptions.tls;
        this.f272461a = z ? "https://" : "http://";
        String[] strArr = ejq.f60272a;
        if (z) {
            i = clientOptions.tlsPort;
            if (i == 0) {
                i = 443;
            }
        } else {
            i = clientOptions.port;
            if (i == 0) {
                i = 80;
            }
        }
        this.f272462b = i;
        this.f272464d = new cc30(clientOptions.restHost, "rest.ably.io", clientOptions);
        ProxyOptions proxyOptions = clientOptions.proxy;
        this.f272466f = proxyOptions;
        if (proxyOptions != null) {
            String str = proxyOptions.host;
            if (str == null) {
                throw AblyException.fromErrorInfo(new ErrorInfo("Unable to configure proxy without proxy host", ConnectivityType.UNKNOWN, 400));
            }
            int i2 = proxyOptions.port;
            if (i2 == 0) {
                throw AblyException.fromErrorInfo(new ErrorInfo("Unable to configure proxy without proxy port", ConnectivityType.UNKNOWN, 400));
            }
            this.f272468h = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i2));
            String str2 = proxyOptions.username;
            if (str2 != null) {
                String str3 = proxyOptions.password;
                if (str3 == null) {
                    throw AblyException.fromErrorInfo(new ErrorInfo("Unable to configure proxy without proxy password", ConnectivityType.UNKNOWN, 400));
                }
                this.f272467g = new qg30(str2, str3, proxyOptions.prefAuthType);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m93581c(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            throw new NullPointerException("inputStream == null");
        }
        int i2 = 0;
        if (i == -1) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 <= -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
        } else {
            byte[] bArr2 = new byte[i];
            while (true) {
                int i4 = inputStream.read(bArr2, i2, i - i2);
                if (i4 <= -1) {
                    return bArr2;
                }
                i2 += i4;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static wg30 m93582d(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        wg30 wg30Var = new wg30();
        wg30Var.f250958a = httpURLConnection.getResponseCode();
        wg30Var.f250959b = httpURLConnection.getResponseMessage();
        String str = f272460j;
        tx8.m81897l(str, "HTTP response:");
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        wg30Var.f250960c = new HashMap(headerFields.size(), 1.0f);
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null) {
                wg30Var.f250960c.put(entry.getKey().toLowerCase(Locale.ROOT), entry.getValue());
                if (tx8.f224599d <= 2) {
                    Iterator<String> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        tx8.m81897l(str, entry.getKey() + ": " + it.next());
                    }
                }
            }
        }
        if (wg30Var.f250958a != 204) {
            wg30Var.f250961d = httpURLConnection.getContentType();
            wg30Var.f250962e = httpURLConnection.getContentLength();
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Throwable unused) {
                errorStream = null;
            }
            if (errorStream == null) {
                errorStream = httpURLConnection.getErrorStream();
            }
            try {
                try {
                    wg30Var.f250963f = m93581c(errorStream, wg30Var.f250962e);
                    tx8.m81897l(str, System.lineSeparator() + new String(wg30Var.f250963f));
                } catch (NullPointerException unused2) {
                    if (errorStream != null) {
                    }
                    return wg30Var;
                } catch (Throwable th) {
                    if (errorStream != null) {
                        try {
                            errorStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
                errorStream.close();
            } catch (IOException unused4) {
            }
        }
        return wg30Var;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01db  */
    /* JADX INFO: renamed from: a */
    public final Object m93583a(HttpURLConnection httpURLConnection, String str, Param[] paramArr, vg30 vg30Var, boolean z, xg30 xg30Var) throws AblyException {
        boolean z2;
        boolean z3;
        byte[] encoded;
        ErrorInfo errorInfoFromResponseStatus;
        Auth auth;
        qg30 qg30Var = this.f272467g;
        ClientOptions clientOptions = this.f272463c;
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setConnectTimeout(clientOptions.httpOpenTimeout);
            httpURLConnection.setReadTimeout(clientOptions.httpRequestTimeout);
            httpURLConnection.setDoInput(true);
            String first = Param.getFirst(paramArr, "Authorization");
            if (first == null && (auth = this.f272465e) != null) {
                first = auth.getAuthorizationHeader();
            }
            if (first != null) {
                httpURLConnection.setRequestProperty("Authorization", first);
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && qg30Var.f188362e != null) {
                httpURLConnection.setRequestProperty("Proxy-Authorization", qg30Var.m72730c(str, httpURLConnection.getURL().getPath(), vg30Var != null ? vg30Var.getEncoded() : null));
            }
            if (paramArr != null) {
                z3 = false;
                for (Param param : paramArr) {
                    httpURLConnection.setRequestProperty(param.key, param.value);
                    if (param.key.equals("Accept")) {
                        z3 = true;
                    }
                }
            } else {
                z3 = false;
            }
            if (!z3) {
                httpURLConnection.setRequestProperty("Accept", "application/json");
            }
            httpURLConnection.setRequestProperty("X-Ably-Version", "2");
            httpURLConnection.setRequestProperty("Ably-Agent", tx8.m81886a(clientOptions.agents, this.f272469i));
            String str2 = f272460j;
            if (vg30Var != null) {
                httpURLConnection.setDoOutput(true);
                encoded = vg30Var.getEncoded();
                int length = encoded.length;
                httpURLConnection.setFixedLengthStreamingMode(length);
                httpURLConnection.setRequestProperty("Content-Type", vg30Var.mo43248a());
                httpURLConnection.setRequestProperty("Content-Length", Integer.toString(length));
                if (tx8.f224599d <= 2) {
                    tx8.m81897l(str2, System.lineSeparator() + new String(encoded));
                }
            } else {
                encoded = null;
            }
            Map<String, List<String>> requestProperties = httpURLConnection.getRequestProperties();
            if (tx8.f224599d <= 2) {
                tx8.m81897l(str2, "HTTP request: " + httpURLConnection.getURL() + " " + str);
                if (z2) {
                    tx8.m81897l(str2, "  Authorization: " + first);
                }
                for (Map.Entry<String, List<String>> entry : requestProperties.entrySet()) {
                    Iterator<String> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        tx8.m81897l(str2, "  " + entry.getKey() + ": " + it.next());
                    }
                }
            }
            if (vg30Var != null) {
                httpURLConnection.getOutputStream().write(encoded);
            }
            wg30 wg30VarM93582d = m93582d(httpURLConnection);
            int i = wg30VarM93582d.f250958a;
            if (i == 0) {
                return null;
            }
            if (i >= 500 && i <= 504) {
                throw AblyException.fromErrorInfo(ErrorInfo.fromResponseStatus(wg30VarM93582d.f250959b, i));
            }
            if (i >= 200 && i < 300) {
                return xg30Var.handleResponse(wg30VarM93582d, null);
            }
            byte[] bArr = wg30VarM93582d.f250963f;
            if (bArr == null || bArr.length <= 0) {
                errorInfoFromResponseStatus = null;
            } else {
                String str3 = wg30VarM93582d.f250961d;
                if (str3 == null || !str3.contains("msgpack")) {
                    String str4 = new String(wg30VarM93582d.f250963f);
                    try {
                        ErrorResponse errorResponseFromJSON = ErrorResponse.fromJSON(str4);
                        if (errorResponseFromJSON != null) {
                            errorInfoFromResponseStatus = errorResponseFromJSON.error;
                        } else {
                            errorInfoFromResponseStatus = null;
                        }
                    } catch (JsonParseException unused) {
                        System.err.println("Error message in unexpected format: ".concat(str4));
                    }
                } else {
                    try {
                        errorInfoFromResponseStatus = ErrorInfo.fromMsgpackBody(wg30VarM93582d.f250963f);
                    } catch (IOException unused2) {
                        System.err.println("Unable to parse msgpack error response");
                        errorInfoFromResponseStatus = null;
                    }
                }
            }
            if (errorInfoFromResponseStatus == null) {
                String headerField = httpURLConnection.getHeaderField("X-Ably-ErrorCode");
                String headerField2 = httpURLConnection.getHeaderField("X-Ably-ErrorMessage");
                if (headerField != null) {
                    try {
                        errorInfoFromResponseStatus = new ErrorInfo(headerField2, wg30VarM93582d.f250958a, Integer.parseInt(headerField));
                    } catch (NumberFormatException unused3) {
                    }
                }
            }
            if (wg30VarM93582d.f250958a == 401) {
                boolean z4 = errorInfoFromResponseStatus != null && errorInfoFromResponseStatus.code == 40140;
                HashMap map = wg30VarM93582d.f250960c;
                List list = map == null ? null : (List) map.get("WWW-Authenticate".toLowerCase(Locale.ROOT));
                if (list != null && list.size() > 0) {
                    String str5 = (String) qg30.m72728e(list).get(pg30.f177214c);
                    if (str5 != null) {
                        z4 |= str5.indexOf("stale") > -1;
                    }
                    HttpCore$AuthRequiredException httpCore$AuthRequiredException = new HttpCore$AuthRequiredException(null, errorInfoFromResponseStatus);
                    if (z4 || !z2) {
                        throw httpCore$AuthRequiredException;
                    }
                }
            }
            if (wg30VarM93582d.f250958a == 407) {
                HashMap map2 = wg30VarM93582d.f250960c;
                List list2 = map2 == null ? null : (List) map2.get("Proxy-Authenticate".toLowerCase(Locale.ROOT));
                if (list2 != null && list2.size() > 0) {
                    HttpCore$AuthRequiredException httpCore$AuthRequiredException2 = new HttpCore$AuthRequiredException(null, errorInfoFromResponseStatus);
                    httpCore$AuthRequiredException2.f7156a = qg30.m72728e(list2);
                    throw httpCore$AuthRequiredException2;
                }
            }
            if (errorInfoFromResponseStatus == null) {
                errorInfoFromResponseStatus = ErrorInfo.fromResponseStatus(wg30VarM93582d.f250959b, wg30VarM93582d.f250958a);
            }
            tx8.m81889d(str2, "Error response from server: err = " + errorInfoFromResponseStatus.toString());
            return xg30Var.handleResponse(wg30VarM93582d, errorInfoFromResponseStatus);
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m93584b(URL url, String str, Param[] paramArr, vg30 vg30Var, xg30 xg30Var) throws Throwable {
        qg30 qg30Var;
        Proxy proxy;
        String[] strArr;
        boolean z = true;
        while (true) {
            try {
                String host = url.getHost();
                ProxyOptions proxyOptions = this.f272466f;
                HttpURLConnection httpURLConnection = null;
                if (proxyOptions != null && (strArr = proxyOptions.nonProxyHosts) != null) {
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            proxy = this.f272468h;
                            break;
                        }
                        if (host.matches(strArr[i])) {
                            proxy = null;
                            break;
                        }
                        i++;
                    }
                } else {
                    proxy = this.f272468h;
                    break;
                }
                try {
                    try {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection(proxy);
                        try {
                            Object objM93583a = m93583a(httpURLConnection2, str, paramArr, vg30Var, (proxy == Proxy.NO_PROXY || this.f272467g == null) ? false : true, xg30Var);
                            httpURLConnection2.disconnect();
                            return objM93583a;
                        } catch (IOException e) {
                            e = e;
                            httpURLConnection = httpURLConnection2;
                            throw AblyException.fromThrowable(e);
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection = httpURLConnection2;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (HttpCore$AuthRequiredException e3) {
                HashMap map = e3.f7156a;
                if (map == null || !z || (qg30Var = this.f272467g) == null) {
                    throw e3;
                }
                pg30 pg30Var = qg30Var.f188367j;
                qg30Var.f188362e = pg30Var;
                String str2 = (String) map.get(pg30Var);
                if (str2 == null) {
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    if (entry == null) {
                        throw AblyException.fromErrorInfo(new ErrorInfo("Invalid authenticate header (no entries)", ConnectivityType.UNKNOWN, 400));
                    }
                    qg30Var.f188362e = (pg30) entry.getKey();
                    str2 = (String) entry.getValue();
                }
                if (qg30Var.f188362e == pg30.f177213b) {
                    synchronized (qg30Var) {
                        HashMap mapM72729f = qg30.m72729f(str2);
                        qg30Var.f188358a = (String) mapM72729f.get("realm");
                        qg30Var.f188359b = (String) mapM72729f.get("nonce");
                        qg30Var.f188361d = (String) mapM72729f.get("opaque");
                        qg30Var.f188364g = qg30.m72726b(qg30Var.f188365h + ':' + qg30Var.f188358a + ':' + qg30Var.f188366i);
                        String str3 = (String) mapM72729f.get("qop");
                        if (str3 != null) {
                            qg30Var.f188360c = str3.split(",");
                        } else {
                            continue;
                        }
                    }
                }
                z = false;
            }
        }
    }
}
