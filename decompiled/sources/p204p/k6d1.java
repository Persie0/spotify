package p204p;

import android.util.ArrayMap;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes10.dex */
public final class k6d1 {

    /* JADX INFO: renamed from: a */
    public final ArrayMap f119733a = new ArrayMap();

    @JavascriptInterface
    public final void clear() {
        this.f119733a.clear();
    }

    @JavascriptInterface
    public final String getItem(String str) {
        return (String) this.f119733a.get(str);
    }

    @JavascriptInterface
    public final int getLength() {
        return this.f119733a.size();
    }

    @JavascriptInterface
    public final String key(int i) {
        return (String) this.f119733a.keyAt(i);
    }

    @JavascriptInterface
    public final void removeItem(String str) {
        this.f119733a.remove(str);
    }

    @JavascriptInterface
    public final void setItem(String str, String str2) {
        this.f119733a.put(str, str2);
    }
}
