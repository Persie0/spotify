package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.encoreconsumermobile.elements.smartshufflebutton.SmartShuffleButtonView;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class jd80 implements pwt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111290a;

    /* JADX INFO: renamed from: b */
    public final Object f111291b;

    /* JADX INFO: renamed from: c */
    public final Object f111292c;

    /* JADX INFO: renamed from: d */
    public final Object f111293d;

    public /* synthetic */ jd80(Object obj, Object obj2, Object obj3, int i) {
        this.f111290a = i;
        this.f111292c = obj;
        this.f111293d = obj2;
        this.f111291b = obj3;
    }

    /* JADX INFO: renamed from: e */
    public static final void m53012e(jd80 jd80Var, kyu kyuVar, it41 it41Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        peu peuVar;
        boolean z;
        peu peuVar2;
        String str;
        fyf fyfVarM75772x;
        boolean z2;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(1888395922);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(kyuVar) : xq00Var.m91770i(kyuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(it41Var) : xq00Var.m91770i(it41Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(jd80Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            glr glrVar = it41Var.f105429i;
            boolean zM88271j = wj50.m88271j(glrVar, clr.f39347a);
            boolean z3 = !zM88271j;
            m140 m140Var = it41Var.f105423c;
            fyf fyfVarM75772x2 = null;
            String str2 = m140Var != null ? m140Var.f138841a : null;
            if (str2 == null) {
                str2 = "";
            }
            boolean zM88271j2 = wj50.m88271j(glrVar, dlr.f50317a);
            boolean z4 = !zM88271j2;
            pvf1 pvf1Var = it41Var.f105422b.f45906m;
            t56 t56Var = pvf1Var instanceof t56 ? (t56) pvf1Var : null;
            String str3 = t56Var != null ? t56Var.f217221d : null;
            boolean zM88271j3 = wj50.m88271j(glrVar, flr.f70857a);
            String strM54977L = k0e1.m54977L(R.string.content_description_for_disabled, xq00Var);
            fxh0 fxh0VarM96644b = cxh0.f43038a;
            if (zM88271j) {
                xq00Var.m91771i0(-2022651814);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1722208596);
                boolean zM91766g = xq00Var.m91766g(strM54977L);
                Object objM91750T = xq00Var.m91750T();
                if (zM91766g || objM91750T == obj) {
                    objM91750T = new zz70(strM54977L, 3);
                    xq00Var.m91793t0(objM91750T);
                }
                fxh0VarM96644b = zoz0.m96644b(fxh0VarM96644b, false, (gh00) objM91750T);
                xq00Var.m91788r(false);
            }
            fxh0 fxh0Var = fxh0VarM96644b;
            if (zM88271j2) {
                xq00Var.m91771i0(1722510411);
                xq00Var.m91788r(false);
                peuVar = null;
            } else {
                xq00Var.m91771i0(1722360186);
                String strM54977L2 = k0e1.m54977L(R.string.release_row_click_action_label, xq00Var);
                boolean z5 = (i3 & 896) == 256;
                Object objM91750T2 = xq00Var.m91750T();
                if (z5 || objM91750T2 == obj) {
                    objM91750T2 = new jj60(21, gh00Var);
                    xq00Var.m91793t0(objM91750T2);
                }
                eh00 eh00Var = (eh00) objM91750T2;
                if (wl51.m88460J0(strM54977L2)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                peuVar = new peu(new t40(strM54977L2), eh00Var);
                xq00Var.m91788r(false);
            }
            if (zM88271j2) {
                z = false;
                xq00Var.m91771i0(1722726667);
                xq00Var.m91788r(false);
                peuVar2 = null;
            } else {
                xq00Var.m91771i0(1722567793);
                String strM54977L3 = k0e1.m54977L(R.string.release_row_long_click_action_label, xq00Var);
                boolean z6 = (i3 & 896) == 256;
                Object objM91750T3 = xq00Var.m91750T();
                if (z6 || objM91750T3 == obj) {
                    objM91750T3 = new jj60(22, gh00Var);
                    xq00Var.m91793t0(objM91750T3);
                }
                eh00 eh00Var2 = (eh00) objM91750T3;
                if (wl51.m88460J0(strM54977L3)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                peu peuVar3 = new peu(new t40(strM54977L3), eh00Var2);
                z = false;
                xq00Var.m91788r(false);
                peuVar2 = peuVar3;
            }
            if (zM88271j3 == 0 && str3 == null) {
                xq00Var.m91771i0(1723276235);
                xq00Var.m91788r(z);
                str = str2;
                fyfVarM75772x = null;
            } else {
                xq00Var.m91771i0(1722993392);
                str = str2;
                fyfVarM75772x = rkk.m75772x(2030568253, new id80(str3, zM88271j3, z3, z4, gh00Var, 0), xq00Var);
                xq00Var.m91788r(z);
            }
            if ((str.length() > 0) || it41Var.f105428h != 4) {
                z2 = false;
                xq00Var.m91771i0(1723512363);
                fyfVarM75772x2 = rkk.m75772x(661904420, new ks1(str, it41Var, z3, 20), xq00Var);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1723707755);
                z2 = false;
                xq00Var.m91788r(false);
            }
            xq00Var.m91771i0(1723811699);
            fyf fyfVarM75772x3 = rkk.m75772x(1498642503, new i9y(27, jd80Var, it41Var), xq00Var);
            xq00Var.m91788r(z2);
            p711.m69222a(fxh0Var, kyuVar, null, false, null, null, peuVar, peuVar2, null, fyfVarM75772x, null, fyfVarM75772x2, fyfVarM75772x3, null, null, rkk.m75772x(1364477398, new cq2(it41Var, z3, 7), xq00Var), xq00Var, 64 | ((i3 << 3) & ContentType.LONG_FORM_ON_DEMAND), 196608, 25916);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new mg60(jd80Var, kyuVar, it41Var, gh00Var, i, 8);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m53013f(kqi0 kqi0Var) {
        return ((Boolean) kqi0Var.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static final void m53014g(kqi0 kqi0Var) {
        kqi0Var.setValue(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: h */
    public static final void m53015h(jd80 jd80Var, xuk xukVar, SmartShuffleButtonView smartShuffleButtonView, int i, u131 u131Var) {
        x0h1.m89578u(xukVar, null, 0, new kga(jd80Var, smartShuffleButtonView, i, u131Var, (fbk) null, 19), 3);
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, p.gh00] */
    /* JADX WARN: Type inference failed for: r12v15, types: [p.gh00, p.ri00] */
    @Override // p204p.pwt
    /* JADX INFO: renamed from: a */
    public final void mo28230a(Object obj, gh00 gh00Var, qwt qwtVar, xq00 xq00Var, int i) {
        switch (this.f111290a) {
            case 0:
                m53017c((tu41) obj, gh00Var, qwtVar, xq00Var, i);
                break;
            case 1:
                xq00Var.m91771i0(1504006056);
                boolean zBooleanValue = ((Boolean) this.f111292c.invoke(obj)).booleanValue();
                boolean z = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && xq00Var.m91766g(gh00Var)) || (i & 48) == 32;
                Object obj2 = this.f111293d;
                boolean zM91770i = z | xq00Var.m91770i(obj2);
                Object objM91750T = xq00Var.m91750T();
                if (zM91770i || objM91750T == t6x0.f217647t) {
                    objM91750T = new cqk(1, obj2, gh00Var);
                    xq00Var.m91793t0(objM91750T);
                }
                scg1.m77780b(3072, rkk.m75772x(719333541, new s1z0((dut) this.f111291b, obj, gh00Var, qwtVar, 1), xq00Var), (eh00) objM91750T, xq00Var, null, zBooleanValue);
                xq00Var.m91788r(false);
                break;
            case 2:
                xq00Var.m91771i0(461858310);
                boolean zBooleanValue2 = ((Boolean) ((ri00) this.f111292c).invoke(obj)).booleanValue();
                boolean z2 = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && xq00Var.m91766g(gh00Var)) || (i & 48) == 32;
                Object obj3 = this.f111293d;
                boolean zM91770i2 = z2 | xq00Var.m91770i(obj3);
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91770i2 || objM91750T2 == t6x0.f217647t) {
                    objM91750T2 = new cqk(2, obj3, gh00Var);
                    xq00Var.m91793t0(objM91750T2);
                }
                zn91.m96553h(3072, 4, rkk.m75772x(-2083308403, new s1z0((xjc0) this.f111291b, obj, gh00Var, qwtVar, 2), xq00Var), (eh00) objM91750T2, xq00Var, null, zBooleanValue2);
                xq00Var.m91788r(false);
                break;
            case 3:
                m53016b((n131) obj, gh00Var, qwtVar, xq00Var, i);
                break;
            default:
                m53018d((et71) obj, gh00Var, qwtVar, xq00Var, i);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX INFO: renamed from: b */
    public void m53016b(n131 n131Var, gh00 gh00Var, qwt qwtVar, xq00 xq00Var, int i) {
        int i2;
        gh00 gh00Var2;
        pgv0 pgv0VarM91796v;
        v131 v131Var;
        gh00 gh00Var3;
        nec necVar;
        Object obj = t6x0.f217647t;
        String str = n131Var.f149281a;
        xq00Var.m91775k0(-767907614);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(n131Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            gh00Var2 = gh00Var;
            i2 |= xq00Var.m91770i(gh00Var2) ? 32 : 16;
        } else {
            gh00Var2 = gh00Var;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1043) != 1042)) {
            if (n131Var.f149287g) {
                kqi0 kqi0VarM69675a = pda0.m69675a(xq00Var);
                boolean zM91766g = xq00Var.m91766g((b250) kqi0VarM69675a.getValue()) | xq00Var.m91766g(str);
                Object objM91750T = xq00Var.m91750T();
                if (zM91766g || objM91750T == obj) {
                    oq91 oq91VarM36806A = dt71.m36806A((b250) kqi0VarM69675a.getValue());
                    if (oq91VarM36806A == null || (gh00Var3 = oq91VarM36806A.f168139b) == null) {
                        objM91750T = null;
                    } else {
                        Integer numM32959J = cjf1.m32959J((b250) kqi0VarM69675a.getValue());
                        st91 st91Var = (st91) gh00Var3.invoke(Integer.valueOf(numM32959J != null ? numM32959J.intValue() : 0));
                        if (st91Var != null) {
                            objM91750T = new u131(str, (zam0) this.f111292c, st91Var, (kv91) ((xrn) this.f111291b).f265393a.f241004b.f212413s4.get());
                        } else {
                            objM91750T = null;
                        }
                    }
                    xq00Var.m91793t0(objM91750T);
                }
                Object obj2 = (u131) objM91750T;
                Object objM91750T2 = xq00Var.m91750T();
                if (objM91750T2 == obj) {
                    objM91750T2 = sam.m77645B(Boolean.FALSE);
                    xq00Var.m91793t0(objM91750T2);
                }
                Object obj3 = (kqi0) objM91750T2;
                Object objM91750T3 = xq00Var.m91750T();
                if (objM91750T3 == obj) {
                    objM91750T3 = hz40.m49254z(dau.f47107a, xq00Var);
                    xq00Var.m91793t0(objM91750T3);
                }
                Object obj4 = (xuk) objM91750T3;
                int iOrdinal = n131Var.f149282b.ordinal();
                if (iOrdinal == 0) {
                    necVar = ex21.f63655b;
                } else if (iOrdinal == 1) {
                    necVar = ex21.f63657d;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    necVar = fx21.f74230b;
                }
                boolean z = n131Var.f149288h;
                boolean zM91770i = xq00Var.m91770i(obj3) | ((i3 & 14) == 4) | xq00Var.m91770i(this) | xq00Var.m91770i(obj4) | xq00Var.m91770i(obj2);
                Object objM91750T4 = xq00Var.m91750T();
                if (zM91770i || objM91750T4 == obj) {
                    Object cyi0Var = new cyi0(n131Var, this, obj4, obj2, obj3, 2);
                    xq00Var.m91793t0(cyi0Var);
                    objM91750T4 = cyi0Var;
                }
                hdi.m47233j(gh00Var, necVar, (gh00) objM91750T4, null, z, xq00Var, (i3 >> 3) & 14);
            } else {
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v == null) {
                    return;
                } else {
                    v131Var = new v131(this, n131Var, gh00Var2, qwtVar, i, 0);
                }
            }
            pgv0VarM91796v.f177419d = v131Var;
        }
        xq00Var.m91757b0();
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            v131Var = new v131(this, n131Var, gh00Var, qwtVar, i, 1);
            pgv0VarM91796v.f177419d = v131Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m53017c(tu41 tu41Var, gh00 gh00Var, qwt qwtVar, xq00 xq00Var, int i) {
        int i2;
        Object obj;
        xq00Var.m91775k0(-1592843547);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(tu41Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj = gh00Var;
            i2 |= xq00Var.m91770i(obj) ? 32 : 16;
        } else {
            obj = gh00Var;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(this) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1043) != 1042)) {
            jyu jyuVarM42535t = frz0.m42535t(1, 2, xq00Var);
            boolean zM91766g = xq00Var.m91766g(jyuVarM42535t);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                Object kyuVar = new kyu(tju.f221017e, 3, jyuVarM42535t, null, 17);
                xq00Var.m91793t0(kyuVar);
                objM91750T = kyuVar;
            }
            qqg1.m73532b(vm6.f242710a.mo30068a((e940) this.f111292c), rkk.m75772x(-2097793115, new y5z(tu41Var, this, (kyu) objM91750T, obj, 23), xq00Var), xq00Var, 56);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new mg60((Object) this, (Object) tu41Var, gh00Var, (Object) qwtVar, i, 9);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m53018d(et71 et71Var, gh00 gh00Var, qwt qwtVar, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1882479526);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(et71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(this) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1043) != 1042)) {
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(new g450(0L));
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            Integer numValueOf = Integer.valueOf((int) (((g450) kqi0Var.getValue()).f76347a >> 32));
            boolean zM91770i = xq00Var.m91770i(kqi0Var) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new jv2(gh00Var, kqi0Var, (fbk) null, 4);
                xq00Var.m91793t0(objM91750T2);
            }
            hz40.m49237i(numValueOf, (th00) objM91750T2, xq00Var);
            float f = et71Var.f62652a.f167867b;
            cxh0 cxh0Var = cxh0.f43038a;
            if (f <= 0.0f) {
                xq00Var.m91771i0(1559958976);
                fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0Var);
                boolean zM91770i2 = xq00Var.m91770i(kqi0Var);
                Object objM91750T3 = xq00Var.m91750T();
                if (zM91770i2 || objM91750T3 == obj) {
                    objM91750T3 = new p511(kqi0Var, 16);
                    xq00Var.m91793t0(objM91750T3);
                }
                dha.m36004a(vkf1.m85877w(fxh0VarM61820d, (gh00) objM91750T3), xq00Var, 0);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1560069491);
                k1h1.m55101h(et71Var, (als) this.f111292c, mi21.m61822f(1.0f, mi21.m61842z(cxh0Var, null, 3)), (ocz0) this.f111293d, (gh71) this.f111291b, gh00Var, xq00Var, ((i2 << 12) & 458752) | (i2 & 14));
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ho41(this, et71Var, gh00Var, qwtVar, i, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jd80(Object obj, gh00 gh00Var, xjc0 xjc0Var) {
        this.f111290a = 2;
        this.f111292c = (ri00) gh00Var;
        this.f111293d = obj;
        this.f111291b = xjc0Var;
    }
}
