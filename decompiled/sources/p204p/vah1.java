package p204p;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.PlatformSpanStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import com.spotify.base.java.logging.Logger;
import com.spotify.notifications.models.preferences.Item$Group;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.io.File;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class vah1 implements Function, Predicate, qt8 {

    /* JADX INFO: renamed from: c */
    public static final vah1 f239275c;

    /* JADX INFO: renamed from: d */
    public static final vah1 f239276d;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f239277a;

    /* JADX INFO: renamed from: b */
    public String f239278b;

    static {
        int i = 0;
        f239275c = new vah1("IEEE_P1363", i);
        f239276d = new vah1("DER", i);
    }

    public /* synthetic */ vah1(String str, int i) {
        this.f239277a = i;
        this.f239278b = str;
    }

    /* JADX INFO: renamed from: d */
    public static String m85081d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = s571.m77252k(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return klh.m56834f(str, " : ", str2);
    }

    /* JADX INFO: renamed from: a */
    public void m85082a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            m85081d(this.f239278b, str, objArr);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f239277a) {
            case 1:
                return ((gqx) obj).mo45449a(jyj.class, this.f239278b);
            case 2:
                s6x0 s6x0Var = (s6x0) obj;
                wj50.m88279p(s6x0Var);
                Object obj2 = s6x0Var.f206218a;
                String str = this.f239278b;
                Throwable thM77348a = s6x0.m77348a(obj2);
                if (thM77348a == null) {
                    return Maybe.m23363f((File) obj2);
                }
                Logger.m3967c(thM77348a, "Failed to load file:\n ".concat(str), new Object[0]);
                return MaybeEmpty.f8264a;
            case 3:
                Logger.m3967c((Throwable) obj, s571.m77251j("Couldn't resolve '", this.f239278b, "' for artist"), new Object[0]);
                return lau.f131415a;
            case 4:
                String str2 = this.f239278b;
                zhl zhlVar = new zhl(str2);
                z98 z98Var = (z98) ((gqx) obj).mo45449a(z98.class, str2).f72301b;
                if (z98Var == null) {
                    throw new IllegalStateException("Failed to retrieve available releases");
                }
                ArrayList arrayList = z98Var.f280706a;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = ((y98) it.next()).f270527a;
                    arrayList2.add(new o8w0(str3, str3));
                }
                ArrayList arrayList3 = new ArrayList();
                int i = 0;
                for (Object obj3 : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    j6f.m52564V(h6f.m46715L((r8w0) obj3, new p8w0(String.valueOf(i))), arrayList3);
                    i = i2;
                }
                return new w7w0(zhlVar, gbu.f78413a, g6f.m43731l0(1, arrayList3));
            case 5:
                return this.f239278b;
            case 6:
                String str4 = this.f239278b;
                wq50 wq50VarM50022o = ia7.m50022o((Item$Group) obj, str4);
                if (wq50VarM50022o != null) {
                    return wq50VarM50022o;
                }
                throw new IllegalArgumentException("Not found V8 category with categoryKey = ".concat(str4).toString());
            case 7:
                bw20 bw20Var = (bw20) ((gqx) obj).mo45449a(bw20.class, this.f239278b).f72301b;
                return Boolean.valueOf(bw20Var != null && bw20Var.f31501a);
            case 8:
                y5f y5fVar = (y5f) ((Map) obj).get(this.f239278b);
                return y5fVar == null ? new y5f(false, false, false) : y5fVar;
            case 9:
            case 16:
            default:
                d0w d0wVar = (d0w) ((Map) obj).get(this.f239278b);
                return d0wVar == null ? yzv.f277906d : d0wVar.f44065B;
            case 10:
                return ((gqx) obj).mo45449a(erc1.class, this.f239278b);
            case 11:
                gqx gqxVar = (gqx) obj;
                String str5 = this.f239278b;
                return new lm11((jyj) gqxVar.mo45449a(jyj.class, str5).f72301b, (fs11) gqxVar.mo45449a(fs11.class, str5).f72301b, (v140) gqxVar.mo45449a(v140.class, str5).f72301b, (dc7) gqxVar.mo45449a(dc7.class, str5).f72301b, (wso0) gqxVar.mo45449a(wso0.class, str5).f72301b, (y7t0) gqxVar.mo45449a(y7t0.class, str5).f72301b, (daj) gqxVar.mo45449a(daj.class, str5).f72301b, (ee7) gqxVar.mo45449a(ee7.class, str5).f72301b, (he7) gqxVar.mo45449a(he7.class, str5).f72301b, (l97) gqxVar.mo45449a(l97.class, str5).f72301b, (ok11) gqxVar.mo45449a(ok11.class, str5).f72301b, (s5q0) gqxVar.mo45449a(s5q0.class, str5).f72301b, (z2q0) gqxVar.mo45449a(z2q0.class, str5).f72301b, (pad1) gqxVar.mo45449a(pad1.class, str5).f72301b, (erc1) gqxVar.mo45449a(erc1.class, str5).f72301b, (vcr0) gqxVar.mo45449a(vcr0.class, str5).f72301b);
            case 12:
                xul0 xul0Var = (xul0) obj;
                return xul0Var.mo49279c() ? Single.just(xul0Var.mo49278b()) : Single.error(new C1889g9(s571.m77251j("The filter with id ", this.f239278b, " could not be found locally"), 5));
            case 13:
                y5f y5fVar2 = (y5f) ((Map) obj).get(this.f239278b);
                return Boolean.valueOf(y5fVar2 != null ? y5fVar2.f269417a : false);
            case 14:
                y5f y5fVar3 = (y5f) ((Map) obj).get(this.f239278b);
                return y5fVar3 == null ? c810.f35072c : y5fVar3;
            case 15:
                y5f y5fVar4 = (y5f) ((Map) obj).get(this.f239278b);
                return Boolean.valueOf(y5fVar4 != null ? y5fVar4.f269417a : true);
            case 17:
                gqx gqxVar2 = (gqx) obj;
                List<fqx> listMo45450b = gqxVar2.mo45450b(i43.class);
                ArrayList arrayList4 = new ArrayList();
                for (fqx fqxVar : listMo45450b) {
                    ktx ktxVar = fqxVar.f72301b;
                    pqm0 pqm0Var = ktxVar != null ? new pqm0(fqxVar.f72300a, ktxVar) : null;
                    if (pqm0Var != null) {
                        arrayList4.add(pqm0Var);
                    }
                }
                Map mapM56705r0 = kkc0.m56705r0(arrayList4);
                ArrayList arrayList5 = new ArrayList(mapM56705r0.size());
                Iterator it2 = mapM56705r0.entrySet().iterator();
                while (true) {
                    String str6 = "";
                    if (!it2.hasNext()) {
                        List<fqx> listMo45450b2 = gqxVar2.mo45450b(d73.class);
                        ArrayList arrayList6 = new ArrayList();
                        for (fqx fqxVar2 : listMo45450b2) {
                            ktx ktxVar2 = fqxVar2.f72301b;
                            pqm0 pqm0Var2 = ktxVar2 != null ? new pqm0(fqxVar2.f72300a, ktxVar2) : null;
                            if (pqm0Var2 != null) {
                                arrayList6.add(pqm0Var2);
                            }
                        }
                        Map mapM56705r1 = kkc0.m56705r0(arrayList6);
                        String str7 = this.f239278b;
                        ArrayList arrayList7 = new ArrayList(mapM56705r1.size());
                        for (Map.Entry entry : mapM56705r1.entrySet()) {
                            String str8 = ((d73) entry.getValue()).f45973c.f256622c;
                            arrayList7.add(new f3c(((d73) entry.getValue()).f45971a, ((d73) entry.getValue()).f45972b, str8 == null ? "" : str8, ((d73) entry.getValue()).f45975e, new glo(((d73) entry.getValue()).f45976f.f92713a, ((d73) entry.getValue()).f45976f.f92714b, ((d73) entry.getValue()).f45976f.f92715c), wj50.m88271j(((d73) entry.getValue()).f45971a, str7), ((d73) entry.getValue()).f45978h));
                        }
                        return g6f.m43700N0(arrayList7, arrayList5);
                    }
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    String str9 = ((i43) entry2.getValue()).f98397a;
                    String str10 = ((i43) entry2.getValue()).f98398b.f95837b;
                    String str11 = ((i43) entry2.getValue()).f98398b.f95839d.f256622c;
                    if (str11 != null) {
                        str6 = str11;
                    }
                    arrayList5.add(new g3c(str9, str10, str6, ((i43) entry2.getValue()).f98398b.f95838c));
                }
                break;
            case 18:
                return this.f239278b;
            case 19:
                z2q0 z2q0Var = (z2q0) ((gqx) obj).mo45449a(z2q0.class, this.f239278b).f72301b;
                return z2q0Var != null ? h8u0.m46850b(z2q0Var) : eau0.f57728a;
        }
    }

    @Override // p204p.qt8
    /* JADX INFO: renamed from: b */
    public j15 mo26895b(xq00 xq00Var) {
        xq00Var.m91771i0(-1074197378);
        String str = this.f239278b;
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayListM79995j = t3d1.m79995j();
        new ArrayList();
        long j = 0;
        int i = 8;
        int i2 = 0;
        arrayListM79995j.add(new f15(i2, str.length(), i, new ew31(leu.m58815a(xq00Var).f112824b.f138757a, j, leu.m58818d(xq00Var).f64974j.f101704a.f63412c, leu.m58818d(xq00Var).f64974j.f101704a.f63413d, (FontSynthesis) null, leu.m58818d(xq00Var).f64974j.f101704a.f63415f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490), null));
        sb.append(str);
        String string = sb.toString();
        ArrayList arrayList = new ArrayList(arrayListM79995j.size());
        int size = arrayListM79995j.size();
        for (int iM62683h = 0; iM62683h < size; iM62683h = ms2.m62683h(sb, (f15) arrayListM79995j.get(iM62683h), arrayList, iM62683h, 1)) {
        }
        j15 j15Var = new j15(string, arrayList);
        xq00Var.m91788r(false);
        return j15Var;
    }

    /* JADX INFO: renamed from: c */
    public void m85083c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            m85081d(this.f239278b, str, objArr);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f239277a) {
            case 9:
                return this.f239278b.equals(((api) obj).mo26689e());
            default:
                return wj50.m88271j(this.f239278b, ((PlayerState) obj).contextUri());
        }
    }

    public String toString() {
        switch (this.f239277a) {
            case 0:
                return this.f239278b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ vah1(String str, int i, Object obj) {
        this.f239277a = i;
        this.f239278b = str;
    }

    public vah1(String str) {
        this.f239277a = 23;
        this.f239278b = edb.m38560i(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }
}
