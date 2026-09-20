package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class y450 implements x450 {
    @Override // p204p.x450
    /* JADX INFO: renamed from: a */
    public final String mo89837a(Uri uri) {
        String queryParameter;
        return (uri.isOpaque() || (queryParameter = uri.getQueryParameter("~campaign")) == null) ? "" : queryParameter;
    }

    @Override // p204p.x450
    /* JADX INFO: renamed from: b */
    public final boolean mo89838b(Uri uri) {
        return uri.isHierarchical() && uri.getQueryParameter("~campaign") != null;
    }
}
