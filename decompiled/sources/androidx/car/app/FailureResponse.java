package androidx.car.app;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.serialization.BundlerException;
import java.security.InvalidParameterException;
import java.util.Objects;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class FailureResponse {
    public static final int BUNDLER_EXCEPTION = 1;
    public static final int ILLEGAL_STATE_EXCEPTION = 2;
    public static final int INVALID_PARAMETER_EXCEPTION = 3;
    public static final int REMOTE_EXCEPTION = 6;
    public static final int RUNTIME_EXCEPTION = 5;
    public static final int SECURITY_EXCEPTION = 4;
    public static final int UNKNOWN_ERROR = 0;
    private final int mErrorType;
    private final String mStackTrace;

    public FailureResponse(Throwable th) {
        Objects.requireNonNull(th);
        this.mStackTrace = Log.getStackTraceString(th);
        if (th instanceof BundlerException) {
            this.mErrorType = 1;
            return;
        }
        if (th instanceof IllegalStateException) {
            this.mErrorType = 2;
            return;
        }
        if (th instanceof InvalidParameterException) {
            this.mErrorType = 3;
            return;
        }
        if (th instanceof SecurityException) {
            this.mErrorType = 4;
            return;
        }
        if (th instanceof RuntimeException) {
            this.mErrorType = 5;
        } else if (th instanceof RemoteException) {
            this.mErrorType = 6;
        } else {
            this.mErrorType = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FailureResponse)) {
            return false;
        }
        FailureResponse failureResponse = (FailureResponse) obj;
        return this.mErrorType == failureResponse.mErrorType && Objects.equals(this.mStackTrace, failureResponse.mStackTrace);
    }

    public int getErrorType() {
        return this.mErrorType;
    }

    public String getStackTrace() {
        String str = this.mStackTrace;
        Objects.requireNonNull(str);
        return str;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mErrorType), this.mStackTrace);
    }

    private FailureResponse() {
        this.mStackTrace = null;
        this.mErrorType = 0;
    }
}
