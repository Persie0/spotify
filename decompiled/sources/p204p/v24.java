package p204p;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Size;

/* JADX INFO: loaded from: classes.dex */
public final class v24 implements c2m0 {

    /* JADX INFO: renamed from: a */
    public final yqq f236536a;

    /* JADX INFO: renamed from: b */
    public long f236537b = 9205357640488583168L;

    /* JADX INFO: renamed from: c */
    public final sqs f236538c;

    /* JADX INFO: renamed from: d */
    public final yum0 f236539d;

    /* JADX INFO: renamed from: e */
    public final boolean f236540e;

    /* JADX INFO: renamed from: f */
    public boolean f236541f;

    /* JADX INFO: renamed from: g */
    public long f236542g;

    /* JADX INFO: renamed from: h */
    public long f236543h;

    /* JADX INFO: renamed from: i */
    public final xlq f236544i;

    public v24(Context context, yqq yqqVar, long j, f4m0 f4m0Var) {
        this.f236536a = yqqVar;
        sqs sqsVar = new sqs(context, rfg1.m75429D(j));
        this.f236538c = sqsVar;
        this.f236539d = sam.m77644A(w2a1.f247311a, zhi0.f282936c);
        this.f236540e = true;
        this.f236542g = 0L;
        this.f236543h = -1L;
        u24 u24Var = new u24(this, 0);
        e6q0 e6q0Var = pb61.f175726a;
        ub61 ub61Var = new ub61(null, null, null, u24Var);
        this.f236544i = Build.VERSION.SDK_INT >= 31 ? new xk51(ub61Var, this, sqsVar) : new ah10(ub61Var, this, sqsVar, f4m0Var);
    }

