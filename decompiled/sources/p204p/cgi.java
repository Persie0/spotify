package p204p;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class cgi extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final cgi f37667L0;

    /* JADX INFO: renamed from: M0 */
    public static final cgi f37668M0;

    /* JADX INFO: renamed from: N0 */
    public static final cgi f37669N0;

    /* JADX INFO: renamed from: O0 */
    public static final cgi f37670O0;

    /* JADX INFO: renamed from: P0 */
    public static final cgi f37671P0;

    /* JADX INFO: renamed from: Q0 */
    public static final cgi f37672Q0;

    /* JADX INFO: renamed from: R0 */
    public static final cgi f37673R0;

    /* JADX INFO: renamed from: S0 */
    public static final cgi f37674S0;

    /* JADX INFO: renamed from: T0 */
    public static final cgi f37675T0;

    /* JADX INFO: renamed from: U0 */
    public static final cgi f37676U0;

    /* JADX INFO: renamed from: V0 */
    public static final cgi f37677V0;

    /* JADX INFO: renamed from: W0 */
    public static final cgi f37678W0;

    /* JADX INFO: renamed from: X */
    public static final cgi f37679X;

    /* JADX INFO: renamed from: X0 */
    public static final cgi f37680X0;

    /* JADX INFO: renamed from: Y */
    public static final cgi f37681Y;

    /* JADX INFO: renamed from: Y0 */
    public static final cgi f37682Y0;

    /* JADX INFO: renamed from: Z */
    public static final cgi f37683Z;

    /* JADX INFO: renamed from: Z0 */
    public static final cgi f37684Z0;

    /* JADX INFO: renamed from: a1 */
    public static final cgi f37685a1;

    /* JADX INFO: renamed from: b */
    public static final cgi f37686b;

    /* JADX INFO: renamed from: b1 */
    public static final cgi f37687b1;

    /* JADX INFO: renamed from: c */
    public static final cgi f37688c;

    /* JADX INFO: renamed from: c1 */
    public static final cgi f37689c1;

    /* JADX INFO: renamed from: d */
    public static final cgi f37690d;

    /* JADX INFO: renamed from: e */
    public static final cgi f37691e;

    /* JADX INFO: renamed from: f */
    public static final cgi f37692f;

    /* JADX INFO: renamed from: g */
    public static final cgi f37693g;

    /* JADX INFO: renamed from: h */
    public static final cgi f37694h;

    /* JADX INFO: renamed from: i */
    public static final cgi f37695i;

    /* JADX INFO: renamed from: t */
    public static final cgi f37696t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37697a;

    static {
        int i = 1;
        f37686b = new cgi(i, 0);
        f37688c = new cgi(i, 1);
        f37690d = new cgi(i, 2);
        f37691e = new cgi(i, 3);
        f37692f = new cgi(i, 4);
        f37693g = new cgi(i, 5);
        f37694h = new cgi(i, 6);
        f37695i = new cgi(i, 7);
        f37696t = new cgi(i, 8);
        f37679X = new cgi(i, 9);
        f37681Y = new cgi(i, 10);
        f37683Z = new cgi(i, 11);
        f37667L0 = new cgi(i, 12);
        f37668M0 = new cgi(i, 13);
        f37669N0 = new cgi(i, 14);
        f37670O0 = new cgi(i, 15);
        f37671P0 = new cgi(i, 16);
        f37672Q0 = new cgi(i, 17);
        f37673R0 = new cgi(i, 18);
        f37674S0 = new cgi(i, 19);
        f37675T0 = new cgi(i, 20);
        f37676U0 = new cgi(i, 21);
        f37677V0 = new cgi(i, 22);
        f37678W0 = new cgi(i, 23);
        f37680X0 = new cgi(i, 24);
        f37682Y0 = new cgi(i, 25);
        f37684Z0 = new cgi(i, 26);
        f37685a1 = new cgi(i, 27);
        f37687b1 = new cgi(i, 28);
        f37689c1 = new cgi(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cgi(int i, int i2) {
        super(i);
        this.f37697a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Map map;
        switch (this.f37697a) {
            case 0:
                return ((bl90) obj).f28133c;
            case 1:
                km51 km51Var = (km51) obj;
                String str = null;
                im51 im51Var = km51Var instanceof im51 ? (im51) km51Var : null;
                if (im51Var != null && (map = im51Var.f103603i) != null) {
                    str = (String) map.get("concert_uri");
                }
                return Boolean.valueOf(true ^ (str == null || str.length() == 0));
            case 2:
                return new iz80((String) obj);
            case 3:
                return (hz80) obj;
            case 4:
                return Boolean.valueOf(obj instanceof hz80);
            case 5:
                if (obj != null) {
                    return (hz80) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
            case 6:
                Context context = (Context) obj;
                ContextMenuButton contextMenuButton = new ContextMenuButton(context, null, 0, 6, null);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.toolbar_icons_size);
                contextMenuButton.setScaleType(ImageView.ScaleType.CENTER);
                contextMenuButton.setImageDrawable(iqg1.m51376r(context, vc41.MORE_ANDROID, android.R.color.white, dimensionPixelSize));
                int dimensionPixelSize2 = contextMenuButton.getContext().getResources().getDimensionPixelSize(R.dimen.min_touch_target_size);
                contextMenuButton.setMinimumHeight(dimensionPixelSize2);
                contextMenuButton.setMinimumWidth(dimensionPixelSize2);
                return contextMenuButton;
            case 7:
                return new ysk(Boolean.TRUE, 27);
            case 8:
                bmi bmiVar = (bmi) obj;
                Bundle bundle = new Bundle();
                bundle.putParcelable("preview", bmiVar.f28539b);
                bundle.putParcelable("voice", bmiVar.f28541d);
                bundle.putParcelable("schedule", bmiVar.f28542e);
                qf40<dp11> qf40Var = bmiVar.f28540c;
                ArrayList arrayList = new ArrayList(i6f.m49804T(qf40Var, 10));
                for (dp11 dp11Var : qf40Var) {
                    arrayList.add(new tum0(dp11Var.f51150a, dp11Var.f51151b, dp11Var.f51152c, dp11Var.f51153d, dp11Var.f51154e, dp11Var.f51155f));
                }
                bundle.putParcelableArrayList("shows", new ArrayList<>(arrayList));
                dp11 dp11Var2 = bmiVar.f28543f;
                bundle.putParcelable("selected_show", new tum0(dp11Var2.f51150a, dp11Var2.f51151b, dp11Var2.f51152c, dp11Var2.f51153d, dp11Var2.f51154e, dp11Var2.f51155f));
                bundle.putString("bottom_sheet_state", bmiVar.f28551n.name());
                bundle.putInt("selected_artwork_carousel_index", bmiVar.f28557t);
                bundle.putParcelableArrayList("recommended_tools", new ArrayList<>(bmiVar.f28559v));
                bundle.putStringArrayList("selected_tool_ids", new ArrayList<>(bmiVar.f28560w));
                bundle.putStringArrayList("interacted_tool_ids", new ArrayList<>(bmiVar.f28561x));
                bundle.putBoolean("has_tool_selection_override", bmiVar.f28562y);
                qf40<x1j> qf40Var2 = bmiVar.f28563z;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(qf40Var2, 10));
                for (x1j x1jVar : qf40Var2) {
                    arrayList2.add(new gum0(x1jVar.f257206a, x1jVar.f257207b, x1jVar.f257208c, x1jVar.f257209d, x1jVar.f257211f, x1jVar.f257212g, x1jVar.f257210e, x1jVar.f257213h));
                }
                bundle.putParcelableArrayList("connector_apps", new ArrayList<>(arrayList2));
                bundle.putString("location", bmiVar.f28537C);
                u8c u8cVar = bmiVar.f28556s;
                r8c r8cVar = u8cVar instanceof r8c ? (r8c) u8cVar : null;
                if (r8cVar != null) {
                    g86 g86Var = r8cVar.f196762a;
                    bundle.putString("uploaded_artwork_carousel_image_url", g86Var.f77414a);
                    bundle.putString("uploaded_artwork_carousel_artwork_id", g86Var.f77415b);
                }
                return bundle;
            case 9:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 10:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 11:
                return xoc1.f264061c6.f243453a;
            case 12:
                return Boolean.valueOf(!((Set) obj).isEmpty());
            case 13:
                ((Number) obj).doubleValue();
                return w2a1.f247311a;
            case 14:
                jpz0.m54007u((mpz0) obj, 0);
                return w2a1.f247311a;
            case 15:
                return w2a1.f247311a;
            case 16:
                return w2a1.f247311a;
            case 17:
                return "spotify:internal:bluejay:connector-apps:authentication";
            case 18:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 19:
                return xoc1.f264077e6.f243453a;
            case 20:
                return new y9j();
            case 21:
                rh20 rh20Var = (rh20) obj;
                return Boolean.valueOf((rh20Var instanceof oh20) || (rh20Var instanceof ph20));
            case 22:
                return (String) obj;
            case 23:
                return (String) obj;
            case 24:
                return Boolean.valueOf((obj instanceof v140) || (obj instanceof w2a1));
            case 25:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 26:
                return Boolean.valueOf(obj instanceof byv);
            case 27:
                if (obj != null) {
                    return (byv) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.entitytypetrait.EntityTypeTrait");
            case 28:
                return ((Boolean) obj).booleanValue() ? irr.f105046c : irr.f105044a;
            default:
                return ((Boolean) obj).booleanValue() ? irr.f105046c : irr.f105044a;
        }
    }
}
