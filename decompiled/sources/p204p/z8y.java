package p204p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.icu.text.BreakIterator;
import com.spotify.music.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class z8y extends Drawable {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ qr60[] f280586i = {new spi0(z8y.class, "isCircular", "isCircular()Z", 0)};

    /* JADX INFO: renamed from: a */
    public final Context f280587a;

    /* JADX INFO: renamed from: b */
    public final int f280588b;

    /* JADX INFO: renamed from: c */
    public final y8y f280589c;

    /* JADX INFO: renamed from: d */
    public final Paint f280590d;

    /* JADX INFO: renamed from: e */
    public final Paint f280591e;

    /* JADX INFO: renamed from: f */
    public Drawable f280592f;

    /* JADX INFO: renamed from: g */
    public final Rect f280593g;

    /* JADX INFO: renamed from: h */
    public final pc0 f280594h;

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:14:0x0019  */
    /* JADX WARN: Code duplicated, block: B:15:0x001b A[PHI: r1
      0x001b: PHI (r1v6 java.lang.String) = (r1v2 java.lang.String), (r1v11 java.lang.String) binds: [B:13:0x0017, B:8:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    /* JADX WARN: Illegal instructions before constructor call */
    public z8y(Context context, String str, String str2, Integer num) {
        String str3;
        String upperCase;
        int color;
        if (str2 == null) {
            if (wl51.m88460J0(str)) {
                str3 = null;
            } else {
                str3 = str;
            }
            if (str3 == null) {
                upperCase = null;
            } else {
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str3);
                upperCase = str3.substring(0, characterInstance.next()).toUpperCase(Locale.ROOT);
            }
        } else {
            str3 = !wl51.m88460J0(str2) ? str2 : null;
            if (str3 == null) {
                if (wl51.m88460J0(str)) {
                    str3 = str;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    upperCase = null;
                } else {
                    BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                    characterInstance2.setText(str3);
                    upperCase = str3.substring(0, characterInstance2.next()).toUpperCase(Locale.ROOT);
                }
            } else {
                BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                characterInstance3.setText(str3);
                upperCase = str3.substring(0, characterInstance3.next()).toUpperCase(Locale.ROOT);
            }
        }
        if (num != null) {
            color = num.intValue();
        } else {
            if (str2 != null) {
                str2 = wl51.m88460J0(str2) ? null : str2;
                if (str2 != null) {
                    str = str2;
                }
            }
            color = context.getColor(!wl51.m88460J0(str) ? kfj.f122175a[Math.abs(str.hashCode()) % 6] : R.color.encore_face_background_fallback);
        }
        this(color, context, upperCase);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int iHeight = bounds.height();
        qr60 qr60Var = f280586i[0];
        boolean zBooleanValue = ((Boolean) this.f280594h.f61172a).booleanValue();
        Paint paint = this.f280591e;
        if (zBooleanValue) {
            float f = iHeight / 2.0f;
            canvas.drawCircle(bounds.width() / 2.0f, f, f, paint);
        } else {
            canvas.drawPaint(paint);
        }
        String str = this.f280589c.f270411b;
        if (str == null) {
            Drawable drawable = this.f280592f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Paint paint2 = this.f280590d;
        paint2.setTextSize(iHeight * 0.55f);
        int length = str.length();
        Rect rect = this.f280593g;
        paint2.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, bounds.exactCenterX(), bounds.exactCenterY() - rect.exactCenterY(), paint2);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        int changingConfigurations = getChangingConfigurations();
        y8y y8yVar = this.f280589c;
        y8yVar.f270414e = changingConfigurations;
        return y8yVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        y8y y8yVar = this.f280589c;
        y8yVar.getClass();
        return new z8y(y8yVar.f270410a, y8yVar.f270411b, y8yVar.f270412c, y8yVar.f270413d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (this.f280589c.f270411b == null) {
            int iWidth = rect.width();
            int i = (int) (iWidth * 0.5f);
            int i2 = (iWidth - i) / 2;
            Context context = this.f280587a;
            Drawable drawable = context.getResources().getDrawable(qzb0.m74318r(i, context.getResources()) ? R.drawable.encore_icon_user_16 : R.drawable.encore_icon_user_24, null);
            drawable.setColorFilter(new PorterDuffColorFilter(this.f280588b, PorterDuff.Mode.SRC_IN));
            Rect rect2 = new Rect(rect);
            rect2.inset(i2, i2);
            drawable.setBounds(rect2);
            this.f280592f = drawable;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f280590d.setAlpha(i);
        this.f280591e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f280590d.setColorFilter(colorFilter);
        this.f280591e.setColorFilter(colorFilter);
    }

    public z8y(Context context, String str, int i, int i2) {
        this.f280587a = context;
        this.f280588b = i2;
        str = (str == null || wl51.m88460J0(str)) ? null : str;
        y8y y8yVar = new y8y();
        y8yVar.f270410a = context;
        y8yVar.f270411b = str;
        y8yVar.f270412c = i;
        y8yVar.f270413d = i2;
        this.f280589c = y8yVar;
        Paint paint = new Paint();
        paint.setColor(i2);
        paint.setTypeface(u1x0.m82233b(context, R.font.spotify_mix_ui_bold));
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f280590d = paint;
        Paint paint2 = new Paint();
        paint2.setColor(i);
        paint2.setAntiAlias(true);
        this.f280591e = paint2;
        this.f280593g = new Rect();
        this.f280594h = new pc0(this);
    }

    public /* synthetic */ z8y(Context context, String str, String str2) {
        this(context, str, str2, (Integer) null);
    }

    public z8y(int i, Context context, String str) {
        this(context, str, i, context.getColor((((Color.red(i) * 299) + (Color.green(i) * 587)) + (Color.blue(i) * 114)) / 1000 >= 128 ? R.color.black : R.color.white));
    }
}
