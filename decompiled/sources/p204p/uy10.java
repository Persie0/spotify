package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class uy10 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final uy10 f235084L0;

    /* JADX INFO: renamed from: M0 */
    public static final uy10 f235085M0;

    /* JADX INFO: renamed from: N0 */
    public static final uy10 f235086N0;

    /* JADX INFO: renamed from: O0 */
    public static final uy10 f235087O0;

    /* JADX INFO: renamed from: P0 */
    public static final uy10 f235088P0;

    /* JADX INFO: renamed from: Q0 */
    public static final uy10 f235089Q0;

    /* JADX INFO: renamed from: R0 */
    public static final uy10 f235090R0;

    /* JADX INFO: renamed from: S0 */
    public static final uy10 f235091S0;

    /* JADX INFO: renamed from: T0 */
    public static final uy10 f235092T0;

    /* JADX INFO: renamed from: U0 */
    public static final uy10 f235093U0;

    /* JADX INFO: renamed from: V0 */
    public static final uy10 f235094V0;

    /* JADX INFO: renamed from: W0 */
    public static final uy10 f235095W0;

    /* JADX INFO: renamed from: X */
    public static final uy10 f235096X;

    /* JADX INFO: renamed from: X0 */
    public static final uy10 f235097X0;

    /* JADX INFO: renamed from: Y */
    public static final uy10 f235098Y;

    /* JADX INFO: renamed from: Y0 */
    public static final uy10 f235099Y0;

    /* JADX INFO: renamed from: Z */
    public static final uy10 f235100Z;

    /* JADX INFO: renamed from: Z0 */
    public static final uy10 f235101Z0;

    /* JADX INFO: renamed from: a1 */
    public static final uy10 f235102a1;

    /* JADX INFO: renamed from: b */
    public static final uy10 f235103b;

    /* JADX INFO: renamed from: b1 */
    public static final uy10 f235104b1;

    /* JADX INFO: renamed from: c */
    public static final uy10 f235105c;

    /* JADX INFO: renamed from: c1 */
    public static final uy10 f235106c1;

    /* JADX INFO: renamed from: d */
    public static final uy10 f235107d;

    /* JADX INFO: renamed from: e */
    public static final uy10 f235108e;

    /* JADX INFO: renamed from: f */
    public static final uy10 f235109f;

    /* JADX INFO: renamed from: g */
    public static final uy10 f235110g;

    /* JADX INFO: renamed from: h */
    public static final uy10 f235111h;

    /* JADX INFO: renamed from: i */
    public static final uy10 f235112i;

    /* JADX INFO: renamed from: t */
    public static final uy10 f235113t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f235114a;

    static {
        int i = 1;
        f235103b = new uy10(i, 0);
        f235105c = new uy10(i, 1);
        f235107d = new uy10(i, 2);
        f235108e = new uy10(i, 3);
        f235109f = new uy10(i, 4);
        f235110g = new uy10(i, 5);
        f235111h = new uy10(i, 6);
        f235112i = new uy10(i, 7);
        f235113t = new uy10(i, 8);
        f235096X = new uy10(i, 9);
        f235098Y = new uy10(i, 10);
        f235100Z = new uy10(i, 11);
        f235084L0 = new uy10(i, 12);
        f235085M0 = new uy10(i, 13);
        f235086N0 = new uy10(i, 14);
        f235087O0 = new uy10(i, 15);
        f235088P0 = new uy10(i, 16);
        f235089Q0 = new uy10(i, 17);
        f235090R0 = new uy10(i, 18);
        f235091S0 = new uy10(i, 19);
        f235092T0 = new uy10(i, 20);
        f235093U0 = new uy10(i, 21);
        f235094V0 = new uy10(i, 22);
        f235095W0 = new uy10(i, 23);
        f235097X0 = new uy10(i, 24);
        f235099Y0 = new uy10(i, 25);
        f235101Z0 = new uy10(i, 26);
        f235102a1 = new uy10(i, 27);
        f235104b1 = new uy10(i, 28);
        f235106c1 = new uy10(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy10(int i, int i2) {
        super(i);
        this.f235114a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f235114a) {
            case 0:
                return w2a1.f247311a;
            case 1:
                return w2a1.f247311a;
            case 2:
                return w2a1.f247311a;
            case 3:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 4:
                return w320.f247465a;
            case 5:
                ((icp) obj).f100858d = new C1870fr(5, 13, (fbk) null);
                return w2a1.f247311a;
            case 6:
                ArrayList arrayList = ((s320) obj).f205159a;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(hf41.m47325a(((r320) it.next()).f195407a));
                }
                return arrayList2;
            case 7:
                return pp91.m70529j(new pqm0("parcelable", (Parcelable) obj));
            case 8:
                return (Parcelable) zn91.m96523K((Bundle) obj, "parcelable", i520.class);
            case 9:
                ArrayList arrayList3 = ((d520) obj).f45311c;
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((z420) it2.next()).f279098a);
                }
                return arrayList4;
            case 10:
                return Integer.valueOf(((t5o0) obj).mo49586U());
            case 11:
                return ((e520) obj).f56233b;
            case 12:
                ((qsp) ((hmh0) obj)).f192162a = x520.f258255h;
                return w2a1.f247311a;
            case 13:
                return ((pla1) obj).f178682b;
            case 14:
                ((fdx0) obj).m41385g(1);
                return w2a1.f247311a;
            case 15:
                tgj tgjVar = (tgj) obj;
                float fM264e = Size.m264e(tgjVar.mo295n()) * 0.07f;
                float fM264e2 = (Size.m264e(tgjVar.mo295n()) * 0.5f) + fM264e;
                if (Float.intBitsToFloat((int) (tgjVar.mo295n() >> 32)) == Float.intBitsToFloat((int) (tgjVar.mo295n() & 4294967295L))) {
                    DrawScope.m275e0(tgjVar, n6f.f150862b, fM264e2, 0L, 0.0f, null, 60);
                } else {
                    float f = -fM264e;
                    float f2 = 2 * fM264e;
                    DrawScope.m274Y(tgjVar, n6f.f150862b, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tgjVar.mo295n() >> 32)) + f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tgjVar.mo295n() & 4294967295L)) + f2)) & 4294967295L), (((long) Float.floatToRawIntBits(fM264e2)) << 32) | (((long) Float.floatToRawIntBits(fM264e2)) & 4294967295L), null, 0.0f, ContentType.LONG_FORM_ON_DEMAND);
                }
                tgjVar.mo50174s1();
                return w2a1.f247311a;
            case 16:
                return ((l3b) obj).m57996b(f235087O0);
            case 17:
                jpz0.m53990d((mpz0) obj);
                return w2a1.f247311a;
            case 18:
                jpz0.m53990d((mpz0) obj);
                return w2a1.f247311a;
            case 19:
                jpz0.m53997k((mpz0) obj, new b4f(0, 0));
                return w2a1.f247311a;
            case 20:
                return w2a1.f247311a;
            case 21:
                return ((ea20) obj).f57570a;
            case 22:
                return (v140) obj;
            case 23:
                return Boolean.valueOf(obj instanceof v140);
            case 24:
                if (obj != null) {
                    return (v140) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
            case 25:
                return new hmu((View) rqg1.m76244o((wpn0) obj, AndroidCompositionLocals_androidKt.f506f));
            case 26:
                return w2a1.f247311a;
            case 27:
                jpz0.m53990d((mpz0) obj);
                return w2a1.f247311a;
            case 28:
                String str = (String) obj;
                return new q0k(str, str, u410.f226536S0, 12);
            default:
                return (String) obj;
        }
    }
}
