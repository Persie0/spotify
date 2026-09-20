package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class sgz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f208957a;

    /* JADX INFO: renamed from: b */
    public int f208958b;

    /* JADX INFO: renamed from: c */
    public Object f208959c;

    public /* synthetic */ sgz(char c, int i) {
        this.f208957a = i;
    }

    /* JADX INFO: renamed from: a */
    public Object mo72406a() {
        int i = this.f208958b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.f208959c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f208958b = i - 1;
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public void m78115b() {
        WeakReference weakReferenceM86493b;
        int i = this.f208958b;
        this.f208958b = i + 1;
        if (i >= 10) {
            this.f208958b = 0;
            Iterator it = ((LinkedHashMap) this.f208959c).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    vvu0 vvu0Var = (vvu0) g6f.m43745s0(arrayList);
                    if (((vvu0Var == null || (weakReferenceM86493b = vvu0Var.m86493b()) == null) ? null : (p340) weakReferenceM86493b.get()) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((vvu0) arrayList.get(i4)).m86493b().get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m78116c(int i, ln6 ln6Var) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            ln6 ln6Var2 = ((ln6[]) this.f208959c)[i2];
            wj50.m88279p(ln6Var2);
            if (wj50.m88283v(0L, ln6Var.f135104g - ln6Var2.f135104g) <= 0) {
                break;
            }
            ln6Var2.f135103f = i;
            ((ln6[]) this.f208959c)[i] = ln6Var2;
            i = i2;
        }
        ((ln6[]) this.f208959c)[i] = ln6Var;
        ln6Var.f135103f = i;
    }

    /* JADX INFO: renamed from: d */
    public int m78117d(int i) {
        int i2 = this.f208958b - 1;
        return i2 >= 0 ? ((int[]) this.f208959c)[i2] : i;
    }

    /* JADX INFO: renamed from: e */
    public int m78118e() {
        int[] iArr = (int[]) this.f208959c;
        int i = this.f208958b - 1;
        this.f208958b = i;
        return iArr[i];
    }

    /* JADX INFO: renamed from: f */
    public void m78119f(int i) {
        int[] iArrCopyOf = (int[]) this.f208959c;
        if (this.f208958b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f208959c = iArrCopyOf;
        }
        int i2 = this.f208958b;
        this.f208958b = i2 + 1;
        iArrCopyOf[i2] = i;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo72407g(Object obj) {
        boolean z;
        Object[] objArr = (Object[]) this.f208959c;
        int i = this.f208958b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f208958b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f208958b = i3 + 1;
        return true;
    }

    /* JADX INFO: renamed from: h */
    public void m78120h(ln6 ln6Var) {
        ln6 ln6Var2;
        int i = ln6Var.f135103f;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = this.f208958b;
        ln6 ln6Var3 = ((ln6[]) this.f208959c)[i2];
        wj50.m88279p(ln6Var3);
        ln6Var.f135103f = -1;
        ((ln6[]) this.f208959c)[i2] = null;
        this.f208958b = i2 - 1;
        if (ln6Var == ln6Var3) {
            return;
        }
        int iM88283v = wj50.m88283v(0L, ln6Var3.f135104g - ln6Var.f135104g);
        if (iM88283v == 0) {
            ((ln6[]) this.f208959c)[i] = ln6Var3;
            ln6Var3.f135103f = i;
            return;
        }
        if (iM88283v >= 0) {
            m78116c(i, ln6Var3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.f208958b;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                ln6Var2 = ((ln6[]) this.f208959c)[i3];
                wj50.m88279p(ln6Var2);
            } else {
                ln6Var2 = ((ln6[]) this.f208959c)[i3];
                wj50.m88279p(ln6Var2);
                ln6 ln6Var4 = ((ln6[]) this.f208959c)[i4];
                wj50.m88279p(ln6Var4);
                if (wj50.m88283v(0L, ln6Var4.f135104g - ln6Var2.f135104g) >= 0) {
                    ln6Var2 = ln6Var4;
                }
            }
            if (wj50.m88283v(0L, ln6Var2.f135104g - ln6Var3.f135104g) <= 0) {
                break;
            }
            int i6 = ln6Var2.f135103f;
            ln6Var2.f135103f = i;
            ((ln6[]) this.f208959c)[i] = ln6Var2;
            i = i6;
        }
        ((ln6[]) this.f208959c)[i] = ln6Var3;
        ln6Var3.f135103f = i;
    }

    /* JADX INFO: renamed from: i */
    public void m78121i(pge0 pge0Var, p340 p340Var, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f208959c;
        Object arrayList = linkedHashMap.get(pge0Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(pge0Var, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        vvu0 vvu0Var = new vvu0(new WeakReference(p340Var), map, j);
        if (arrayList2.isEmpty()) {
            arrayList2.add(vvu0Var);
        } else {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                vvu0 vvu0Var2 = (vvu0) arrayList2.get(i);
                if (j >= vvu0Var2.m86494c()) {
                    if (vvu0Var2.m86493b().get() == p340Var) {
                        arrayList2.set(i, vvu0Var);
                        break;
                    } else {
                        arrayList2.add(i, vvu0Var);
                        break;
                    }
                }
            }
        }
        m78115b();
    }

    /* JADX INFO: renamed from: j */
    public int m78122j(int i) {
        int iM63084b;
        float f = -1;
        SparseArray sparseArray = (SparseArray) this.f208959c;
        if (-1 == i) {
            mx41 mx41Var = i == -1 ? (mx41) sparseArray.valueAt(0) : (mx41) sparseArray.get(-1);
            if (mx41Var != null && -1 != (iM63084b = mx41Var.m63084b(f, f))) {
                return iM63084b == -1 ? mx41Var.f147954c : ((nx41) mx41Var.f147953b.get(iM63084b)).f159363e;
            }
        } else {
            mx41 mx41Var2 = (mx41) sparseArray.get(i);
            if (mx41Var2 != null) {
                int iM63084b2 = mx41Var2.m63084b(f, f);
                return iM63084b2 == -1 ? mx41Var2.f147954c : ((nx41) mx41Var2.f147953b.get(iM63084b2)).f159363e;
            }
        }
        return -1;
    }

    public String toString() {
        switch (this.f208957a) {
            case 1:
                return ((String) this.f208959c) + ", uid: " + this.f208958b;
            default:
                return super.toString();
        }
    }

    public sgz(String str, int i) {
        this.f208957a = 1;
        Objects.requireNonNull(str);
        this.f208959c = str;
        this.f208958b = i;
    }

    public sgz(int i, byte b) {
        this.f208957a = i;
        switch (i) {
            case 5:
                this.f208959c = new LinkedHashMap();
                break;
            default:
                this.f208959c = new int[10];
                break;
        }
    }

    public sgz(Context context, XmlResourceParser xmlResourceParser) {
        this.f208957a = 7;
        this.f208958b = -1;
        this.f208959c = new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), b2u0.f22714r);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f208958b = typedArrayObtainStyledAttributes.getResourceId(index, this.f208958b);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            mx41 mx41Var = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                mx41Var = new mx41(context, xmlResourceParser);
                                ((SparseArray) this.f208959c).put(mx41Var.f147952a, mx41Var);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                nx41 nx41Var = new nx41(context, xmlResourceParser);
                                if (mx41Var != null) {
                                    mx41Var.m63083a(nx41Var);
                                }
                            }
                            break;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public sgz(int i) {
        this.f208957a = 3;
        if (i > 0) {
            this.f208959c = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public sgz(ArrayList arrayList) {
        this.f208957a = 6;
        this.f208959c = arrayList;
    }
}
