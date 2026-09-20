package p204p;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zmx0 {

    /* JADX INFO: renamed from: a */
    public int f284355a;

    /* JADX INFO: renamed from: b */
    public int f284356b;

    /* JADX INFO: renamed from: c */
    public int f284357c;

    /* JADX INFO: renamed from: d */
    public final Object f284358d;

    /* JADX INFO: renamed from: e */
    public Object f284359e;

    public zmx0(List list) {
        this.f284359e = new ku31("", null);
        this.f284357c = 0;
        this.f284358d = list;
        this.f284355a = 0;
        this.f284356b = 0;
        if (list.isEmpty()) {
            return;
        }
        m96495b(0, 0);
        ku31 ku31Var = (ku31) list.get(0);
        this.f284359e = ku31Var;
        this.f284357c = ku31Var.f126444a.length();
    }

    /* JADX INFO: renamed from: a */
    public anx0 m96494a() {
        return new anx0(this);
    }

    /* JADX INFO: renamed from: b */
    public void m96495b(int i, int i2) {
        List list = (List) this.f284358d;
        if (i < 0 || i >= list.size()) {
            throw new IllegalArgumentException(s571.m77247f(i, "Line index ", list.size(), " out of range, number of lines: "));
        }
        ku31 ku31Var = (ku31) list.get(i);
        if (i2 < 0 || i2 > ku31Var.f126444a.length()) {
            throw new IllegalArgumentException(s571.m77247f(i2, "Index ", ku31Var.f126444a.length(), " out of range, line length: "));
        }
    }

    /* JADX INFO: renamed from: c */
    public int m96496c(char c) {
        int i = 0;
        while (true) {
            char cM96506m = m96506m();
            if (cM96506m == 0) {
                return -1;
            }
            if (cM96506m == c) {
                return i;
            }
            i++;
            m96503j();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m96497d() {
        int i = this.f284357c;
        this.f284357c = i == Integer.MIN_VALUE ? this.f284355a : i + this.f284356b;
        this.f284359e = ((String) this.f284358d) + this.f284357c;
    }

    /* JADX INFO: renamed from: e */
    public cx10 m96498e(zpt0 zpt0Var, zpt0 zpt0Var2) {
        List list = (List) this.f284358d;
        int i = zpt0Var.f285226b;
        int i2 = zpt0Var.f285227c;
        int i3 = zpt0Var2.f285226b;
        int i4 = zpt0Var2.f285227c;
        if (i == i3) {
            ku31 ku31Var = (ku31) list.get(i);
            CharSequence charSequenceSubSequence = ku31Var.f126444a.subSequence(i2, i4);
            bv31 bv31Var = ku31Var.f126445b;
            ku31 ku31Var2 = new ku31(charSequenceSubSequence, bv31Var != null ? bv31Var.m30583a(i2, i4) : null);
            cx10 cx10Var = new cx10();
            cx10Var.f42884a.add(ku31Var2);
            return cx10Var;
        }
        cx10 cx10Var2 = new cx10();
        ku31 ku31Var3 = (ku31) list.get(i);
        ku31 ku31VarM57375a = ku31Var3.m57375a(i2, ku31Var3.f126444a.length());
        ArrayList arrayList = cx10Var2.f42884a;
        arrayList.add(ku31VarM57375a);
        while (true) {
            i++;
            if (i >= i3) {
                arrayList.add(((ku31) list.get(i3)).m57375a(0, i4));
                return cx10Var2;
            }
            arrayList.add((ku31) list.get(i));
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m96499f() {
        return this.f284356b < this.f284357c || this.f284355a < ((List) this.f284358d).size() - 1;
    }

    /* JADX INFO: renamed from: g */
    public int m96500g(qgj0 qgj0Var) {
        int i = 0;
        while (((BitSet) qgj0Var.f188484b).get(m96506m())) {
            i++;
            m96503j();
        }
        return i;
    }

    /* JADX INFO: renamed from: h */
    public int m96501h(char c) {
        int i = 0;
        while (m96506m() == c) {
            i++;
            m96503j();
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public void m96502i() {
        if (this.f284357c == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* JADX INFO: renamed from: j */
    public void m96503j() {
        List list = (List) this.f284358d;
        int i = this.f284356b + 1;
        this.f284356b = i;
        if (i > this.f284357c) {
            int i2 = this.f284355a + 1;
            this.f284355a = i2;
            if (i2 < list.size()) {
                ku31 ku31Var = (ku31) list.get(this.f284355a);
                this.f284359e = ku31Var;
                this.f284357c = ku31Var.f126444a.length();
            } else {
                ku31 ku31Var2 = new ku31("", null);
                this.f284359e = ku31Var2;
                this.f284357c = ku31Var2.f126444a.length();
            }
            this.f284356b = 0;
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m96504k(char c) {
        if (m96506m() != c) {
            return false;
        }
        m96503j();
        return true;
    }

    /* JADX INFO: renamed from: l */
    public boolean m96505l(String str) {
        int i = this.f284356b;
        if (i < this.f284357c && str.length() + i <= this.f284357c) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (((ku31) this.f284359e).f126444a.charAt(this.f284356b + i2) == str.charAt(i2)) {
                }
            }
            this.f284356b = str.length() + this.f284356b;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public char m96506m() {
        int i = this.f284356b;
        if (i < this.f284357c) {
            return ((ku31) this.f284359e).f126444a.charAt(i);
        }
        return this.f284355a < ((List) this.f284358d).size() + (-1) ? '\n' : (char) 0;
    }

    /* JADX INFO: renamed from: n */
    public zpt0 m96507n() {
        return new zpt0(this.f284355a, this.f284356b, 2);
    }

    /* JADX INFO: renamed from: o */
    public void m96508o() {
        this.f284356b = 0;
    }

    /* JADX INFO: renamed from: p */
    public void m96509p(zpt0 zpt0Var) {
        int i = zpt0Var.f285226b;
        int i2 = zpt0Var.f285227c;
        m96495b(i, i2);
        this.f284355a = i;
        this.f284356b = i2;
        ku31 ku31Var = (ku31) ((List) this.f284358d).get(i);
        this.f284359e = ku31Var;
        this.f284357c = ku31Var.f126444a.length();
    }

    /* JADX INFO: renamed from: q */
    public int m96510q() {
        int i = 0;
        while (true) {
            char cM96506m = m96506m();
            if (cM96506m != ' ') {
                switch (cM96506m) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i;
                }
            }
            i++;
            m96503j();
        }
    }

    public zmx0(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public zmx0(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f284358d = str;
        this.f284355a = i2;
        this.f284356b = i3;
        this.f284357c = Integer.MIN_VALUE;
        this.f284359e = "";
    }

    public zmx0(String str) {
        wj50.m88276m(!TextUtils.isEmpty(str));
        this.f284358d = str;
        this.f284355a = 1;
        this.f284357c = 0;
    }
}
