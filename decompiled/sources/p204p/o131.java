package p204p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.smartshufflebutton.SmartShuffleButtonView;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class o131 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final o131 f160583L0;

    /* JADX INFO: renamed from: M0 */
    public static final o131 f160584M0;

    /* JADX INFO: renamed from: N0 */
    public static final o131 f160585N0;

    /* JADX INFO: renamed from: O0 */
    public static final o131 f160586O0;

    /* JADX INFO: renamed from: P0 */
    public static final o131 f160587P0;

    /* JADX INFO: renamed from: Q0 */
    public static final o131 f160588Q0;

    /* JADX INFO: renamed from: R0 */
    public static final o131 f160589R0;

    /* JADX INFO: renamed from: S0 */
    public static final o131 f160590S0;

    /* JADX INFO: renamed from: T0 */
    public static final o131 f160591T0;

    /* JADX INFO: renamed from: U0 */
    public static final o131 f160592U0;

    /* JADX INFO: renamed from: V0 */
    public static final o131 f160593V0;

    /* JADX INFO: renamed from: W0 */
    public static final o131 f160594W0;

    /* JADX INFO: renamed from: X */
    public static final o131 f160595X;

    /* JADX INFO: renamed from: X0 */
    public static final o131 f160596X0;

    /* JADX INFO: renamed from: Y */
    public static final o131 f160597Y;

    /* JADX INFO: renamed from: Y0 */
    public static final o131 f160598Y0;

    /* JADX INFO: renamed from: Z */
    public static final o131 f160599Z;

    /* JADX INFO: renamed from: Z0 */
    public static final o131 f160600Z0;

    /* JADX INFO: renamed from: a1 */
    public static final o131 f160601a1;

    /* JADX INFO: renamed from: b */
    public static final o131 f160602b;

    /* JADX INFO: renamed from: b1 */
    public static final o131 f160603b1;

    /* JADX INFO: renamed from: c */
    public static final o131 f160604c;

    /* JADX INFO: renamed from: c1 */
    public static final o131 f160605c1;

    /* JADX INFO: renamed from: d */
    public static final o131 f160606d;

    /* JADX INFO: renamed from: e */
    public static final o131 f160607e;

    /* JADX INFO: renamed from: f */
    public static final o131 f160608f;

    /* JADX INFO: renamed from: g */
    public static final o131 f160609g;

    /* JADX INFO: renamed from: h */
    public static final o131 f160610h;

    /* JADX INFO: renamed from: i */
    public static final o131 f160611i;

    /* JADX INFO: renamed from: t */
    public static final o131 f160612t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f160613a;

    static {
        int i = 1;
        f160602b = new o131(i, 0);
        f160604c = new o131(i, 1);
        f160606d = new o131(i, 2);
        f160607e = new o131(i, 3);
        f160608f = new o131(i, 4);
        f160609g = new o131(i, 5);
        f160610h = new o131(i, 6);
        f160611i = new o131(i, 7);
        f160612t = new o131(i, 8);
        f160595X = new o131(i, 9);
        f160597Y = new o131(i, 10);
        f160599Z = new o131(i, 11);
        f160583L0 = new o131(i, 12);
        f160584M0 = new o131(i, 13);
        f160585N0 = new o131(i, 14);
        f160586O0 = new o131(i, 15);
        f160587P0 = new o131(i, 16);
        f160588Q0 = new o131(i, 17);
        f160589R0 = new o131(i, 18);
        f160590S0 = new o131(i, 19);
        f160591T0 = new o131(i, 20);
        f160592U0 = new o131(i, 21);
        f160593V0 = new o131(i, 22);
        f160594W0 = new o131(i, 23);
        f160596X0 = new o131(i, 24);
        f160598Y0 = new o131(i, 25);
        f160600Z0 = new o131(i, 26);
        f160601a1 = new o131(i, 27);
        f160603b1 = new o131(i, 28);
        f160605c1 = new o131(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o131(int i, int i2) {
        super(i);
        this.f160613a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Single singleError;
        Single singleError2;
        switch (this.f160613a) {
            case 0:
                k131 k131Var = new k131(false);
                r431 r431Var = r431.f195645a;
                return new d131("", "", (gue) k131Var, false, new s431(r431Var, r431Var, r431.f195646b), 40);
            case 1:
                return (d131) obj;
            case 2:
                return (a131) obj;
            case 3:
                return (hz80) obj;
            case 4:
                return new e131(((ty80) obj).f224877f.f271256a);
            case 5:
                return Boolean.valueOf(obj instanceof hz80);
            case 6:
                if (obj != null) {
                    return (hz80) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
            case 7:
                List list = ((qu80) obj).f192599e.f271280y.f12711a;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((u580) it.next()).f226939a);
                }
                return arrayList;
            case 8:
                nb81 nb81Var = (nb81) obj;
                String str = nb81Var.f152211a;
                String str2 = nb81Var.f152212b;
                String str3 = nb81Var.f152213c;
                String str4 = nb81Var.f152214d;
                String str5 = nb81Var.f152215e;
                String str6 = nb81Var.f152217g;
                String str7 = nb81Var.f152216f;
                cav0 cav0Var = nb81Var.f152218h;
                boolean z = false;
                if (cav0Var == cav0.f35938b) {
                    z = true;
                }
                return new bp81(str, str2, str3, str7, str4, str5, str6, z, cav0Var == cav0.f35937a);
            case 9:
                return ((nb81) obj).f152212b;
            case 10:
                ((Number) obj).intValue();
                return null;
            case 11:
                return ((cb81) obj).f36046a;
            case 12:
                return new l331(((c7k0) obj).f34942a.f139520a);
            case 13:
                return gbu.f78413a;
            case 14:
                String strM38000d0 = e72.m38000d0((ContextTrack) obj, ContextTrack.Metadata.KEY_CONTEXT_URI);
                wj50.m88279p(strM38000d0);
                return strM38000d0;
            case 15:
                return ((nw80) obj).f159052f;
            case 16:
                Logger.m3966b(edb.m38564m("Failed sending Smart Shuffle reset signal, ", ((j2x0) obj).mo27977b()), new Object[0]);
                return w2a1.f247311a;
            case 17:
                Logger.m3965a("Success sending Smart Shuffle reset signal", new Object[0]);
                return w2a1.f247311a;
            case 18:
                Context context = (Context) obj;
                SmartShuffleButtonView smartShuffleButtonView = new SmartShuffleButtonView(context, null, 0, 6, null);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.header_action_row_button_size);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.header_action_row_button_padding);
                smartShuffleButtonView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                smartShuffleButtonView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                return smartShuffleButtonView;
            case 19:
                return w2a1.f247311a;
            case 20:
                ag31 ag31Var = (ag31) obj;
                return Boolean.valueOf((ag31Var instanceof lf31) || (ag31Var instanceof yf31));
            case 21:
                ag31 ag31Var2 = (ag31) obj;
                if (ag31Var2 instanceof yf31) {
                    yf31 yf31Var = (yf31) ag31Var2;
                    singleError = Single.just(new aal(yf31Var.f272113a, yf31Var.f272114b));
                } else {
                    singleError = ag31Var2 instanceof lf31 ? Single.error(((lf31) ag31Var2).f132792a) : Single.error(x9l.f259395a);
                }
                wj50.m88279p(singleError);
                return singleError;
            case 22:
                ag31 ag31Var3 = (ag31) obj;
                return Boolean.valueOf((ag31Var3 instanceof mf31) || (ag31Var3 instanceof xf31));
            case 23:
                ag31 ag31Var4 = (ag31) obj;
                if (ag31Var4 instanceof mf31) {
                    singleError2 = Single.error(((mf31) ag31Var4).f142944a);
                } else if (ag31Var4 instanceof xf31) {
                    xf31 xf31Var = (xf31) ag31Var4;
                    singleError2 = Single.just(new kcl(xf31Var.f260824a, xf31Var.f260825b));
                } else {
                    singleError2 = Single.error(x9l.f259395a);
                }
                wj50.m88279p(singleError2);
                return singleError2;
            case 24:
                return w2a1.f247311a;
            case 25:
                jpz0.m53990d((mpz0) obj);
                return w2a1.f247311a;
            case 26:
                return Integer.valueOf(((t5o0) obj).mo49586U());
            case 27:
                return ((xk31) obj).f262267a;
            case 28:
                return ((xk31) obj).f262267a;
            default:
                return Boolean.valueOf(obj instanceof v140);
        }
    }
}
