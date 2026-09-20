package p204p;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ry70 implements omy0 {

    /* JADX INFO: renamed from: x */
    public static final t9y0 f203827x = l7l.m58436q(new f150(13), new xaf(15));

    /* JADX INFO: renamed from: a */
    public boolean f203828a;

    /* JADX INFO: renamed from: b */
    public ky70 f203829b;

    /* JADX INFO: renamed from: c */
    public final zs0 f203830c;

    /* JADX INFO: renamed from: d */
    public final yum0 f203831d;

    /* JADX INFO: renamed from: e */
    public final zk1 f203832e;

    /* JADX INFO: renamed from: f */
    public final yum0 f203833f;

    /* JADX INFO: renamed from: g */
    public final yum0 f203834g;

    /* JADX INFO: renamed from: h */
    public lp70 f203835h;

    /* JADX INFO: renamed from: i */
    public final xs70 f203836i;

    /* JADX INFO: renamed from: j */
    public final eb8 f203837j;

    /* JADX INFO: renamed from: k */
    public final ae00 f203838k;

    /* JADX INFO: renamed from: l */
    public final boolean f203839l;

    /* JADX INFO: renamed from: m */
    public final vv70 f203840m;

    /* JADX INFO: renamed from: n */
    public final r5q f203841n;

    /* JADX INFO: renamed from: o */
    public float f203842o;

    /* JADX INFO: renamed from: p */
    public int f203843p;

    /* JADX INFO: renamed from: q */
    public final toi0 f203844q;

    /* JADX INFO: renamed from: r */
    public final woi0 f203845r;

    /* JADX INFO: renamed from: s */
    public final sv70 f203846s;

    /* JADX INFO: renamed from: t */
    public final fv70 f203847t;

    /* JADX INFO: renamed from: u */
    public final kqi0 f203848u;

    /* JADX INFO: renamed from: v */
    public final kqi0 f203849v;

    /* JADX INFO: renamed from: w */
    public final bq70 f203850w;

    public ry70(int[] iArr, int[] iArr2) {
        Integer numValueOf;
        yrv yrvVar = new yrv(2, this, ry70.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0, 0, 16);
        zs0 zs0Var = new zs0();
        zs0Var.f285795b = yrvVar;
        zs0Var.f285796c = iArr;
        zs0Var.f285797d = new vum0(zs0.m96793k(iArr));
        zs0Var.f285798e = iArr2;
        zs0Var.f285799f = new vum0(zs0.m96794l(iArr, iArr2));
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            int length = iArr.length - 1;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    int i3 = iArr[i2];
                    i = i > i3 ? i3 : i;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        zs0Var.f285801h = new nv70(numValueOf != null ? numValueOf.intValue() : 0, 90, 200);
        this.f203830c = zs0Var;
        this.f203831d = new yum0(ly70.f137980a, zhi0.f282936c);
        this.f203832e = new zk1(16, (byte) 0);
        Boolean bool = Boolean.FALSE;
        this.f203833f = sam.m77645B(bool);
        this.f203834g = sam.m77645B(bool);
        this.f203836i = new xs70(this, 2);
        this.f203837j = new eb8();
        this.f203838k = new ae00(17);
        this.f203839l = true;
        this.f203840m = new vv70(null);
        this.f203841n = new r5q(new rv70(this, 5));
        this.f203843p = -1;
        toi0 toi0Var = x350.f257695a;
        this.f203844q = new toi0();
        this.f203845r = new woi0();
        this.f203846s = new sv70();
        this.f203847t = new fv70();
        this.f203848u = pqo0.m70671k();
        this.f203849v = pqo0.m70671k();
        this.f203850w = new bq70();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r5.f203841n.mo28414a(r6, r7, r0) == r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.omy0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo28414a(xqi0 xqi0Var, th00 th00Var, fbk fbkVar) {
        qy70 qy70Var;
        th00 th00Var2;
        if (fbkVar instanceof qy70) {
            qy70Var = (qy70) fbkVar;
            int i = qy70Var.f193846e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qy70Var.f193846e = i - Integer.MIN_VALUE;
            } else {
                qy70Var = new qy70(this, fbkVar);
            }
        } else {
            qy70Var = new qy70(this, fbkVar);
        }
        Object obj = qy70Var.f193844c;
        int i2 = qy70Var.f193846e;
        Object obj2 = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                th00 th00Var3 = (th00) qy70Var.f193843b;
                xqi0Var = qy70Var.f193842a;
                bga.m29073P(obj);
                th00Var2 = th00Var3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj);
        if (this.f203831d.getValue() == ly70.f137980a) {
            qy70Var.f193842a = xqi0Var;
            qy70Var.f193843b = (mb61) th00Var;
            qy70Var.f193846e = 1;
            if (this.f203837j.m38360d(qy70Var) != obj2) {
            }
        }
        th00Var2 = th00Var;
        th00Var2 = th00Var;
        return obj2;
        th00Var2 = th00Var;
        th00Var2 = th00Var;
        th00Var2 = th00Var;
        qy70Var.f193842a = null;
        qy70Var.f193843b = null;
        qy70Var.f193846e = 2;
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: b */
    public final boolean mo28415b() {
        return this.f203841n.mo28415b();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: c */
    public final boolean mo28416c() {
        return ((Boolean) this.f203834g.getValue()).booleanValue();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: d */
    public final boolean mo28417d() {
        return ((Boolean) this.f203833f.getValue()).booleanValue();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: e */
    public final float mo28418e(float f) {
        return this.f203841n.mo28418e(f);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0148 A[LOOP:1: B:62:0x010c->B:72:0x0148, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x014c A[EDGE_INSN: B:95:0x014c->B:73:0x014c BREAK  A[LOOP:1: B:62:0x010c->B:72:0x0148], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: f */
    public final void m76691f(ky70 ky70Var, boolean z, boolean z2) {
        Object obj;
        gh00 gh00VarMo28816e;
        bq70 bq70Var = this.f203850w;
        zs0 zs0Var = this.f203830c;
        if (!z && this.f203828a) {
            this.f203829b = ky70Var;
            oa31 oa31VarM58610i = lb5.m58610i();
            gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
            oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
            try {
                if (bq70Var.m30188d() && Arrays.equals(ky70Var.f127693a, (int[]) zs0Var.f285796c) && Arrays.equals(ky70Var.f127694b, (int[]) zs0Var.f285798e)) {
                    bq70Var.m30197m();
                }
                return;
            } finally {
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            }
        }
        if (z) {
            this.f203828a = true;
        }
        float f = this.f203842o;
        float f2 = ky70Var.f127695c;
        ?? r8 = ky70Var.f127705m;
        int[] iArr = ky70Var.f127693a;
        int[] iArr2 = ky70Var.f127694b;
        this.f203842o = f - f2;
        this.f203831d.setValue(ky70Var);
        if (z2) {
            zs0Var.f285798e = iArr2;
            ((vum0) zs0Var.f285799f).m86438w(zs0.m96794l((int[]) zs0Var.f285796c, iArr2));
        } else {
            zs0Var.getClass();
            int iM96793k = zs0.m96793k(iArr);
            int size = r8.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = r8.get(i);
                if (((my70) obj).f148333a == iM96793k) {
                    break;
                } else {
                    i++;
                }
            }
            my70 my70Var = (my70) obj;
            zs0Var.f285800g = my70Var != null ? my70Var.f148334b : null;
            ((nv70) zs0Var.f285801h).m65727a(iM96793k);
            if (zs0Var.f285794a || ky70Var.f127704l > 0) {
                zs0Var.f285794a = true;
                oa31 oa31VarM58610i2 = lb5.m58610i();
                gh00VarMo28816e = oa31VarM58610i2 != null ? oa31VarM58610i2.mo28816e() : null;
                oa31 oa31VarM58611j2 = lb5.m58611j(oa31VarM58610i2);
                try {
                    zs0Var.f285796c = iArr;
                    ((vum0) zs0Var.f285797d).m86438w(zs0.m96793k(iArr));
                    zs0Var.f285798e = iArr2;
                    ((vum0) zs0Var.f285799f).m86438w(zs0.m96794l(iArr, iArr2));
                    lb5.m58615n(oa31VarM58610i2, oa31VarM58611j2, gh00VarMo28816e);
                } catch (Throwable th) {
                    lb5.m58615n(oa31VarM58610i2, oa31VarM58611j2, gh00VarMo28816e);
                    throw th;
                }
            }
            if (this.f203843p != -1 && !r8.isEmpty()) {
                int i2 = ((my70) g6f.m43741q0(r8)).f148333a;
                int i3 = ((my70) g6f.m43687A0(r8)).f148333a;
                int i4 = this.f203843p;
                if (i2 > i4 || i4 > i3) {
                    this.f203843p = -1;
                    toi0 toi0Var = this.f203844q;
                    Object[] objArr = toi0Var.f247488c;
                    long[] jArr = toi0Var.f247486a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((j & 255) < 128) {
                                        ((uv70) objArr[(i5 << 3) + i7]).cancel();
                                    }
                                    j >>= 8;
                                }
                                if (i6 != 8) {
                                    break;
                                } else if (i5 != length) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                    toi0Var.m81195c();
                }
            }
        }
        this.f203834g.setValue(Boolean.valueOf(iArr[0] != 0 || iArr2[0] > 0));
        this.f203833f.setValue(Boolean.valueOf(ky70Var.f127698f));
        if (z) {
            bq70Var.m30198n(ky70Var.f127697e, ky70Var.f127703k, ky70Var.f127712t);
        }
    }

    /* JADX INFO: renamed from: g */
    public final ky70 m76692g() {
        return (ky70) this.f203831d.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: h */
    public final void m76693h(float f, ky70 ky70Var) {
        toi0 toi0Var;
        int iM96287n;
        int i;
        long jM38117h;
        if (!this.f203839l) {
            return;
        }
        ?? r2 = ky70Var.f127705m;
        if (r2.isEmpty()) {
            return;
        }
        boolean z = f < 0.0f;
        int i2 = z ? ((my70) g6f.m43687A0(r2)).f148333a : ((my70) g6f.m43741q0(r2)).f148333a;
        if (i2 == this.f203843p) {
            return;
        }
        this.f203843p = i2;
        int[] iArr = f450.f65676a;
        uoi0 uoi0Var = new uoi0();
        py70 py70Var = ky70Var.f127701i;
        int[] iArr2 = py70Var.f183366b;
        int length = iArr2.length;
        int i3 = 0;
        while (true) {
            toi0Var = this.f203844q;
            if (i3 >= length) {
                break;
            }
            zk1 zk1Var = this.f203832e;
            if (z) {
                iM96287n = i2 + 1;
                int length2 = zk1Var.f283580c + ((int[]) zk1Var.f283581d).length;
                while (true) {
                    if (iM96287n >= length2) {
                        iM96287n = zk1Var.f283580c + ((int[]) zk1Var.f283581d).length;
                        break;
                    } else if (zk1Var.m96279e(iM96287n, i3)) {
                        break;
                    } else {
                        iM96287n++;
                    }
                }
            } else {
                iM96287n = zk1Var.m96287n(i2, i3);
            }
            int i4 = iM96287n;
            if (i4 < 0 || i4 >= ky70Var.f127704l || uoi0Var.m83622c(i4)) {
                break;
            }
            uoi0Var.f232444b[uoi0Var.m83623d(i4)] = i4;
            if (!toi0Var.m87102a(i4)) {
                boolean zM95828m = ky70Var.f127702j.m95828m(i4);
                int i5 = zM95828m ? 0 : i3;
                int i6 = zM95828m ? length : 1;
                if (i6 == 1) {
                    i = iArr2[i5];
                } else {
                    int[] iArr3 = py70Var.f183365a;
                    int i7 = iArr3[i5];
                    int i8 = (i5 + i6) - 1;
                    i = (iArr3[i8] + iArr2[i8]) - i7;
                }
                if (ky70Var.f127713u == vvl0.f245248a) {
                    if (i < 0) {
                        ot40.m67767a("width must be >= 0");
                    }
                    jM38117h = e8j.m38117h(i, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
                } else {
                    if (i < 0) {
                        ot40.m67767a("height must be >= 0");
                    }
                    jM38117h = e8j.m38117h(0, Alert.DURATION_SHOW_INDEFINITELY, i, i);
                }
                vv70 vv70Var = this.f203840m;
                m12 m12Var = vv70Var.f245164c;
                toi0Var.m81201i(i4, m12Var != null ? m12Var.m60506U(i4, jM38117h, vv70Var.f245163b, true, null) : qjs.f189299a);
            }
            i3++;
            i2 = i4;
        }
        long[] jArr = toi0Var.f247486a;
        int length3 = jArr.length - 2;
        if (length3 < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j = jArr[i9];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length3)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i9 << 3) + i11;
                        int i13 = toi0Var.f247487b[i12];
                        uv70 uv70Var = (uv70) toi0Var.f247488c[i12];
                        boolean zM83622c = uoi0Var.m83622c(i13);
                        if (!zM83622c) {
                            uv70Var.cancel();
                        }
                        if (!zM83622c) {
                            toi0Var.m81200h(i12);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length3) {
                return;
            } else {
                i9++;
            }
        }
    }
}
