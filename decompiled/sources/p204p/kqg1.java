package p204p;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class kqg1 extends UrlRequest.Callback {

    /* JADX INFO: renamed from: a */
    public final hqb f125315a;

    /* JADX INFO: renamed from: b */
    public final eva f125316b;

    public kqg1(hqb hqbVar) {
        this.f125315a = hqbVar;
        r9f1 r9f1Var = s9f1.f206952b;
        this.f125316b = new eva(1);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        urlResponseInfo.getUrl();
        this.f125315a.resumeWith(new c6x0(cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws IOException {
        urlResponseInfo.getUrl();
        byteBuffer.flip();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        this.f125316b.write(bArr);
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlResponseInfo.getUrl();
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlResponseInfo.getUrl();
        urlRequest.read(ByteBuffer.allocateDirect(65536));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        s9f1 s9f1VarM77579p;
        urlResponseInfo.getUrl();
        eva evaVar = this.f125316b;
        synchronized (evaVar) {
            try {
                int i = evaVar.f63195f;
                byte[] bArr = evaVar.f63194e;
                if (i >= bArr.length) {
                    evaVar.f63192c.add(new r9f1(evaVar.f63194e));
                    evaVar.f63194e = eva.f63189h;
                } else if (i > 0) {
                    evaVar.f63192c.add(new r9f1(Arrays.copyOf(bArr, i)));
                }
                evaVar.f63193d += evaVar.f63195f;
                int size = 0;
                evaVar.f63195f = 0;
                ArrayList arrayList = evaVar.f63192c;
                if (arrayList == null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next();
                        size++;
                    }
                } else {
                    size = arrayList.size();
                }
                s9f1VarM77579p = size == 0 ? s9f1.f206952b : s9f1.m77579p(arrayList.iterator(), size);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f125315a.resumeWith(new jqg1(urlResponseInfo, s9f1VarM77579p.m77584y()));
    }
}
