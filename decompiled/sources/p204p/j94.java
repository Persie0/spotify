package p204p;

import android.net.http.HeaderBlock;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class j94 extends UrlResponseInfo.HeaderBlock {

    /* JADX INFO: renamed from: a */
    public final HeaderBlock f110087a;

    public j94(HeaderBlock headerBlock) {
        this.f110087a = headerBlock;
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final List getAsList() {
        return this.f110087a.getAsList();
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final Map getAsMap() {
        return this.f110087a.getAsMap();
    }
}
