package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g15 implements Appendable {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f75524a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f75525b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f75526c;

    public /* synthetic */ g15() {
        this(16);
    }

    /* JADX INFO: renamed from: a */
    public final void m43325a(wl80 wl80Var, int i, int i2) {
        this.f75526c.add(new f15(i, i2, 8, wl80Var, null));
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        m43330f(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m43326b(xl80 xl80Var, int i, int i2) {
        this.f75526c.add(new f15(i, i2, 8, xl80Var, null));
    }

    /* JADX INFO: renamed from: c */
    public final void m43327c(int i, String str, int i2, String str2) {
        this.f75526c.add(new f15(i, i2, new cl51(str2), str));
    }

    /* JADX INFO: renamed from: d */
    public final void m43328d(ew31 ew31Var, int i, int i2) {
        this.f75526c.add(new f15(i, i2, 8, ew31Var, null));
    }

    /* JADX INFO: renamed from: e */
    public final void m43329e(int i, int i2, CharSequence charSequence) {
        boolean z = charSequence instanceof j15;
        StringBuilder sb = this.f75524a;
        if (!z) {
            sb.append(charSequence, i, i2);
            return;
        }
        j15 j15Var = (j15) charSequence;
        int length = sb.length();
        sb.append((CharSequence) j15Var.f107641b, i, i2);
        List listM55048a = k15.m55048a(j15Var, i, i2, null);
        if (listM55048a != null) {
            int size = listM55048a.size();
            for (int i3 = 0; i3 < size; i3++) {
                i15 i15Var = (i15) listM55048a.get(i3);
                this.f75526c.add(new f15(i15Var.f97389b + length, i15Var.f97390c + length, i15Var.f97388a, i15Var.f97391d));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m43330f(CharSequence charSequence) {
        if (charSequence instanceof j15) {
            m43332h((j15) charSequence);
        } else {
            this.f75524a.append(charSequence);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m43331g(String str) {
        this.f75524a.append(str);
    }

    /* JADX INFO: renamed from: h */
    public final void m43332h(j15 j15Var) {
        StringBuilder sb = this.f75524a;
        int length = sb.length();
        sb.append(j15Var.f107641b);
        List list = j15Var.f107640a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                i15 i15Var = (i15) list.get(i);
                this.f75526c.add(new f15(i15Var.f97389b + length, i15Var.f97390c + length, i15Var.f97388a, i15Var.f97391d));
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m43333i(gh00 gh00Var) {
        ArrayList arrayList = this.f75526c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i15 i15Var = (i15) gh00Var.invoke(((f15) arrayList.get(i)).m40521a(Integer.MIN_VALUE));
            arrayList.set(i, new f15(i15Var.f97389b, i15Var.f97390c, i15Var.f97388a, i15Var.f97391d));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m43334j() {
        ArrayList arrayList = this.f75525b;
        if (arrayList.isEmpty()) {
            nt40.m65599c("Nothing to pop.");
        }
        ((f15) arrayList.remove(arrayList.size() - 1)).f64789c = this.f75524a.length();
    }

    /* JADX INFO: renamed from: k */
    public final void m43335k(int i) {
        ArrayList arrayList = this.f75525b;
        if (i >= arrayList.size()) {
            nt40.m65599c(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            m43334j();
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m43336l(yl80 yl80Var) {
        f15 f15Var = new f15(this.f75524a.length(), 0, 12, yl80Var, null);
        ArrayList arrayList = this.f75525b;
        arrayList.add(f15Var);
        this.f75526c.add(f15Var);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: m */
    public final void m43337m(String str, String str2) {
        f15 f15Var = new f15(this.f75524a.length(), 0, 4, new cl51(str2), str);
        ArrayList arrayList = this.f75525b;
        arrayList.add(f15Var);
        this.f75526c.add(f15Var);
        arrayList.size();
    }

    /* JADX INFO: renamed from: n */
    public final int m43338n(ew31 ew31Var) {
        f15 f15Var = new f15(this.f75524a.length(), 0, 12, ew31Var, null);
        ArrayList arrayList = this.f75525b;
        arrayList.add(f15Var);
        this.f75526c.add(f15Var);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: o */
    public final j15 m43339o() {
        StringBuilder sb = this.f75524a;
        String string = sb.toString();
        ArrayList arrayList = this.f75526c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int iM62683h = 0; iM62683h < size; iM62683h = ms2.m62683h(sb, (f15) arrayList.get(iM62683h), arrayList2, iM62683h, 1)) {
        }
        return new j15(string, arrayList2);
    }

    public g15(int i) {
        this.f75524a = new StringBuilder(i);
        this.f75525b = new ArrayList();
        this.f75526c = new ArrayList();
        new ArrayList();
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        m43329e(i, i2, charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f75524a.append(c);
        return this;
    }

    public g15(String str) {
        this();
        m43331g(str);
    }

    public g15(j15 j15Var) {
        this();
        m43332h(j15Var);
    }
}
