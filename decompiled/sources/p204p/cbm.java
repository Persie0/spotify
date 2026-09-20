package p204p;

import android.os.Bundle;
import android.text.Spanned;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cbm {

    /* JADX INFO: renamed from: a */
    public static final String f36158a;

    /* JADX INFO: renamed from: b */
    public static final String f36159b;

    /* JADX INFO: renamed from: c */
    public static final String f36160c;

    /* JADX INFO: renamed from: d */
    public static final String f36161d;

    /* JADX INFO: renamed from: e */
    public static final String f36162e;

    static {
        String str = h0b1.f86200a;
        f36158a = Integer.toString(0, 36);
        f36159b = Integer.toString(1, 36);
        f36160c = Integer.toString(2, 36);
        f36161d = Integer.toString(3, 36);
        f36162e = Integer.toString(4, 36);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m32180a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f36158a, spanned.getSpanStart(obj));
        bundle2.putInt(f36159b, spanned.getSpanEnd(obj));
        bundle2.putInt(f36160c, spanned.getSpanFlags(obj));
        bundle2.putInt(f36161d, i);
        if (bundle != null) {
            bundle2.putBundle(f36162e, bundle);
        }
        return bundle2;
    }
}
