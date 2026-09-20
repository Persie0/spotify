package p204p;

import android.widget.TextView;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.AuthorMetadata;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.Comment;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class a53 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12411a;

    /* JADX INFO: renamed from: b */
    public static final a53 f12400b = new a53(0);

    /* JADX INFO: renamed from: c */
    public static final a53 f12402c = new a53(1);

    /* JADX INFO: renamed from: d */
    public static final a53 f12404d = new a53(2);

    /* JADX INFO: renamed from: e */
    public static final a53 f12405e = new a53(3);

    /* JADX INFO: renamed from: f */
    public static final a53 f12406f = new a53(4);

    /* JADX INFO: renamed from: g */
    public static final a53 f12407g = new a53(5);

    /* JADX INFO: renamed from: h */
    public static final a53 f12408h = new a53(6);

    /* JADX INFO: renamed from: i */
    public static final a53 f12409i = new a53(7);

    /* JADX INFO: renamed from: t */
    public static final a53 f12410t = new a53(8);

    /* JADX INFO: renamed from: X */
    public static final a53 f12393X = new a53(9);

    /* JADX INFO: renamed from: Y */
    public static final a53 f12395Y = new a53(10);

    /* JADX INFO: renamed from: Z */
    public static final a53 f12397Z = new a53(11);

    /* JADX INFO: renamed from: L0 */
    public static final a53 f12381L0 = new a53(12);

    /* JADX INFO: renamed from: M0 */
    public static final a53 f12382M0 = new a53(13);

    /* JADX INFO: renamed from: N0 */
    public static final a53 f12383N0 = new a53(14);

    /* JADX INFO: renamed from: O0 */
    public static final a53 f12384O0 = new a53(15);

    /* JADX INFO: renamed from: P0 */
    public static final a53 f12385P0 = new a53(16);

    /* JADX INFO: renamed from: Q0 */
    public static final a53 f12386Q0 = new a53(17);

    /* JADX INFO: renamed from: R0 */
    public static final a53 f12387R0 = new a53(18);

    /* JADX INFO: renamed from: S0 */
    public static final a53 f12388S0 = new a53(19);

    /* JADX INFO: renamed from: T0 */
    public static final a53 f12389T0 = new a53(20);

    /* JADX INFO: renamed from: U0 */
    public static final a53 f12390U0 = new a53(21);

    /* JADX INFO: renamed from: V0 */
    public static final a53 f12391V0 = new a53(22);

    /* JADX INFO: renamed from: W0 */
    public static final a53 f12392W0 = new a53(23);

    /* JADX INFO: renamed from: X0 */
    public static final a53 f12394X0 = new a53(24);

    /* JADX INFO: renamed from: Y0 */
    public static final a53 f12396Y0 = new a53(25);

    /* JADX INFO: renamed from: Z0 */
    public static final a53 f12398Z0 = new a53(26);

    /* JADX INFO: renamed from: a1 */
    public static final a53 f12399a1 = new a53(27);

    /* JADX INFO: renamed from: b1 */
    public static final a53 f12401b1 = new a53(28);

    /* JADX INFO: renamed from: c1 */
    public static final a53 f12403c1 = new a53(29);

    public /* synthetic */ a53(int i) {
        this.f12411a = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        String string;
        Class<?> declaringClass;
        List listM46715L;
        int i = this.f12411a;
        lau lauVar = lau.f131415a;
        boolean z = false;
        int i2 = 1;
        switch (i) {
            case 0:
                return Boolean.valueOf(obj instanceof tim0);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                } else {
                    string = value instanceof Object[] ? Arrays.toString((Object[]) value) : value.toString();
                }
                return str + '=' + string;
            case 2:
                int i3 = ara.f18984l;
                return Boolean.valueOf(g6f.m43725i0(ox31.f170868f, nec.m64249l((eab) obj)));
            case 3:
                eab eabVar = (eab) obj;
                if (eabVar instanceof mi00) {
                    int i4 = ara.f18984l;
                    if (g6f.m43725i0(ox31.f170868f, nec.m64249l(eabVar))) {
                        z = true;
                    }
                } else {
                    int i5 = ara.f18984l;
                }
                return Boolean.valueOf(z);
            case 4:
                n95 n95Var = g6b.f77007a;
                return new cq60((Class) obj);
            case 5:
                n95 n95Var2 = g6b.f77007a;
                return new gr60((Class) obj);
            case 6:
                return upf.m83704u((cq60) g6b.f77007a.m63903n((Class) obj), lauVar, false, lauVar, null);
            case 7:
                return upf.m83704u((cq60) g6b.f77007a.m63903n((Class) obj), lauVar, true, lauVar, null);
            case 8:
                n95 n95Var3 = g6b.f77007a;
                return new ConcurrentHashMap();
            case 9:
                up60 up60Var = (up60) obj;
                if (!up60Var.mo29114n() || (declaringClass = ((ife) up60Var).mo28587A().getDeclaringClass()) == null) {
                    return null;
                }
                return qpv0.f191387a.mo54112b(declaringClass);
            case 10:
                return ((up60) obj).getTypeParameters();
            case 11:
                d6a1 d6a1Var = (d6a1) obj;
                wj50.m88279p(d6a1Var);
                return Boolean.valueOf(d6a1Var.mo36063C0() instanceof vwb);
            case 12:
                return null;
            case 13:
                return null;
            case 14:
                return null;
            case 15:
                return Boolean.valueOf(gyf1.m46153s((eab) obj));
            case 16:
                vhf vhfVar = (vhf) obj;
                List list = vhfVar.f241509a;
                Comment comment = (Comment) g6f.m43745s0(list);
                if (comment != null && comment.m22138B()) {
                    return Collections.singletonList(ohf.f165421b);
                }
                ArrayList<Comment> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((Comment) obj2).m22138B()) {
                        arrayList.add(obj2);
                    }
                }
                int i6 = vhfVar.f241511c;
                boolean z2 = vhfVar.f241512d;
                ov71 ov71Var = vhfVar.f241513e;
                ArrayList arrayList2 = new ArrayList();
                for (Comment comment2 : arrayList) {
                    int iM22139C = comment2.m22139C();
                    if (iM22139C == 0) {
                        listM46715L = Collections.singletonList(new jhf(comment2, i6, z2 && !comment2.m22151z(), ov71Var));
                    } else {
                        ae50<AuthorMetadata> ae50VarM22143G = comment2.m22143G();
                        ArrayList arrayList3 = new ArrayList();
                        for (AuthorMetadata authorMetadata : ae50VarM22143G) {
                            wj50.m88279p(authorMetadata);
                            uku ukuVarM59070u = lig1.m59070u(authorMetadata);
                            if (ukuVarM59070u != null) {
                                arrayList3.add(ukuVarM59070u);
                            }
                        }
                        listM46715L = h6f.m46715L(new jhf(comment2, i6, z2 && !comment2.m22151z(), ov71Var), new nhf(iM22139C, comment2.m22147u(), opo.m67574x(arrayList3)));
                    }
                    j6f.m52564V(listM46715L, arrayList2);
                }
                return arrayList2;
            case 17:
                return lig1.m59069t((yhf) obj);
            case 18:
                return new ek5((l25) obj, i2);
            case 19:
                return Boolean.valueOf(obj instanceof stj);
            case 20:
                Object objM29583F0 = bk5.m29583F0(((TypeVariable) obj).getBounds());
                if (objM29583F0 instanceof TypeVariable) {
                    return (TypeVariable) objM29583F0;
                }
                return null;
            case 21:
                Class cls = (Class) obj;
                if (Modifier.isStatic(cls.getModifiers())) {
                    return null;
                }
                return cls.getDeclaringClass();
            case 22:
                return bk5.m29613h0(((Class) obj).getTypeParameters());
            case 23:
                Type ownerType = ((ParameterizedType) obj).getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 24:
                return bk5.m29620k1(((ParameterizedType) obj).getActualTypeArguments());
            case 25:
                return ((a970) obj).f13502e;
            case 26:
                return ((a970) obj).f13500c;
            case 27:
                return Boolean.valueOf(obj instanceof TextView);
            case 28:
                gd70 gd70Var = (gd70) obj;
                jxq jxqVar = jxq.f117170c;
                return gd70Var;
            default:
                jxq jxqVar2 = jxq.f117170c;
                return "";
        }
    }
}
