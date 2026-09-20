package p204p;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class da71 extends sz30 {

    /* JADX INFO: renamed from: b */
    public final String f46990b;

    /* JADX INFO: renamed from: c */
    public final pf40 f46991c;

    public da71(String str, String str2, wsv0 wsv0Var) {
        super(str);
        c95.m31843i(!wsv0Var.isEmpty());
        this.f46990b = str2;
        pf40 pf40VarM69791p = pf40.m69791p(wsv0Var);
        this.f46991c = pf40VarM69791p;
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m35403d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override // p204p.s5f0
    /* JADX INFO: renamed from: b */
    public final void mo35404b(nhd0 nhd0Var) {
        byte b;
        Integer numValueOf;
        switch (this.f215378a) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TPOS":
                b = 21;
                break;
            case "TRCK":
                b = 22;
                break;
            case "TSST":
                b = 23;
                break;
            case "TYER":
                b = 24;
                break;
            default:
                b = -1;
                break;
        }
        pf40 pf40Var = this.f46991c;
        try {
            switch (b) {
                case 0:
                case 10:
                    nhd0Var.f153966c = (CharSequence) pf40Var.get(0);
                    break;
                case 1:
                case 11:
                    nhd0Var.f153953A = (CharSequence) pf40Var.get(0);
                    break;
                case 2:
                case 13:
                    String str = (String) pf40Var.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    nhd0Var.f153984u = Integer.valueOf(i);
                    nhd0Var.f153985v = Integer.valueOf(i2);
                    break;
                case 3:
                case 18:
                    nhd0Var.f153965b = (CharSequence) pf40Var.get(0);
                    break;
                case 4:
                case 19:
                    nhd0Var.f153967d = (CharSequence) pf40Var.get(0);
                    break;
                case 5:
                case 20:
                    nhd0Var.f153954B = (CharSequence) pf40Var.get(0);
                    break;
                case 6:
                case 22:
                    String str2 = (String) pf40Var.get(0);
                    String str3 = h0b1.f86200a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    nhd0Var.f153978o = Integer.valueOf(i3);
                    nhd0Var.f153979p = numValueOf;
                    break;
                case 7:
                case 17:
                    nhd0Var.f153964a = (CharSequence) pf40Var.get(0);
                    break;
                case 8:
                case 16:
                    nhd0Var.f153989z = (CharSequence) pf40Var.get(0);
                    break;
                case 9:
                case 24:
                    nhd0Var.f153983t = Integer.valueOf(Integer.parseInt((String) pf40Var.get(0)));
                    break;
                case 12:
                    Integer numM54981P = k0e1.m54981P((String) pf40Var.get(0));
                    if (numM54981P != null) {
                        String strM82051a = tz30.m82051a(numM54981P.intValue());
                        if (strM82051a != null) {
                            nhd0Var.f153958F = strM82051a;
                        }
                    } else {
                        nhd0Var.f153958F = (CharSequence) pf40Var.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListM35403d = m35403d((String) pf40Var.get(0));
                    int size = arrayListM35403d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                nhd0Var.f153985v = (Integer) arrayListM35403d.get(2);
                            }
                        }
                        nhd0Var.f153984u = (Integer) arrayListM35403d.get(1);
                    }
                    nhd0Var.f153983t = (Integer) arrayListM35403d.get(0);
                    break;
                case 15:
                    ArrayList arrayListM35403d2 = m35403d((String) pf40Var.get(0));
                    int size2 = arrayListM35403d2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                nhd0Var.f153988y = (Integer) arrayListM35403d2.get(2);
                            }
                        }
                        nhd0Var.f153987x = (Integer) arrayListM35403d2.get(1);
                    }
                    nhd0Var.f153986w = (Integer) arrayListM35403d2.get(0);
                    break;
                case 21:
                    String str4 = (String) pf40Var.get(0);
                    String str5 = h0b1.f86200a;
                    String[] strArrSplit2 = str4.split("/", -1);
                    int i4 = Integer.parseInt(strArrSplit2[0]);
                    numValueOf = strArrSplit2.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit2[1])) : null;
                    nhd0Var.f153956D = Integer.valueOf(i4);
                    nhd0Var.f153957E = numValueOf;
                    break;
                case 23:
                    nhd0Var.f153955C = (CharSequence) pf40Var.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && da71.class == obj.getClass()) {
            da71 da71Var = (da71) obj;
            if (Objects.equals(this.f215378a, da71Var.f215378a) && Objects.equals(this.f46990b, da71Var.f46990b)) {
                pf40 pf40Var = da71Var.f46991c;
                pf40 pf40Var2 = this.f46991c;
                pf40Var2.getClass();
                if (pmf0.m70330p(pf40Var2, pf40Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(527, 31, this.f215378a);
        String str = this.f46990b;
        return this.f46991c.hashCode() + ((iM77243b + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p204p.sz30
    public final String toString() {
        return this.f215378a + ": description=" + this.f46990b + ": values=" + this.f46991c;
    }
}
