package p204p;

import android.view.View;
import android.view.WindowInsets;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.GridSection;
import androidx.car.app.model.Header;
import androidx.car.app.model.OnItemVisibilityChangedDelegateImpl;
import androidx.car.app.model.Row;
import androidx.car.app.model.RowSection;
import androidx.car.app.model.SectionHeader;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.fragment.app.FragmentContainerView;
import androidx.media3.common.ParserException;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.msgpack.core.MessagePack;
import p000.C1635n;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ofg1 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f164760a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: b */
    public static final byte[] f164761b = {0, 0, 33, 7, MessagePack.Code.INT64, 17, -122, 68, MessagePack.Code.EXT16, MessagePack.Code.NEVER_USED, MessagePack.Code.FLOAT32, 0, 0, 0};

    /* JADX INFO: renamed from: c */
    public static sd40 f164762c;

    /* JADX INFO: renamed from: d */
    public static sd40 f164763d;

    /* JADX INFO: renamed from: a */
    public static final void m66832a(sl7 sl7Var, eh00 eh00Var, fyf fyfVar, fyf fyfVar2, vh00 vh00Var, xq00 xq00Var, int i) {
        fyf fyfVar3;
        fyf fyfVar4;
        vh00 vh00Var2;
        yum0 yum0Var;
        xq00Var.m91775k0(1813726486);
        int i2 = i | (xq00Var.m91766g(sl7Var) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | 24576;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            fyf fyfVar5 = l3g.f129329a;
            Object[] objArr = new Object[0];
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = z67.f279744h;
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) dul.m37018u(objArr, (eh00) objM91750T, xq00Var, 48);
            yum0 yum0Var2 = sl7Var.f210311g;
            zl7 zl7Var = (zl7) yum0Var2.getValue();
            boolean zM91766g = xq00Var.m91766g(yum0Var2) | xq00Var.m91766g(kqi0Var) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91766g || objM91750T2 == obj) {
                yum0Var = yum0Var2;
                objM91750T2 = new f81(eh00Var, yum0Var, kqi0Var, null, 17);
                xq00Var.m91793t0(objM91750T2);
            } else {
                yum0Var = yum0Var2;
            }
            hz40.m49237i(zl7Var, (th00) objM91750T2, xq00Var);
            zl7 zl7Var2 = (zl7) yum0Var.getValue();
            if (zl7Var2 instanceof wl7) {
                xq00Var.m91771i0(-765542319);
                fyfVar3 = fyfVar;
                fyfVar3.mo24510D0(zl7Var2, xq00Var, 48);
                xq00Var.m91788r(false);
                fyfVar4 = fyfVar2;
            } else {
                fyfVar3 = fyfVar;
                if (zl7Var2 instanceof xl7) {
                    xq00Var.m91771i0(-765539936);
                    Boolean bool = (Boolean) kqi0Var.getValue();
                    bool.getClass();
                    fyfVar4 = fyfVar2;
                    fyfVar4.mo24818M(zl7Var2, bool, xq00Var, 384);
                    xq00Var.m91788r(false);
                } else {
                    fyfVar4 = fyfVar2;
                    if (!(zl7Var2 instanceof yl7)) {
                        throw lq51.m59703i(-765544491, xq00Var, false);
                    }
                    xq00Var.m91771i0(-765537365);
                    fyfVar5.mo24510D0(zl7Var2, xq00Var, 48);
                    xq00Var.m91788r(false);
                }
            }
            vh00Var2 = fyfVar5;
        } else {
            fyfVar3 = fyfVar;
            fyfVar4 = fyfVar2;
            xq00Var.m91757b0();
            vh00Var2 = vh00Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1635n(sl7Var, eh00Var, fyfVar3, fyfVar4, vh00Var2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m66833b(String str, String str2, String str3, bhb0 bhb0Var, boolean z, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        String str4;
        String str5;
        bhb0 bhb0Var2;
        boolean z2;
        xq00Var.m91775k0(-1136492815);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= xq00Var.m91766g(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            str5 = str3;
            i2 |= xq00Var.m91766g(str5) ? 256 : 128;
        } else {
            str5 = str3;
        }
        if ((i & 3072) == 0) {
            bhb0Var2 = bhb0Var;
            i2 |= xq00Var.m91766g(bhb0Var2) ? 2048 : 1024;
        } else {
            bhb0Var2 = bhb0Var;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= xq00Var.m91768h(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 131072 : 65536;
        }
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            boolean z3 = (i2 & 458752) == 131072;
            Object objM91750T = xq00Var.m91750T();
            if (z3 || objM91750T == t6x0.f217647t) {
                objM91750T = new fza0(7, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            dgu.m35938b((eh00) objM91750T, null, null, false, false, 0.0f, false, null, false, false, null, rkk.m75772x(-915321104, new xs1(bhb0Var2, str, str4, str5, z2, gh00Var), xq00Var), xq00Var, 0, 48, Entity.AUTOCOMPLETE_FIELD_NUMBER);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ms1(str, str2, str3, bhb0Var, z, gh00Var, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final iuo m66834c(String str) {
        if (str.equals("LOGGED_OUT")) {
            return iuo.LOGGED_OUT;
        }
        if (str.equals("LOGGED_IN")) {
            return iuo.LOGGED_IN;
        }
        if (str.equals("PRE_PLAYBACK")) {
            return iuo.PRE_PLAYBACK;
        }
        if (str.equals("PLAYING")) {
            return iuo.PLAYING;
        }
        throw new IllegalArgumentException(s571.m77251j("Cannot convert \"", str, "\" to session stage"));
    }

    /* JADX INFO: renamed from: d */
    public static final String m66835d(iuo iuoVar) {
        return iuoVar.f106011a;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m66836e(d5y d5yVar) {
        l2n0 l2n0Var = new l2n0(8);
        int i = zkq.m96331f(d5yVar, l2n0Var).f283803a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        d5yVar.mo35039i(0, l2n0Var.f129054a, 4);
        l2n0Var.m57930R(0);
        int iM57945q = l2n0Var.m57945q();
        if (iM57945q == 1463899717) {
            return true;
        }
        yif1.m93808r("Unsupported form type: " + iM57945q);
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final void m66837f(o3m0 o3m0Var, y400 y400Var, ArrayList arrayList) {
        if (o3m0Var instanceof q3m0) {
            ((q3m0) o3m0Var).mo69069b(y400Var, arrayList);
        } else {
            arrayList.addAll(o3m0Var.mo66191c(y400Var));
        }
    }

    /* JADX INFO: renamed from: g */
    public static final GridSection m66838g(String str, List list, int i, eh00 eh00Var, SectionHeader sectionHeader) {
        i020 i020Var = new i020();
        i020Var.f97101f = 1;
        i020Var.f97102g = 1;
        if (sectionHeader != null) {
            i020Var.f150644c = sectionHeader;
        } else if (str == null) {
            i020Var.f150643b = null;
        } else {
            CarText carTextCreate = CarText.create(str);
            uzb.f235457e.m84293b(carTextCreate);
            i020Var.f150643b = carTextCreate;
        }
        i020Var.f97101f = i;
        i020Var.f97102g = 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i020Var.f150642a.add((GridItem) it.next());
        }
        i020Var.f150646e = OnItemVisibilityChangedDelegateImpl.create(new tg7(eh00Var));
        return new GridSection(i020Var, 0);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m66839h(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ms2.m62680e(f8, f26, (f6 * f28) - (f7 * f27), f30);
            fArr2[1] = o7t0.m66394h(f4, f26, (f3 * f27) + ((-f2) * f28), f30);
            fArr2[2] = ms2.m62680e(f16, f20, (f14 * f22) - (f15 * f21), f30);
            fArr2[3] = o7t0.m66394h(f12, f20, (f11 * f21) + ((-f10) * f22), f30);
            float f31 = -f5;
            fArr2[4] = o7t0.m66394h(f8, f24, (f7 * f25) + (f31 * f28), f30);
            fArr2[5] = ms2.m62680e(f4, f24, (f28 * f) - (f3 * f25), f30);
            float f32 = -f13;
            fArr2[6] = o7t0.m66394h(f16, f18, (f15 * f19) + (f32 * f22), f30);
            fArr2[7] = ms2.m62680e(f12, f18, (f9 * f22) - (f11 * f19), f30);
            fArr2[8] = ms2.m62680e(f8, f23, (f5 * f27) - (f6 * f25), f30);
            fArr2[9] = o7t0.m66394h(f4, f23, (f25 * f2) + ((-f) * f27), f30);
            fArr2[10] = ms2.m62680e(f16, f17, (f13 * f21) - (f14 * f19), f30);
            fArr2[11] = o7t0.m66394h(f12, f17, (f19 * f10) + ((-f9) * f21), f30);
            fArr2[12] = o7t0.m66394h(f7, f23, (f6 * f24) + (f31 * f26), f30);
            fArr2[13] = ms2.m62680e(f3, f23, (f * f26) - (f2 * f24), f30);
            fArr2[14] = o7t0.m66394h(f15, f17, (f14 * f18) + (f32 * f20), f30);
            fArr2[15] = ms2.m62680e(f11, f17, (f9 * f20) - (f10 * f18), f30);
        }
        return !(f29 == 0.0f);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m66840i(o3m0 o3m0Var, y400 y400Var) {
        if (o3m0Var instanceof q3m0) {
            return ((q3m0) o3m0Var).mo69068a(y400Var);
        }
        ArrayList arrayList = new ArrayList();
        m66837f(o3m0Var, y400Var, arrayList);
        return arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: j */
    public static RowSection m66841j(String str, List list, String str2, eh00 eh00Var, SectionHeader sectionHeader, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            eh00Var = null;
        }
        if ((i & 16) != 0) {
            sectionHeader = null;
        }
        qrx0 qrx0Var = new qrx0();
        if (sectionHeader != null) {
            qrx0Var.f150644c = sectionHeader;
        } else if (str != null) {
            CarText carTextCreate = CarText.create(str);
            uzb.f235457e.m84293b(carTextCreate);
            qrx0Var.f150643b = carTextCreate;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qrx0Var.f150642a.add((Row) it.next());
        }
        qrx0Var.f150646e = OnItemVisibilityChangedDelegateImpl.create(new vg7(eh00Var));
        if (str2 != null) {
            CarText carTextCreate2 = CarText.create(str2);
            uzb.f235457e.m84293b(carTextCreate2);
            qrx0Var.f150645d = carTextCreate2;
        }
        return qrx0Var.m73661a();
    }

    /* JADX INFO: renamed from: k */
    public static WindowInsets m66842k(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, FragmentContainerView fragmentContainerView, WindowInsets windowInsets) {
        return onApplyWindowInsetsListener.onApplyWindowInsets(fragmentContainerView, windowInsets);
    }

    /* JADX INFO: renamed from: l */
    public static gu51 m66843l(String str) {
        return new gu51(str, iag1.f100255a);
    }

    /* JADX INFO: renamed from: m */
    public static final List m66844m(Map map, fk60 fk60Var) {
        Object c6x0Var;
        String str = (String) map.get("prompts");
        lau lauVar = lau.f131415a;
        if (str == null) {
            return lauVar;
        }
        try {
            c6x0Var = (List) fk60Var.m41880a(str, new mj5(sks0.Companion.serializer(), 0));
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Object obj = lauVar;
        if (!(c6x0Var instanceof c6x0)) {
            obj = c6x0Var;
        }
        return (List) obj;
    }

    /* JADX INFO: renamed from: n */
    public static final x4y m66845n(xq00 xq00Var) {
        Object[] objArr = new Object[0];
        t9y0 t9y0Var = x4y.f258216b;
        Object objM91750T = xq00Var.m91750T();
        if (objM91750T == t6x0.f217647t) {
            objM91750T = y2e.f268592i;
            xq00Var.m91793t0(objM91750T);
        }
        return (x4y) dul.m37020w(objArr, t9y0Var, (eh00) objM91750T, xq00Var, 384);
    }

    /* JADX INFO: renamed from: o */
    public static final void m66846o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException("null not expected: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: p */
    public static SectionedItemTemplate m66847p(List list) {
        e8b e8bVar = new e8b(R.string.cal_errors_something_went_wrong);
        Header headerM96740o = zqg1.m96740o(null, Action.BACK, null, 5);
        y9z0 y9z0Var = new y9z0();
        qrx0 qrx0Var = new qrx0();
        CharSequence charSequenceM69036v = p3h1.m69036v(e8bVar);
        if (charSequenceM69036v == null) {
            qrx0Var.f150645d = null;
        } else {
            CarText carTextCreate = CarText.create(charSequenceM69036v);
            uzb.f235457e.m84293b(carTextCreate);
            qrx0Var.f150645d = carTextCreate;
        }
        y9z0Var.f270698a = Collections.singletonList(qrx0Var.m73661a());
        y9z0Var.f270700c = headerM96740o;
        n80.f151281o.m63817a(list);
        y9z0Var.f270699b = list;
        return y9z0Var.m93162a();
    }

    /* JADX INFO: renamed from: q */
    public static SectionedItemTemplate m66848q(boolean z, Header header, List list, List list2, int i) {
        if ((i & 2) != 0) {
            header = null;
        }
        if ((i & 8) != 0) {
            list2 = lau.f131415a;
        }
        y9z0 y9z0Var = new y9z0();
        if (header != null) {
            y9z0Var.f270700c = header;
        }
        y9z0Var.f270698a = list2;
        y9z0Var.f270701d = z;
        n80.f151281o.m63817a(list);
        y9z0Var.f270699b = list;
        y9z0Var.f270702e = false;
        y9z0Var.f270703f = 1;
        return y9z0Var.m93162a();
    }

    /* JADX INFO: renamed from: r */
    public static zkq m66849r(int i, d5y d5yVar, l2n0 l2n0Var) throws ParserException {
        zkq zkqVarM96331f = zkq.m96331f(d5yVar, l2n0Var);
        while (true) {
            int i2 = zkqVarM96331f.f283803a;
            if (i2 == i) {
                return zkqVarM96331f;
            }
            ei6.m39077n(i2, "Ignoring unknown WAV chunk: ");
            long j = zkqVarM96331f.f283804b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.m755d("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            d5yVar.mo35044v((int) j2);
            zkqVarM96331f = zkq.m96331f(d5yVar, l2n0Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final ArrayList m66850s(List list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            Iterator it = ((f2b1) obj).mo30507a().iterator();
            while (it.hasNext()) {
                arrayList.add("[" + i + "] " + ((String) it.next()));
            }
            i = i2;
        }
        return arrayList;
    }
}
