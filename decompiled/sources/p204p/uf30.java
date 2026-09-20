package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uf30 {

    /* JADX INFO: renamed from: a */
    public static final iva f229666a;

    /* JADX INFO: renamed from: b */
    public static final String[] f229667b;

    /* JADX INFO: renamed from: c */
    public static final String[] f229668c;

    /* JADX INFO: renamed from: d */
    public static final String[] f229669d;

    static {
        iva ivaVar = new iva(kk40.m56679u("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"));
        ivaVar.f106180c = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        f229666a = ivaVar;
        f229667b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f229668c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = c0f1.m31133d("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        f229669d = strArr;
        String[] strArr2 = f229668c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = dq60.m36616p(strArr2[i2], "|PADDED", new StringBuilder());
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f229668c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = dq60.m36616p(strArr3[i4], "|PADDED", sb);
        }
        int length = f229668c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = f229668c;
            if (strArr4[i7] == null) {
                strArr4[i7] = f229669d[i7];
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m82948a(int i) {
        String[] strArr = f229667b;
        return i < strArr.length ? strArr[i] : c0f1.m31133d("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0055  */
    /* JADX INFO: renamed from: b */
    public static String m82949b(boolean z, int i, int i2, int i3, int i4) {
        String strM29801l0;
        String str;
        String strM82948a = m82948a(i3);
        if (i4 == 0) {
            strM29801l0 = "";
        } else {
            String[] strArr = f229669d;
            if (i3 == 2 || i3 == 3) {
                strM29801l0 = strArr[i4];
            } else if (i3 == 4 || i3 == 6) {
                strM29801l0 = i4 == 1 ? "ACK" : strArr[i4];
            } else if (i3 == 7 || i3 == 8) {
                strM29801l0 = strArr[i4];
            } else {
                String[] strArr2 = f229668c;
                if (i4 < strArr2.length) {
                    str = strArr2[i4];
                    wj50.m88279p(str);
                } else {
                    str = strArr[i4];
                }
                if (i3 != 5 || (i4 & 4) == 0) {
                    strM29801l0 = (i3 != 0 || (i4 & 32) == 0) ? str : bm51.m29801l0(str, "PRIORITY", "COMPRESSED");
                } else {
                    strM29801l0 = bm51.m29801l0(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return c0f1.m31133d("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strM82948a, strM29801l0);
    }

    /* JADX INFO: renamed from: c */
    public static String m82950c(int i, int i2, long j, boolean z) {
        return c0f1.m31133d("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), m82948a(8), Long.valueOf(j));
    }
}
