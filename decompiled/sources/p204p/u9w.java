package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class u9w {

    /* JADX INFO: renamed from: a */
    public final j4u f228286a;

    /* JADX INFO: renamed from: b */
    public final List f228287b;

    public u9w(j4u j4uVar, List list) {
        this.f228286a = j4uVar;
        this.f228287b = list;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x0111  */
    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0128  */
    /* JADX WARN: Code duplicated, block: B:55:0x0143 A[LOOP:0: B:50:0x0122->B:55:0x0143, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0146  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0169  */
    /* JADX WARN: Code duplicated, block: B:66:0x0170  */
    /* JADX WARN: Code duplicated, block: B:68:0x0174  */
    /* JADX WARN: Code duplicated, block: B:71:0x017b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0194  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a7 A[LOOP:2: B:78:0x018e->B:83:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:90:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0106, code lost:
    
        if (r15 == r5) goto L43;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0106 -> B:44:0x0109). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m82652a(lu01 lu01Var, fbk fbkVar) {
        t9w t9wVar;
        String str;
        String str2;
        Map map;
        Collection collectionValues;
        String str3;
        v9w v9wVar;
        String str4;
        int i;
        int i2;
        Collection arrayList;
        Iterator it;
        int i3;
        List listM83901t;
        int i4;
        Iterator it2;
        int i5;
        Iterator it3;
        as01 as01Var;
        Iterator it4;
        if (fbkVar instanceof t9w) {
            t9wVar = (t9w) fbkVar;
            int i6 = t9wVar.f218369X;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                t9wVar.f218369X = i6 - Integer.MIN_VALUE;
            } else {
                t9wVar = new t9w(this, fbkVar);
            }
        } else {
            t9wVar = new t9w(this, fbkVar);
        }
        Object objM56684z = t9wVar.f218378i;
        int i7 = t9wVar.f218369X;
        yuk yukVar = yuk.f276404a;
        if (i7 == 0) {
            bga.m29073P(objM56684z);
            String str5 = lu01Var.f136946a;
            Set set = dd41.f47702f;
            r46.m74726U(str5);
            str = ef41.f58936i.split(str5, 0)[0];
            vi01 vi01Var = (vi01) zn91.m96523K(lu01Var.f136952g, "transcript.share.asset_content", vi01.class);
            String strM43753y0 = (vi01Var == null || (map = vi01Var.f241580e) == null || (collectionValues = map.values()) == null) ? null : g6f.m43753y0(collectionValues, "\n", null, null, null, 62);
            wj50.m88279p(str);
            Long l = vi01Var != null ? new Long(vi01Var.f241583h) : null;
            t9wVar.f218370a = str;
            t9wVar.f218371b = strM43753y0;
            t9wVar.f218369X = 1;
            objM56684z = kk40.m56684z(new k9w(this.f228286a, l, str, null), t9wVar);
            if (objM56684z != yukVar) {
                str2 = strM43753y0;
            }
            return yukVar;
        }
        if (i7 == 1) {
            str2 = t9wVar.f218371b;
            str = t9wVar.f218370a;
            bga.m29073P(objM56684z);
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = t9wVar.f218377h;
            i2 = t9wVar.f218376g;
            i3 = t9wVar.f218375f;
            it = t9wVar.f218374e;
            arrayList = t9wVar.f218373d;
            v9wVar = t9wVar.f218372c;
            str3 = t9wVar.f218371b;
            str4 = t9wVar.f218370a;
            bga.m29073P(objM56684z);
        }
        sr01 sr01Var = (sr01) objM56684z;
        if (sr01Var != null) {
            arrayList.add(sr01Var);
        }
        if (it.hasNext()) {
            wj50.m88279p(str4);
            listM83901t = usg1.m83901t(str4, (List) arrayList);
            i4 = -1;
            if (str3 != null) {
                it4 = listM83901t.iterator();
                i5 = 0;
                while (it4.hasNext()) {
                    if (wj50.m88271j(((sr01) it4.next()).f213201a.f201919b, vsg1.m86352l(gn80.SHARE_FORMAT_TRANSCRIPT, new String[0]))) {
                        i4 = i5;
                        break;
                    }
                    i5++;
                }
            } else {
                Set set2 = dd41.f47702f;
                if (r46.m74708A(str4, gn80.CLIP)) {
                    it3 = listM83901t.iterator();
                    i5 = 0;
                    while (it3.hasNext()) {
                        as01Var = ((sr01) it3.next()).f213202b.f154745b;
                        if (as01Var instanceof jcc1) {
                            if (((jcc1) as01Var).f111058Y != null) {
                                i4 = i5;
                                break;
                            }
                            i5++;
                        } else if (as01Var instanceof l471) {
                            if ((as01Var instanceof fw6) && ((fw6) as01Var).f73985X != null) {
                                i4 = i5;
                                break;
                            }
                            i5++;
                        } else {
                            if (((l471) as01Var).f129589t != null) {
                                i4 = i5;
                                break;
                            }
                            i5++;
                        }
                    }
                } else {
                    it2 = listM83901t.iterator();
                    i5 = 0;
                    while (it2.hasNext()) {
                        if (wj50.m88271j(((sr01) it2.next()).f213201a.f201918a.f136946a, str4)) {
                            i4 = i5;
                            break;
                        }
                        i5++;
                    }
                }
            }
            return new zr01(i4 >= 0 ? i4 : 0, listM83901t);
        }
        qr01 qr01Var = (qr01) it.next();
        t9wVar.f218370a = str4;
        t9wVar.f218371b = str3;
        t9wVar.f218372c = v9wVar;
        t9wVar.f218373d = arrayList;
        t9wVar.f218374e = it;
        t9wVar.f218375f = i3;
        t9wVar.f218376g = i2;
        t9wVar.f218377h = i;
        t9wVar.f218369X = 2;
        objM56684z = qr01Var.mo51502b(v9wVar, str3, t9wVar);
        v9w v9wVar2 = (v9w) objM56684z;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : this.f228287b) {
            if (((qr01) obj).mo51501a(v9wVar2)) {
                arrayList2.add(obj);
            }
        }
        str3 = str2;
        v9wVar = v9wVar2;
        str4 = str;
        i = 0;
        i2 = 0;
        arrayList = new ArrayList();
        it = arrayList2.iterator();
        i3 = 0;
        if (it.hasNext()) {
            wj50.m88279p(str4);
            listM83901t = usg1.m83901t(str4, (List) arrayList);
            i4 = -1;
            if (str3 != null) {
                it4 = listM83901t.iterator();
                i5 = 0;
                while (it4.hasNext()) {
                    if (wj50.m88271j(((sr01) it4.next()).f213201a.f201919b, vsg1.m86352l(gn80.SHARE_FORMAT_TRANSCRIPT, new String[0]))) {
                        i4 = i5;
                        break;
                    }
                    i5++;
                }
            } else {
                Set set3 = dd41.f47702f;
                if (r46.m74708A(str4, gn80.CLIP)) {
                    it3 = listM83901t.iterator();
                    i5 = 0;
                    while (it3.hasNext()) {
                        as01Var = ((sr01) it3.next()).f213202b.f154745b;
                        if (as01Var instanceof jcc1) {
                            if (((jcc1) as01Var).f111058Y != null) {
                                i4 = i5;
                                break;
                            }
                            i5++;
                        } else if (as01Var instanceof l471) {
                            if (as01Var instanceof fw6) {
                                continue;
                            }
                            i5++;
                        } else {
                            if (((l471) as01Var).f129589t != null) {
                                i4 = i5;
                                break;
                            }
                            i5++;
                        }
                    }
                } else {
                    it2 = listM83901t.iterator();
                    i5 = 0;
                    while (it2.hasNext()) {
                        if (wj50.m88271j(((sr01) it2.next()).f213201a.f201918a.f136946a, str4)) {
                            i4 = i5;
                            break;
                        }
                        i5++;
                    }
                }
            }
            return new zr01(i4 >= 0 ? i4 : 0, listM83901t);
        }
        qr01 qr01Var2 = (qr01) it.next();
        t9wVar.f218370a = str4;
        t9wVar.f218371b = str3;
        t9wVar.f218372c = v9wVar;
        t9wVar.f218373d = arrayList;
        t9wVar.f218374e = it;
        t9wVar.f218375f = i3;
        t9wVar.f218376g = i2;
        t9wVar.f218377h = i;
        t9wVar.f218369X = 2;
        objM56684z = qr01Var2.mo51502b(v9wVar, str3, t9wVar);
    }
}
