package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p204p.p1m0;
import p204p.x5i0;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f774k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f775a;

    /* JADX INFO: renamed from: b */
    public Object f776b;

    /* JADX INFO: renamed from: c */
    public byte[] f777c;

    /* JADX INFO: renamed from: d */
    public Parcelable f778d;

    /* JADX INFO: renamed from: e */
    public int f779e;

    /* JADX INFO: renamed from: f */
    public int f780f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f781g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f782h;

    /* JADX INFO: renamed from: i */
    public String f783i;

    /* JADX INFO: renamed from: j */
    public String f784j;

    public IconCompat() {
        this.f775a = -1;
        this.f777c = null;
        this.f778d = null;
        this.f779e = 0;
        this.f780f = 0;
        this.f781g = null;
        this.f782h = f774k;
        this.f783i = null;
    }

    /* JADX INFO: renamed from: a */
    public static IconCompat m387a(Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f779e = bundle.getInt("int1");
        iconCompat.f780f = bundle.getInt("int2");
        iconCompat.f784j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f781g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f782h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.f776b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f776b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f776b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m388b(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: c */
    public static IconCompat m389c(Bitmap bitmap) {
        p1m0.m68836q(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f776b = bitmap;
        return iconCompat;
    }

    /* JADX INFO: renamed from: d */
    public static IconCompat m390d(Bitmap bitmap) {
        p1m0.m68836q(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f776b = bitmap;
        return iconCompat;
    }

    /* JADX INFO: renamed from: e */
    public static IconCompat m391e(Uri uri) {
        p1m0.m68836q(uri);
        String string = uri.toString();
        p1m0.m68836q(string);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f776b = string;
        return iconCompat;
    }

    /* JADX INFO: renamed from: f */
    public static IconCompat m392f(Context context, int i) {
        p1m0.m68836q(context);
        return m393g(context.getResources(), context.getPackageName(), i);
    }

    /* JADX INFO: renamed from: g */
    public static IconCompat m393g(Resources resources, String str, int i) {
        p1m0.m68836q(str);
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f779e = i;
        if (resources != null) {
            try {
                iconCompat.f776b = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f776b = str;
        }
        iconCompat.f784j = str;
        return iconCompat;
    }

    /* JADX INFO: renamed from: h */
    public final int m394h() {
        int i = this.f775a;
        if (i == -1) {
            return x5i0.m90046z(this.f776b);
        }
        if (i == 2) {
            return this.f779e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* JADX INFO: renamed from: i */
    public final String m395i() {
        int i = this.f775a;
        if (i == -1) {
            return x5i0.m90013A(this.f776b);
        }
        if (i == 2) {
            String str = this.f784j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f776b).split(":", -1)[0] : this.f784j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* JADX INFO: renamed from: j */
    public final int m396j() {
        int i = this.f775a;
        return i == -1 ? x5i0.m90014B(this.f776b) : i;
    }

    /* JADX INFO: renamed from: k */
    public final Uri m397k() {
        int i = this.f775a;
        if (i == -1) {
            return x5i0.m90015C(this.f776b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f776b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* JADX INFO: renamed from: l */
    public final InputStream m398l(Context context) {
        Uri uriM397k = m397k();
        String scheme = uriM397k.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM397k);
            } catch (Exception unused) {
                uriM397k.toString();
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f776b));
        } catch (FileNotFoundException unused2) {
            uriM397k.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final Bundle m399m() {
        Bundle bundle = new Bundle();
        switch (this.f775a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f776b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f776b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f776b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f776b);
                break;
        }
        bundle.putInt("type", this.f775a);
        bundle.putInt("int1", this.f779e);
        bundle.putInt("int2", this.f780f);
        bundle.putString("string1", this.f784j);
        ColorStateList colorStateList = this.f781g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f782h;
        if (mode != f774k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public final String toString() {
        String str;
        if (this.f775a == -1) {
            return String.valueOf(this.f776b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f775a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f775a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f776b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f776b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f784j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m394h())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f779e);
                if (this.f780f != 0) {
                    sb.append(" off=");
                    sb.append(this.f780f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f776b);
                break;
        }
        if (this.f781g != null) {
            sb.append(" tint=");
            sb.append(this.f781g);
        }
        if (this.f782h != f774k) {
            sb.append(" mode=");
            sb.append(this.f782h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f777c = null;
        this.f778d = null;
        this.f779e = 0;
        this.f780f = 0;
        this.f781g = null;
        this.f782h = f774k;
        this.f783i = null;
        this.f775a = i;
    }
}
