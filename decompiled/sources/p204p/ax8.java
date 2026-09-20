package p204p;

import android.graphics.Color;
import com.comscore.streaming.AdvertisementType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ax8 implements qu30 {

    /* JADX INFO: renamed from: a */
    public ArrayList f20783a;

    /* JADX INFO: renamed from: b */
    public ArrayList f20784b;

    /* JADX INFO: renamed from: c */
    public String f20785c;

    /* JADX INFO: renamed from: f */
    public transient ly30 f20788f;

    /* JADX INFO: renamed from: o */
    public ArrayList f20797o;

    /* JADX INFO: renamed from: p */
    public float f20798p;

    /* JADX INFO: renamed from: q */
    public float f20799q;

    /* JADX INFO: renamed from: r */
    public float f20800r;

    /* JADX INFO: renamed from: s */
    public float f20801s;

    /* JADX INFO: renamed from: t */
    public final int f20802t;

    /* JADX INFO: renamed from: u */
    public final int f20803u;

    /* JADX INFO: renamed from: v */
    public final int f20804v;

    /* JADX INFO: renamed from: w */
    public final int f20805w;

    /* JADX INFO: renamed from: x */
    public final int f20806x;

    /* JADX INFO: renamed from: y */
    public final String[] f20807y;

    /* JADX INFO: renamed from: d */
    public int f20786d = 1;

    /* JADX INFO: renamed from: e */
    public boolean f20787e = true;

    /* JADX INFO: renamed from: g */
    public int f20789g = 3;

    /* JADX INFO: renamed from: h */
    public float f20790h = Float.NaN;

    /* JADX INFO: renamed from: i */
    public float f20791i = Float.NaN;

    /* JADX INFO: renamed from: j */
    public boolean f20792j = true;

    /* JADX INFO: renamed from: k */
    public boolean f20793k = true;

    /* JADX INFO: renamed from: l */
    public erb0 f20794l = new erb0();

    /* JADX INFO: renamed from: m */
    public float f20795m = 17.0f;

    /* JADX INFO: renamed from: n */
    public boolean f20796n = true;

    public ax8(ArrayList arrayList) {
        this.f20783a = null;
        this.f20784b = null;
        this.f20785c = "DataSet";
        this.f20783a = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f20784b = arrayList2;
        this.f20783a.add(Integer.valueOf(Color.rgb(140, AdvertisementType.BRANDED_AS_CONTENT, 255)));
        arrayList2.add(-16777216);
        this.f20785c = null;
        this.f20798p = -3.4028235E38f;
        this.f20799q = Float.MAX_VALUE;
        this.f20800r = -3.4028235E38f;
        this.f20801s = Float.MAX_VALUE;
        this.f20797o = arrayList;
        if (!arrayList.isEmpty()) {
            this.f20798p = -3.4028235E38f;
            this.f20799q = Float.MAX_VALUE;
            this.f20800r = -3.4028235E38f;
            this.f20801s = Float.MAX_VALUE;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bx8 bx8Var = (bx8) ((lyv) it.next());
                if (bx8Var != null && !Float.isNaN(bx8Var.f138119a)) {
                    float f = bx8Var.f138119a;
                    if (f < this.f20799q) {
                        this.f20799q = f;
                    }
                    if (f > this.f20798p) {
                        this.f20798p = f;
                    }
                    float f2 = bx8Var.f138121c;
                    if (f2 < this.f20801s) {
                        this.f20801s = f2;
                    }
                    if (f2 > this.f20800r) {
                        this.f20800r = f2;
                    }
                }
            }
        }
        this.f20802t = Color.rgb(255, 187, 115);
        this.f20803u = 1;
        this.f20804v = Color.rgb(215, 215, 215);
        this.f20805w = -16777216;
        this.f20806x = 120;
        this.f20807y = new String[]{"Stack"};
        this.f20802t = Color.rgb(0, 0, 0);
        for (int i = 0; i < arrayList.size(); i++) {
            ((bx8) arrayList.get(i)).getClass();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((bx8) arrayList.get(i2)).getClass();
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m27368a(float f) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f20797o;
        int size = arrayList2.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (size + i) / 2;
            float f2 = ((lyv) arrayList2.get(i2)).f138121c;
            if (f == f2) {
                while (i2 > 0 && ((lyv) arrayList2.get(i2 - 1)).f138121c == f) {
                    i2--;
                }
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    lyv lyvVar = (lyv) arrayList2.get(i2);
                    if (lyvVar.f138121c != f) {
                        break;
                    }
                    arrayList.add(lyvVar);
                    i2++;
                }
                break;
            }
            if (f > f2) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final lyv m27369b(float f, float f2) {
        int iM27370c = m27370c(f, f2, 3);
        if (iM27370c > -1) {
            return (lyv) this.f20797o.get(iM27370c);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m27370c(float f, float f2, int i) {
        int i2;
        lyv lyvVar;
        ArrayList arrayList = this.f20797o;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 < size) {
            int i4 = (i3 + size) / 2;
            float f3 = ((lyv) arrayList.get(i4)).f138121c - f;
            int i5 = i4 + 1;
            float f4 = ((lyv) arrayList.get(i5)).f138121c - f;
            float fAbs = Math.abs(f3);
            float fAbs2 = Math.abs(f4);
            if (fAbs2 >= fAbs) {
                if (fAbs >= fAbs2) {
                    double d = f3;
                    if (d < 0.0d) {
                        if (d < 0.0d) {
                        }
                    }
                }
                size = i4;
            }
            i3 = i5;
        }
        if (size != -1) {
            float f5 = ((lyv) arrayList.get(size)).f138121c;
            if (i == 1) {
                if (f5 < f && size < arrayList.size() - 1) {
                    size++;
                }
            } else if (i == 2 && f5 > f && size > 0) {
                size--;
            }
            if (!Float.isNaN(f2)) {
                while (size > 0 && ((lyv) arrayList.get(size - 1)).f138121c == f5) {
                    size--;
                }
                float fMo30764c = ((lyv) arrayList.get(size)).mo30764c();
                loop2: while (true) {
                    i2 = size;
                    do {
                        size++;
                        if (size >= arrayList.size()) {
                            break loop2;
                        }
                        lyvVar = (lyv) arrayList.get(size);
                        if (lyvVar.f138121c != f5) {
                            break loop2;
                        }
                    } while (Math.abs(lyvVar.mo30764c() - f2) >= Math.abs(fMo30764c - f2));
                    fMo30764c = f2;
                }
                return i2;
            }
        }
        return size;
    }

    public final String toString() {
        ArrayList arrayList = this.f20797o;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuilder sb = new StringBuilder("DataSet, label: ");
        String str = this.f20785c;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(", entries: ");
        sb.append(arrayList.size());
        sb.append("\n");
        stringBuffer2.append(sb.toString());
        stringBuffer.append(stringBuffer2.toString());
        for (int i = 0; i < arrayList.size(); i++) {
            stringBuffer.append(((lyv) arrayList.get(i)).toString() + " ");
        }
        return stringBuffer.toString();
    }
}
