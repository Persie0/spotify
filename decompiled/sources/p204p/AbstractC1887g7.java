package p204p;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: renamed from: p.g7 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC1887g7 implements vk60, fro, frh {

    /* JADX INFO: renamed from: a */
    public final ArrayList f77146a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public boolean f77147b;

    /* JADX INFO: renamed from: c */
    public final fk60 f77148c;

    /* JADX INFO: renamed from: d */
    public final String f77149d;

    /* JADX INFO: renamed from: e */
    public final qk60 f77150e;

    public AbstractC1887g7(String str, fk60 fk60Var) {
        this.f77148c = fk60Var;
        this.f77149d = str;
        this.f77150e = fk60Var.f70477a;
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: A */
    public final Object mo39210A(ktz0 ktz0Var, int i, rr60 rr60Var, Object obj) {
        this.f77146a.add(m43773E(ktz0Var, i));
        Object objMo42504Y = mo42504Y(rr60Var);
        if (!this.f77147b) {
            m43774I();
        }
        this.f77147b = false;
        return objMo42504Y;
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: B */
    public final Object mo39211B(ktz0 ktz0Var, int i, rr60 rr60Var, Object obj) {
        this.f77146a.add(m43773E(ktz0Var, i));
        Object objMo42504Y = (rr60Var.getDescriptor().mo57365b() || mo29812X()) ? mo42504Y(rr60Var) : null;
        if (!this.f77147b) {
            m43774I();
        }
        this.f77147b = false;
        return objMo42504Y;
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: C */
    public final short mo39212C() {
        return m43789x(m43774I());
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: D */
    public final double mo39213D(ktz0 ktz0Var, int i) {
        return m43783k(m43773E(ktz0Var, i));
    }

    /* JADX INFO: renamed from: E */
    public final String m43773E(ktz0 ktz0Var, int i) {
        String strMo29817z = mo29817z(ktz0Var, i);
        return strMo29817z;
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: F */
    public final float mo39214F() {
        return m43784l(m43774I());
    }

    /* JADX INFO: renamed from: G */
    public abstract yk60 mo29809G();

    @Override // p204p.fro
    /* JADX INFO: renamed from: H */
    public final double mo39215H() {
        return m43783k(m43774I());
    }

    /* JADX INFO: renamed from: I */
    public final Object m43774I() {
        ArrayList arrayList = this.f77146a;
        Object objRemove = arrayList.remove(h6f.m46714K(arrayList));
        this.f77147b = true;
        return objRemove;
    }

    /* JADX INFO: renamed from: J */
    public final String m43775J() {
        ArrayList arrayList = this.f77146a;
        return arrayList.isEmpty() ? "$" : g6f.m43753y0(arrayList, ".", "$.", null, null, 60);
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: K */
    public final boolean mo39216K() {
        return m43780h(m43774I());
    }

    /* JADX INFO: renamed from: L */
    public final String m43776L(String str) {
        return m43775J() + '.' + str;
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: M */
    public final boolean mo39217M(ktz0 ktz0Var, int i) {
        return m43780h(m43773E(ktz0Var, i));
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: N */
    public final char mo39218N() {
        return m43782j(m43774I());
    }

    /* JADX INFO: renamed from: O */
    public final void m43777O(sl60 sl60Var, String str, String str2) {
        throw new JsonDecodingException(fpg1.m42364t(-1, "Failed to parse literal '" + sl60Var + "' as " + (bm51.m29803n0(str, "i", false) ? "an " : "a ").concat(str) + " value", m43776L(str2), null, this.f77148c.f70477a.f189476m ? fpg1.m42367w(-1, m43779g().toString()).toString() : null));
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: Q */
    public final float mo39219Q(ktz0 ktz0Var, int i) {
        return m43784l(m43773E(ktz0Var, i));
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: T */
    public final int mo39221T(ktz0 ktz0Var) {
        String str = (String) m43774I();
        yk60 yk60VarMo29815e = mo29815e(str);
        String strMo33226i = ktz0Var.mo33226i();
        boolean z = yk60VarMo29815e instanceof sl60;
        fk60 fk60Var = this.f77148c;
        if (z) {
            return q191.m71915y(ktz0Var, fk60Var, ((sl60) yk60VarMo29815e).mo47869a(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        jqv0 jqv0Var = qpv0.f191387a;
        sb.append(jqv0Var.mo54112b(sl60.class).mo29111F());
        sb.append(", but had ");
        sb.append(jqv0Var.mo54112b(yk60VarMo29815e.getClass()).mo29111F());
        throw new JsonDecodingException(fpg1.m42364t(-1, dq60.m36616p(" as the serialized body of ", strMo33226i, sb), m43776L(str), null, fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarMo29815e.toString()).toString() : null));
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: V */
    public final String mo39222V() {
        return m43790y(m43774I());
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: X */
    public boolean mo29812X() {
        return !(m43779g() instanceof kl60);
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: Y */
    public final Object mo42504Y(rr60 rr60Var) {
        if (!(rr60Var instanceof AbstractC2641z8)) {
            return rr60Var.deserialize(this);
        }
        fk60 fk60Var = this.f77148c;
        qk60 qk60Var = fk60Var.f70477a;
        AbstractC2641z8 abstractC2641z8 = (AbstractC2641z8) rr60Var;
        String strM97051n = zuj0.m97051n(fk60Var, abstractC2641z8.getDescriptor());
        yk60 yk60VarM43779g = m43779g();
        String strMo33226i = abstractC2641z8.getDescriptor().mo33226i();
        if (!(yk60VarM43779g instanceof nl60)) {
            StringBuilder sb = new StringBuilder("Expected ");
            jqv0 jqv0Var = qpv0.f191387a;
            sb.append(jqv0Var.mo54112b(nl60.class).mo29111F());
            sb.append(", but had ");
            sb.append(jqv0Var.mo54112b(yk60VarM43779g.getClass()).mo29111F());
            throw new JsonDecodingException(fpg1.m42364t(-1, dq60.m36616p(" as the serialized body of ", strMo33226i, sb), m43775J(), null, fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarM43779g.toString()).toString() : null));
        }
        nl60 nl60Var = (nl60) yk60VarM43779g;
        yk60 yk60Var = (yk60) nl60Var.get(strM97051n);
        try {
            return ex60.m40164A(fk60Var, strM97051n, nl60Var, jhl0.m53420n((AbstractC2641z8) rr60Var, this, yk60Var != null ? zk60.m96304f(zk60.m96309k(yk60Var)) : null));
        } catch (SerializationException e) {
            String message = e.getMessage();
            wj50.m88279p(message);
            throw new JsonDecodingException(fpg1.m42364t(-1, message, null, null, fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, nl60Var.toString()).toString() : null));
        }
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: b */
    public frh mo29814b(ktz0 ktz0Var) {
        yk60 yk60VarM43779g = m43779g();
        k0e1 kind = ktz0Var.getKind();
        boolean zM88271j = wj50.m88271j(kind, in51.f103871A0);
        fk60 fk60Var = this.f77148c;
        if (zM88271j || (kind instanceof v8q0)) {
            String strMo33226i = ktz0Var.mo33226i();
            if (yk60VarM43779g instanceof jk60) {
                return new cm60(fk60Var, (jk60) yk60VarM43779g);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            jqv0 jqv0Var = qpv0.f191387a;
            sb.append(jqv0Var.mo54112b(jk60.class).mo29111F());
            sb.append(", but had ");
            sb.append(jqv0Var.mo54112b(yk60VarM43779g.getClass()).mo29111F());
            throw new JsonDecodingException(fpg1.m42364t(-1, dq60.m36616p(" as the serialized body of ", strMo33226i, sb), m43775J(), null, fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarM43779g.toString()).toString() : null));
        }
        if (!wj50.m88271j(kind, jn51.f114021z0)) {
            String strMo33226i2 = ktz0Var.mo33226i();
            if (yk60VarM43779g instanceof nl60) {
                return new bm60(fk60Var, (nl60) yk60VarM43779g, this.f77149d, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            jqv0 jqv0Var2 = qpv0.f191387a;
            sb2.append(jqv0Var2.mo54112b(nl60.class).mo29111F());
            sb2.append(", but had ");
            sb2.append(jqv0Var2.mo54112b(yk60VarM43779g.getClass()).mo29111F());
            throw new JsonDecodingException(fpg1.m42364t(-1, dq60.m36616p(" as the serialized body of ", strMo33226i2, sb2), m43775J(), null, fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarM43779g.toString()).toString() : null));
        }
        ktz0 ktz0VarM85621c = vie1.m85621c(fk60Var.f70478b, ktz0Var.mo33225h(0));
        k0e1 kind2 = ktz0VarM85621c.getKind();
        if ((kind2 instanceof aer0) || wj50.m88271j(kind2, otz0.f170119z0)) {
            String strMo33226i3 = ktz0Var.mo33226i();
            if (yk60VarM43779g instanceof nl60) {
                return new dm60(fk60Var, (nl60) yk60VarM43779g);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            jqv0 jqv0Var3 = qpv0.f191387a;
            sb3.append(jqv0Var3.mo54112b(nl60.class).mo29111F());
            sb3.append(", but had ");
            sb3.append(jqv0Var3.mo54112b(yk60VarM43779g.getClass()).mo29111F());
            throw new JsonDecodingException(fpg1.m42364t(-1, dq60.m36616p(" as the serialized body of ", strMo33226i3, sb3), m43775J(), null, fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarM43779g.toString()).toString() : null));
        }
        if (!fk60Var.f70477a.f189467d) {
            throw fpg1.m42349e(ktz0VarM85621c);
        }
        String strMo33226i4 = ktz0Var.mo33226i();
        if (yk60VarM43779g instanceof jk60) {
            return new cm60(fk60Var, (jk60) yk60VarM43779g);
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        jqv0 jqv0Var4 = qpv0.f191387a;
        sb4.append(jqv0Var4.mo54112b(jk60.class).mo29111F());
        sb4.append(", but had ");
        sb4.append(jqv0Var4.mo54112b(yk60VarM43779g.getClass()).mo29111F());
        throw new JsonDecodingException(fpg1.m42364t(-1, dq60.m36616p(" as the serialized body of ", strMo33226i4, sb4), m43775J(), null, fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarM43779g.toString()).toString() : null));
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: b0 */
    public final short mo39223b0(wdr0 wdr0Var, int i) {
        return m43789x(m43773E(wdr0Var, i));
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: c */
    public final i82 mo42496c() {
        return this.f77148c.f70478b;
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: c0 */
    public final byte mo39224c0() {
        return m43781i(m43774I());
    }

    @Override // p204p.vk60
    /* JADX INFO: renamed from: d */
    public final fk60 mo43778d() {
        return this.f77148c;
    }

    /* JADX INFO: renamed from: e */
    public abstract yk60 mo29815e(String str);

    @Override // p204p.frh
    /* JADX INFO: renamed from: e0 */
    public final char mo39225e0(wdr0 wdr0Var, int i) {
        return m43782j(m43773E(wdr0Var, i));
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: f */
    public final String mo39226f(ktz0 ktz0Var, int i) {
        return m43790y(m43773E(ktz0Var, i));
    }

    /* JADX INFO: renamed from: g */
    public final yk60 m43779g() {
        yk60 yk60VarMo29815e;
        String str = (String) g6f.m43689C0(this.f77146a);
        return (str == null || (yk60VarMo29815e = mo29815e(str)) == null) ? mo29809G() : yk60VarMo29815e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m43780h(Object obj) {
        Boolean bool;
        String str = (String) obj;
        yk60 yk60VarMo29815e = mo29815e(str);
        if (!(yk60VarMo29815e instanceof sl60)) {
            StringBuilder sb = new StringBuilder("Expected ");
            jqv0 jqv0Var = qpv0.f191387a;
            sb.append(jqv0Var.mo54112b(sl60.class).mo29111F());
            sb.append(", but had ");
            sb.append(jqv0Var.mo54112b(yk60VarMo29815e.getClass()).mo29111F());
            sb.append(" as the serialized body of boolean");
            throw new JsonDecodingException(fpg1.m42364t(-1, sb.toString(), m43776L(str), null, this.f77148c.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarMo29815e.toString()).toString() : null));
        }
        sl60 sl60Var = (sl60) yk60VarMo29815e;
        try {
            it40 it40Var = zk60.f283668a;
            String strMo47869a = sl60Var.mo47869a();
            String[] strArr = nl51.f155008a;
            if (strMo47869a.equalsIgnoreCase("true")) {
                bool = Boolean.TRUE;
            } else {
                bool = strMo47869a.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            m43777O(sl60Var, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m43777O(sl60Var, "boolean", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final byte m43781i(Object obj) {
        String str = (String) obj;
        yk60 yk60VarMo29815e = mo29815e(str);
        if (!(yk60VarMo29815e instanceof sl60)) {
            StringBuilder sb = new StringBuilder("Expected ");
            jqv0 jqv0Var = qpv0.f191387a;
            sb.append(jqv0Var.mo54112b(sl60.class).mo29111F());
            sb.append(", but had ");
            sb.append(jqv0Var.mo54112b(yk60VarMo29815e.getClass()).mo29111F());
            sb.append(" as the serialized body of byte");
            throw new JsonDecodingException(fpg1.m42364t(-1, sb.toString(), m43776L(str), null, this.f77148c.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarMo29815e.toString()).toString() : null));
        }
        sl60 sl60Var = (sl60) yk60VarMo29815e;
        try {
            long jM96310l = zk60.m96310l(sl60Var);
            Byte bValueOf = (-128 > jM96310l || jM96310l > 127) ? null : Byte.valueOf((byte) jM96310l);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            m43777O(sl60Var, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m43777O(sl60Var, "byte", str);
            throw null;
        }
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: i0 */
    public final long mo39227i0(ktz0 ktz0Var, int i) {
        return m43788v(m43773E(ktz0Var, i));
    }

    /* JADX INFO: renamed from: j */
    public final char m43782j(Object obj) {
        String str = (String) obj;
        yk60 yk60VarMo29815e = mo29815e(str);
        if (!(yk60VarMo29815e instanceof sl60)) {
            StringBuilder sb = new StringBuilder("Expected ");
            jqv0 jqv0Var = qpv0.f191387a;
            sb.append(jqv0Var.mo54112b(sl60.class).mo29111F());
            sb.append(", but had ");
            sb.append(jqv0Var.mo54112b(yk60VarMo29815e.getClass()).mo29111F());
            sb.append(" as the serialized body of char");
            throw new JsonDecodingException(fpg1.m42364t(-1, sb.toString(), m43776L(str), null, this.f77148c.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarMo29815e.toString()).toString() : null));
        }
        sl60 sl60Var = (sl60) yk60VarMo29815e;
        try {
            String strMo47869a = sl60Var.mo47869a();
            int length = strMo47869a.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strMo47869a.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            m43777O(sl60Var, "char", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final double m43783k(Object obj) {
        String str = (String) obj;
        yk60 yk60VarMo29815e = mo29815e(str);
        boolean z = yk60VarMo29815e instanceof sl60;
        fk60 fk60Var = this.f77148c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            jqv0 jqv0Var = qpv0.f191387a;
            sb.append(jqv0Var.mo54112b(sl60.class).mo29111F());
            sb.append(", but had ");
            sb.append(jqv0Var.mo54112b(yk60VarMo29815e.getClass()).mo29111F());
            sb.append(" as the serialized body of double");
            throw new JsonDecodingException(fpg1.m42364t(-1, sb.toString(), m43776L(str), null, fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarMo29815e.toString()).toString() : null));
        }
        sl60 sl60Var = (sl60) yk60VarMo29815e;
        try {
            double dM96305g = zk60.m96305g(sl60Var);
            if (fk60Var.f70477a.f189473j || Math.abs(dM96305g) <= Double.MAX_VALUE) {
                return dM96305g;
            }
            throw new JsonDecodingException(fpg1.m42364t(-1, fpg1.m42369y(str, Double.valueOf(dM96305g)), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, m43779g().toString()).toString() : null));
        } catch (IllegalArgumentException unused) {
            m43777O(sl60Var, "double", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final float m43784l(Object obj) {
        String str = (String) obj;
        yk60 yk60VarMo29815e = mo29815e(str);
        boolean z = yk60VarMo29815e instanceof sl60;
        fk60 fk60Var = this.f77148c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            jqv0 jqv0Var = qpv0.f191387a;
            sb.append(jqv0Var.mo54112b(sl60.class).mo29111F());
            sb.append(", but had ");
            sb.append(jqv0Var.mo54112b(yk60VarMo29815e.getClass()).mo29111F());
            sb.append(" as the serialized body of float");
            throw new JsonDecodingException(fpg1.m42364t(-1, sb.toString(), m43776L(str), null, fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarMo29815e.toString()).toString() : null));
        }
        sl60 sl60Var = (sl60) yk60VarMo29815e;
        try {
            it40 it40Var = zk60.f283668a;
            float f = Float.parseFloat(sl60Var.mo47869a());
            if (fk60Var.f70477a.f189473j || Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            throw new JsonDecodingException(fpg1.m42364t(-1, fpg1.m42369y(str, Float.valueOf(f)), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, m43779g().toString()).toString() : null));
        } catch (IllegalArgumentException unused) {
            m43777O(sl60Var, "float", str);
            throw null;
        }
    }

    @Override // p204p.vk60
    /* JADX INFO: renamed from: m */
    public final yk60 mo43785m() {
        return m43779g();
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: n */
    public final int mo39228n() {
        return m43787s(m43774I());
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: o */
    public final int mo39229o(ktz0 ktz0Var, int i) {
        return m43787s(m43773E(ktz0Var, i));
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: q */
    public final byte mo39230q(wdr0 wdr0Var, int i) {
        return m43781i(m43773E(wdr0Var, i));
    }

    /* JADX INFO: renamed from: r */
    public final fro m43786r(Object obj, ktz0 ktz0Var) {
        String str = (String) obj;
        if (!jk51.m53584b(ktz0Var)) {
            this.f77146a.add(str);
            return this;
        }
        yk60 yk60VarMo29815e = mo29815e(str);
        String strMo33226i = ktz0Var.mo33226i();
        boolean z = yk60VarMo29815e instanceof sl60;
        fk60 fk60Var = this.f77148c;
        if (z) {
            return new wk60(vbg1.m85145k(((sl60) yk60VarMo29815e).mo47869a(), fk60Var), fk60Var);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        jqv0 jqv0Var = qpv0.f191387a;
        sb.append(jqv0Var.mo54112b(sl60.class).mo29111F());
        sb.append(", but had ");
        sb.append(jqv0Var.mo54112b(yk60VarMo29815e.getClass()).mo29111F());
        throw new JsonDecodingException(fpg1.m42364t(-1, dq60.m36616p(" as the serialized body of ", strMo33226i, sb), m43776L(str), null, fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarMo29815e.toString()).toString() : null));
    }

    /* JADX INFO: renamed from: s */
    public final int m43787s(Object obj) {
        String str = (String) obj;
        yk60 yk60VarMo29815e = mo29815e(str);
        if (!(yk60VarMo29815e instanceof sl60)) {
            StringBuilder sb = new StringBuilder("Expected ");
            jqv0 jqv0Var = qpv0.f191387a;
            sb.append(jqv0Var.mo54112b(sl60.class).mo29111F());
            sb.append(", but had ");
            sb.append(jqv0Var.mo54112b(yk60VarMo29815e.getClass()).mo29111F());
            sb.append(" as the serialized body of int");
            throw new JsonDecodingException(fpg1.m42364t(-1, sb.toString(), m43776L(str), null, this.f77148c.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarMo29815e.toString()).toString() : null));
        }
        sl60 sl60Var = (sl60) yk60VarMo29815e;
        try {
            long jM96310l = zk60.m96310l(sl60Var);
            Integer numValueOf = (-2147483648L > jM96310l || jM96310l > 2147483647L) ? null : Integer.valueOf((int) jM96310l);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            m43777O(sl60Var, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m43777O(sl60Var, "int", str);
            throw null;
        }
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: t */
    public final fro mo39231t(wdr0 wdr0Var, int i) {
        return m43786r(m43773E(wdr0Var, i), wdr0Var.mo33225h(i));
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: u */
    public final long mo39232u() {
        return m43788v(m43774I());
    }

    /* JADX INFO: renamed from: v */
    public final long m43788v(Object obj) {
        String str = (String) obj;
        yk60 yk60VarMo29815e = mo29815e(str);
        if (yk60VarMo29815e instanceof sl60) {
            sl60 sl60Var = (sl60) yk60VarMo29815e;
            try {
                return zk60.m96310l(sl60Var);
            } catch (IllegalArgumentException unused) {
                m43777O(sl60Var, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        jqv0 jqv0Var = qpv0.f191387a;
        sb.append(jqv0Var.mo54112b(sl60.class).mo29111F());
        sb.append(", but had ");
        sb.append(jqv0Var.mo54112b(yk60VarMo29815e.getClass()).mo29111F());
        sb.append(" as the serialized body of long");
        throw new JsonDecodingException(fpg1.m42364t(-1, sb.toString(), m43776L(str), null, this.f77148c.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarMo29815e.toString()).toString() : null));
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: w */
    public final fro mo39233w(ktz0 ktz0Var) {
        if (g6f.m43689C0(this.f77146a) != null) {
            return m43786r(m43774I(), ktz0Var);
        }
        return new tl60(this.f77148c, mo29809G(), this.f77149d).mo39233w(ktz0Var);
    }

    /* JADX INFO: renamed from: x */
    public final short m43789x(Object obj) {
        String str = (String) obj;
        yk60 yk60VarMo29815e = mo29815e(str);
        if (!(yk60VarMo29815e instanceof sl60)) {
            StringBuilder sb = new StringBuilder("Expected ");
            jqv0 jqv0Var = qpv0.f191387a;
            sb.append(jqv0Var.mo54112b(sl60.class).mo29111F());
            sb.append(", but had ");
            sb.append(jqv0Var.mo54112b(yk60VarMo29815e.getClass()).mo29111F());
            sb.append(" as the serialized body of short");
            throw new JsonDecodingException(fpg1.m42364t(-1, sb.toString(), m43776L(str), null, this.f77148c.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarMo29815e.toString()).toString() : null));
        }
        sl60 sl60Var = (sl60) yk60VarMo29815e;
        try {
            long jM96310l = zk60.m96310l(sl60Var);
            Short shValueOf = (-32768 > jM96310l || jM96310l > 32767) ? null : Short.valueOf((short) jM96310l);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            m43777O(sl60Var, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m43777O(sl60Var, "short", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: y */
    public final String m43790y(Object obj) {
        String str = (String) obj;
        yk60 yk60VarMo29815e = mo29815e(str);
        boolean z = yk60VarMo29815e instanceof sl60;
        fk60 fk60Var = this.f77148c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            jqv0 jqv0Var = qpv0.f191387a;
            sb.append(jqv0Var.mo54112b(sl60.class).mo29111F());
            sb.append(", but had ");
            sb.append(jqv0Var.mo54112b(yk60VarMo29815e.getClass()).mo29111F());
            sb.append(" as the serialized body of string");
            throw new JsonDecodingException(fpg1.m42364t(-1, sb.toString(), m43776L(str), null, fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarMo29815e.toString()).toString() : null));
        }
        sl60 sl60Var = (sl60) yk60VarMo29815e;
        if (!(sl60Var instanceof hl60)) {
            throw new JsonDecodingException(fpg1.m42364t(-1, s571.m77251j("Expected string value for a non-null key '", str, "', got null literal instead"), m43776L(str), "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, m43779g().toString()).toString() : null));
        }
        hl60 hl60Var = (hl60) sl60Var;
        if (hl60Var.f92623a || fk60Var.f70477a.f189466c) {
            return hl60Var.f92625c;
        }
        throw new JsonDecodingException(fpg1.m42364t(-1, s571.m77251j("String literal for value of key '", str, "' should be quoted"), m43776L(str), "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, m43779g().toString()).toString() : null));
    }

    /* JADX INFO: renamed from: z */
    public String mo29817z(ktz0 ktz0Var, int i) {
        return ktz0Var.mo33223f(i);
    }

    /* JADX INFO: renamed from: a */
    public void mo29813a(ktz0 ktz0Var) {
    }
}
