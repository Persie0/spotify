package p204p;

import android.net.Uri;
import android.os.Parcelable;
import com.spotify.player.model.PlayerState;
import com.spotify.signup.signup.p150v2.proto.FieldError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class xr11 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final xr11 f265200L0;

    /* JADX INFO: renamed from: M0 */
    public static final xr11 f265201M0;

    /* JADX INFO: renamed from: N0 */
    public static final xr11 f265202N0;

    /* JADX INFO: renamed from: O0 */
    public static final xr11 f265203O0;

    /* JADX INFO: renamed from: P0 */
    public static final xr11 f265204P0;

    /* JADX INFO: renamed from: Q0 */
    public static final xr11 f265205Q0;

    /* JADX INFO: renamed from: R0 */
    public static final xr11 f265206R0;

    /* JADX INFO: renamed from: S0 */
    public static final xr11 f265207S0;

    /* JADX INFO: renamed from: T0 */
    public static final xr11 f265208T0;

    /* JADX INFO: renamed from: U0 */
    public static final xr11 f265209U0;

    /* JADX INFO: renamed from: V0 */
    public static final xr11 f265210V0;

    /* JADX INFO: renamed from: W0 */
    public static final xr11 f265211W0;

    /* JADX INFO: renamed from: X */
    public static final xr11 f265212X;

    /* JADX INFO: renamed from: X0 */
    public static final xr11 f265213X0;

    /* JADX INFO: renamed from: Y */
    public static final xr11 f265214Y;

    /* JADX INFO: renamed from: Y0 */
    public static final xr11 f265215Y0;

    /* JADX INFO: renamed from: Z */
    public static final xr11 f265216Z;

    /* JADX INFO: renamed from: Z0 */
    public static final xr11 f265217Z0;

    /* JADX INFO: renamed from: a1 */
    public static final xr11 f265218a1;

    /* JADX INFO: renamed from: b */
    public static final xr11 f265219b;

    /* JADX INFO: renamed from: b1 */
    public static final xr11 f265220b1;

    /* JADX INFO: renamed from: c */
    public static final xr11 f265221c;

    /* JADX INFO: renamed from: c1 */
    public static final xr11 f265222c1;

    /* JADX INFO: renamed from: d */
    public static final xr11 f265223d;

    /* JADX INFO: renamed from: e */
    public static final xr11 f265224e;

    /* JADX INFO: renamed from: f */
    public static final xr11 f265225f;

    /* JADX INFO: renamed from: g */
    public static final xr11 f265226g;

    /* JADX INFO: renamed from: h */
    public static final xr11 f265227h;

    /* JADX INFO: renamed from: i */
    public static final xr11 f265228i;

    /* JADX INFO: renamed from: t */
    public static final xr11 f265229t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f265230a;

    static {
        int i = 1;
        f265219b = new xr11(i, 0);
        f265221c = new xr11(i, 1);
        f265223d = new xr11(i, 2);
        f265224e = new xr11(i, 3);
        f265225f = new xr11(i, 4);
        f265226g = new xr11(i, 5);
        f265227h = new xr11(i, 6);
        f265228i = new xr11(i, 7);
        f265229t = new xr11(i, 8);
        f265212X = new xr11(i, 9);
        f265214Y = new xr11(i, 10);
        f265216Z = new xr11(i, 11);
        f265200L0 = new xr11(i, 12);
        f265201M0 = new xr11(i, 13);
        f265202N0 = new xr11(i, 14);
        f265203O0 = new xr11(i, 15);
        f265204P0 = new xr11(i, 16);
        f265205Q0 = new xr11(i, 17);
        f265206R0 = new xr11(i, 18);
        f265207S0 = new xr11(i, 19);
        f265208T0 = new xr11(i, 20);
        f265209U0 = new xr11(i, 21);
        f265210V0 = new xr11(i, 22);
        f265211W0 = new xr11(i, 23);
        f265213X0 = new xr11(i, 24);
        f265215Y0 = new xr11(i, 25);
        f265217Z0 = new xr11(i, 26);
        f265218a1 = new xr11(i, 27);
        f265220b1 = new xr11(i, 28);
        f265222c1 = new xr11(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr11(int i, int i2) {
        super(i);
        this.f265230a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object next;
        switch (this.f265230a) {
            case 0:
                return "campfire-include-in-suggestions";
            case 1:
                return new ysk(Boolean.valueOf(((String) obj).equals("1")), 27);
            case 2:
                return ((rch0) obj).m75308e();
            case 3:
                return new yr11("spotify:local-files");
            case 4:
                return w2a1.f247311a;
            case 5:
                return Collections.singletonMap(1, Collections.singleton(((gt11) obj).f84076c.f30987d));
            case 6:
                lu11 lu11Var = (lu11) obj;
                return new mu11(lu11Var.f136957a, lu11Var.f136958b, false, lu11Var.f136959c);
            case 7:
                return ku11.f126433a;
            case 8:
                return ((ht11) obj).f94897c;
            case 9:
                return Collections.singletonMap(1, Collections.singleton(((ht11) obj).f94897c.f30987d));
            case 10:
                return new udh0(new g4h0(new vch0((st91) obj, 7)));
            case 11:
                return "shuffle-algorithm";
            case 12:
                String str = (String) obj;
                List list = dv11.f53339e;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((bv11) it.next()).f31253a);
                }
                Iterator it2 = av11.f20071e.iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                    if (((av11) next).f20072a.equals(str)) {
                        return new ysk(Integer.valueOf(arrayList.indexOf((av11) next)), 27);
                    }
                }
                next = null;
                return new ysk(Integer.valueOf(arrayList.indexOf((av11) next)), 27);
            case 13:
                return new jv11(iv11.f106067a, false, false);
            case 14:
                return lw11.f137433a;
            case 15:
                return pp91.m70529j(new pqm0("parcelable", (Parcelable) obj));
            case 16:
                return w2a1.f247311a;
            case 17:
                return ((qy11) obj).f193784a.f234804f.mo27463a();
            case 18:
                return new ry11((qy11) obj, ty11.f224802b);
            case 19:
                iz11 iz11Var = (iz11) obj;
                pqm0 pqm0Var = new pqm0("username", iz11Var.f107103a);
                pqm0 pqm0Var2 = new pqm0("imageUri", iz11Var.f107104b);
                pqm0 pqm0Var3 = new pqm0("displayName", iz11Var.f107105c);
                n6f n6fVar = iz11Var.f107106d;
                return pp91.m70529j(pqm0Var, pqm0Var2, pqm0Var3, new pqm0("backgroundColor", Integer.valueOf(n6fVar != null ? rfg1.m75429D(n6fVar.f150873a) : 0)));
            case 20:
                return new rz11((String) null, (Uri) null, (String) null, (n6f) null, ((qz11) obj).f194088a, 47);
            case 21:
                rz11 rz11Var = (rz11) obj;
                pqm0 pqm0Var4 = new pqm0("username", rz11Var.f204029a);
                pqm0 pqm0Var5 = new pqm0("imageUri", rz11Var.f204030b);
                pqm0 pqm0Var6 = new pqm0("displayName", rz11Var.f204031c);
                n6f n6fVar2 = rz11Var.f204032d;
                return pp91.m70529j(pqm0Var4, pqm0Var5, pqm0Var6, new pqm0("backgroundColor", Integer.valueOf(n6fVar2 != null ? rfg1.m75429D(n6fVar2.f150873a) : 0)));
            case 22:
                ((jtp) obj).m54301a(f265209U0, al11.f16710Q0);
                return w2a1.f247311a;
            case 23:
                return Boolean.valueOf(((rz11) obj).f204033e.f287441a instanceof xy11);
            case 24:
                return ((FieldError) obj).getMessage();
            case 25:
                return ((FieldError) obj).getMessage();
            case 26:
                return ((FieldError) obj).getMessage();
            case 27:
                return rb21.f197429a;
            case 28:
                return ((qb21) obj).f186984a;
            default:
                return rkk.m75761m((PlayerState) obj);
        }
    }
}
