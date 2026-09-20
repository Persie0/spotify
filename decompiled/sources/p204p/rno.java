package p204p;

import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class rno {

    /* JADX INFO: renamed from: a */
    public final int f200946a;

    /* JADX INFO: renamed from: b */
    public final HashMap f200947b;

    /* JADX INFO: renamed from: c */
    public final HashMap f200948c;

    public /* synthetic */ rno(int i, int i2) {
        this(i);
    }

    /* JADX INFO: renamed from: a */
    public static rno m76006a(rno rnoVar, String str, boolean z) {
        return z ? (rno) rnoVar.f200947b.get(str) : (rno) rnoVar.f200948c.get(str.toString().toLowerCase(Locale.ENGLISH));
    }

    /* JADX INFO: renamed from: c */
    public final void m76008c(String str) {
        int length = str.length();
        HashMap map = this.f200948c;
        HashMap map2 = this.f200947b;
        int i = this.f200946a;
        if (length == i) {
            map2.put(str, null);
            map.put(str.toLowerCase(Locale.ENGLISH), null);
        } else if (length > i) {
            String strSubstring = str.substring(0, i);
            rno rnoVar = (rno) map2.get(strSubstring);
            if (rnoVar == null) {
                rnoVar = new rno(length);
                map2.put(strSubstring, rnoVar);
                map.put(strSubstring.toLowerCase(Locale.ENGLISH), rnoVar);
            }
            rnoVar.m76008c(str);
        }
    }

    public rno(int i) {
        this.f200947b = new HashMap();
        this.f200948c = new HashMap();
        this.f200946a = i;
    }
}
