package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class wf0 {

    /* JADX INFO: renamed from: a */
    public final Context f250650a;

    public wf0(Context context) {
        this.f250650a = context;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m87917a(zo01 zo01Var) {
        Intent intent;
        Iterator<E> it = zo01Var.f284611b.iterator();
        do {
            intent = null;
            if (!it.hasNext()) {
                return null;
            }
            String str = (String) it.next();
            String str2 = zo01Var.f284612c;
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String str3 = zo01Var.f284613d;
            String str4 = zo01Var.f284614e;
            String str5 = zo01Var.f284615f;
            Intent intent2 = new Intent(str2);
            intent2.setPackage(str);
            intent2.setDataAndType(str4 != null ? Uri.parse(str4) : null, str3);
            if (str5 != null) {
                intent2.addCategory(str5);
            }
            if (this.f250650a.getPackageManager().resolveActivity(intent2, 0) != null) {
                intent = intent2;
            }
        } while (intent == null);
        return intent;
    }
}
