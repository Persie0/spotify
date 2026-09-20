package p204p;

import com.comscore.streaming.ContentType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class z2z implements w2z {

    /* JADX INFO: renamed from: e */
    public static final List f278698e = Collections.singletonList(new f880());

    /* JADX INFO: renamed from: f */
    public static final List f278699f = Collections.singletonList(new l880());

    /* JADX INFO: renamed from: g */
    public static final List f278700g = Collections.singletonList(new e980());

    /* JADX INFO: renamed from: h */
    public static final List f278701h = h6f.m46715L(new e980(), p880.f174896b);

    /* JADX INFO: renamed from: i */
    public static final List f278702i = Collections.singletonList(new i880(3, (List) null));

    /* JADX INFO: renamed from: j */
    public static final List f278703j = Collections.singletonList(h880.f88652b);

    /* JADX INFO: renamed from: k */
    public static final List f278704k = Collections.singletonList(g880.f77435b);

    /* JADX INFO: renamed from: l */
    public static final List f278705l = Collections.singletonList(k880.f120269b);

    /* JADX INFO: renamed from: m */
    public static final List f278706m = Collections.singletonList(j880.f109864b);

    /* JADX INFO: renamed from: n */
    public static final List f278707n = Collections.singletonList(new f980());

    /* JADX INFO: renamed from: o */
    public static final List f278708o = h6f.m46715L(new f980(), new x880());

    /* JADX INFO: renamed from: p */
    public static final List f278709p = Collections.singletonList(new n880());

    /* JADX INFO: renamed from: q */
    public static final List f278710q = Collections.singletonList(new y880());

    /* JADX INFO: renamed from: a */
    public final cpe1 f278711a;

    /* JADX INFO: renamed from: b */
    public final String f278712b;

    /* JADX INFO: renamed from: c */
    public final dd41 f278713c;

    /* JADX INFO: renamed from: d */
    public final String f278714d;

    public z2z(cpe1 cpe1Var, String str, dd41 dd41Var, String str2) {
        this.f278711a = cpe1Var;
        this.f278712b = str;
        this.f278713c = dd41Var;
        this.f278714d = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0.equals("downloaded") != false) goto L88;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m95234a() {
        k980 k980VarM52276n;
        dd41 dd41Var = this.f278713c;
        he41 he41Var = dd41Var.f47710d;
        ArrayList arrayList = null;
        boolean zM88271j = wj50.m88271j(he41Var != null ? he41Var.getType() : null, nvp0.f158938f);
        lau lauVar = lau.f131415a;
        if (zM88271j) {
            String str = this.f278714d;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1377611054:
                        if (str.equals("by_spotify")) {
                            return f278704k;
                        }
                        break;
                    case -1374614473:
                        if (str.equals("by_you")) {
                            return f278703j;
                        }
                        break;
                    case -683249211:
                        if (str.equals("folders")) {
                            return f278706m;
                        }
                        break;
                    case 118879398:
                        if (str.equals("is_mixed")) {
                            return f278705l;
                        }
                        break;
                    case 2039141159:
                        break;
                }
            }
            return lauVar;
        }
        int iOrdinal = dd41Var.f47709c.ordinal();
        if (iOrdinal == 175) {
            return f278698e;
        }
        if (iOrdinal == 181) {
            return f278710q;
        }
        if (iOrdinal != 194 && iOrdinal != 203 && iOrdinal != 208) {
            if (iOrdinal != 185 && iOrdinal != 186) {
                if (iOrdinal != 190) {
                    if (iOrdinal != 191) {
                        switch (iOrdinal) {
                            case 177:
                                return f278699f;
                            case 178:
                                return f278709p;
                            case 179:
                                return f278702i;
                            default:
                                switch (iOrdinal) {
                                    case 198:
                                        giq giqVar = (giq) this.f278711a;
                                        uzy uzyVar = giqVar.f80232a;
                                        String str2 = this.f278712b;
                                        List listM84314a = uzyVar.m84314a(str2);
                                        if (!listM84314a.isEmpty() || !giqVar.m44845b()) {
                                            return listM84314a;
                                        }
                                        String strMo48711f = giqVar.m44844a().mo48711f(giq.f80229g);
                                        if (strMo48711f != null && strMo48711f.length() != 0) {
                                            List listM88477a1 = wl51.m88477a1(strMo48711f, new String[]{","}, 0, 6);
                                            ArrayList arrayList2 = new ArrayList();
                                            Iterator it = listM88477a1.iterator();
                                            while (it.hasNext()) {
                                                try {
                                                    k980VarM52276n = j3h1.m52276n((String) it.next(), lauVar);
                                                } catch (IllegalArgumentException unused) {
                                                    k980VarM52276n = null;
                                                }
                                                if (k980VarM52276n != null) {
                                                    arrayList2.add(k980VarM52276n);
                                                }
                                                break;
                                            }
                                            if (!arrayList2.isEmpty()) {
                                                arrayList = arrayList2;
                                            }
                                        }
                                        if (arrayList == null) {
                                            return listM84314a;
                                        }
                                        uzyVar.f235657a = new pqm0(str2, arrayList);
                                        return uzyVar.m84314a(str2);
                                    case ContentType.BUMPER /* 199 */:
                                        return f278700g;
                                    case 200:
                                        return f278701h;
                                    default:
                                        return lauVar;
                                }
                        }
                    }
                }
            }
            return f278708o;
        }
        return f278707n;
    }

    /* JADX INFO: renamed from: b */
    public final void m95235b(List list) {
        if (this.f278713c.f47709c == gn80.COLLECTION_ROOT) {
            giq giqVar = (giq) this.f278711a;
            giqVar.f80232a.f235657a = new pqm0(this.f278712b, list);
            if (giqVar.m44845b()) {
                String strM43753y0 = g6f.m43753y0(list, ",", null, null, rhq.f199302f, 30);
                lv31 lv31VarEdit = giqVar.m44844a().edit();
                lv31VarEdit.m60051d(giq.f80229g, strM43753y0);
                lv31VarEdit.m60055h();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m95236c(hbj hbjVar) {
        if (this.f278713c.f47709c == gn80.COLLECTION_ROOT) {
            cpe1 cpe1Var = this.f278711a;
            if (hbjVar == null) {
                giq giqVar = (giq) cpe1Var;
                giqVar.f80232a.f235658b = null;
                if (giqVar.m44845b()) {
                    lv31 lv31VarEdit = giqVar.m44844a().edit();
                    lv31VarEdit.m60053f(giq.f80230h);
                    lv31VarEdit.m60053f(giq.f80231i);
                    lv31VarEdit.m60055h();
                    return;
                }
                return;
            }
            giq giqVar2 = (giq) cpe1Var;
            giqVar2.f80232a.f235658b = new pqm0(this.f278712b, hbjVar);
            if (giqVar2.m44845b()) {
                lv31 lv31VarEdit2 = giqVar2.m44844a().edit();
                lv31VarEdit2.m60051d(giq.f80230h, hbjVar.f89551a);
                lv31VarEdit2.m60051d(giq.f80231i, hbjVar.f89552b);
                lv31VarEdit2.m60055h();
            }
        }
    }
}
