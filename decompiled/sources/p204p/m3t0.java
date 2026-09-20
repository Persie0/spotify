package p204p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.protobuf.internal.ProtobufDecodingException;

/* JADX INFO: loaded from: classes2.dex */
public class m3t0 extends ptc implements fro, frh {

    /* JADX INFO: renamed from: c */
    public final y1t0 f139752c;

    /* JADX INFO: renamed from: d */
    public final o3t0 f139753d;

    /* JADX INFO: renamed from: e */
    public final ktz0 f139754e;

    /* JADX INFO: renamed from: f */
    public final int[] f139755f;

    /* JADX INFO: renamed from: g */
    public HashMap f139756g;

    /* JADX INFO: renamed from: h */
    public HashMap f139757h;

    /* JADX INFO: renamed from: i */
    public boolean f139758i;

    /* JADX INFO: renamed from: t */
    public final dwt f139759t;

    public m3t0(y1t0 y1t0Var, o3t0 o3t0Var, ktz0 ktz0Var) {
        super(2, false);
        this.f139752c = y1t0Var;
        this.f139753d = o3t0Var;
        this.f139754e = ktz0Var;
        this.f139759t = new dwt(ktz0Var, new a1m0(this));
        int iMo33222e = ktz0Var.mo33222e();
        if (iMo33222e >= 32) {
            m60741g1(ktz0Var, iMo33222e);
            return;
        }
        int i = iMo33222e + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        for (int i3 = 0; i3 < iMo33222e; i3++) {
            int iM68797j = p1h1.m68797j(ktz0Var, i3, false);
            if (iM68797j > iMo33222e || iM68797j == -2) {
                m60741g1(ktz0Var, iMo33222e);
                return;
            }
            iArr[iM68797j] = i3;
        }
        this.f139755f = iArr;
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: A */
    public final Object mo39210A(ktz0 ktz0Var, int i, rr60 rr60Var, Object obj) {
        m70922A0(mo45307f1(ktz0Var, i));
        return m60733W0(rr60Var, obj);
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: B */
    public final Object mo39211B(ktz0 ktz0Var, int i, rr60 rr60Var, Object obj) {
        m70922A0(mo45307f1(ktz0Var, i));
        if (this.f139758i) {
            return null;
        }
        return m60733W0(rr60Var, obj);
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: C */
    public final short mo39212C() {
        return (short) m60737a1(m70929y0());
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: D */
    public final double mo39213D(ktz0 ktz0Var, int i) {
        return m60735Y0(mo45307f1(ktz0Var, i));
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: F */
    public final float mo39214F() {
        return m60736Z0(m70929y0());
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: H */
    public final double mo39215H() {
        return m60735Y0(m70929y0());
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: K */
    public final boolean mo39216K() {
        return m60734X0(m70929y0());
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: M */
    public final boolean mo39217M(ktz0 ktz0Var, int i) {
        return m60734X0(mo45307f1(ktz0Var, i));
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: N */
    public final char mo39218N() {
        return (char) m60737a1(m70929y0());
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: Q */
    public final float mo39219Q(ktz0 ktz0Var, int i) {
        return m60736Z0(mo45307f1(ktz0Var, i));
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: T */
    public final int mo39221T(ktz0 ktz0Var) {
        int iM60737a1 = m60737a1(m70929y0());
        if (iM60737a1 < ktz0Var.mo33222e() && iM60737a1 >= 0 && p1h1.m68797j(ktz0Var, iM60737a1, true) == iM60737a1) {
            return iM60737a1;
        }
        int iMo33222e = ktz0Var.mo33222e();
        for (int i = 0; i < iMo33222e; i++) {
            if (p1h1.m68797j(ktz0Var, i, true) == iM60737a1) {
                return i;
            }
        }
        throw new ProtobufDecodingException(iM60737a1 + " is not among valid " + this.f139754e.mo33226i() + " enum proto numbers", null);
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: V */
    public final String mo39222V() {
        return mo45306c1(m70929y0());
    }

    /* JADX INFO: renamed from: W0 */
    public final Object m60733W0(rr60 rr60Var, Object obj) {
        String string;
        jn51 jn51Var = jn51.f114021z0;
        try {
            if (rr60Var instanceof whc0) {
                return m60740e1(rr60Var, obj);
            }
            if (wj50.m88271j(rr60Var.getDescriptor(), kua.f126493c.f260527b)) {
                return m60739d1((byte[]) obj);
            }
            if (!wj50.m88271j(rr60Var.getDescriptor(), xq91.f264927c.f260527b)) {
                return rr60Var instanceof AbstractC2327r6 ? ((AbstractC2327r6) rr60Var).m74832e(this, obj) : rr60Var.deserialize(this);
            }
            vq91 vq91Var = (vq91) obj;
            byte[] bArrM86204b = vq91Var != null ? vq91Var.m86204b() : null;
            return vq91.m86203a(m60739d1(bArrM86204b != null ? bArrM86204b : null));
        } catch (ProtobufDecodingException e) {
            long jM70926m0 = m70926m0();
            ktz0 descriptor = rr60Var.getDescriptor();
            ktz0 ktz0Var = this.f139754e;
            if (wj50.m88271j(ktz0Var, descriptor)) {
                string = "Error while decoding " + ktz0Var.mo33226i();
            } else if (wj50.m88271j(ktz0Var.getKind(), in51.f103871A0) && !wj50.m88271j(rr60Var.getDescriptor().getKind(), jn51Var)) {
                StringBuilder sb = new StringBuilder("Error while decoding index ");
                sb.append(((int) (jM70926m0 & 2147483647L)) - 1);
                sb.append(" in repeated field of ");
                sb.append(rr60Var.getDescriptor().mo33226i());
                string = sb.toString();
            } else if (wj50.m88271j(ktz0Var.getKind(), jn51Var)) {
                int i = ((int) (jM70926m0 & 2147483647L)) - 1;
                StringBuilder sbM38571t = edb.m38571t(i / 2, "Error while decoding ", i % 2 == 0 ? "key" : "value", " of index ", " in map field of ");
                sbM38571t.append(rr60Var.getDescriptor().mo33226i());
                string = sbM38571t.toString();
            } else {
                string = "Error while decoding " + rr60Var.getDescriptor().mo33226i() + " at proto number " + ((int) (jM70926m0 & 2147483647L)) + " of " + ktz0Var.mo33226i();
            }
            throw new ProtobufDecodingException(string, e);
        }
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: X */
    public final boolean mo29812X() {
        return !this.f139758i;
    }

    /* JADX INFO: renamed from: X0 */
    public final boolean m60734X0(long j) {
        int iM60737a1 = m60737a1(j);
        if (iM60737a1 == 0) {
            return false;
        }
        if (iM60737a1 == 1) {
            return true;
        }
        throw new SerializationException(s571.m77246e(iM60737a1, "Unexpected boolean value: "));
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: Y */
    public final Object mo42504Y(rr60 rr60Var) {
        return m60733W0(rr60Var, null);
    }

    /* JADX INFO: renamed from: Y0 */
    public final double m60735Y0(long j) {
        o3t0 o3t0Var = this.f139753d;
        try {
            return j == 19500 ? o3t0Var.m66203k() : o3t0Var.m66202j();
        } catch (ProtobufDecodingException e) {
            throw new ProtobufDecodingException("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f139754e.mo33226i(), e);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final float m60736Z0(long j) {
        o3t0 o3t0Var = this.f139753d;
        try {
            return j == 19500 ? o3t0Var.m66205m() : o3t0Var.m66204l();
        } catch (ProtobufDecodingException e) {
            throw new ProtobufDecodingException("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f139754e.mo33226i(), e);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final int m60737a1(long j) {
        o3t0 o3t0Var = this.f139753d;
        try {
            return j == 19500 ? o3t0Var.m66207o() : o3t0Var.m66206n(p1h1.m68800m(j));
        } catch (ProtobufDecodingException e) {
            throw new ProtobufDecodingException("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f139754e.mo33226i(), e);
        }
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0071: MOVE (r14 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:114), block:B:32:0x0071 */
    /* JADX INFO: renamed from: b */
    public frh mo29814b(ktz0 ktz0Var) {
        ktz0 ktz0Var2;
        Integer num;
        ktz0 ktz0Var3 = this.f139754e;
        try {
            k0e1 kind = ktz0Var.getKind();
            in51 in51Var = in51.f103871A0;
            boolean zM88271j = wj50.m88271j(kind, in51Var);
            y1t0 y1t0Var = this.f139752c;
            o3t0 o3t0Var = this.f139753d;
            try {
                try {
                    if (zM88271j) {
                        long jM70926m0 = m70926m0();
                        if (!wj50.m88271j(ktz0Var3.getKind(), in51Var) || jM70926m0 == 19500 || ktz0Var3.equals(ktz0Var)) {
                            return (o3t0Var.f161440c == z2t0.SIZE_DELIMITED && p1h1.m68803p(ktz0Var.mo33225h(0))) ? new x3m0(y1t0Var, new o3t0(o3t0Var.m66197e()), ktz0Var) : new imw0(y1t0Var, o3t0Var, jM70926m0, ktz0Var);
                        }
                        o3t0 o3t0VarM85651f = vig1.m85651f(o3t0Var, jM70926m0);
                        o3t0VarM85651f.m66214v();
                        return new imw0(y1t0Var, o3t0VarM85651f, 1, ktz0Var);
                    }
                    if (!wj50.m88271j(kind, in51.f103873z0) && !wj50.m88271j(kind, in51.f103872B0) && !(kind instanceof v8q0)) {
                        if (wj50.m88271j(kind, jn51.f114021z0)) {
                            return new xgc0(y1t0Var, vig1.m85652g(o3t0Var, m70926m0()), m70926m0(), ktz0Var);
                        }
                        throw new SerializationException("Primitives are not supported at top-level");
                    }
                    long jM70926m1 = m70926m0();
                    if (jM70926m1 == 19500 && wj50.m88271j(ktz0Var3, ktz0Var)) {
                        return this;
                    }
                    if (!p1h1.m68802o(jM70926m1)) {
                        return new m3t0(y1t0Var, vig1.m85651f(o3t0Var, jM70926m1), ktz0Var);
                    }
                    int i = ((int) (jM70926m1 & 2147483647L)) - 1;
                    HashMap map = this.f139757h;
                    if (map != null && (num = (Integer) map.get(Integer.valueOf(i))) != null) {
                        jM70926m1 = p1h1.m68807t(num.intValue(), jM70926m1);
                    }
                    return new gnl0(y1t0Var, o3t0Var, jM70926m1, ktz0Var);
                } catch (ProtobufDecodingException e) {
                    e = e;
                    throw new ProtobufDecodingException("Fail to begin structure for " + ktz0Var2.mo33226i() + " in " + ktz0Var3.mo33226i() + " at proto number " + ((int) (m70926m0() & 2147483647L)), e);
                }
            } catch (ProtobufDecodingException e2) {
                e = e2;
                throw new ProtobufDecodingException("Fail to begin structure for " + ktz0Var2.mo33226i() + " in " + ktz0Var3.mo33226i() + " at proto number " + ((int) (m70926m0() & 2147483647L)), e);
            }
        } catch (ProtobufDecodingException e3) {
            e = e3;
            ktz0Var2 = ktz0Var;
        }
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: b0 */
    public final short mo39223b0(wdr0 wdr0Var, int i) {
        return (short) m60737a1(mo45307f1(wdr0Var, i));
    }

    /* JADX INFO: renamed from: b1 */
    public final long m60738b1(long j) {
        o3t0 o3t0Var = this.f139753d;
        try {
            return j == 19500 ? o3t0Var.m66211s() : o3t0Var.m66209q(p1h1.m68800m(j));
        } catch (ProtobufDecodingException e) {
            throw new ProtobufDecodingException("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f139754e.mo33226i(), e);
        }
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: c */
    public final i82 mo42496c() {
        return this.f139752c.f268405a;
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: c0 */
    public final byte mo39224c0() {
        return (byte) m60737a1(m70929y0());
    }

    /* JADX INFO: renamed from: c1 */
    public String mo45306c1(long j) {
        o3t0 o3t0Var = this.f139753d;
        try {
            return j == 19500 ? o3t0Var.m66213u() : o3t0Var.m66212t();
        } catch (ProtobufDecodingException e) {
            throw new ProtobufDecodingException("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f139754e.mo33226i(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [long] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v9, types: [byte[]] */
    /* JADX INFO: renamed from: d1 */
    public final byte[] m60739d1(byte[] bArr) {
        byte[] bArrM66200h;
        byte[] bArrM66201i;
        long jM70926m0 = m70926m0();
        o3t0 o3t0Var = this.f139753d;
        try {
            if (jM70926m0 == 19500) {
                bArrM66201i = o3t0Var.m66201i();
            } else {
                bArrM66200h = o3t0Var.m66200h();
            }
            if (bArr == null) {
                jM70926m0 = bArrM66200h;
                jM70926m0 = bArrM66201i;
                return jM70926m0;
            }
            jM70926m0 = bArrM66200h;
            jM70926m0 = bArrM66201i;
            return bk5.m29596S0(bArr, jM70926m0);
        } catch (ProtobufDecodingException e) {
            throw new ProtobufDecodingException("Error while decoding proto number " + ((int) (jM70926m0 & 2147483647L)) + " of " + this.f139754e.mo33226i(), e);
        }
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: e0 */
    public final char mo39225e0(wdr0 wdr0Var, int i) {
        return (char) m60737a1(mo45307f1(wdr0Var, i));
    }

    /* JADX INFO: renamed from: e1 */
    public final LinkedHashMap m60740e1(rr60 rr60Var, Object obj) {
        whc0 whc0Var = (whc0) rr60Var;
        zgc0 zgc0Var = new zgc0(whc0Var.m88124i(), whc0Var.m88125j(), 0);
        Map map = obj instanceof Map ? (Map) obj : null;
        Set<Map.Entry> set = (Set) new mj5(zgc0Var, 1).m74832e(this, map != null ? map.entrySet() : null);
        int iM31820L = c95.m31820L(i6f.m49804T(set, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Map.Entry entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: f */
    public final String mo39226f(ktz0 ktz0Var, int i) {
        return mo45306c1(mo45307f1(ktz0Var, i));
    }

    /* JADX INFO: renamed from: f1 */
    public long mo45307f1(ktz0 ktz0Var, int i) {
        return p1h1.m68796i(ktz0Var, i);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m60741g1(ktz0 ktz0Var, int i) {
        HashMap map = new HashMap(i, 1.0f);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (p1h1.m68797j(ktz0Var, i3, false) == -2) {
                List listM68799l = p1h1.m68799l(this.f139752c.f268405a, ktz0Var.mo33225h(i3));
                ArrayList arrayList = new ArrayList(i6f.m49804T(listM68799l, 10));
                Iterator it = listM68799l.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf((int) (p1h1.m68796i((ktz0) it.next(), 0) & 2147483647L)));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    map.put(Integer.valueOf(((Number) it2.next()).intValue()), Integer.valueOf(i3));
                }
                i2++;
            } else {
                map.put(Integer.valueOf(p1h1.m68797j(ktz0Var, i3, false)), Integer.valueOf(i3));
            }
        }
        if (i2 > 0) {
            this.f139757h = new HashMap(i2, 1.0f);
        }
        this.f139756g = map;
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: i0 */
    public final long mo39227i0(ktz0 ktz0Var, int i) {
        return m60738b1(mo45307f1(ktz0Var, i));
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: n */
    public final int mo39228n() {
        return m60737a1(m70929y0());
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: o */
    public final int mo39229o(ktz0 ktz0Var, int i) {
        return m60737a1(mo45307f1(ktz0Var, i));
    }

    /* JADX INFO: renamed from: p */
    public int mo29816p(ktz0 ktz0Var) {
        int iIntValue;
        HashMap map;
        o3t0 o3t0Var = this.f139753d;
        while (true) {
            try {
                int iM66214v = o3t0Var.m66214v();
                dwt dwtVar = this.f139759t;
                if (iM66214v == -1) {
                    return dwtVar.m37173c();
                }
                if (iM66214v == 0) {
                    throw new SerializationException("0 is not allowed as the protobuf field number in " + ktz0Var.mo33226i() + ", the input bytes may have been corrupted");
                }
                int[] iArr = this.f139755f;
                if (iArr != null) {
                    iIntValue = (iM66214v < 0 || iM66214v >= iArr.length) ? -1 : iArr[iM66214v];
                } else {
                    HashMap map2 = this.f139756g;
                    wj50.m88279p(map2);
                    Object obj = map2.get(Integer.valueOf(iM66214v));
                    if (obj == null) {
                        obj = -1;
                    }
                    iIntValue = ((Number) obj).intValue();
                }
                if (iIntValue != -1) {
                    if (p1h1.m68802o(p1h1.m68796i(ktz0Var, iIntValue)) && (map = this.f139757h) != null) {
                    }
                    dwtVar.m37172b(iIntValue);
                    return iIntValue;
                }
                o3t0Var.m66215w();
            } catch (ProtobufDecodingException e) {
                throw new ProtobufDecodingException("Fail to get element index for " + ktz0Var.mo33226i() + " in " + this.f139754e.mo33226i(), e);
            }
        }
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: q */
    public final byte mo39230q(wdr0 wdr0Var, int i) {
        return (byte) m60737a1(mo45307f1(wdr0Var, i));
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: t */
    public final fro mo39231t(wdr0 wdr0Var, int i) {
        long jMo45307f1 = mo45307f1(wdr0Var, i);
        wdr0Var.mo33225h(i);
        m70922A0(jMo45307f1);
        return this;
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: u */
    public final long mo39232u() {
        return m60738b1(m70929y0());
    }

    @Override // p204p.fro
    /* JADX INFO: renamed from: w */
    public final fro mo39233w(ktz0 ktz0Var) {
        m70922A0(m70929y0());
        return this;
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: a */
    public final void mo29813a(ktz0 ktz0Var) {
    }
}
