package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t571 implements Appendable {

    /* JADX INFO: renamed from: a */
    public final u571 f217232a;

    /* JADX INFO: renamed from: b */
    public final mir f217233b;

    /* JADX INFO: renamed from: c */
    public final z2n0 f217234c;

    /* JADX INFO: renamed from: d */
    public c97 f217235d;

    /* JADX INFO: renamed from: e */
    public long f217236e;

    /* JADX INFO: renamed from: f */
    public ic71 f217237f;

    /* JADX INFO: renamed from: g */
    public qqi0 f217238g;

    /* JADX INFO: renamed from: h */
    public pqm0 f217239h;

    public t571(u571 u571Var, c97 c97Var, u571 u571Var2, mir mirVar, int i) {
        qqi0 qqi0Var = null;
        c97Var = (i & 2) != 0 ? null : c97Var;
        u571Var2 = (i & 4) != 0 ? u571Var : u571Var2;
        mirVar = (i & 8) != 0 ? null : mirVar;
        this.f217232a = u571Var2;
        this.f217233b = mirVar;
        z2n0 z2n0Var = new z2n0();
        z2n0Var.f278616a = u571Var;
        z2n0Var.f278618c = -1;
        z2n0Var.f278619d = -1;
        this.f217234c = z2n0Var;
        this.f217235d = c97Var != null ? new c97(c97Var) : null;
        long j = u571Var.f226936d;
        List list = u571Var.f226933a;
        this.f217236e = j;
        this.f217237f = u571Var.f226937e;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            i15[] i15VarArr = new i15[size];
            for (int i2 = 0; i2 < size; i2++) {
                i15VarArr[i2] = (i15) list.get(i2);
            }
            qqi0Var = new qqi0(size, i15VarArr);
        }
        this.f217238g = qqi0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX INFO: renamed from: o */
    public static u571 m80091o(t571 t571Var, long j, ic71 ic71Var, int i) {
        List list;
        if ((i & 1) != 0) {
            j = t571Var.f217236e;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            ic71Var = t571Var.f217237f;
        }
        ic71 ic71Var2 = ic71Var;
        qqi0 qqi0Var = t571Var.f217238g;
        if (qqi0Var != null) {
            List listM73560f = qqi0Var.m73560f();
            if (((pqi0) listM73560f).isEmpty()) {
                list = null;
            } else {
                list = listM73560f;
            }
        } else {
            list = null;
        }
        return new u571(t571Var.f217234c.toString(), j2, ic71Var2, null, list, null, 8);
    }

    /* JADX INFO: renamed from: a */
    public final z2n0 m80092a() {
        return this.f217234c;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        z2n0 z2n0Var = this.f217234c;
        m80100i(z2n0Var.length(), z2n0Var.length(), 1);
        int length = z2n0Var.length();
        int length2 = z2n0Var.length();
        String strValueOf = String.valueOf(c);
        z2n0Var.m95227a(length, length2, strValueOf, 0, strValueOf.length());
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m80093b() {
        m80104m(null);
    }

    /* JADX INFO: renamed from: c */
    public final c97 m80094c() {
        c97 c97Var = this.f217235d;
        if (c97Var != null) {
            return c97Var;
        }
        c97 c97Var2 = new c97(null);
        this.f217235d = c97Var2;
        return c97Var2;
    }

    /* JADX INFO: renamed from: d */
    public final c97 m80095d() {
        return m80094c();
    }

    /* JADX INFO: renamed from: e */
    public final qqi0 m80096e() {
        return this.f217238g;
    }

    /* JADX INFO: renamed from: f */
    public final ic71 m80097f() {
        return this.f217237f;
    }

    /* JADX INFO: renamed from: g */
    public final pqm0 m80098g() {
        return this.f217239h;
    }

    /* JADX INFO: renamed from: h */
    public final long m80099h() {
        return this.f217236e;
    }

    /* JADX INFO: renamed from: i */
    public final void m80100i(int i, int i2, int i3) {
        int i4;
        c97 c97VarM80094c = m80094c();
        if (i != i2 || i3 != 0) {
            int iMin = Math.min(i, i2);
            int iMax = Math.max(i, i2);
            int i5 = i3 - (iMax - iMin);
            int i6 = 0;
            hmc hmcVar = null;
            boolean z = false;
            while (true) {
                qqi0 qqi0Var = (qqi0) c97VarM80094c.f35413b;
                if (i6 >= qqi0Var.f191610c) {
                    break;
                }
                hmc hmcVar2 = (hmc) qqi0Var.f191608a[i6];
                int i7 = hmcVar2.f92886a;
                if ((iMin > i7 || i7 > iMax) && ((iMin > (i4 = hmcVar2.f92887b) || i4 > iMax) && ((iMin > i4 || i7 > iMin) && (iMax > i4 || i7 > iMax)))) {
                    if (i7 > iMax && !z) {
                        c97VarM80094c.m31890m(hmcVar, iMin, iMax, i5);
                        z = true;
                    }
                    if (z) {
                        hmcVar2.f92886a += i5;
                        hmcVar2.f92887b += i5;
                    }
                    ((qqi0) c97VarM80094c.f35414c).m73556b(hmcVar2);
                } else if (hmcVar == null) {
                    hmcVar = hmcVar2;
                } else {
                    hmcVar.f92887b = hmcVar2.f92887b;
                    hmcVar.f92889d = hmcVar2.f92889d;
                }
                i6++;
            }
            if (!z) {
                c97VarM80094c.m31890m(hmcVar, iMin, iMax, i5);
            }
            qqi0 qqi0Var2 = (qqi0) c97VarM80094c.f35413b;
            c97VarM80094c.f35413b = (qqi0) c97VarM80094c.f35414c;
            c97VarM80094c.f35414c = qqi0Var2;
            qqi0Var2.m73561g();
        }
        mir mirVar = this.f217233b;
        if (mirVar != null) {
            mirVar.m61904h(i, i2, i3);
        }
        this.f217236e = osg1.m67730p(this.f217236e, i, i2, i3);
    }

    /* JADX INFO: renamed from: j */
    public final void m80101j(int i, int i2, CharSequence charSequence) {
        int length = charSequence.length();
        if (i > i2) {
            pt40.m70891a("Expected start=" + i + " <= end=" + i2);
        }
        if (length < 0) {
            pt40.m70891a("Expected textStart=0 <= textEnd=" + length);
        }
        z2n0 z2n0Var = this.f217234c;
        int iM63437n = n0e1.m63437n(i, 0, z2n0Var.length());
        int iM63437n2 = n0e1.m63437n(i2, 0, z2n0Var.length());
        int iM63437n3 = n0e1.m63437n(0, 0, charSequence.length());
        int iM63437n4 = n0e1.m63437n(length, 0, charSequence.length());
        m80100i(iM63437n, iM63437n2, iM63437n4 - iM63437n3);
        this.f217234c.m95227a(iM63437n, iM63437n2, charSequence, iM63437n3, iM63437n4);
        m80104m(null);
        this.f217239h = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m80102k() {
        int length = this.f217234c.length();
        u571 u571Var = this.f217232a;
        m80101j(0, length, u571Var.f226935c.toString());
        m80105n(u571Var.f226936d);
        m80094c().m31891n();
    }

    /* JADX INFO: renamed from: l */
    public final void m80103l(int i, int i2, List list) {
        z2n0 z2n0Var = this.f217234c;
        if (i < 0 || i > z2n0Var.length()) {
            StringBuilder sbM56838j = klh.m56838j(i, "start (", ") offset is outside of text region ");
            sbM56838j.append(z2n0Var.length());
            throw new IndexOutOfBoundsException(sbM56838j.toString());
        }
        if (i2 < 0 || i2 > z2n0Var.length()) {
            StringBuilder sbM56838j2 = klh.m56838j(i2, "end (", ") offset is outside of text region ");
            sbM56838j2.append(z2n0Var.length());
            throw new IndexOutOfBoundsException(sbM56838j2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(s571.m77247f(i, "Do not set reversed or empty range: ", i2, " > "));
        }
        m80104m(new ic71(dvg1.m37112n(i, i2)));
        qqi0 qqi0Var = this.f217238g;
        if (qqi0Var != null) {
            qqi0Var.m73561g();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.f217238g == null) {
            this.f217238g = new qqi0(0, new i15[16]);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            i15 i15Var = (i15) list.get(i3);
            qqi0 qqi0Var2 = this.f217238g;
            if (qqi0Var2 != null) {
                qqi0Var2.m73556b(i15.m49395a(i15Var, null, i15Var.f97389b + i, i15Var.f97390c + i, 9));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m80104m(ic71 ic71Var) {
        if (ic71Var != null && !ic71.m50236d(ic71Var.f100752a)) {
            this.f217237f = ic71Var;
            return;
        }
        this.f217237f = null;
        qqi0 qqi0Var = this.f217238g;
        if (qqi0Var != null) {
            qqi0Var.m73561g();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m80105n(long j) {
        long jM37112n = dvg1.m37112n(0, this.f217234c.length());
        if (!ic71.m50233a(jM37112n, j)) {
            pt40.m70891a("Expected " + ((Object) ic71.m50241i(j)) + " to be in " + ((Object) ic71.m50241i(jM37112n)));
        }
        this.f217236e = j;
        this.f217239h = null;
    }

    public final String toString() {
        return this.f217234c.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            z2n0 z2n0Var = this.f217234c;
            m80100i(z2n0Var.length(), z2n0Var.length(), charSequence.length());
            z2n0Var.m95227a(z2n0Var.length(), z2n0Var.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            z2n0 z2n0Var = this.f217234c;
            m80100i(z2n0Var.length(), z2n0Var.length(), i2 - i);
            int length = z2n0Var.length();
            int length2 = z2n0Var.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
            z2n0Var.m95227a(length, length2, charSequenceSubSequence, 0, charSequenceSubSequence.length());
        }
        return this;
    }
}
