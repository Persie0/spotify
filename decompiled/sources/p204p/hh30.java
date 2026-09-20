package p204p;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class hh30 extends ih30 {

    /* JADX INFO: renamed from: Y */
    public final String f91280Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ km6 f91281Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh30(km6 km6Var, String str, String str2, Param[] paramArr, Param[] paramArr2, vg30 vg30Var, xg30 xg30Var, ymc ymcVar) {
        super(km6Var, str2, paramArr, paramArr2, vg30Var, xg30Var, ymcVar);
        this.f91281Z = km6Var;
        this.f91280Y = str;
    }

    /* JADX INFO: renamed from: f */
    public final String m47497f(String str) {
        Param[] paramArr = this.f102147e;
        if (Param.getFirst(paramArr, "request_id") == null) {
            return str;
        }
        Locale locale = Locale.ROOT;
        return str + " request_id=" + Param.getFirst(paramArr, "request_id");
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM32202a;
        int length;
        cc30 cc30Var = this.f91281Z.f124059b.f272464d;
        synchronized (cc30Var) {
            pyi pyiVar = cc30Var.f36299g;
            long j = pyiVar.f183409a;
            if (j > 0 && j <= System.currentTimeMillis()) {
                pyiVar.f183410b = null;
                pyiVar.f183409a = 0L;
            }
            strM32202a = (String) pyiVar.f183410b;
            if (strM32202a == null) {
                strM32202a = cc30Var.f36293a;
            }
        }
        cc30 cc30Var2 = this.f91281Z.f124059b.f272464d;
        synchronized (cc30Var2) {
            if (cc30Var2.f36295c == null) {
                length = 0;
            } else if (strM32202a.equals(cc30Var2.f36293a) || strM32202a.equals((String) cc30Var2.f36299g.f183410b)) {
                length = cc30Var2.f36295c.length;
            } else {
                String[] strArr = cc30Var2.f36295c;
                length = (strArr.length - Arrays.asList(strArr).indexOf(strM32202a)) - 1;
            }
        }
        int i = length > 0 ? this.f91281Z.f124059b.f272463c.httpMaxRetryCount : 0;
        while (!this.f102151i) {
            try {
                Object objM50576c = m50576c(strM32202a, this.f91280Y);
                this.f102143a = objM50576c;
                m50578e(objM50576c);
                this.f91281Z.f124059b.f272464d.m32203b(strM32202a);
            } catch (AblyException.HostFailedException e) {
                try {
                    i--;
                    if (i < 0) {
                        ErrorInfo errorInfo = e.errorInfo;
                        errorInfo.message = m47497f(errorInfo.message);
                        m50577d(e.errorInfo);
                    } else {
                        tx8.m81888c("p.km6", m47497f("Connection failed to host `" + strM32202a + "`. Searching for new host..."));
                        strM32202a = this.f91281Z.f124059b.f272464d.m32202a(strM32202a);
                        if (strM32202a == null) {
                            ErrorInfo errorInfo2 = e.errorInfo;
                            errorInfo2.message = m47497f(errorInfo2.message);
                            m50577d(e.errorInfo);
                        } else {
                            tx8.m81888c("p.km6", m47497f("Switched to `" + strM32202a + "`."));
                            synchronized (this) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        throw th;
                    }
                }
            } catch (AblyException e2) {
                ErrorInfo errorInfo3 = e2.errorInfo;
                errorInfo3.message = m47497f(errorInfo3.message);
                m50577d(e2.errorInfo);
            }
            synchronized (this) {
            }
            return;
        }
    }
}
