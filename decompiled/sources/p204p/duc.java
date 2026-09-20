package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class duc implements wfq0 {
    /* JADX INFO: renamed from: a */
    public static String m36928a(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* JADX INFO: renamed from: b */
    public static duc m36929b(String str) {
        int length = str.length();
        if (length == 0) {
            return utc.f233889f;
        }
        if (length != 1) {
            return length != 2 ? new vtc(str) : new ytc(str.charAt(0), str.charAt(1));
        }
        return new xtc(str.charAt(0), 0);
    }

    /* JADX INFO: renamed from: c */
    public int mo36930c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        c95.m31851q(i, length);
        while (i < length) {
            if (mo27173e(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public int mo36931d(String str) {
        return mo36930c(str, 0);
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo27173e(char c);

    /* JADX INFO: renamed from: f */
    public duc mo27174f() {
        return new auc(this);
    }

    /* JADX INFO: renamed from: g */
    public String mo36932g(String str) {
        String string = str.toString();
        int iMo36931d = mo36931d(string);
        if (iMo36931d == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i = 1;
        while (true) {
            iMo36931d++;
            while (iMo36931d != charArray.length) {
                if (mo27173e(charArray[iMo36931d])) {
                    i++;
                } else {
                    charArray[iMo36931d - i] = charArray[iMo36931d];
                    iMo36931d++;
                }
            }
            return new String(charArray, 0, iMo36931d - i);
        }
    }
}
