package p204p;

import androidx.media3.common.PlaybackException;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Set;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s0m {

    /* JADX INFO: renamed from: a */
    public static final Set f204433a = bk5.m29624m1(new Integer[]{4001, 4002, 4003, 4004, 4005});

    /* JADX INFO: renamed from: a */
    public static final r0m m76887a(int i, Exception exc) {
        HttpException httpException = exc instanceof HttpException ? (HttpException) exc : null;
        Integer numValueOf = httpException != null ? Integer.valueOf(httpException.f288164a) : null;
        if (numValueOf != null && numValueOf.intValue() > 0) {
            i = 2;
        } else if ((exc instanceof SocketTimeoutException) || (exc instanceof UnknownHostException) || (exc instanceof ConnectException)) {
            i = 1;
        } else if (exc instanceof UnsupportedEncodingException) {
            i = 3;
        } else if (exc instanceof PlaybackException) {
            i = f204433a.contains(Integer.valueOf(((PlaybackException) exc).f965a)) ? 4 : 5;
        }
        return new r0m(i, numValueOf);
    }
}
