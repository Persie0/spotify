package p204p;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class b0m {

    /* JADX INFO: renamed from: A */
    public static final String f21947A;

    /* JADX INFO: renamed from: B */
    public static final String f21948B;

    /* JADX INFO: renamed from: C */
    public static final String f21949C;

    /* JADX INFO: renamed from: D */
    public static final String f21950D;

    /* JADX INFO: renamed from: E */
    public static final String f21951E;

    /* JADX INFO: renamed from: F */
    public static final String f21952F;

    /* JADX INFO: renamed from: G */
    public static final String f21953G;

    /* JADX INFO: renamed from: H */
    public static final String f21954H;

    /* JADX INFO: renamed from: I */
    public static final String f21955I;

    /* JADX INFO: renamed from: J */
    public static final String f21956J;

    /* JADX INFO: renamed from: K */
    public static final String f21957K;

    /* JADX INFO: renamed from: L */
    public static final String f21958L;

    /* JADX INFO: renamed from: s */
    public static final String f21959s;

    /* JADX INFO: renamed from: t */
    public static final String f21960t;

    /* JADX INFO: renamed from: u */
    public static final String f21961u;

    /* JADX INFO: renamed from: v */
    public static final String f21962v;

    /* JADX INFO: renamed from: w */
    public static final String f21963w;

    /* JADX INFO: renamed from: x */
    public static final String f21964x;

    /* JADX INFO: renamed from: y */
    public static final String f21965y;

    /* JADX INFO: renamed from: z */
    public static final String f21966z;

    /* JADX INFO: renamed from: a */
    public final CharSequence f21967a;

    /* JADX INFO: renamed from: b */
    public final Layout.Alignment f21968b;

    /* JADX INFO: renamed from: c */
    public final Layout.Alignment f21969c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f21970d;

    /* JADX INFO: renamed from: e */
    public final float f21971e;

    /* JADX INFO: renamed from: f */
    public final int f21972f;

    /* JADX INFO: renamed from: g */
    public final int f21973g;

    /* JADX INFO: renamed from: h */
    public final float f21974h;

    /* JADX INFO: renamed from: i */
    public final int f21975i;

    /* JADX INFO: renamed from: j */
    public final float f21976j;

    /* JADX INFO: renamed from: k */
    public final float f21977k;

    /* JADX INFO: renamed from: l */
    public final boolean f21978l;

    /* JADX INFO: renamed from: m */
    public final int f21979m;

    /* JADX INFO: renamed from: n */
    public final int f21980n;

    /* JADX INFO: renamed from: o */
    public final float f21981o;

    /* JADX INFO: renamed from: p */
    public final int f21982p;

    /* JADX INFO: renamed from: q */
    public final float f21983q;

    /* JADX INFO: renamed from: r */
    public final int f21984r;

    static {
        new b0m("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = h0b1.f86200a;
        f21959s = Integer.toString(0, 36);
        f21960t = Integer.toString(17, 36);
        f21961u = Integer.toString(1, 36);
        f21962v = Integer.toString(2, 36);
        f21963w = Integer.toString(3, 36);
        f21964x = Integer.toString(18, 36);
        f21965y = Integer.toString(4, 36);
        f21966z = Integer.toString(5, 36);
        f21947A = Integer.toString(6, 36);
        f21948B = Integer.toString(7, 36);
        f21949C = Integer.toString(8, 36);
        f21950D = Integer.toString(9, 36);
        f21951E = Integer.toString(10, 36);
        f21952F = Integer.toString(11, 36);
        f21953G = Integer.toString(12, 36);
        f21954H = Integer.toString(13, 36);
        f21955I = Integer.toString(14, 36);
        f21956J = Integer.toString(15, 36);
        f21957K = Integer.toString(16, 36);
        f21958L = Integer.toString(19, 36);
    }

    public b0m(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            c95.m31843i(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f21967a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f21967a = charSequence.toString();
        } else {
            this.f21967a = null;
        }
        this.f21968b = alignment;
        this.f21969c = alignment2;
        this.f21970d = bitmap;
        this.f21971e = f;
        this.f21972f = i;
        this.f21973g = i2;
        this.f21974h = f2;
        this.f21975i = i3;
        this.f21976j = f4;
        this.f21977k = f5;
        this.f21978l = z;
        this.f21979m = i5;
        this.f21980n = i4;
        this.f21981o = f3;
        this.f21982p = i6;
        this.f21983q = f6;
        this.f21984r = i7;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0105  */
    /* JADX WARN: Code duplicated, block: B:61:0x014f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: b */
    public static b0m m27840b(Bundle bundle) {
        ?? r6;
        Bitmap bitmapDecodeByteArray;
        float f;
        int i;
        float f2;
        int i2;
        int i3;
        ?? charSequence = bundle.getCharSequence(f21959s);
        boolean z = true;
        if (charSequence != 0) {
            ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(f21960t);
            if (parcelableArrayList != null) {
                charSequence = SpannableString.valueOf(charSequence);
                for (Bundle bundle2 : parcelableArrayList) {
                    int i4 = bundle2.getInt(cbm.f36158a);
                    int i5 = bundle2.getInt(cbm.f36159b);
                    int i6 = bundle2.getInt(cbm.f36160c);
                    int i7 = bundle2.getInt(cbm.f36161d, -1);
                    Bundle bundle3 = bundle2.getBundle(cbm.f36162e);
                    if (i7 == 1) {
                        bundle3.getClass();
                        String string = bundle3.getString(wtx0.f255030c);
                        string.getClass();
                        charSequence.setSpan(new wtx0(string, bundle3.getInt(wtx0.f255031d)), i4, i5, i6);
                    } else if (i7 == 2) {
                        bundle3.getClass();
                        charSequence.setSpan(new q571(bundle3.getInt(q571.f185449d), bundle3.getInt(q571.f185450e), bundle3.getInt(q571.f185451f)), i4, i5, i6);
                    } else if (i7 == 3) {
                        charSequence.setSpan(new b730(), i4, i5, i6);
                    } else if (i7 == 4) {
                        bundle3.getClass();
                        String string2 = bundle3.getString(cvc1.f42353b);
                        string2.getClass();
                        charSequence.setSpan(new cvc1(string2), i4, i5, i6);
                    }
                }
            }
        } else {
            charSequence = 0;
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f21961u);
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(f21962v);
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f21963w);
        if (bitmap != null) {
            r6 = 0;
            bitmapDecodeByteArray = bitmap;
        } else {
            byte[] byteArray = bundle.getByteArray(f21964x);
            if (byteArray != null) {
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                r6 = 0;
            } else {
                r6 = charSequence;
                bitmapDecodeByteArray = null;
            }
        }
        String str = f21965y;
        if (bundle.containsKey(str)) {
            String str2 = f21966z;
            if (bundle.containsKey(str2)) {
                f = bundle.getFloat(str);
                i = bundle.getInt(str2);
            } else {
                f = -3.4028235E38f;
                i = Integer.MIN_VALUE;
            }
        } else {
            f = -3.4028235E38f;
            i = Integer.MIN_VALUE;
        }
        String str3 = f21947A;
        int i8 = bundle.containsKey(str3) ? bundle.getInt(str3) : Integer.MIN_VALUE;
        String str4 = f21948B;
        float f3 = bundle.containsKey(str4) ? bundle.getFloat(str4) : -3.4028235E38f;
        String str5 = f21949C;
        int i9 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
        String str6 = f21951E;
        if (bundle.containsKey(str6)) {
            String str7 = f21950D;
            if (bundle.containsKey(str7)) {
                float f4 = bundle.getFloat(str6);
                i2 = bundle.getInt(str7);
                f2 = f4;
            } else {
                f2 = -3.4028235E38f;
                i2 = Integer.MIN_VALUE;
            }
        } else {
            f2 = -3.4028235E38f;
            i2 = Integer.MIN_VALUE;
        }
        String str8 = f21952F;
        float f5 = bundle.containsKey(str8) ? bundle.getFloat(str8) : -3.4028235E38f;
        String str9 = f21953G;
        float f6 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
        String str10 = f21954H;
        if (bundle.containsKey(str10)) {
            i3 = bundle.getInt(str10);
        } else {
            i3 = -16777216;
            z = false;
        }
        int i10 = i3;
        boolean z2 = !bundle.getBoolean(f21955I, false) ? false : z;
        String str11 = f21956J;
        int i11 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
        String str12 = f21957K;
        float f7 = bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f;
        String str13 = f21958L;
        return new b0m(r6, alignment2, alignment4, bitmapDecodeByteArray, f, i, i8, f3, i9, i2, f2, f5, f6, z2, i10, i11, f7, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
    }

    /* JADX INFO: renamed from: a */
    public final a0m m27841a() {
        a0m a0mVar = new a0m();
        a0mVar.f11103a = this.f21967a;
        a0mVar.f11104b = this.f21970d;
        a0mVar.f11105c = this.f21968b;
        a0mVar.f11106d = this.f21969c;
        a0mVar.f11107e = this.f21971e;
        a0mVar.f11108f = this.f21972f;
        a0mVar.f11109g = this.f21973g;
        a0mVar.f11110h = this.f21974h;
        a0mVar.f11111i = this.f21975i;
        a0mVar.f11112j = this.f21980n;
        a0mVar.f11113k = this.f21981o;
        a0mVar.f11114l = this.f21976j;
        a0mVar.f11115m = this.f21977k;
        a0mVar.f11116n = this.f21978l;
        a0mVar.f11117o = this.f21979m;
        a0mVar.f11118p = this.f21982p;
        a0mVar.f11119q = this.f21983q;
        a0mVar.f11120r = this.f21984r;
        return a0mVar;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m27842c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f21967a;
        if (charSequence != null) {
            bundle.putCharSequence(f21959s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = cbm.f36158a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (wtx0 wtx0Var : (wtx0[]) spanned.getSpans(0, spanned.length(), wtx0.class)) {
                    wtx0Var.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(wtx0.f255030c, wtx0Var.f255032a);
                    bundle2.putInt(wtx0.f255031d, wtx0Var.f255033b);
                    arrayList.add(cbm.m32180a(spanned, wtx0Var, 1, bundle2));
                }
                for (q571 q571Var : (q571[]) spanned.getSpans(0, spanned.length(), q571.class)) {
                    q571Var.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(q571.f185449d, q571Var.f185452a);
                    bundle3.putInt(q571.f185450e, q571Var.f185453b);
                    bundle3.putInt(q571.f185451f, q571Var.f185454c);
                    arrayList.add(cbm.m32180a(spanned, q571Var, 2, bundle3));
                }
                for (b730 b730Var : (b730[]) spanned.getSpans(0, spanned.length(), b730.class)) {
                    arrayList.add(cbm.m32180a(spanned, b730Var, 3, null));
                }
                for (cvc1 cvc1Var : (cvc1[]) spanned.getSpans(0, spanned.length(), cvc1.class)) {
                    cvc1Var.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(cvc1.f42353b, cvc1Var.f42354a);
                    arrayList.add(cbm.m32180a(spanned, cvc1Var, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f21960t, arrayList);
                }
            }
        }
        bundle.putSerializable(f21961u, this.f21968b);
        bundle.putSerializable(f21962v, this.f21969c);
        bundle.putFloat(f21965y, this.f21971e);
        bundle.putInt(f21966z, this.f21972f);
        bundle.putInt(f21947A, this.f21973g);
        bundle.putFloat(f21948B, this.f21974h);
        bundle.putInt(f21949C, this.f21975i);
        bundle.putInt(f21950D, this.f21980n);
        bundle.putFloat(f21951E, this.f21981o);
        bundle.putFloat(f21952F, this.f21976j);
        bundle.putFloat(f21953G, this.f21977k);
        bundle.putBoolean(f21955I, this.f21978l);
        bundle.putInt(f21954H, this.f21979m);
        bundle.putInt(f21956J, this.f21982p);
        bundle.putFloat(f21957K, this.f21983q);
        bundle.putInt(f21958L, this.f21984r);
        return bundle;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && b0m.class == obj.getClass()) {
            b0m b0mVar = (b0m) obj;
            Bitmap bitmap2 = b0mVar.f21970d;
            if (TextUtils.equals(this.f21967a, b0mVar.f21967a) && this.f21968b == b0mVar.f21968b && this.f21969c == b0mVar.f21969c && ((bitmap = this.f21970d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f21971e == b0mVar.f21971e && this.f21972f == b0mVar.f21972f && this.f21973g == b0mVar.f21973g && this.f21974h == b0mVar.f21974h && this.f21975i == b0mVar.f21975i && this.f21976j == b0mVar.f21976j && this.f21977k == b0mVar.f21977k && this.f21978l == b0mVar.f21978l && this.f21979m == b0mVar.f21979m && this.f21980n == b0mVar.f21980n && this.f21981o == b0mVar.f21981o && this.f21982p == b0mVar.f21982p && this.f21983q == b0mVar.f21983q && this.f21984r == b0mVar.f21984r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f21967a, this.f21968b, this.f21969c, this.f21970d, Float.valueOf(this.f21971e), Integer.valueOf(this.f21972f), Integer.valueOf(this.f21973g), Float.valueOf(this.f21974h), Integer.valueOf(this.f21975i), Float.valueOf(this.f21976j), Float.valueOf(this.f21977k), Boolean.valueOf(this.f21978l), Integer.valueOf(this.f21979m), Integer.valueOf(this.f21980n), Float.valueOf(this.f21981o), Integer.valueOf(this.f21982p), Float.valueOf(this.f21983q), Integer.valueOf(this.f21984r));
    }
}
