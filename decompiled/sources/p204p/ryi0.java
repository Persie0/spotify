package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ryi0 extends jyi0 implements Iterable, pq60 {

    /* JADX INFO: renamed from: N0 */
    public static final /* synthetic */ int f203924N0 = 0;

    /* JADX INFO: renamed from: L0 */
    public String f203925L0;

    /* JADX INFO: renamed from: M0 */
    public String f203926M0;

    /* JADX INFO: renamed from: Y */
    public final mw31 f203927Y;

    /* JADX INFO: renamed from: Z */
    public int f203928Z;

    public ryi0(tyi0 tyi0Var) {
        super(tyi0Var);
        this.f203927Y = new mw31(0);
    }

    @Override // p204p.jyi0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ryi0) || !super.equals(obj)) {
            return false;
        }
        mw31 mw31Var = this.f203927Y;
        int iM62986h = mw31Var.m62986h();
        ryi0 ryi0Var = (ryi0) obj;
        mw31 mw31Var2 = ryi0Var.f203927Y;
        if (iM62986h != mw31Var2.m62986h() || this.f203928Z != ryi0Var.f203928Z) {
            return false;
        }
        for (jyi0 jyi0Var : (b6j) btz0.m30477A(new C2042k7(mw31Var, 4))) {
            if (!jyi0Var.equals(fag1.m41164m(mw31Var2, jyi0Var.f117421h))) {
                return false;
            }
        }
        return true;
    }

    @Override // p204p.jyi0
    /* JADX INFO: renamed from: f */
    public final hyi0 mo54794f(oge0 oge0Var) {
        return m76729r(oge0Var, false, this);
    }

    @Override // p204p.jyi0
    public final int hashCode() {
        int iM62984e = this.f203928Z;
        mw31 mw31Var = this.f203927Y;
        int iM62986h = mw31Var.m62986h();
        for (int i = 0; i < iM62986h; i++) {
            iM62984e = (((iM62984e * 31) + mw31Var.m62984e(i)) * 31) + ((jyi0) mw31Var.m62987i(i)).hashCode();
        }
        return iM62984e;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qyi0(this);
    }

    @Override // p204p.jyi0
    /* JADX INFO: renamed from: j */
    public final void mo54796j(Context context, AttributeSet attributeSet) {
        String strValueOf;
        super.mo54796j(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, w0u0.f246831d);
        m76731t(typedArrayObtainAttributes.getResourceId(0, 0));
        int i = this.f203928Z;
        if (i <= 16777215) {
            strValueOf = String.valueOf(i);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i);
            }
        }
        this.f203925L0 = strValueOf;
        typedArrayObtainAttributes.recycle();
    }

    /* JADX INFO: renamed from: o */
    public final void m76726o(jyi0 jyi0Var) {
        int i = jyi0Var.f117421h;
        String str = jyi0Var.f117422i;
        if (i == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = this.f117422i;
        if (str2 != null && wj50.m88271j(str, str2)) {
            throw new IllegalArgumentException(("Destination " + jyi0Var + " cannot have the same route as graph " + this).toString());
        }
        if (i == this.f117421h) {
            throw new IllegalArgumentException(("Destination " + jyi0Var + " cannot have the same id as graph " + this).toString());
        }
        mw31 mw31Var = this.f203927Y;
        mw31Var.getClass();
        jyi0 jyi0Var2 = (jyi0) fag1.m41164m(mw31Var, i);
        if (jyi0Var2 == jyi0Var) {
            return;
        }
        if (jyi0Var.f117415b != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (jyi0Var2 != null) {
            jyi0Var2.f117415b = null;
        }
        jyi0Var.f117415b = this;
        mw31Var.m62985g(jyi0Var.f117421h, jyi0Var);
    }

    /* JADX INFO: renamed from: p */
    public final jyi0 m76727p(String str, boolean z) {
        Object next;
        ryi0 ryi0Var;
        jyi0 jyi0Var;
        Iterator it = ((b6j) btz0.m30477A(new C2042k7(this.f203927Y, 4))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            jyi0Var = (jyi0) next;
            if (bm51.m29797h0(jyi0Var.f117422i, str, false)) {
                break;
            }
        } while (jyi0Var.m54795i(str) == null);
        jyi0 jyi0Var2 = (jyi0) next;
        if (jyi0Var2 != null) {
            return jyi0Var2;
        }
        if (!z || (ryi0Var = this.f117415b) == null || str == null || wl51.m88460J0(str)) {
            return null;
        }
        return ryi0Var.m76727p(str, true);
    }

    /* JADX INFO: renamed from: q */
    public final jyi0 m76728q(int i, ryi0 ryi0Var, boolean z) {
        mw31 mw31Var = this.f203927Y;
        mw31Var.getClass();
        jyi0 jyi0VarM76728q = (jyi0) fag1.m41164m(mw31Var, i);
        if (jyi0VarM76728q != null) {
            return jyi0VarM76728q;
        }
        if (z) {
            Iterator it = ((b6j) btz0.m30477A(new C2042k7(mw31Var, 4))).iterator();
            do {
                if (!it.hasNext()) {
                    jyi0VarM76728q = null;
                    break;
                }
                jyi0 jyi0Var = (jyi0) it.next();
                jyi0VarM76728q = (!(jyi0Var instanceof ryi0) || jyi0Var.equals(ryi0Var)) ? null : ((ryi0) jyi0Var).m76728q(i, this, true);
            } while (jyi0VarM76728q == null);
        }
        if (jyi0VarM76728q != null) {
            return jyi0VarM76728q;
        }
        ryi0 ryi0Var2 = this.f117415b;
        if (ryi0Var2 == null || ryi0Var2.equals(ryi0Var)) {
            return null;
        }
        ryi0 ryi0Var3 = this.f117415b;
        wj50.m88279p(ryi0Var3);
        return ryi0Var3.m76728q(i, this, z);
    }

    /* JADX INFO: renamed from: r */
    public final hyi0 m76729r(oge0 oge0Var, boolean z, ryi0 ryi0Var) {
        hyi0 hyi0VarM76729r;
        hyi0 hyi0VarMo54794f = super.mo54794f(oge0Var);
        ArrayList arrayList = new ArrayList();
        qyi0 qyi0Var = new qyi0(this);
        while (true) {
            hyi0VarM76729r = null;
            if (!qyi0Var.hasNext()) {
                break;
            }
            jyi0 jyi0Var = (jyi0) qyi0Var.next();
            hyi0VarM76729r = wj50.m88271j(jyi0Var, ryi0Var) ? null : jyi0Var.mo54794f(oge0Var);
            if (hyi0VarM76729r != null) {
                arrayList.add(hyi0VarM76729r);
            }
        }
        hyi0 hyi0Var = (hyi0) g6f.m43690D0(arrayList);
        ryi0 ryi0Var2 = this.f117415b;
        if (ryi0Var2 != null && z && !ryi0Var2.equals(ryi0Var)) {
            hyi0VarM76729r = ryi0Var2.m76729r(oge0Var, true, this);
        }
        return (hyi0) g6f.m43690D0(bk5.m29582E0(new hyi0[]{hyi0VarMo54794f, hyi0Var, hyi0VarM76729r}));
    }

    /* JADX INFO: renamed from: s */
    public final hyi0 m76730s(String str, boolean z, ryi0 ryi0Var) {
        hyi0 hyi0VarM76730s;
        hyi0 hyi0VarM54795i = m54795i(str);
        ArrayList arrayList = new ArrayList();
        qyi0 qyi0Var = new qyi0(this);
        while (true) {
            hyi0VarM76730s = null;
            if (!qyi0Var.hasNext()) {
                break;
            }
            jyi0 jyi0Var = (jyi0) qyi0Var.next();
            if (!wj50.m88271j(jyi0Var, ryi0Var)) {
                hyi0VarM76730s = jyi0Var instanceof ryi0 ? ((ryi0) jyi0Var).m76730s(str, false, this) : jyi0Var.m54795i(str);
            }
            if (hyi0VarM76730s != null) {
                arrayList.add(hyi0VarM76730s);
            }
        }
        hyi0 hyi0Var = (hyi0) g6f.m43690D0(arrayList);
        ryi0 ryi0Var2 = this.f117415b;
        if (ryi0Var2 != null && z && !ryi0Var2.equals(ryi0Var)) {
            hyi0VarM76730s = ryi0Var2.m76730s(str, true, this);
        }
        return (hyi0) g6f.m43690D0(bk5.m29582E0(new hyi0[]{hyi0VarM54795i, hyi0Var, hyi0VarM76730s}));
    }

    /* JADX INFO: renamed from: t */
    public final void m76731t(int i) {
        if (i != this.f117421h) {
            if (this.f203926M0 != null) {
                m76732u(null);
            }
            this.f203928Z = i;
            this.f203925L0 = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + this).toString());
    }

    @Override // p204p.jyi0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.f203926M0;
        jyi0 jyi0VarM76727p = (str == null || wl51.m88460J0(str)) ? null : m76727p(str, true);
        if (jyi0VarM76727p == null) {
            jyi0VarM76727p = m76728q(this.f203928Z, this, false);
        }
        sb.append(" startDestination=");
        if (jyi0VarM76727p == null) {
            String str2 = this.f203926M0;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.f203925L0;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f203928Z));
                }
            }
        } else {
            sb.append("{");
            sb.append(jyi0VarM76727p.toString());
            sb.append("}");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m76732u(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (str.equals(this.f117422i)) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (wl51.m88460J0(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.f203928Z = iHashCode;
        this.f203926M0 = str;
    }
}
