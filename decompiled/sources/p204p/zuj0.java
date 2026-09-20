package p204p;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.element.core.ElementCrashContextException;
import com.spotify.music.R;
import com.spotify.voiceassistants.playermodels.ParsedQueryKt;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonEncodingException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public abstract class zuj0 {

    /* JADX INFO: renamed from: a */
    public static sd40 f286456a;

    /* JADX INFO: renamed from: A */
    public static uxy m97036A(float f) {
        return new uxy(2, f);
    }

    /* JADX INFO: renamed from: B */
    public static String m97037B(jah1 jah1Var) {
        StringBuilder sb = new StringBuilder(jah1Var.mo41180d());
        for (int i = 0; i < jah1Var.mo41180d(); i++) {
            byte bMo41178a = jah1Var.mo41178a(i);
            if (bMo41178a == 34) {
                sb.append("\\\"");
            } else if (bMo41178a == 39) {
                sb.append("\\'");
            } else if (bMo41178a != 92) {
                switch (bMo41178a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo41178a < 32 || bMo41178a > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo41178a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo41178a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo41178a & 7) + 48));
                        } else {
                            sb.append((char) bMo41178a);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static final void m97038a(ggc ggcVar, sgc sgcVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        sgc sgcVar2 = sgcVar;
        xq00Var.m91775k0(122057860);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? xq00Var.m91766g(ggcVar) : xq00Var.m91770i(ggcVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(sgcVar2) : xq00Var.m91770i(sgcVar2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && xq00Var.m91770i(ggcVar));
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new wga(ggcVar, 24);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM61822f, false, (gh00) objM91750T);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96644b);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            ahf1.m25932d(ggcVar.f79631b, zsf1.m96866z(cxh0Var, leu.m58816b(xq00Var).f117233e.f137887c, leu.m58816b(xq00Var).f117230b.f224761d), leu.m58818d(xq00Var).f64969e, leu.m58815a(xq00Var).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
            xq00Var.m91771i0(-2136677543);
            Iterator it = ggcVar.f79632c.iterator();
            while (it.hasNext()) {
                mif1.m61869b(sgcVar2, (pgc) it.next(), null, null, xq00Var, 8 | ((i3 >> 3) & 14), 12);
                sgcVar2 = sgcVar;
            }
            xq00Var.m91788r(false);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ot6(ggcVar, sgcVar, fxh0Var2, i, 23);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m97039b(wr31 wr31Var, xi3 xi3Var, boolean z, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        int i3;
        int i4;
        int i5;
        String strM54978M;
        d9m d9mVar;
        int i6;
        cxh0 cxh0Var;
        boolean z2;
        wwu wwuVar;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(1957755921);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91762e(wr31Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91762e(xi3Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91768h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            switch (wr31Var.ordinal()) {
                case 0:
                    i3 = R.string.your_library_sort_order_recently_updated;
                    break;
                case 1:
                    i3 = R.string.your_library_sort_order_recently_added;
                    break;
                case 2:
                    i3 = R.string.your_library_sort_order_alphabetical;
                    break;
                case 3:
                    i3 = R.string.your_library_sort_order_creator;
                    break;
                case 4:
                    i3 = R.string.your_library_sort_order_custom;
                    break;
                case 5:
                    i3 = R.string.your_library_sort_order_recents;
                    break;
                case 6:
                    i3 = R.string.your_library_sort_order_author;
                    break;
                case 7:
                    i3 = R.string.your_library_sort_order_relevance;
                    break;
                case 8:
                    i3 = R.string.your_library_sort_order_date;
                    break;
                case 9:
                    i3 = R.string.your_library_sort_order_release_date;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            String strM54977L = k0e1.m54977L(i3, xq00Var);
            int iOrdinal = xi3Var.ordinal();
            if (iOrdinal == 0) {
                i4 = 207777691;
                i5 = R.string.library_grid_view_mode_accessibility_label;
            } else {
                if (iOrdinal != 1) {
                    throw lq51.m59703i(207776310, xq00Var, false);
                }
                i4 = 207780923;
                i5 = R.string.library_list_view_mode_accessibility_label;
            }
            String strM12k = AbstractC0000a.m12k(xq00Var, i4, i5, xq00Var, false);
            if (z) {
                strM54978M = AbstractC0000a.m12k(xq00Var, 2146377006, R.string.library_sort_row_layout_content_description_edit_mode, xq00Var, false);
            } else {
                xq00Var.m91771i0(2146483181);
                strM54978M = k0e1.m54978M(R.string.library_sort_row_view_mode_layout_content_description, new Object[]{strM54977L, strM12k}, xq00Var);
                xq00Var.m91788r(false);
            }
            String strM54977L2 = k0e1.m54977L(R.string.library_sort_action_description, xq00Var);
            int i7 = i2 & 7168;
            boolean z3 = i7 == 2048;
            Object objM91750T = xq00Var.m91750T();
            if (z3 || objM91750T == ia7Var) {
                objM91750T = new sy11(20, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            d9m d9mVar2 = new d9m(strM54977L2, (eh00) objM91750T);
            int iOrdinal2 = xi3Var.ordinal();
            if (iOrdinal2 == 0) {
                xq00Var.m91771i0(207803199);
                String strM54977L3 = k0e1.m54977L(R.string.library_sort_list_icon_action_description, xq00Var);
                boolean z4 = i7 == 2048;
                Object objM91750T2 = xq00Var.m91750T();
                if (z4 || objM91750T2 == ia7Var) {
                    objM91750T2 = new sy11(21, gh00Var);
                    xq00Var.m91793t0(objM91750T2);
                }
                d9mVar = new d9m(strM54977L3, (eh00) objM91750T2);
                xq00Var.m91788r(false);
            } else {
                if (iOrdinal2 != 1) {
                    throw lq51.m59703i(207801710, xq00Var, false);
                }
                xq00Var.m91771i0(207810911);
                String strM54977L4 = k0e1.m54977L(R.string.library_sort_grid_icon_action_description, xq00Var);
                boolean z5 = i7 == 2048;
                Object objM91750T3 = xq00Var.m91750T();
                if (z5 || objM91750T3 == ia7Var) {
                    objM91750T3 = new sy11(22, gh00Var);
                    xq00Var.m91793t0(objM91750T3);
                }
                d9mVar = new d9m(strM54977L4, (eh00) objM91750T3);
                xq00Var.m91788r(false);
            }
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, fxh0Var);
            boolean zM91766g = xq00Var.m91766g(strM54978M) | xq00Var.m91770i(d9mVar2) | xq00Var.m91770i(d9mVar);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91766g || objM91750T4 == ia7Var) {
                objM91750T4 = new o431(strM54978M, d9mVar2, d9mVar, 4);
                xq00Var.m91793t0(objM91750T4);
            }
            fxh0 fxh0VarM39673I = epv0.m39673I("sort_row_element_test_tag", zoz0.m96644b(fxh0VarM61822f, true, (gh00) objM91750T4));
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 48);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM39673I);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            boolean z6 = i7 == 2048;
            Object objM91750T5 = xq00Var.m91750T();
            if (z6 || objM91750T5 == ia7Var) {
                objM91750T5 = new sy11(17, gh00Var);
                xq00Var.m91793t0(objM91750T5);
            }
            u40 u40Var = u40.f226523c;
            peu peuVar = new peu(u40Var, (eh00) objM91750T5);
            wgu wguVar = wgu.f251150c;
            rgu rguVarM86517r = vvx.m86517r(xq00Var);
            float f = leu.m58816b(xq00Var).f117230b.f224759b;
            cxh0 cxh0Var2 = cxh0.f43038a;
            dyu.m37371c(peuVar, wguVar, epv0.m39673I("sort_order_button_test_tag", zsf1.m96832C(cxh0Var2, f, 0.0f, 0.0f, 0.0f, 14)), null, rguVarM86517r, null, null, null, nah.f152070a, null, rkk.m75772x(-1929189132, new od21(strM54977L, 4), xq00Var), xq00Var, 805306416, 48, 1496);
            xq00 xq00Var3 = xq00Var;
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            fr0.m42474r(1.0f, true, xq00Var3);
            if (z) {
                xq00Var3.m91771i0(-232211285);
                i6 = i7;
                boolean z7 = i6 == 2048;
                Object objM91750T6 = xq00Var3.m91750T();
                if (z7 || objM91750T6 == ia7Var) {
                    objM91750T6 = new sy11(18, gh00Var);
                    xq00Var3.m91793t0(objM91750T6);
                }
                cxh0Var = cxh0Var2;
                dyu.m37371c(new peu(u40Var, (eh00) objM91750T6), wguVar, epv0.m39673I("edit_button_test_tag", cxh0Var2), null, vvx.m86517r(xq00Var), null, null, null, null, null, nah.f152071b, xq00Var, 432, 48, 2008);
                xq00Var3 = xq00Var;
                z2 = false;
                xq00Var3.m91788r(false);
            } else {
                i6 = i7;
                cxh0Var = cxh0Var2;
                z2 = false;
                xq00Var3.m91771i0(-231834387);
                xq00Var3.m91788r(false);
            }
            int iOrdinal3 = xi3Var.ordinal();
            if (iOrdinal3 == 0) {
                wwuVar = lru.f136360c;
            } else {
                if (iOrdinal3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                wwuVar = pqu.f180425c;
            }
            boolean z8 = i6 == 2048 ? true : z2;
            Object objM91750T7 = xq00Var3.m91750T();
            if (z8 || objM91750T7 == ia7Var) {
                objM91750T7 = new sy11(19, gh00Var);
                xq00Var3.m91793t0(objM91750T7);
            }
            xq00 xq00Var4 = xq00Var3;
            riw0.m75607a(new peu(u40Var, (eh00) objM91750T7), wguVar, epv0.m39673I("view_density_button_test_tag", cxh0Var), null, vvx.m86517r(xq00Var3), null, false, null, null, rkk.m75772x(-1280850036, new w70(wwuVar, 13), xq00Var3), xq00Var4, 432, 6, 984);
            xq00Var2 = xq00Var4;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ugb0(wr31Var, xi3Var, z, gh00Var, fxh0Var, i, 19);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m97040c(int i, xq00 xq00Var) {
        xq00 xq00Var2;
        xq00Var.m91775k0(-2143848556);
        if (xq00Var.m91752Y(i & 1, i != 0)) {
            Context context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = context.getDrawable(R.drawable.library_sort_row_icon);
                xq00Var.m91793t0(objM91750T);
            }
            Drawable drawable = (Drawable) objM91750T;
            if (drawable != null) {
                xq00Var.m91771i0(-1228464287);
                xq00Var2 = xq00Var;
                upf.m83687d(xfs.m90512a(drawable, xq00Var), null, mi21.m61834r(vvx.m86517r(xq00Var).f199019d, cxh0.f43038a), null, null, 0.0f, new jm9(5, leu.m58815a(xq00Var).f112824b.f138757a), xq00Var2, 56, 56);
                xq00Var2.m91788r(false);
            } else {
                xq00Var2 = xq00Var;
                xq00Var2.m91771i0(-1228236530);
                xq00Var2.m91788r(false);
            }
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new evm0(i, 15, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m97041d(fk60 fk60Var, rr60 rr60Var, rr60 rr60Var2, String str) {
        ktz0 descriptor = rr60Var2.getDescriptor();
        q191.m71883A(fk60Var, descriptor);
        if (xuf1.m92165d(descriptor).contains(str)) {
            String strMo33226i = rr60Var.getDescriptor().mo33226i();
            String strMo33226i2 = rr60Var2.getDescriptor().mo33226i();
            throw new JsonEncodingException(dq60.m36616p(str, "'.", edb.m38573v("Class '", strMo33226i2, "' cannot be serialized ", (fk60Var.f70477a.f189475l == 2 && wj50.m88271j(strMo33226i, strMo33226i2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : dq60.m36608h('\'', "as base class '", strMo33226i), " because it has property name that conflicts with JSON class discriminator '")), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Object[] m97042e(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        bk5.m29636u0(0, i, 6, objArr, objArr2);
        bk5.m29629p0(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: renamed from: f */
    public static final Object[] m97043f(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        bk5.m29636u0(0, i, 6, objArr, objArr2);
        bk5.m29629p0(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: g */
    public static final Object[] m97044g(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        bk5.m29636u0(0, i, 6, objArr, objArr2);
        bk5.m29629p0(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: h */
    public static final Object[] m97045h(Object[] objArr, int i, int i2, mj91 mj91Var) {
        Object[] objArr2 = new Object[objArr.length - 1];
        bk5.m29636u0(0, i, 6, objArr, objArr2);
        bk5.m29629p0(i, i + 2, i2, objArr, objArr2);
        objArr2[i2 - 2] = mj91Var;
        bk5.m29629p0(i2 - 1, i2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: i */
    public static final Object[] m97046i(int i, int i2, Object obj, Object obj2, Object[] objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        bk5.m29629p0(i + 2, i + 1, objArr.length, objArrCopyOf, objArrCopyOf);
        bk5.m29629p0(i2 + 2, i2, i, objArrCopyOf, objArrCopyOf);
        objArrCopyOf[i2] = obj;
        objArrCopyOf[i2 + 1] = obj2;
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: j */
    public static final void m97047j(Throwable th, Object obj, Object obj2, String str) throws Throwable {
        String strMo29110D;
        String strMo29110D2 = null;
        if (obj != null) {
            strMo29110D = qpv0.f191387a.mo54112b(obj.getClass()).mo29110D();
        } else {
            strMo29110D = null;
        }
        if (obj2 != null) {
            strMo29110D2 = qpv0.f191387a.mo54112b(obj2.getClass()).mo29110D();
        }
        y85.m93061f(th, new ElementCrashContextException(dq60.m36618r(edb.m38573v("Element: ", str, ", Props: ", strMo29110D, ", State: "), strMo29110D2, ". ", "")));
        throw th;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m97048k(Throwable th, Object obj, Object obj2, String str) throws Throwable {
        m97047j(th, obj, obj2, str);
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public static final void m97049l(up60 up60Var) {
        String strMo29110D = up60Var.mo29110D();
        if (strMo29110D == null) {
            strMo29110D = up60Var.toString();
        }
        IllegalStateException illegalStateException = new IllegalStateException(edb.m38564m("ElementRuntime is disposed and should not be used anymore. Element: ", strMo29110D));
        String strMo29110D2 = up60Var.mo29110D();
        String strMo29111F = up60Var.mo29111F();
        if (strMo29111F == null) {
            strMo29111F = up60Var.toString();
        }
        illegalStateException.setStackTrace((StackTraceElement[]) bk5.m29599V0(new StackTraceElement[]{new StackTraceElement(strMo29110D2, "", s571.m77250i(strMo29111F, ".kt"), -1)}, illegalStateException.getStackTrace()));
        throw illegalStateException;
    }

    /* JADX INFO: renamed from: m */
    public static final void m97050m(k0e1 k0e1Var) {
        if (k0e1Var instanceof otz0) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (k0e1Var instanceof aer0) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (k0e1Var instanceof v8q0) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    /* JADX INFO: renamed from: n */
    public static final String m97051n(fk60 fk60Var, ktz0 ktz0Var) {
        for (Annotation annotation : ktz0Var.getAnnotations()) {
            if (annotation instanceof pk60) {
                return ((pk60) annotation).discriminator();
            }
        }
        return fk60Var.f70477a.f189472i;
    }

    /* JADX INFO: renamed from: o */
    public static hzd0 m97052o(djx0 djx0Var, fi00 fi00Var, o0e1 o0e1Var) {
        Object obj = new Object();
        hzd0 hzd0Var = new hzd0();
        hzd0Var.mo49264n(djx0Var, new nk90(o0e1Var, obj, fi00Var, hzd0Var));
        return hzd0Var;
    }

    /* JADX INFO: renamed from: p */
    public static t180 m97053p(st91 st91Var) {
        return new t180(st91Var, 23);
    }

    /* JADX INFO: renamed from: q */
    public static final Object m97054q(vb40 vb40Var, skp skpVar) {
        Object obj = vb40Var.f239417s.f87925a.get(skpVar);
        if (obj != null) {
            return obj;
        }
        Object obj2 = vb40Var.f239419u.f207348n.f87925a.get(skpVar);
        return obj2 == null ? skpVar.f210178b : obj2;
    }

    /* JADX INFO: renamed from: r */
    public static final Object m97055r(ivl0 ivl0Var, skp skpVar) {
        Object obj = ivl0Var.f106241j.f87925a.get(skpVar);
        return obj == null ? skpVar.f210178b : obj;
    }

    /* JADX INFO: renamed from: s */
    public static final Object m97056s(h5y h5yVar, skp skpVar) {
        Object obj = h5yVar.f87925a.get(skpVar);
        return obj == null ? skpVar.f210178b : obj;
    }

    /* JADX INFO: renamed from: t */
    public static uxy m97057t(float f) {
        return new uxy(1, f);
    }

    /* JADX INFO: renamed from: u */
    public static final int m97058u(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: renamed from: v */
    public static ObjectAnimator m97059v(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
    }

    /* JADX INFO: renamed from: w */
    public static uxy m97060w(float f) {
        return new uxy(3, f);
    }

    /* JADX INFO: renamed from: x */
    public static final Shader.TileMode m97061x(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3) {
            return Build.VERSION.SDK_INT >= 31 ? k04.m54920q() : Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: y */
    public static final wwu m97062y(String str) {
        switch (str.hashCode()) {
            case -2117384923:
                if (str.equals("TRENDING")) {
                    return dwu.f53749c;
                }
                return null;
            case -1853007448:
                if (str.equals("SEARCH")) {
                    return tuu.f223921c;
                }
                return null;
            case -132630821:
                if (str.equals("REPORT_ABUSE")) {
                    return ruu.f202910c;
                }
                return null;
            case 2458420:
                if (str.equals(ParsedQueryKt.INTENT_PLAY)) {
                    return psu.f180961c;
                }
                return null;
            case 2544381:
                if (str.equals("SHOW")) {
                    return cuu.f42218c;
                }
                return null;
            case 2614219:
                if (str.equals("USER")) {
                    return jwu.f116719c;
                }
                return null;
            case 81665115:
                if (str.equals("VIDEO")) {
                    return mwu.f147884c;
                }
                return null;
            case 231328061:
                if (str.equals("RELEASED")) {
                    return muu.f147437c;
                }
                return null;
            case 989877798:
                if (str.equals("ARROW_RIGHT")) {
                    return knu.f124473c;
                }
                return null;
            case 1055811561:
                if (str.equals("DISCOVER")) {
                    return qpu.f191379c;
                }
                return null;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    return nnu.f156491c;
                }
                return null;
            case 2056967449:
                if (str.equals("EVENTS")) {
                    return aqu.f18809c;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: z */
    public static final fxh0 m97063z(fxh0 fxh0Var) {
        return r9g1.m75068p(z520.m95414A(fxh0Var, e6u.f56740T0), hmx0.f93097a);
    }
}
