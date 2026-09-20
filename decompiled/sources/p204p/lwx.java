package p204p;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class lwx implements qja1 {

    /* JADX INFO: renamed from: a */
    public static final List f137652a = h6f.m46715L("https://www.paypal.com/", "https://www.sandbox.paypal.com/", "https://play.google.com/store/account/subscriptions");

    @Override // p204p.qja1
    /* JADX INFO: renamed from: l */
    public final boolean mo27923l(Uri uri) {
        String string = uri.toString();
        List list = f137652a;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (bm51.m29803n0(string, (String) it.next(), true)) {
                return true;
            }
        }
        return false;
    }
}
