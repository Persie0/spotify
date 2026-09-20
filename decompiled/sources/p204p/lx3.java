package p204p;

import android.net.http.BidirectionalStream$Callback;
import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;

/* JADX INFO: loaded from: classes11.dex */
public final class lx3 implements BidirectionalStream$Callback {

    /* JADX INFO: renamed from: a */
    public final BidirectionalStream.Callback f137705a;

    /* JADX INFO: renamed from: b */
    public mx3 f137706b;

    public lx3(BidirectionalStream.Callback callback) {
        Objects.requireNonNull(callback, "Callback is required.");
        this.f137705a = callback;
    }

    public final void onCanceled(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        nt4 nt4VarM65595a = nt4.m65595a(urlResponseInfo);
        try {
            this.f137705a.onCanceled(this.f137706b, nt4VarM65595a);
        } finally {
            this.f137706b.m63082a(2, nt4VarM65595a, null);
        }
    }

    public final void onFailed(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        nt4 nt4VarM65595a = nt4.m65595a(urlResponseInfo);
        CronetException cronetExceptionM25769S = AbstractC1665af.m25769S(httpException);
        try {
            this.f137705a.onFailed(this.f137706b, nt4VarM65595a, cronetExceptionM25769S);
        } finally {
            this.f137706b.m63082a(1, nt4VarM65595a, cronetExceptionM25769S);
        }
    }

    public final void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.f137705a.onReadCompleted(this.f137706b, nt4.m65595a(urlResponseInfo), byteBuffer, z);
    }

    public final void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.f137705a.onResponseHeadersReceived(this.f137706b, nt4.m65595a(urlResponseInfo));
    }

    public final void onResponseTrailersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HeaderBlock headerBlock) {
        this.f137705a.onResponseTrailersReceived(this.f137706b, nt4.m65595a(urlResponseInfo), new j94(headerBlock));
    }

    public final void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.f137705a.onStreamReady(this.f137706b);
    }

    public final void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        nt4 nt4VarM65595a = nt4.m65595a(urlResponseInfo);
        try {
            this.f137705a.onSucceeded(this.f137706b, nt4VarM65595a);
        } finally {
            this.f137706b.m63082a(0, nt4VarM65595a, null);
        }
    }

    public final void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.f137705a.onWriteCompleted(this.f137706b, nt4.m65595a(urlResponseInfo), byteBuffer, z);
    }
}
