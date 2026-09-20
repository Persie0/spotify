package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class h15 implements uq7, Init, yh00, vd50, g4l0, xpa0, Predicate, Function, i7o0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f86515a;

    public /* synthetic */ h15(int i) {
        this.f86515a = i;
    }

    /* JADX INFO: renamed from: f */
    public static final String m46399f(char c, String str, String str2, Throwable th) {
        List list = Logger.f3009a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + 5);
        sb.append(c);
        sb.append(" [");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        if (th != null) {
            sb.append(' ');
            sb.append(Log.getStackTraceString(th));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public static ArrayList m46400k(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            b5q0 b5q0Var = (b5q0) ((d0w) obj).f44067D.mo30169a(b5q0.class);
            if (!(b5q0Var != null ? b5q0Var.f23644d : false)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static int m46401n(Intent intent) {
        if ("sonos-v1".equals(m46402o(intent))) {
            return 2;
        }
        if ("com.spotify.sso.action.START_GOOGLE_AUTH_FLOW_V1".equals(intent.getAction())) {
            return 3;
        }
        if (m46404q(intent.getDataString())) {
            return 4;
        }
        if ("1".equals(m46402o(intent))) {
            return 1;
        }
        return "google-assistant-v1".equals(m46402o(intent)) ? 5 : 6;
    }

    /* JADX INFO: renamed from: o */
    public static String m46402o(Intent intent) {
        return intent.getSerializableExtra("VERSION") instanceof Integer ? String.valueOf(intent.getIntExtra("VERSION", 0)) : intent.getStringExtra("VERSION");
    }

    /* JADX INFO: renamed from: p */
    public static boolean m46403p() {
        return Build.VERSION.SDK_INT >= 36;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m46404q(String str) {
        if (str != null && !str.isEmpty()) {
            Uri uri = Uri.parse(str);
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (uri.isHierarchical() && queryParameterNames.contains("client_id") && queryParameterNames.contains("scope")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static void m46405r(fo01 fo01Var, Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", fo01Var.f71390a);
        intent.putExtra("android.intent.extra.TEXT", fo01Var.f71391b + "\n" + fo01Var.f71393d);
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, null));
    }

    @Override // p204p.i7o0
    /* JADX INFO: renamed from: a */
    public h7o0 mo40751a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new s491(context, layoutInflater, viewGroup);
    }

    @Override // p204p.yh00
    public Object apply(Object obj) {
        int i;
        int i2;
        Set setM43736n1;
        int i3;
        int i4;
        int i5;
        uv11 uv11Var;
        int i6;
        uv11 uv11Var2;
        uv11 uv11Var3;
        r431 r431VarM49107f = null;
        switch (this.f86515a) {
            case 11:
                return t6x.f217618h.get(obj);
            case 23:
                List<fqx> listMo45450b = ((gqx) obj).mo45450b(uy80.class);
                ArrayList arrayList = new ArrayList();
                for (fqx fqxVar : listMo45450b) {
                    ktx ktxVar = fqxVar.f72301b;
                    pqm0 pqm0Var = ktxVar != null ? new pqm0(fqxVar.f72300a, ktxVar) : null;
                    if (pqm0Var != null) {
                        arrayList.add(pqm0Var);
                    }
                }
                Map mapM56705r0 = kkc0.m56705r0(arrayList);
                ArrayList arrayList2 = new ArrayList(mapM56705r0.size());
                for (Map.Entry entry : mapM56705r0.entrySet()) {
                    uy80 uy80Var = (uy80) entry.getValue();
                    String str = (String) entry.getKey();
                    String str2 = uy80Var.f235208d;
                    if (str2.length() == 0) {
                        str2 = uy80Var.f235205a;
                    }
                    String string = Html.fromHtml(str2, 0).toString();
                    String str3 = uy80Var.f235209e.f225257b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String string2 = Html.fromHtml(str2, 0).toString();
                    e1c e1cVar = e1c.f55174c;
                    arrayList2.add(new i1c(str3, "", string, str, lau.f131415a, string2, (String) null, 256));
                }
                return new efv0(arrayList2);
            default:
                iy21 iy21Var = (iy21) obj;
                n031 n031Var = iy21Var.f106829d;
                n031 n031Var2 = iy21Var.f106829d;
                r431 r431VarM49107f2 = r431.f195645a;
                r431 r431VarM49107f3 = n031Var != null ? hy21.m49107f(n031Var.f148876c) : r431VarM49107f2;
                r431 r431VarM49107f4 = n031Var2 != null ? hy21.m49107f(n031Var2.f148877d) : r431VarM49107f2;
                if (n031Var2 != null) {
                    r431VarM49107f2 = hy21.m49107f(n031Var2.f148878e);
                }
                r431 r431Var = r431VarM49107f2;
                r431 r431VarM49107f5 = (n031Var2 == null || (uv11Var3 = n031Var2.f148879f) == null) ? null : hy21.m49107f(uv11Var3);
                r431 r431VarM49107f6 = (n031Var2 == null || (uv11Var2 = n031Var2.f148880g) == null) ? null : hy21.m49107f(uv11Var2);
                int i7 = 3;
                if (n031Var2 == null || (i6 = n031Var2.f148881h) == 0) {
                    i = 0;
                } else {
                    int iM38547C = edb.m38547C(i6);
                    if (iM38547C == 0) {
                        i = 1;
                    } else if (iM38547C != 1) {
                        i = iM38547C != 2 ? 4 : 3;
                    } else {
                        i = 2;
                    }
                }
                if (n031Var2 != null && (uv11Var = n031Var2.f148882i) != null) {
                    r431VarM49107f = hy21.m49107f(uv11Var);
                }
                if (n031Var2 == null || (i5 = n031Var2.f148884k) == 0) {
                    i2 = 0;
                } else {
                    int iM38547C2 = edb.m38547C(i5);
                    if (iM38547C2 == 0) {
                        i2 = 1;
                    } else if (iM38547C2 != 1) {
                        i2 = iM38547C2 != 2 ? 4 : 3;
                    } else {
                        i2 = 2;
                    }
                }
                if (n031Var2 != null) {
                    Set set = n031Var2.f148885l;
                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(set, 10));
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(hy21.m49107f((uv11) it.next()));
                    }
                    setM43736n1 = g6f.m43736n1(arrayList3);
                } else {
                    setM43736n1 = gbu.f78413a;
                }
                Set set2 = setM43736n1;
                boolean z = n031Var2 != null ? n031Var2.f148886m : false;
                if (n031Var2 == null || (i4 = n031Var2.f148887n) == 0) {
                    i3 = 4;
                } else {
                    int iM38547C3 = edb.m38547C(i4);
                    if (iM38547C3 == 0) {
                        i7 = 1;
                    } else if (iM38547C3 == 1) {
                        i7 = 2;
                    } else if (iM38547C3 != 2) {
                        if (iM38547C3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i7 = 4;
                    }
                    i3 = i7;
                }
                return new s431(r431VarM49107f3, r431VarM49107f4, r431Var, r431VarM49107f5, r431VarM49107f6, i, r431VarM49107f, i2, set2, z, i3);
        }
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: c */
    public xul0 mo37748c(Uri uri, ar7 ar7Var) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String str = ar7Var.f18968c;
        if (str != null) {
            builderBuildUpon.appendQueryParameter("state", str);
        }
        builderBuildUpon.appendQueryParameter("code", ar7Var.f18966a);
        return xul0.m92201d(builderBuildUpon.build());
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        switch (this.f86515a) {
            case 13:
                mnn0 mnn0VarM62359a = mnn0.m62359a(i);
                return mnn0VarM62359a == null ? mnn0.UNRECOGNIZED : mnn0VarM62359a;
            default:
                n70 n70VarM63788a = n70.m63788a(i);
                return n70VarM63788a == null ? n70.UNRECOGNIZED : n70VarM63788a;
        }
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: d */
    public Bundle mo37749d(String str, String str2, int i, String str3) {
        Logger.m3966b("Url V1 doesn't support token response type", new Object[0]);
        throw new UnsupportedOperationException("Url V1 doesn't support token response");
    }

    @Override // p204p.xpa0
    /* JADX INFO: renamed from: e */
    public String mo46407e(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f86515a) {
            case 3:
                return First.m15574b((u2e) obj);
            default:
                return First.m15575c((z5b0) obj, bk5.m29624m1(new fcg1[]{k5b0.f119467g, i5b0.f98882g}));
        }
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: g */
    public Intent mo37750g(zew zewVar, String str, String str2) {
        return null;
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: i */
    public Bundle mo37751i(String str, String str2, String str3) {
        return null;
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: j */
    public Intent mo37752j(Bundle bundle) {
        return null;
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: m */
    public xul0 mo37753m(Uri uri, zew zewVar, String str) {
        String str2 = zewVar.f282142a;
        TextUtils.isEmpty(str);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        return xul0.m92201d(builderBuildUpon.appendQueryParameter("error", builderBuildUpon.toString()).build());
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        List list = ((wrl0) obj).f254385a;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((srl0) it.next()) == srl0.MESSAGES) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ h15(Object obj, int i) {
        this.f86515a = i;
    }

    @Override // p204p.xpa0
    /* JADX INFO: renamed from: b */
    public String mo46406b(String str) {
        return str;
    }

    @Override // p204p.g4l0
    /* JADX INFO: renamed from: h */
    public int mo43538h(int i) {
        return i;
    }

    @Override // p204p.g4l0
    /* JADX INFO: renamed from: l */
    public int mo43539l(int i) {
        return i;
    }
}
