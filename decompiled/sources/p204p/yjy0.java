package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class yjy0 extends AbstractC1806e9 {

    /* JADX INFO: renamed from: c */
    public long f273500c;

    /* JADX INFO: renamed from: d */
    public long[] f273501d;

    /* JADX INFO: renamed from: e */
    public long[] f273502e;

    /* JADX INFO: renamed from: F1 */
    public static Serializable m93946F1(int i, l2n0 l2n0Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(l2n0Var.m57953y()));
        }
        if (i == 1) {
            return Boolean.valueOf(l2n0Var.m57917E() == 1);
        }
        if (i == 2) {
            return m93948H1(l2n0Var);
        }
        if (i != 3) {
            if (i == 8) {
                return m93947G1(l2n0Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(l2n0Var.m57953y()));
                l2n0Var.m57931S(2);
                return date;
            }
            int iM57921I = l2n0Var.m57921I();
            ArrayList arrayList = new ArrayList(iM57921I);
            for (int i2 = 0; i2 < iM57921I; i2++) {
                Serializable serializableM93946F1 = m93946F1(l2n0Var.m57917E(), l2n0Var);
                if (serializableM93946F1 != null) {
                    arrayList.add(serializableM93946F1);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM93948H1 = m93948H1(l2n0Var);
            int iM57917E = l2n0Var.m57917E();
            if (iM57917E == 9) {
                return map;
            }
            Serializable serializableM93946F2 = m93946F1(iM57917E, l2n0Var);
            if (serializableM93946F2 != null) {
                map.put(strM93948H1, serializableM93946F2);
            }
        }
    }

    /* JADX INFO: renamed from: G1 */
    public static HashMap m93947G1(l2n0 l2n0Var) {
        int iM57921I = l2n0Var.m57921I();
        HashMap map = new HashMap(iM57921I);
        for (int i = 0; i < iM57921I; i++) {
            String strM93948H1 = m93948H1(l2n0Var);
            Serializable serializableM93946F1 = m93946F1(l2n0Var.m57917E(), l2n0Var);
            if (serializableM93946F1 != null) {
                map.put(strM93948H1, serializableM93946F1);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: H1 */
    public static String m93948H1(l2n0 l2n0Var) {
        int iM57924L = l2n0Var.m57924L();
        int i = l2n0Var.f129055b;
        l2n0Var.m57931S(iM57924L);
        return new String(l2n0Var.f129054a, i, iM57924L);
    }
}
