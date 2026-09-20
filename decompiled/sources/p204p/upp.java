package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.spotify.encoreconsumermobile.elements.selection.SelectionView;
import com.spotify.player.model.ContextTrack;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class upp extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final upp f232744L0;

    /* JADX INFO: renamed from: M0 */
    public static final upp f232745M0;

    /* JADX INFO: renamed from: N0 */
    public static final upp f232746N0;

    /* JADX INFO: renamed from: O0 */
    public static final upp f232747O0;

    /* JADX INFO: renamed from: P0 */
    public static final upp f232748P0;

    /* JADX INFO: renamed from: Q0 */
    public static final upp f232749Q0;

    /* JADX INFO: renamed from: R0 */
    public static final upp f232750R0;

    /* JADX INFO: renamed from: S0 */
    public static final upp f232751S0;

    /* JADX INFO: renamed from: T0 */
    public static final upp f232752T0;

    /* JADX INFO: renamed from: U0 */
    public static final upp f232753U0;

    /* JADX INFO: renamed from: V0 */
    public static final upp f232754V0;

    /* JADX INFO: renamed from: W0 */
    public static final upp f232755W0;

    /* JADX INFO: renamed from: X */
    public static final upp f232756X;

    /* JADX INFO: renamed from: X0 */
    public static final upp f232757X0;

    /* JADX INFO: renamed from: Y */
    public static final upp f232758Y;

    /* JADX INFO: renamed from: Y0 */
    public static final upp f232759Y0;

    /* JADX INFO: renamed from: Z */
    public static final upp f232760Z;

    /* JADX INFO: renamed from: Z0 */
    public static final upp f232761Z0;

    /* JADX INFO: renamed from: a1 */
    public static final upp f232762a1;

    /* JADX INFO: renamed from: b */
    public static final upp f232763b;

    /* JADX INFO: renamed from: b1 */
    public static final upp f232764b1;

    /* JADX INFO: renamed from: c */
    public static final upp f232765c;

    /* JADX INFO: renamed from: c1 */
    public static final upp f232766c1;

    /* JADX INFO: renamed from: d */
    public static final upp f232767d;

    /* JADX INFO: renamed from: e */
    public static final upp f232768e;

    /* JADX INFO: renamed from: f */
    public static final upp f232769f;

    /* JADX INFO: renamed from: g */
    public static final upp f232770g;

    /* JADX INFO: renamed from: h */
    public static final upp f232771h;

    /* JADX INFO: renamed from: i */
    public static final upp f232772i;

    /* JADX INFO: renamed from: t */
    public static final upp f232773t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f232774a;

    static {
        int i = 1;
        f232763b = new upp(i, 0);
        f232765c = new upp(i, 1);
        f232767d = new upp(i, 2);
        f232768e = new upp(i, 3);
        f232769f = new upp(i, 4);
        f232770g = new upp(i, 5);
        f232771h = new upp(i, 6);
        f232772i = new upp(i, 7);
        f232773t = new upp(i, 8);
        f232756X = new upp(i, 9);
        f232758Y = new upp(i, 10);
        f232760Z = new upp(i, 11);
        f232744L0 = new upp(i, 12);
        f232745M0 = new upp(i, 13);
        f232746N0 = new upp(i, 14);
        f232747O0 = new upp(i, 15);
        f232748P0 = new upp(i, 16);
        f232749Q0 = new upp(i, 17);
        f232750R0 = new upp(i, 18);
        f232751S0 = new upp(i, 19);
        f232752T0 = new upp(i, 20);
        f232753U0 = new upp(i, 21);
        f232754V0 = new upp(i, 22);
        f232755W0 = new upp(i, 23);
        f232757X0 = new upp(i, 24);
        f232759Y0 = new upp(i, 25);
        f232761Z0 = new upp(i, 26);
        f232762a1 = new upp(i, 27);
        f232764b1 = new upp(i, 28);
        f232766c1 = new upp(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ upp(int i, int i2) {
        super(i);
        this.f232774a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f232774a) {
            case 0:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 1:
                w4f0 w4f0Var = (w4f0) ((Bundle) obj).getParcelable("webviewElementState");
                return w4f0Var != null ? w4f0.m87190c(w4f0Var, null, null, null, true, false, null, false, null, null, 503) : new w4f0();
            case 2:
                return w2a1.f247311a;
            case 3:
                return new e3q0(((Boolean) obj).booleanValue(), 1);
            case 4:
                return new lez0(((Boolean) obj).booleanValue());
            case 5:
                return new rj1(true);
            case 6:
                return new rj1(true);
            case 7:
                return new d87((String) obj);
            case 8:
                return new htv(false);
            case 9:
                return new csv((String) obj, false);
            case 10:
                return new myg0((nyg0) obj, 3);
            case 11:
                return new myg0((nyg0) obj, 1);
            case 12:
                return new myg0((nyg0) obj, 4);
            case 13:
                return new myg0((nyg0) obj, 2);
            case 14:
                return new myg0((nyg0) obj, 0);
            case 15:
                return new kcz0(false);
            case 16:
                return new lez0(((Boolean) obj).booleanValue());
            case 17:
                return new x2i0(lau.f131415a, nau.f152117a);
            case 18:
                return new u3i0(7);
            case 19:
                return e72.m38002e0((ContextTrack) obj);
            case 20:
                return w2a1.f247311a;
            case 21:
                Map.Entry entry = (Map.Entry) obj;
                return klh.m56834f((String) entry.getKey(), ": ", ((iq10) entry.getValue()).name().toLowerCase(Locale.ROOT));
            case 22:
                return ((ekl) obj).f60469a;
            case 23:
                return Boolean.valueOf(!(((View) obj) instanceof ViewStub));
            case 24:
                return Boolean.valueOf(!(((View) obj) instanceof ViewStub));
            case 25:
                return w2a1.f247311a;
            case 26:
                return w2a1.f247311a;
            case 27:
                return vjw0.f242077a;
            case 28:
                return new SelectionView((Context) obj, null, 0, 6, null);
            default:
                return new a4q(((y3q) obj).f268975a);
        }
    }
}
