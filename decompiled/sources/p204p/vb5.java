package p204p;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.net.Uri;
import androidx.compose.p002ui.text.font.FontWeight;
import com.comscore.streaming.ContentType;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.Function;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class vb5 implements pfe1, zua, l591, vd50, Function, e5y, geo0, Init, s4l0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f239420a;

    public /* synthetic */ vb5(int i) {
        this.f239420a = i;
    }

    /* JADX INFO: renamed from: i */
    public static final na20 m85112i(oa20 oa20Var) {
        npa npaVar = new npa();
        oa20Var.mo33954d(npaVar);
        return new na20(0, oa20Var, npaVar);
    }

    /* JADX INFO: renamed from: j */
    public static final oa20 m85113j(euw0 euw0Var) {
        return new oa20(euw0Var);
    }

    /* JADX INFO: renamed from: l */
    public static final fv31 m85114l(int i) {
        fv31 fv31Var = cj80.f38521e;
        return fv31.f73628b.m78180K("limited_experience_indicator_last_enter_announcement_" + i);
    }

    /* JADX INFO: renamed from: m */
    public static final fv31 m85115m(int i) {
        fv31 fv31Var = cj80.f38521e;
        return fv31.f73628b.m78180K("limited_experience_indicator_last_exit_announcement_" + i);
    }

    /* JADX INFO: renamed from: o */
    public static final Float m85116o(String str, Set set) {
        orn0 orn0Var = qd01.f187442j;
        if (set.contains(str)) {
            return Float.valueOf(10.0f);
        }
        Set set2 = set;
        boolean z = set2 instanceof Collection;
        if (!z || !set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (bm51.m29803n0((String) it.next(), str, false)) {
                    return Float.valueOf(5.0f);
                }
            }
        }
        if (z && set2.isEmpty()) {
            return null;
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            if (wl51.m88496t0((String) it2.next(), str, false)) {
                return Float.valueOf(1.0f);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final viy0 m85117p(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return viy0.MAGICLINK_LOGIN;
        }
        if (iM38547C == 1) {
            return viy0.MAGICLINK_EMAIL_USERNAME;
        }
        if (iM38547C == 2) {
            return viy0.MAGICLINK_EMAIL_SENT;
        }
        if (iM38547C == 3) {
            return viy0.LOGIN;
        }
        if (iM38547C == 4) {
            return viy0.MAGICLINK_FACEBOOK_SSO;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: q */
    public static Typeface m85118q(String str, FontWeight fontWeight, int i) {
        if (i == 0 && wj50.m88271j(fontWeight, FontWeight.f532t) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM38690u = eem.m38690u(i, fontWeight);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM38690u) : Typeface.create(str, iM38690u);
    }

    /* JADX INFO: renamed from: r */
    public static Uri m85119r(String str, String str2) {
        return Uri.parse("https://spotify.link/content_linking").buildUpon().appendQueryParameter("~campaign", str2).appendQueryParameter("$deeplink_path", str).appendQueryParameter("$fallback_url", str).build();
    }

    /* JADX INFO: renamed from: u */
    public static void m85120u(Object obj, Rect rect) {
        ((C2374sf) obj).m77971f(rect);
    }

    @Override // p204p.zua
    /* JADX INFO: renamed from: a */
    public byte[] mo82449a(int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f239420a) {
            case 8:
                return evp.f63294h.get(obj);
            case 10:
                ybv ybvVar = ((qu80) obj).f192599e;
                if (ybvVar.f271259d.m84311c(3).length() <= 0) {
                    return "";
                }
                String string = uh30.m83118a(ybvVar.f271259d.m84311c(3)).toString();
                wj50.m88279p(string);
                return string;
            case 17:
                return v7f0.f238176h.get(obj);
            default:
                return gh31.m44710a((o2x0) obj);
        }
    }

    @Override // p204p.geo0
    /* JADX INFO: renamed from: b */
    public Typeface mo36518b(int i, FontWeight fontWeight) {
        return m85118q(null, fontWeight, i);
    }

    @Override // p204p.s4l0
    /* JADX INFO: renamed from: c */
    public long mo50590c(d5y d5yVar) {
        return -1L;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        q300 q300Var;
        hoo hooVar;
        switch (this.f239420a) {
            case 4:
                if (i == 0) {
                    q300Var = q300.FORMAT_UNSPECIFIED;
                } else if (i == 1) {
                    q300Var = q300.FORMAT_AUDIO;
                } else if (i == 2) {
                    q300Var = q300.FORMAT_VIDEO;
                } else if (i == 3) {
                    q300Var = q300.FORMAT_PARROT;
                } else if (i != 4) {
                    q300Var = i != 5 ? null : q300.FORMAT_GENERATED;
                } else {
                    q300Var = q300.FORMAT_LOSSLESS;
                }
                return q300Var == null ? q300.UNRECOGNIZED : q300Var;
            default:
                switch (i) {
                    case 0:
                        hooVar = hoo.DAY_OF_WEEK_UNSPECIFIED;
                        break;
                    case 1:
                        hooVar = hoo.DAY_OF_WEEK_SUNDAY;
                        break;
                    case 2:
                        hooVar = hoo.DAY_OF_WEEK_MONDAY;
                        break;
                    case 3:
                        hooVar = hoo.DAY_OF_WEEK_TUESDAY;
                        break;
                    case 4:
                        hooVar = hoo.DAY_OF_WEEK_WEDNESDAY;
                        break;
                    case 5:
                        hooVar = hoo.DAY_OF_WEEK_THURSDAY;
                        break;
                    case 6:
                        hooVar = hoo.DAY_OF_WEEK_FRIDAY;
                        break;
                    case 7:
                        hooVar = hoo.DAY_OF_WEEK_SATURDAY;
                        break;
                    default:
                        hooVar = null;
                        break;
                }
                return hooVar == null ? hoo.UNRECOGNIZED : hooVar;
        }
    }

    @Override // p204p.geo0
    /* JADX INFO: renamed from: e */
    public Typeface mo36521e(w310 w310Var, FontWeight fontWeight, int i) {
        String strConcat = w310Var.f247456f;
        int i2 = fontWeight.f533a / 100;
        if (i2 >= 0 && i2 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceM85118q = m85118q(strConcat, fontWeight, i);
            if (!wj50.m88271j(typefaceM85118q, Typeface.create(Typeface.DEFAULT, eem.m38690u(i, fontWeight))) && !wj50.m88271j(typefaceM85118q, m85118q(null, fontWeight, i))) {
                typeface = typefaceM85118q;
            }
        }
        return typeface == null ? m85118q(w310Var.f247456f, fontWeight, i) : typeface;
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: f */
    public Bitmap mo33239f(Bitmap bitmap, Integer num, Integer num2) {
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int width = (bitmap.getWidth() - iMin) / 2;
        int height = (bitmap.getHeight() - iMin) / 2;
        float f = iMin / 2.0f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(-width, -height);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        new Canvas(bitmapCreateBitmap).drawCircle(f, f, f, paint);
        return bitmapCreateBitmap;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f239420a) {
            case 21:
                epq0 epq0Var = (epq0) obj;
                lpq0 lpq0Var = epq0Var.f61698c;
                boolean z = lpq0Var instanceof ipq0;
                knq0 knq0Var = knq0.f124461a;
                if (z) {
                    return First.m15575c(epq0Var, Collections.singleton(knq0Var));
                }
                if (lpq0Var instanceof hpq0) {
                    return First.m15575c(epq0.m39663a(epq0Var, null, new kpq0(false), false, 59), Collections.singleton(knq0Var));
                }
                if (lpq0Var instanceof kpq0) {
                    return First.m15575c(epq0Var, Effects.m15571a(new mnq0(), knq0Var));
                }
                if (lpq0Var instanceof jpq0) {
                    x9r0 x9r0Var = epq0Var.f61699d;
                    return First.m15575c(epq0Var, Collections.singleton(x9r0Var != null ? new inq0(x9r0Var.f259432b) : null));
                }
                if (lpq0Var instanceof gpq0) {
                    return First.m15574b(epq0.m39663a(epq0Var, null, new kpq0(false), false, 59));
                }
                throw new NoWhenBranchMatchedException();
            default:
                return First.m15574b((fdt0) obj);
        }
    }

    @Override // p204p.s4l0
    /* JADX INFO: renamed from: g */
    public ddz0 mo50591g() {
        return new ra8(-9223372036854775807L);
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: k */
    public String mo33244k() {
        return "circle";
    }

    /* JADX WARN: Code duplicated, block: B:220:0x04e1  */
    @Override // p204p.pfe1
    /* JADX INFO: renamed from: n */
    public fh9 mo33508n(String str, int i, int i2, int i3, Map map) {
        int i4;
        int i5;
        dh9 dh9VarM40165B;
        boolean z;
        int iAbs;
        dh9 dh9VarM40183q;
        int i6;
        int i7;
        fh9 fh9Var;
        int i8;
        int i9;
        int i10 = 9;
        int i11 = 28;
        int i12 = 0;
        int i13 = 2;
        int i14 = 1;
        switch (this.f239420a) {
            case 1:
                Charset charsetForName = StandardCharsets.ISO_8859_1;
                EnumMap enumMap = (EnumMap) map;
                ydu yduVar = ydu.f271832b;
                if (enumMap.containsKey(yduVar)) {
                    charsetForName = Charset.forName(enumMap.get(yduVar).toString());
                }
                ydu yduVar2 = ydu.f271831a;
                int i15 = enumMap.containsKey(yduVar2) ? Integer.parseInt(enumMap.get(yduVar2).toString()) : 33;
                ydu yduVar3 = ydu.f271840t;
                int i16 = enumMap.containsKey(yduVar3) ? Integer.parseInt(enumMap.get(yduVar3).toString()) : 0;
                if (i != 1) {
                    throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(edb.m38548D(i)));
                }
                byte[] bytes = str.getBytes(charsetForName);
                List<lv41> listSingletonList = Collections.singletonList(lv41.f137220e);
                int i17 = 0;
                while (true) {
                    char c = '\n';
                    int i18 = 32;
                    if (i17 >= bytes.length) {
                        lv41 lv41Var = (lv41) Collections.min(listSingletonList, new kxy(4));
                        lv41Var.getClass();
                        LinkedList linkedList = new LinkedList();
                        for (iy71 iy71Var = lv41Var.m60059b(bytes.length).f137222b; iy71Var != null; iy71Var = iy71Var.f106896a) {
                            linkedList.addFirst(iy71Var);
                        }
                        dh9 dh9Var = new dh9();
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            ((iy71) it.next()).mo38505a(dh9Var, bytes);
                        }
                        int i19 = dh9Var.f49021b;
                        int iM60873e = m5p0.m60873e(i19, i15, 100, 11);
                        int i20 = i19 + iM60873e;
                        int[] iArr = ex60.f63679a;
                        if (i16 != 0) {
                            z = i16 < 0;
                            iAbs = Math.abs(i16);
                            if (iAbs > (z ? 4 : 32)) {
                                throw new IllegalArgumentException(edb.m38563l("Illegal value ", i16, " for layers"));
                            }
                            i4 = ((z ? 88 : ContentType.LONG_FORM_ON_DEMAND) + (iAbs << 4)) * iAbs;
                            i5 = iArr[iAbs];
                            int i21 = i4 - (i4 % i5);
                            dh9VarM40165B = ex60.m40165B(dh9Var, i5);
                            int i22 = dh9VarM40165B.f49021b;
                            if (iM60873e + i22 > i21) {
                                throw new IllegalArgumentException("Data to large for user specified layer");
                            }
                            if (z && i22 > (i5 << 6)) {
                                throw new IllegalArgumentException("Data to large for user specified layer");
                            }
                        } else {
                            int i23 = 0;
                            int i24 = 0;
                            dh9 dh9VarM40165B2 = null;
                            while (true) {
                                if (i24 > i18) {
                                    throw new IllegalArgumentException("Data too large for an Aztec code");
                                }
                                boolean z2 = i24 <= 3;
                                int i25 = z2 ? i24 + 1 : i24;
                                i4 = ((z2 ? 88 : ContentType.LONG_FORM_ON_DEMAND) + (i25 << 4)) * i25;
                                if (i20 <= i4) {
                                    if (dh9VarM40165B2 == null || i23 != iArr[i25]) {
                                        i5 = iArr[i25];
                                        dh9VarM40165B2 = ex60.m40165B(dh9Var, i5);
                                    } else {
                                        i5 = i23;
                                    }
                                    int i26 = i4 - (i4 % i5);
                                    if ((!z2 || dh9VarM40165B2.f49021b <= (i5 << 6)) && dh9VarM40165B2.f49021b + iM60873e <= i26) {
                                        dh9VarM40165B = dh9VarM40165B2;
                                        z = z2;
                                        iAbs = i25;
                                    } else {
                                        i23 = i5;
                                    }
                                }
                                i24++;
                                c = c;
                                i18 = 32;
                            }
                        }
                        dh9 dh9VarM40183q2 = ex60.m40183q(dh9VarM40165B, i4, i5);
                        int i27 = dh9VarM40165B.f49021b / i5;
                        dh9 dh9Var2 = new dh9();
                        if (z) {
                            dh9Var2.m36000c(iAbs - 1, 2);
                            dh9Var2.m36000c(i27 - 1, 6);
                            dh9VarM40183q = ex60.m40183q(dh9Var2, 28, 4);
                        } else {
                            dh9Var2.m36000c(iAbs - 1, 5);
                            dh9Var2.m36000c(i27 - 1, 11);
                            dh9VarM40183q = ex60.m40183q(dh9Var2, 40, 4);
                        }
                        int i28 = (z ? 11 : 14) + (iAbs << 2);
                        int[] iArr2 = new int[i28];
                        if (z) {
                            for (int i29 = 0; i29 < i28; i29++) {
                                iArr2[i29] = i29;
                            }
                            i6 = i28;
                        } else {
                            int i30 = i28 / 2;
                            i6 = (((i30 - 1) / 15) * 2) + i28 + 1;
                            int i31 = i6 / 2;
                            for (int i32 = 0; i32 < i30; i32++) {
                                int i33 = (i32 / 15) + i32;
                                iArr2[(i30 - i32) - 1] = (i31 - i33) - 1;
                                iArr2[i30 + i32] = i33 + i31 + 1;
                            }
                        }
                        fh9 fh9Var2 = new fh9(i6, i6);
                        int i34 = 0;
                        int i35 = 0;
                        while (i35 < iAbs) {
                            int i36 = 2;
                            int i37 = ((iAbs - i35) << 2) + (z ? 9 : 12);
                            int i38 = 0;
                            while (i38 < i37) {
                                int i39 = i38 << 1;
                                int i40 = 0;
                                while (i40 < i36) {
                                    if (dh9VarM40183q2.m36002e(i34 + i39 + i40)) {
                                        int i41 = i35 << 1;
                                        fh9Var2.m41651c(iArr2[i41 + i40], iArr2[i41 + i38]);
                                    }
                                    if (dh9VarM40183q2.m36002e((i37 << 1) + i34 + i39 + i40)) {
                                        int i42 = i35 << 1;
                                        fh9Var2.m41651c(iArr2[i42 + i38], iArr2[((i28 - 1) - i42) - i40]);
                                    }
                                    if (dh9VarM40183q2.m36002e((i37 << 2) + i34 + i39 + i40)) {
                                        int i43 = (i28 - 1) - (i35 << 1);
                                        fh9Var2.m41651c(iArr2[i43 - i40], iArr2[i43 - i38]);
                                    }
                                    if (dh9VarM40183q2.m36002e((i37 * 6) + i34 + i39 + i40)) {
                                        int i44 = i35 << 1;
                                        fh9Var2.m41651c(iArr2[((i28 - 1) - i44) - i38], iArr2[i44 + i40]);
                                    }
                                    i40++;
                                    z = z;
                                    i36 = 2;
                                }
                                i38++;
                                i36 = 2;
                            }
                            i34 += i37 << 3;
                            i35++;
                            z = z;
                        }
                        boolean z3 = z;
                        int i45 = i6 / 2;
                        if (z3) {
                            for (int i46 = 0; i46 < 7; i46++) {
                                int i47 = (i45 - 3) + i46;
                                if (dh9VarM40183q.m36002e(i46)) {
                                    fh9Var2.m41651c(i47, i45 - 5);
                                }
                                if (dh9VarM40183q.m36002e(i46 + 7)) {
                                    fh9Var2.m41651c(i45 + 5, i47);
                                }
                                if (dh9VarM40183q.m36002e(20 - i46)) {
                                    fh9Var2.m41651c(i47, i45 + 5);
                                }
                                if (dh9VarM40183q.m36002e(27 - i46)) {
                                    fh9Var2.m41651c(i45 - 5, i47);
                                }
                            }
                        } else {
                            for (int i48 = 0; i48 < 10; i48++) {
                                int i49 = (i48 / 5) + (i45 - 5) + i48;
                                if (dh9VarM40183q.m36002e(i48)) {
                                    fh9Var2.m41651c(i49, i45 - 7);
                                }
                                if (dh9VarM40183q.m36002e(i48 + 10)) {
                                    fh9Var2.m41651c(i45 + 7, i49);
                                }
                                if (dh9VarM40183q.m36002e(29 - i48)) {
                                    fh9Var2.m41651c(i49, i45 + 7);
                                }
                                if (dh9VarM40183q.m36002e(39 - i48)) {
                                    fh9Var2.m41651c(i45 - 7, i49);
                                }
                            }
                        }
                        if (z3) {
                            ex60.m40182p(fh9Var2, i45, 5);
                        } else {
                            ex60.m40182p(fh9Var2, i45, 7);
                            int i50 = 0;
                            int i51 = 0;
                            while (i51 < (i28 / 2) - 1) {
                                for (int i52 = i45 & 1; i52 < i6; i52 += 2) {
                                    int i53 = i45 - i50;
                                    fh9Var2.m41651c(i53, i52);
                                    int i54 = i45 + i50;
                                    fh9Var2.m41651c(i54, i52);
                                    fh9Var2.m41651c(i52, i53);
                                    fh9Var2.m41651c(i52, i54);
                                }
                                i51 += 15;
                                i50 += 16;
                            }
                        }
                        int i55 = fh9Var2.f69610a;
                        int iMax = Math.max(200, i55);
                        int i56 = fh9Var2.f69611b;
                        int iMax2 = Math.max(200, i56);
                        int iMin = Math.min(iMax / i55, iMax2 / i56);
                        int i57 = (iMax - (i55 * iMin)) / 2;
                        int i58 = (iMax2 - (i56 * iMin)) / 2;
                        fh9 fh9Var3 = new fh9(iMax, iMax2);
                        int i59 = 0;
                        while (i59 < i56) {
                            int i60 = i57;
                            int i61 = 0;
                            while (i61 < i55) {
                                if (fh9Var2.m41650b(i61, i59)) {
                                    fh9Var3.m41652d(i60, i58, iMin, iMin);
                                }
                                i61++;
                                i60 += iMin;
                            }
                            i59++;
                            i58 += iMin;
                        }
                        return fh9Var3;
                    }
                    int i62 = i17 + 1;
                    byte b = i62 < bytes.length ? bytes[i62] : (byte) 0;
                    byte b2 = bytes[i17];
                    if (b2 != 13) {
                        if (b2 != 44) {
                            if (b2 != 46) {
                                if (b2 == 58 && b == 32) {
                                    i7 = 5;
                                } else {
                                    i7 = 0;
                                }
                            } else if (b == 32) {
                                i7 = 3;
                            } else {
                                i7 = 0;
                            }
                        } else if (b == 32) {
                            i7 = 4;
                        } else {
                            i7 = 0;
                        }
                    } else if (b == 10) {
                        i7 = 2;
                    } else {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        LinkedList linkedList2 = new LinkedList();
                        for (lv41 lv41Var2 : listSingletonList) {
                            lv41 lv41VarM60059b = lv41Var2.m60059b(i17);
                            linkedList2.add(lv41VarM60059b.m60061d(4, i7));
                            if (lv41Var2.f137221a != 4) {
                                linkedList2.add(lv41VarM60059b.m60062e(4, i7));
                            }
                            if (i7 == 3 || i7 == 4) {
                                linkedList2.add(lv41VarM60059b.m60061d(2, 16 - i7).m60061d(2, 1));
                            }
                            if (lv41Var2.f137223c > 0) {
                                linkedList2.add(lv41Var2.m60058a(i17).m60058a(i62));
                            }
                        }
                        listSingletonList = yr20.m94403a(linkedList2);
                        i17 = i62;
                    } else {
                        LinkedList linkedList3 = new LinkedList();
                        for (lv41 lv41Var3 : listSingletonList) {
                            char c2 = (char) (bytes[i17] & 255);
                            int[][] iArr3 = yr20.f275369c;
                            int i63 = lv41Var3.f137221a;
                            boolean z4 = iArr3[i63][c2] > 0;
                            lv41 lv41VarM60059b2 = null;
                            for (int i64 = 0; i64 <= 4; i64++) {
                                int i65 = iArr3[i64][c2];
                                if (i65 > 0) {
                                    if (lv41VarM60059b2 == null) {
                                        lv41VarM60059b2 = lv41Var3.m60059b(i17);
                                    }
                                    lv41 lv41Var4 = lv41VarM60059b2;
                                    if (!z4 || i64 == i63 || i64 == 2) {
                                        linkedList3.add(lv41Var4.m60061d(i64, i65));
                                    }
                                    if (!z4 && yr20.f275370d[i63][i64] >= 0) {
                                        linkedList3.add(lv41Var4.m60062e(i64, i65));
                                    }
                                    lv41VarM60059b2 = lv41Var4;
                                }
                            }
                            if (lv41Var3.f137223c > 0 || iArr3[i63][c2] == 0) {
                                linkedList3.add(lv41Var3.m60058a(i17));
                            }
                        }
                        listSingletonList = yr20.m94403a(linkedList3);
                    }
                    i17++;
                }
                break;
            default:
                if (str.isEmpty()) {
                    throw new IllegalArgumentException("Found empty contents");
                }
                if (i != 6) {
                    throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(edb.m38548D(i)));
                }
                EnumMap enumMap2 = (EnumMap) map;
                nf61 nf61Var = (nf61) enumMap2.get(ydu.f271833c);
                if (nf61Var == null) {
                    nf61Var = nf61.f153257a;
                }
                if (enumMap2.get(ydu.f271834d) != null) {
                    throw new ClassCastException();
                }
                if (enumMap2.get(ydu.f271835e) != null) {
                    throw new ClassCastException();
                }
                int i66 = 7;
                int i67 = 3;
                ceu[] ceuVarArr = {new olr0(i11), new bc5(i13), new r571(i12), new r571(i14), new t36(i10), new ri5(i14)};
                geu geuVar = new geu(str);
                StringBuilder sb = (StringBuilder) geuVar.f79199f;
                geuVar.f79198e = nf61Var;
                if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
                    geuVar.m44528f((char) 236);
                    geuVar.f79196c = 2;
                    geuVar.f79194a += 7;
                } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
                    geuVar.m44528f((char) 237);
                    geuVar.f79196c = 2;
                    geuVar.f79194a += 7;
                }
                int i68 = 0;
                while (geuVar.m44526d()) {
                    ceuVarArr[i68].mo28685o(geuVar);
                    int i69 = geuVar.f79195b;
                    if (i69 >= 0) {
                        geuVar.f79195b = -1;
                        i68 = i69;
                    }
                }
                int length = sb.length();
                geuVar.m44527e(sb.length());
                int i70 = ((mf61) geuVar.f79200g).f142970b;
                if (length < i70 && i68 != 0 && i68 != 5 && i68 != 4) {
                    geuVar.m44528f((char) 254);
                }
                if (sb.length() < i70) {
                    sb.append((char) 129);
                }
                while (sb.length() < i70) {
                    int length2 = ((sb.length() + 1) * 149) % 253;
                    int i71 = length2 + 130;
                    if (i71 > 254) {
                        i71 = length2 - 124;
                    }
                    sb.append((char) i71);
                }
                String string = sb.toString();
                mf61 mf61VarM61614e = mf61.m61614e(string.length(), nf61Var);
                int i72 = mf61VarM61614e.f142973e;
                int i73 = mf61VarM61614e.f142972d;
                int[] iArr4 = bew.f26460a;
                int length3 = string.length();
                int i74 = mf61VarM61614e.f142970b;
                int i75 = mf61VarM61614e.f142971c;
                if (length3 != i74) {
                    throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
                }
                StringBuilder sb2 = new StringBuilder(i74 + i75);
                sb2.append(string);
                int iMo53307c = mf61VarM61614e.mo53307c();
                if (iMo53307c == 1) {
                    sb2.append(bew.m28967a(i75, string));
                } else {
                    sb2.setLength(sb2.capacity());
                    int[] iArr5 = new int[iMo53307c];
                    int[] iArr6 = new int[iMo53307c];
                    int[] iArr7 = new int[iMo53307c];
                    int i76 = 0;
                    while (i76 < iMo53307c) {
                        int i77 = i76 + 1;
                        iArr5[i76] = mf61VarM61614e.mo53306a(i77);
                        iArr6[i76] = mf61VarM61614e.f142976h;
                        iArr7[i76] = 0;
                        if (i76 > 0) {
                            iArr7[i76] = iArr7[i76 - 1] + iArr5[i76];
                        }
                        i76 = i77;
                    }
                    int i78 = 0;
                    while (i78 < iMo53307c) {
                        StringBuilder sb3 = new StringBuilder(iArr5[i78]);
                        for (int i79 = i78; i79 < i74; i79 += iMo53307c) {
                            sb3.append(string.charAt(i79));
                        }
                        String strM28967a = bew.m28967a(iArr6[i78], sb3.toString());
                        int i80 = i78;
                        int i81 = i12;
                        while (i80 < iArr6[i78] * iMo53307c) {
                            sb2.setCharAt(i74 + i80, strM28967a.charAt(i81));
                            i80 += iMo53307c;
                            i81++;
                        }
                        i78++;
                        i12 = 0;
                    }
                }
                String string2 = sb2.toString();
                int iM61615b = mf61VarM61614e.m61615b() * i73;
                int iM61616d = mf61VarM61614e.m61616d() * i72;
                w780 w780Var = new w780(string2, iM61615b, iM61616d);
                int i82 = w780Var.f248599c;
                byte[] bArr = (byte[]) w780Var.f248601e;
                int i83 = 4;
                int i84 = 0;
                int i85 = 0;
                while (true) {
                    if (i83 == iM61616d && i85 == 0) {
                        int i86 = iM61616d - 1;
                        w780Var.m87385x(i86, 0, i84, i14);
                        w780Var.m87385x(i86, i14, i84, 2);
                        w780Var.m87385x(i86, 2, i84, i67);
                        w780Var.m87385x(0, iM61615b - 2, i84, 4);
                        int i87 = iM61615b - 1;
                        w780Var.m87385x(0, i87, i84, 5);
                        w780Var.m87385x(1, i87, i84, 6);
                        w780Var.m87385x(2, i87, i84, i66);
                        w780Var.m87385x(3, i87, i84, 8);
                        i84++;
                    }
                    int i88 = iM61616d - 2;
                    if (i83 == i88 && i85 == 0 && iM61615b % 4 != 0) {
                        w780Var.m87385x(iM61616d - 3, 0, i84, 1);
                        w780Var.m87385x(i88, 0, i84, 2);
                        w780Var.m87385x(iM61616d - 1, 0, i84, 3);
                        w780Var.m87385x(0, iM61615b - 4, i84, 4);
                        w780Var.m87385x(0, iM61615b - 3, i84, 5);
                        w780Var.m87385x(0, iM61615b - 2, i84, 6);
                        int i89 = iM61615b - 1;
                        w780Var.m87385x(0, i89, i84, 7);
                        w780Var.m87385x(1, i89, i84, 8);
                        i84++;
                    }
                    if (i83 == i88 && i85 == 0 && iM61615b % 8 == 4) {
                        w780Var.m87385x(iM61616d - 3, 0, i84, 1);
                        w780Var.m87385x(i88, 0, i84, 2);
                        w780Var.m87385x(iM61616d - 1, 0, i84, 3);
                        w780Var.m87385x(0, iM61615b - 2, i84, 4);
                        int i90 = iM61615b - 1;
                        w780Var.m87385x(0, i90, i84, 5);
                        w780Var.m87385x(1, i90, i84, 6);
                        w780Var.m87385x(2, i90, i84, 7);
                        w780Var.m87385x(3, i90, i84, 8);
                        i84++;
                    }
                    if (i83 == iM61616d + 4 && i85 == 2 && iM61615b % 8 == 0) {
                        int i91 = iM61616d - 1;
                        w780Var.m87385x(i91, 0, i84, 1);
                        int i92 = iM61615b - 1;
                        w780Var.m87385x(i91, i92, i84, 2);
                        int i93 = iM61615b - 3;
                        w780Var.m87385x(0, i93, i84, 3);
                        int i94 = iM61615b - 2;
                        w780Var.m87385x(0, i94, i84, 4);
                        w780Var.m87385x(0, i92, i84, 5);
                        w780Var.m87385x(1, i93, i84, 6);
                        w780Var.m87385x(1, i94, i84, 7);
                        w780Var.m87385x(1, i92, i84, 8);
                        i84++;
                    }
                    while (true) {
                        if (i83 < iM61616d && i85 >= 0 && bArr[(i83 * i82) + i85] < 0) {
                            w780Var.m87342N(i83, i85, i84);
                            i84++;
                        }
                        int i95 = i83 - 2;
                        int i96 = i85 + 2;
                        if (i95 >= 0 && i96 < iM61615b) {
                            i83 = i95;
                            i85 = i96;
                        }
                    }
                    int i97 = i83 - 1;
                    int i98 = i85 + 5;
                    while (true) {
                        if (i97 >= 0 && i98 < iM61615b && bArr[(i97 * i82) + i98] < 0) {
                            w780Var.m87342N(i97, i98, i84);
                            i84++;
                        }
                        int i99 = i97 + 2;
                        int i100 = i98 - 2;
                        if (i99 < iM61616d && i100 >= 0) {
                            i97 = i99;
                            i98 = i100;
                        }
                    }
                    i83 = i97 + 5;
                    i85 = i98 - 1;
                    if (i83 >= iM61616d && i85 >= iM61615b) {
                        int i101 = iM61615b - 1;
                        int i102 = iM61616d - 1;
                        if (bArr[(i102 * i82) + i101] < 0) {
                            int i103 = (i102 * i82) + i101;
                            byte b3 = (byte) 1;
                            bArr[i103] = b3;
                            bArr[(i88 * i82) + (iM61615b - 2)] = b3;
                        }
                        int iM61615b2 = mf61VarM61614e.m61615b() * i73;
                        int iM61616d2 = mf61VarM61614e.m61616d() * i72;
                        boolean z5 = true;
                        p4l0 p4l0Var = new p4l0((mf61VarM61614e.m61615b() * i73) + (mf61VarM61614e.m61615b() << 1), (mf61VarM61614e.m61616d() * i72) + (mf61VarM61614e.m61616d() << 1));
                        int i104 = 0;
                        int i105 = 0;
                        while (i105 < iM61616d2) {
                            int i106 = i105 % i72;
                            if (i106 == 0) {
                                int i107 = 0;
                                int i108 = 0;
                                while (i107 < (mf61VarM61614e.m61615b() * i73) + (mf61VarM61614e.m61615b() << 1)) {
                                    p4l0Var.m69147s(i108, i104, i107 % 2 == 0 ? z5 : false);
                                    i108++;
                                    i107++;
                                    z5 = true;
                                }
                                i104++;
                            }
                            int i109 = 0;
                            for (int i110 = 0; i110 < iM61615b2; i110++) {
                                int i111 = i110 % i73;
                                if (i111 == 0) {
                                    p4l0Var.m69147s(i109, i104, true);
                                    i109++;
                                }
                                p4l0Var.m69147s(i109, i104, bArr[(i105 * i82) + i110] == 1);
                                int i112 = i109 + 1;
                                if (i111 == i73 - 1) {
                                    p4l0Var.m69147s(i112, i104, i105 % 2 == 0);
                                    i109 += 2;
                                } else {
                                    i109 = i112;
                                }
                            }
                            int i113 = i104 + 1;
                            if (i106 == i72 - 1) {
                                int i114 = 0;
                                for (int i115 = 0; i115 < (mf61VarM61614e.m61615b() * i73) + (mf61VarM61614e.m61615b() << 1); i115++) {
                                    p4l0Var.m69147s(i114, i113, true);
                                    i114++;
                                }
                                i104 += 2;
                            } else {
                                i104 = i113;
                            }
                            i105++;
                            z5 = true;
                        }
                        int i116 = p4l0Var.f173978b;
                        int i117 = p4l0Var.f173979c;
                        int iMax3 = Math.max(200, i116);
                        int iMax4 = Math.max(200, i117);
                        int iMin2 = Math.min(iMax3 / i116, iMax4 / i117);
                        int i118 = (iMax3 - (i116 * iMin2)) / 2;
                        int i119 = (iMax4 - (i117 * iMin2)) / 2;
                        if (200 < i117 || 200 < i116) {
                            fh9Var = new fh9(i116, i117);
                            i8 = 0;
                            i9 = 0;
                        } else {
                            fh9Var = new fh9(200, 200);
                            i8 = i118;
                            i9 = i119;
                        }
                        int[] iArr8 = fh9Var.f69613d;
                        int length4 = iArr8.length;
                        for (int i120 = 0; i120 < length4; i120++) {
                            iArr8[i120] = 0;
                        }
                        int i121 = i9;
                        int i122 = 0;
                        while (i122 < i117) {
                            int i123 = i8;
                            int i124 = 0;
                            while (i124 < i116) {
                                if (p4l0Var.m69142n(i124, i122) == 1) {
                                    fh9Var.m41652d(i123, i121, iMin2, iMin2);
                                }
                                i124++;
                                i123 += iMin2;
                            }
                            i122++;
                            i121 += iMin2;
                        }
                        return fh9Var;
                    }
                    i82 = i82;
                    mf61VarM61614e = mf61VarM61614e;
                    i66 = 7;
                    i14 = 1;
                    i67 = 3;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m85121s(String str) {
        String queryParameter;
        if (str != null) {
            Uri uri = Uri.parse(str);
            if (!uri.isHierarchical()) {
                uri = null;
            }
            if (uri != null && (queryParameter = uri.getQueryParameter("client_id")) != null && queryParameter.length() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: x */
    public ck81 mo37837x(int i, int i2) {
        return new nlr();
    }

    public /* synthetic */ vb5(Object obj, int i) {
        this.f239420a = i;
    }

    public /* synthetic */ vb5(son sonVar, otn otnVar, int i) {
        this.f239420a = i;
    }

    public /* synthetic */ vb5(boolean z, int i) {
        this.f239420a = i;
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: t */
    public void mo37836t() {
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: d */
    public void mo37835d(ddz0 ddz0Var) {
    }

    @Override // p204p.s4l0
    /* JADX INFO: renamed from: h */
    public void mo50592h(long j) {
    }
}
