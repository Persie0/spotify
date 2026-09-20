package p204p;

import android.net.Uri;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.SearchTemplate;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wcg1 {

    /* JADX INFO: renamed from: a */
    public static final x8x f250051a = new x8x(3);

    /* JADX INFO: renamed from: b */
    public static sd40 f250052b;

    /* JADX INFO: renamed from: c */
    public static sd40 f250053c;

    /* JADX INFO: renamed from: a */
    public static final void m87736a(int i, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1725452990);
        int i2 = i | 48;
        boolean z2 = false;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            EnumC1976ie enumC1976ieM53044a = AbstractC2124me.m61534c(xq00Var).m53044a();
            if (enumC1976ieM53044a.compareTo(EnumC1976ie.f101281e) >= 0 && enumC1976ieM53044a.compareTo(EnumC1976ie.f101285i) <= 0) {
                z2 = true;
            }
            boolean z3 = !z2;
            long j = leu.m58815a(xq00Var).f112823a.f229875b.f123094b;
            kyu kyuVar = new kyu(null, 1, null, null, 26);
            fyf fyfVarM75772x = rkk.m75772x(-397494518, new yye(j, z3, z), xq00Var);
            fyf fyfVarM75772x2 = rkk.m75772x(-153957655, new zye(z, j, 0), xq00Var);
            fyf fyfVarM75772x3 = rkk.m75772x(576652934, new zye(z, j, 1), xq00Var);
            fxh0Var2 = cxh0.f43038a;
            p711.m69222a(fxh0Var2, kyuVar, null, false, null, null, null, null, null, null, null, fyfVarM75772x, fyfVarM75772x2, null, null, fyfVarM75772x3, xq00Var, 70, 197040, 26620);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fl3(z, fxh0Var2, i, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m87737b(snb1 snb1Var, eh00 eh00Var, fxh0 fxh0Var, int i, xq00 xq00Var, int i2, int i3) {
        int i4;
        xq00Var.m91775k0(2046395941);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? xq00Var.m91766g(snb1Var) : xq00Var.m91770i(snb1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        int i5 = i4 | 384;
        int i6 = i3 & 8;
        if (i6 != 0) {
            i5 = i4 | 3456;
        } else if ((i2 & 3072) == 0) {
            i5 |= xq00Var.m91762e(i == 0 ? -1 : edb.m38547C(i)) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i5 & 1, (i5 & 1171) != 1170)) {
            if (i6 != 0) {
                i = 1;
            }
            qiu.m72876b(18, rkk.m75772x(-739385126, new sbu(i, snb1Var, eh00Var), xq00Var), xq00Var, 54);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        int i7 = i;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new aj0(snb1Var, eh00Var, fxh0Var2, i7, i2, i3, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m87738c(fs20 fs20Var, fs20 fs20Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00 xq00Var2;
        xq00Var.m91775k0(-990207985);
        int i2 = (xq00Var.m91766g(fs20Var) ? 4 : 2) | i | (xq00Var.m91766g(fs20Var2) ? 32 : 16) | (xq00Var.m91770i(fxh0Var) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            xq00Var2 = xq00Var;
            iyg1.m51914a(mi21.m61822f(1.0f, fxh0Var), null, rkk.m75772x(-922129179, new ks1(fs20Var2, fs20Var.f72752b == 1, fs20Var, 28), xq00Var), xq00Var2, 3072, 6);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new szl0(fs20Var, fs20Var2, fxh0Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m87739d(fs20 fs20Var, fs20 fs20Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        ryu ryuVar;
        ryu ryuVar2;
        xq00 xq00Var2 = xq00Var;
        int i2 = fs20Var.f72752b;
        xq00Var2.m91775k0(-966184513);
        int i3 = i | (xq00Var2.m91766g(fs20Var) ? 4 : 2) | (xq00Var2.m91766g(fs20Var2) ? 32 : 16) | (xq00Var2.m91770i(fxh0Var) ? 256 : 128);
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z = i2 == 1;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, fxh0Var);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM61822f);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            Uri uri = Uri.parse(fs20Var2.f72751a);
            if (z) {
                xq00Var2.m91771i0(-1154222696);
                xq00Var2.m91788r(false);
                ryuVar = null;
            } else {
                xq00Var2.m91771i0(-868516116);
                ryuVar = new ryu(33, leu.m58816b(xq00Var2).f117234f.f148186b, leu.m58816b(xq00Var2).f117234f.f148185a);
                xq00Var2.m91788r(false);
            }
            gfp gfpVar = leu.f132721a;
            ofu ofuVarM44635a = gfpVar.m44635a();
            cxu cxuVarM28032o = b3h1.m28032o(fs20Var2.f72752b, xq00Var2);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f2 = mi21.m61822f(0.55f, cxh0Var);
            wb9 wb9Var = d7f0.f46184t;
            ryu ryuVar3 = ryuVar;
            pha phaVar = pha.f177517a;
            fxh0 fxh0VarMo34315F = phaVar.mo66945a(fxh0VarM61822f2, wb9Var).mo34315F(z ? r9g1.m75068p(cxh0Var, hmx0.f93097a) : cxh0Var);
            qgj qgjVar = qgj.f188480a;
            l0y0.m57821c(uri, qgjVar, fxh0VarMo34315F, null, ryuVar3, ofuVarM44635a, null, null, null, cxuVarM28032o, false, false, xq00Var2, 1073744944, 0, 3520);
            Uri uri2 = Uri.parse(fs20Var.f72751a);
            if (z) {
                xq00Var2.m91771i0(-1153728680);
                xq00Var2.m91788r(false);
                ryuVar2 = null;
            } else {
                xq00Var2.m91771i0(-868500180);
                ryu ryuVar4 = new ryu(33, leu.m58816b(xq00Var2).f117234f.f148186b, leu.m58816b(xq00Var2).f117234f.f148185a);
                xq00Var2.m91788r(false);
                ryuVar2 = ryuVar4;
            }
            ofu ofuVarM44635a2 = gfpVar.m44635a();
            cxu cxuVarM28032o2 = b3h1.m28032o(i2, xq00Var2);
            fxh0 fxh0VarMo66945a = phaVar.mo66945a(mi21.m61822f(0.55f, cxh0Var), d7f0.f46172h);
            if (z) {
                fxh0VarMo66945a = fxh0VarMo66945a.mo34315F(r9g1.m75068p(cxh0Var, hmx0.f93097a));
            }
            l0y0.m57821c(uri2, qgjVar, fxh0VarMo66945a, null, ryuVar2, ofuVarM44635a2, null, null, null, cxuVarM28032o2, false, false, xq00Var2, 1073744944, 0, 3520);
            xq00Var2 = xq00Var2;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new szl0(fs20Var, fs20Var2, fxh0Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final fxh0 m87740e(fxh0 fxh0Var, boolean z, long j) {
        return z ? xtm0.m92060G(fxh0Var, j, null, 14) : nec.m64246i(fxh0Var, j, kxf1.f127485a);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m87741f(k7i0 k7i0Var) {
        return k7i0Var.f120136b.f109603a instanceof ti51;
    }

    /* JADX INFO: renamed from: g */
    public static zz11 m87742g() {
        zz11 zz11Var = new zz11(22);
        zz11Var.f287861b = -1;
        return zz11Var;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m87743h(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: i */
    public static final StackTraceElement m87744i(ly8 ly8Var) {
        int iIntValue;
        String strM57054c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        kpo kpoVar = (kpo) ly8Var.getClass().getAnnotation(kpo.class);
        String str = null;
        if (kpoVar == null || kpoVar.m57058v() < 1) {
            return null;
        }
        try {
            Field declaredField = ly8Var.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(ly8Var);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? kpoVar.m57056l()[iIntValue] : -1;
        li80 li80Var = wjf1.f251963b;
        li80 li80Var2 = wjf1.f251962a;
        if (li80Var == null) {
            try {
                li80 li80Var3 = new li80(Class.class.getDeclaredMethod("getModule", null), ly8Var.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), ly8Var.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 28);
                wjf1.f251963b = li80Var3;
                li80Var = li80Var3;
            } catch (Exception unused2) {
                wjf1.f251963b = li80Var2;
                li80Var = li80Var2;
            }
        }
        if (li80Var != li80Var2 && (method = (Method) li80Var.f133740b) != null && (objInvoke = method.invoke(ly8Var.getClass(), null)) != null && (method2 = (Method) li80Var.f133741c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) li80Var.f133742d;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM57054c = kpoVar.m57054c();
        } else {
            strM57054c = str + '/' + kpoVar.m57054c();
        }
        return new StackTraceElement(strM57054c, kpoVar.m57057m(), kpoVar.m57055f(), i);
    }

    /* JADX INFO: renamed from: j */
    public static int m87745j(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: k */
    public static final i5x m87746k(scs0 scs0Var) {
        return mhf1.m61771p(scs0Var).m94133b(obs0.f163706c, kir0.f123049N0);
    }

    /* JADX INFO: renamed from: l */
    public static SearchTemplate m87747l(String str, ArrayList arrayList, h8b h8bVar, String str2, wiy0 wiy0Var, int i) {
        Iterable<kr50> iterable = arrayList;
        if ((i & 2) != 0) {
            iterable = lau.f131415a;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        p2z0 p2z0Var = new p2z0(wiy0Var);
        p2z0Var.f173482e = true;
        Action action = Action.BACK;
        n80 n80Var = n80.f151278l;
        Objects.requireNonNull(action);
        n80Var.m63817a(Collections.singletonList(action));
        p2z0Var.f173483f = action;
        p2z0Var.f173480c = str;
        ys50 ys50Var = new ys50();
        if (h8bVar != null) {
            CharSequence charSequenceM69036v = p3h1.m69036v(h8bVar);
            Objects.requireNonNull(charSequenceM69036v);
            ys50Var.f275693e = CarText.create(charSequenceM69036v);
            for (kr50 kr50Var : iterable) {
                Objects.requireNonNull(kr50Var);
                ys50Var.f275689a.add(kr50Var);
            }
        }
        ItemList itemListM94429a = ys50Var.m94429a();
        frx0 frx0Var = frx0.f72675e;
        frx0Var.getClass();
        if (itemListM94429a.getOnSelectedDelegate() != null && !frx0Var.f72678c) {
            throw new IllegalArgumentException("Selectable lists are not allowed");
        }
        frx0Var.m42515a(itemListM94429a.getItems());
        p2z0Var.f173481d = itemListM94429a;
        if (str2 != null) {
            p2z0Var.f173479b = str2;
            p2z0Var.f173482e = false;
        }
        return new SearchTemplate(p2z0Var);
    }

    /* JADX INFO: renamed from: m */
    public static final uxq m87748m(g50 g50Var) {
        uxq uxqVar = (uxq) kd60.f121624d.get(g50Var);
        return uxqVar == null ? vxq.m86676g(g50Var) : uxqVar;
    }
}