    @Override // p204p.c2m0
    /* JADX INFO: renamed from: a */
    public final jlq mo31333a() {
        return this.f236544i;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:103:0x0207  */
    /* JADX WARN: Code duplicated, block: B:105:0x0211  */
    /* JADX WARN: Code duplicated, block: B:106:0x0215  */
    /* JADX WARN: Code duplicated, block: B:109:0x0225  */
    /* JADX WARN: Code duplicated, block: B:111:0x022a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0232  */
    /* JADX WARN: Code duplicated, block: B:114:0x0236  */
    /* JADX WARN: Code duplicated, block: B:116:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x023f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0247  */
    /* JADX WARN: Code duplicated, block: B:127:0x0269  */
    /* JADX WARN: Code duplicated, block: B:138:0x0292  */
    /* JADX WARN: Code duplicated, block: B:149:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:160:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:167:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x012f A[PHI: r7
      0x012f: PHI (r7v9 float) = (r7v8 float), (r7v12 float) binds: [B:73:0x015d, B:62:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0132  */
    /* JADX WARN: Code duplicated, block: B:67:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ed  */
    @Override // p204p.c2m0
    /* JADX INFO: renamed from: b */
    public final long mo31334b(int i, long j, gh00 gh00Var) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fM84503j;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jM256f;
        long jM256f2;
        boolean z;
        boolean zM78961f;
        int i3;
        long j3;
        boolean z2;
        int i4;
        boolean z3;
        if (Size.m266g(this.f236542g)) {
            return ((Offset) gh00Var.invoke(new Offset(j))).f493a;
        }
        boolean z4 = this.f236541f;
        boolean z5 = true;
        sqs sqsVar = this.f236538c;
        if (!z4) {
            if (sqs.m78962g(sqsVar.f213144f)) {
                m84502i(0L);
            }
            if (sqs.m78962g(sqsVar.f213145g)) {
                m84503j(0L);
            }
            if (sqs.m78962g(sqsVar.f213142d)) {
                m84504k(0L);
            }
            if (sqs.m78962g(sqsVar.f213143e)) {
                m84501h(0L);
            }
            this.f236541f = true;
        }
        int i5 = fk4.f70465a;
        float f = yjg1.m93917i(i, 2) ? 4.0f : 1.0f;
        long jM258h = Offset.m258h(j, f);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!sqs.m78962g(sqsVar.f213142d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (sqs.m78962g(sqsVar.f213143e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float fM84501h = m84501h(jM258h);
                    if (!sqs.m78962g(sqsVar.f213143e)) {
                        sqsVar.m78964b().finish();
                    }
                    fIntBitsToFloat = fM84501h == Float.intBitsToFloat((int) (jM258h & 4294967295L)) ? Float.intBitsToFloat(i6) : fM84501h / f;
                }
            } else {
                float fM84504k = m84504k(jM258h);
                j2 = 4294967295L;
                if (!sqs.m78962g(sqsVar.f213142d)) {
                    sqsVar.m78967e().finish();
                }
                fIntBitsToFloat = fM84504k == Float.intBitsToFloat((int) (jM258h & 4294967295L)) ? Float.intBitsToFloat(i6) : fM84504k / f;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!sqs.m78962g(sqsVar.f213144f) && Float.intBitsToFloat(i2) < 0.0f) {
                fM84503j = m84502i(jM258h);
                if (!sqs.m78962g(sqsVar.f213144f)) {
                    sqsVar.m78965c().finish();
                }
                if (fM84503j == Float.intBitsToFloat((int) (jM258h >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fM84503j / f;
                }
            } else if (sqs.m78962g(sqsVar.f213145g) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fM84503j = m84503j(jM258h);
                if (!sqs.m78962g(sqsVar.f213145g)) {
                    sqsVar.m78966d().finish();
                }
                if (fM84503j == Float.intBitsToFloat((int) (jM258h >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fM84503j / f;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!Offset.m253c(jFloatToRawIntBits, 0L)) {
                m84500g();
            }
            jM256f = Offset.m256f(j, jFloatToRawIntBits);
            long j4 = ((Offset) gh00Var.invoke(new Offset(jM256f))).f493a;
            jM256f2 = Offset.m256f(jM256f, j4);
            if ((Float.intBitsToFloat((int) (jM256f >> 32)) == 0.0f || Float.intBitsToFloat((int) (jM256f & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j4 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j4 & j2)) != 0.0f) && (sqs.m78962g(sqsVar.f213144f) || sqs.m78962g(sqsVar.f213142d) || sqs.m78962g(sqsVar.f213145g) || sqs.m78962g(sqsVar.f213143e)))) {
                m84498e();
            }
            if (yjg1.m93917i(i, 1)) {
                i3 = (int) (jM256f2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    j3 = jM256f2;
                    m84502i(j3);
                } else {
                    j3 = jM256f2;
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        m84503j(j3);
                    } else {
                        z2 = false;
                    }
                    i4 = (int) (j3 & j2);
                    if (Float.intBitsToFloat(i4) > 1056964608) {
                        m84504k(j3);
                    } else {
                        if (Float.intBitsToFloat(i4) < -1090519040) {
                            m84501h(j3);
                        } else {
                            z3 = false;
                        }
                        if (!z2 || z3) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z3 = true;
                    if (z2) {
                    }
                    z = true;
                }
                z2 = true;
                i4 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    m84504k(j3);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        m84501h(j3);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!Offset.m253c(jM256f, 0L)) {
                if (sqs.m78961f(sqsVar.f213144f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zM78961f = false;
                } else {
                    sxg1.m79613A(sqsVar.m78965c(), Float.intBitsToFloat(i2));
                    zM78961f = sqs.m78961f(sqsVar.f213144f);
                }
                if (sqs.m78961f(sqsVar.f213145g) && Float.intBitsToFloat(i2) > 0.0f) {
                    sxg1.m79613A(sqsVar.m78966d(), Float.intBitsToFloat(i2));
                    if (!zM78961f || sqs.m78961f(sqsVar.f213145g)) {
                        zM78961f = true;
                    } else {
                        zM78961f = false;
                    }
                }
                if (sqs.m78961f(sqsVar.f213142d) && Float.intBitsToFloat(i6) < 0.0f) {
                    sxg1.m79613A(sqsVar.m78967e(), Float.intBitsToFloat(i6));
                    if (!zM78961f || sqs.m78961f(sqsVar.f213142d)) {
                        zM78961f = true;
                    } else {
                        zM78961f = false;
                    }
                }
                if (sqs.m78961f(sqsVar.f213143e) && Float.intBitsToFloat(i6) > 0.0f) {
                    sxg1.m79613A(sqsVar.m78964b(), Float.intBitsToFloat(i6));
                    if (!zM78961f || sqs.m78961f(sqsVar.f213143e)) {
                        zM78961f = true;
                    } else {
                        zM78961f = false;
                    }
                }
                if (!zM78961f && !z) {
                    z5 = false;
                }
                z = z5;
            }
            if (z) {
                m84500g();
            }
            return Offset.m257g(jFloatToRawIntBits, j4);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!sqs.m78962g(sqsVar.f213144f)) {
            if (sqs.m78962g(sqsVar.f213145g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (sqs.m78962g(sqsVar.f213145g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!Offset.m253c(jFloatToRawIntBits, 0L)) {
            m84500g();
        }
        jM256f = Offset.m256f(j, jFloatToRawIntBits);
        long j5 = ((Offset) gh00Var.invoke(new Offset(jM256f))).f493a;
        jM256f2 = Offset.m256f(jM256f, j5);
        if (Float.intBitsToFloat((int) (jM256f >> 32)) == 0.0f) {
            m84498e();
        } else {
            m84498e();
        }
        if (yjg1.m93917i(i, 1)) {
            i3 = (int) (jM256f2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                j3 = jM256f2;
                m84502i(j3);
            } else {
                j3 = jM256f2;
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    m84503j(j3);
                } else {
                    z2 = false;
                }
                i4 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    m84504k(j3);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        m84501h(j3);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            }
            z2 = true;
            i4 = (int) (j3 & j2);
            if (Float.intBitsToFloat(i4) > 1056964608) {
                m84504k(j3);
            } else {
                if (Float.intBitsToFloat(i4) < -1090519040) {
                    m84501h(j3);
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                z = true;
            }
            z3 = true;
            if (z2) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!Offset.m253c(jM256f, 0L)) {
            if (sqs.m78961f(sqsVar.f213144f)) {
                zM78961f = false;
            } else {
                zM78961f = false;
            }
            if (sqs.m78961f(sqsVar.f213145g)) {
                sxg1.m79613A(sqsVar.m78966d(), Float.intBitsToFloat(i2));
                if (zM78961f) {
                    zM78961f = true;
                } else {
                    zM78961f = true;
                }
            }
            if (sqs.m78961f(sqsVar.f213142d)) {
                sxg1.m79613A(sqsVar.m78967e(), Float.intBitsToFloat(i6));
                if (zM78961f) {
                    zM78961f = true;
                } else {
                    zM78961f = true;
                }
            }
            if (sqs.m78961f(sqsVar.f213143e)) {
                sxg1.m79613A(sqsVar.m78964b(), Float.intBitsToFloat(i6));
                if (zM78961f) {
                    zM78961f = true;
                } else {
                    zM78961f = true;
                }
            }
            if (!zM78961f) {
                z5 = false;
            }
            z = z5;
        }
        if (z) {
            m84500g();
        }
        return Offset.m257g(jFloatToRawIntBits, j5);
    }

    @Override // p204p.c2m0
    /* JADX INFO: renamed from: c */
    public final boolean mo31335c() {
        sqs sqsVar = this.f236538c;
        EdgeEffect edgeEffect = sqsVar.f213142d;
        if (edgeEffect != null && sxg1.m79639v(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = sqsVar.f213143e;
        if (edgeEffect2 != null && sxg1.m79639v(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = sqsVar.f213144f;
        if (edgeEffect3 != null && sxg1.m79639v(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = sqsVar.f213145g;
        return (edgeEffect4 == null || sxg1.m79639v(edgeEffect4) == 0.0f) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p204p.c2m0
    /* JADX INFO: renamed from: d */
    public final Object mo31336d(long j, th00 th00Var, fbk fbkVar) {
        s24 s24Var;
        float fM79632o;
        float fM79632o2;
        long j2;
        if (fbkVar instanceof s24) {
            s24Var = (s24) fbkVar;
            int i = s24Var.f204896d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s24Var.f204896d = i - Integer.MIN_VALUE;
            } else {
                s24Var = new s24(this, (ibk) fbkVar);
            }
        } else {
            s24Var = new s24(this, (ibk) fbkVar);
        }
        Object objInvoke = s24Var.f204894b;
        int i2 = s24Var.f204896d;
        w2a1 w2a1Var = w2a1.f247311a;
        sqs sqsVar = this.f236538c;
        if (i2 == 0) {
            bga.m29073P(objInvoke);
            boolean zM266g = Size.m266g(this.f236542g);
            Object obj = yuk.f276404a;
            if (zM266g) {
                Object objM60851a = m5b1.m60851a(j);
                s24Var.f204896d = 1;
                if (th00Var.invoke(objM60851a, s24Var) != obj) {
                    return w2a1Var;
                }
            } else {
                boolean zM78962g = sqs.m78962g(sqsVar.f213144f);
                yqq yqqVar = this.f236536a;
                if (!zM78962g || m5b1.m60854d(j) >= 0.0f) {
                    fM79632o = (!sqs.m78962g(sqsVar.f213145g) || m5b1.m60854d(j) <= 0.0f) ? 0.0f : -sxg1.m79632o(sqsVar.m78966d(), -m5b1.m60854d(j), Float.intBitsToFloat((int) (this.f236542g >> 32)), yqqVar);
                } else {
                    fM79632o = sxg1.m79632o(sqsVar.m78965c(), m5b1.m60854d(j), Float.intBitsToFloat((int) (this.f236542g >> 32)), yqqVar);
                }
                if (!sqs.m78962g(sqsVar.f213142d) || m5b1.m60855e(j) >= 0.0f) {
                    fM79632o2 = (!sqs.m78962g(sqsVar.f213143e) || m5b1.m60855e(j) <= 0.0f) ? 0.0f : -sxg1.m79632o(sqsVar.m78964b(), -m5b1.m60855e(j), Float.intBitsToFloat((int) (4294967295L & this.f236542g)), yqqVar);
                } else {
                    fM79632o2 = sxg1.m79632o(sqsVar.m78967e(), m5b1.m60855e(j), Float.intBitsToFloat((int) (4294967295L & this.f236542g)), yqqVar);
                }
                long jM70524e = pp91.m70524e(fM79632o, fM79632o2);
                if (!m5b1.m60853c(jM70524e)) {
                    m84500g();
                }
                long jM60856f = m5b1.m60856f(j, jM70524e);
                Object objM60851a2 = m5b1.m60851a(jM60856f);
                s24Var.f204893a = jM60856f;
                s24Var.f204896d = 2;
                objInvoke = th00Var.invoke(objM60851a2, s24Var);
                if (objInvoke != obj) {
                    j2 = jM60856f;
                }
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objInvoke);
            return w2a1Var;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j2 = s24Var.f204893a;
        bga.m29073P(objInvoke);
        long jM60856f2 = m5b1.m60856f(j2, ((m5b1) objInvoke).m60860j());
        this.f236541f = false;
        if (m5b1.m60854d(jM60856f2) > 0.0f) {
            sxg1.m79642y(sqsVar.m78965c(), q3d0.m72083N(m5b1.m60854d(jM60856f2)));
        } else if (m5b1.m60854d(jM60856f2) < 0.0f) {
            sxg1.m79642y(sqsVar.m78966d(), -q3d0.m72083N(m5b1.m60854d(jM60856f2)));
        }
        if (m5b1.m60855e(jM60856f2) > 0.0f) {
            sxg1.m79642y(sqsVar.m78967e(), q3d0.m72083N(m5b1.m60855e(jM60856f2)));
        } else if (m5b1.m60855e(jM60856f2) < 0.0f) {
            sxg1.m79642y(sqsVar.m78964b(), -q3d0.m72083N(m5b1.m60855e(jM60856f2)));
        }
        m84498e();
        return w2a1Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m84498e() {
        boolean z;
        sqs sqsVar = this.f236538c;
        EdgeEffect edgeEffect = sqsVar.f213142d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = sqsVar.f213143e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = sqsVar.f213144f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = sqsVar.f213145g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            m84500g();
        }
    }

    /* JADX INFO: renamed from: f */
    public final long m84499f() {
        long jM85480u = this.f236537b;
        if ((9223372034707292159L & jM85480u) == 9205357640488583168L) {
            jM85480u = vgg1.m85480u(this.f236542g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM85480u >> 32)) / Float.intBitsToFloat((int) (this.f236542g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM85480u & 4294967295L)) / Float.intBitsToFloat((int) (this.f236542g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: g */
    public final void m84500g() {
        if (this.f236540e) {
            this.f236539d.setValue(w2a1.f247311a);
        }
    }

    /* JADX INFO: renamed from: h */
    public final float m84501h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m84499f() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f236542g & 4294967295L));
        EdgeEffect edgeEffectM78964b = this.f236538c.m78964b();
        return sxg1.m79639v(edgeEffectM78964b) == 0.0f ? Float.intBitsToFloat((int) (this.f236542g & 4294967295L)) * (-sxg1.m79643z(edgeEffectM78964b, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: i */
    public final float m84502i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m84499f() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f236542g >> 32));
        EdgeEffect edgeEffectM78965c = this.f236538c.m78965c();
        return sxg1.m79639v(edgeEffectM78965c) == 0.0f ? Float.intBitsToFloat((int) (this.f236542g >> 32)) * sxg1.m79643z(edgeEffectM78965c, fIntBitsToFloat2, 1 - fIntBitsToFloat) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: j */
    public final float m84503j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m84499f() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f236542g >> 32));
        EdgeEffect edgeEffectM78966d = this.f236538c.m78966d();
        return sxg1.m79639v(edgeEffectM78966d) == 0.0f ? Float.intBitsToFloat((int) (this.f236542g >> 32)) * (-sxg1.m79643z(edgeEffectM78966d, -fIntBitsToFloat2, fIntBitsToFloat)) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: k */
    public final float m84504k(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m84499f() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f236542g & 4294967295L));
        EdgeEffect edgeEffectM78967e = this.f236538c.m78967e();
        return sxg1.m79639v(edgeEffectM78967e) == 0.0f ? Float.intBitsToFloat((int) (this.f236542g & 4294967295L)) * sxg1.m79643z(edgeEffectM78967e, fIntBitsToFloat2, fIntBitsToFloat) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: l */
    public final void m84505l(long j) {
        boolean zM262c = Size.m262c(this.f236542g, 0L);
        boolean zM262c2 = Size.m262c(j, this.f236542g);
        this.f236542g = j;
        if (!zM262c2) {
            int iM72083N = q3d0.m72083N(Float.intBitsToFloat((int) (j >> 32)));
            long jM72083N = (((long) q3d0.m72083N(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iM72083N) << 32);
            sqs sqsVar = this.f236538c;
            sqsVar.f213141c = jM72083N;
            EdgeEffect edgeEffect = sqsVar.f213142d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM72083N >> 32), (int) (jM72083N & 4294967295L));
            }
            EdgeEffect edgeEffect2 = sqsVar.f213143e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM72083N >> 32), (int) (jM72083N & 4294967295L));
            }
            EdgeEffect edgeEffect3 = sqsVar.f213144f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM72083N & 4294967295L), (int) (jM72083N >> 32));
            }
            EdgeEffect edgeEffect4 = sqsVar.f213145g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM72083N & 4294967295L), (int) (jM72083N >> 32));
            }
            EdgeEffect edgeEffect5 = sqsVar.f213146h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM72083N >> 32), (int) (jM72083N & 4294967295L));
            }
            EdgeEffect edgeEffect6 = sqsVar.f213147i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM72083N >> 32), (int) (jM72083N & 4294967295L));
            }
            EdgeEffect edgeEffect7 = sqsVar.f213148j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM72083N & 4294967295L), (int) (jM72083N >> 32));
            }
            EdgeEffect edgeEffect8 = sqsVar.f213149k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM72083N), (int) (jM72083N >> 32));
            }
        }
        if (zM262c || zM262c2) {
            return;
        }
        m84498e();
    }
}
