package p204p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class z4b1 extends q4b1 {

    /* JADX INFO: renamed from: j */
    public static final PorterDuff.Mode f279193j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public x4b1 f279194b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f279195c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f279196d;

    /* JADX INFO: renamed from: e */
    public boolean f279197e;

    /* JADX INFO: renamed from: f */
    public final boolean f279198f;

    /* JADX INFO: renamed from: g */
    public final float[] f279199g;

    /* JADX INFO: renamed from: h */
    public final Matrix f279200h;

    /* JADX INFO: renamed from: i */
    public final Rect f279201i;

    public z4b1() {
        this.f279198f = true;
        this.f279199g = new float[9];
        this.f279200h = new Matrix();
        this.f279201i = new Rect();
        x4b1 x4b1Var = new x4b1();
        x4b1Var.f258048c = null;
        x4b1Var.f258049d = f279193j;
        x4b1Var.f258047b = new w4b1();
        this.f279194b = x4b1Var;
    }

    /* JADX INFO: renamed from: a */
    public static z4b1 m95341a(Resources resources, int i, Resources.Theme theme) {
        z4b1 z4b1Var = new z4b1();
        ThreadLocal threadLocal = u1x0.f225931a;
        z4b1Var.f185136a = ex60.m40184r(resources, i, theme);
        new y4b1(z4b1Var.f185136a.getConstantState());
        return z4b1Var;
    }

    /* JADX INFO: renamed from: b */
    public final PorterDuffColorFilter m95342b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f185136a;
        if (drawable == null) {
            return false;
        }
        svg1.m79485u(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f279201i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f279196d;
        if (colorFilter == null) {
            colorFilter = this.f279195c;
        }
        Matrix matrix = this.f279200h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f279199g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && svg1.m79490z(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        x4b1 x4b1Var = this.f279194b;
        Bitmap bitmap = x4b1Var.f258051f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != x4b1Var.f258051f.getHeight()) {
            x4b1Var.f258051f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            x4b1Var.f258056k = true;
        }
        if (this.f279198f) {
            x4b1 x4b1Var2 = this.f279194b;
            if (x4b1Var2.f258056k || x4b1Var2.f258052g != x4b1Var2.f258048c || x4b1Var2.f258053h != x4b1Var2.f258049d || x4b1Var2.f258055j != x4b1Var2.f258050e || x4b1Var2.f258054i != x4b1Var2.f258047b.getRootAlpha()) {
                x4b1 x4b1Var3 = this.f279194b;
                x4b1Var3.f258051f.eraseColor(0);
                Canvas canvas2 = new Canvas(x4b1Var3.f258051f);
                w4b1 w4b1Var = x4b1Var3.f258047b;
                w4b1Var.m87189a(w4b1Var.f247777g, w4b1.f247770p, canvas2, iMin, iMin2);
                x4b1 x4b1Var4 = this.f279194b;
                x4b1Var4.f258052g = x4b1Var4.f258048c;
                x4b1Var4.f258053h = x4b1Var4.f258049d;
                x4b1Var4.f258054i = x4b1Var4.f258047b.getRootAlpha();
                x4b1Var4.f258055j = x4b1Var4.f258050e;
                x4b1Var4.f258056k = false;
            }
        } else {
            x4b1 x4b1Var5 = this.f279194b;
            x4b1Var5.f258051f.eraseColor(0);
            Canvas canvas3 = new Canvas(x4b1Var5.f258051f);
            w4b1 w4b1Var2 = x4b1Var5.f258047b;
            w4b1Var2.m87189a(w4b1Var2.f247777g, w4b1.f247770p, canvas3, iMin, iMin2);
        }
        x4b1 x4b1Var6 = this.f279194b;
        if (x4b1Var6.f258047b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (x4b1Var6.f258057l == null) {
                Paint paint2 = new Paint();
                x4b1Var6.f258057l = paint2;
                paint2.setFilterBitmap(true);
            }
            x4b1Var6.f258057l.setAlpha(x4b1Var6.f258047b.getRootAlpha());
            x4b1Var6.f258057l.setColorFilter(colorFilter);
            paint = x4b1Var6.f258057l;
        }
        canvas.drawBitmap(x4b1Var6.f258051f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f185136a;
        return drawable != null ? svg1.m79487w(drawable) : this.f279194b.f258047b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f185136a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f279194b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f185136a;
        return drawable != null ? svg1.m79489y(drawable) : this.f279196d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f185136a != null) {
            return new y4b1(this.f185136a.getConstantState());
        }
        this.f279194b.f258046a = getChangingConfigurations();
        return this.f279194b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f185136a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f279194b.f258047b.f247779i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f185136a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f279194b.f258047b.f247778h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f185136a;
        return drawable != null ? svg1.m79450D(drawable) : this.f279194b.f258050e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        x4b1 x4b1Var = this.f279194b;
        if (x4b1Var == null) {
            return false;
        }
        w4b1 w4b1Var = x4b1Var.f258047b;
        if (w4b1Var.f247784n == null) {
            w4b1Var.f247784n = Boolean.valueOf(w4b1Var.f247777g.mo77192a());
        }
        if (w4b1Var.f247784n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f279194b.f258048c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f279197e && super.mutate() == this) {
            x4b1 x4b1Var = this.f279194b;
            x4b1 x4b1Var2 = new x4b1();
            x4b1Var2.f258048c = null;
            x4b1Var2.f258049d = f279193j;
            if (x4b1Var != null) {
                x4b1Var2.f258046a = x4b1Var.f258046a;
                w4b1 w4b1Var = new w4b1(x4b1Var.f258047b);
                x4b1Var2.f258047b = w4b1Var;
                if (x4b1Var.f258047b.f247775e != null) {
                    w4b1Var.f247775e = new Paint(x4b1Var.f258047b.f247775e);
                }
                if (x4b1Var.f258047b.f247774d != null) {
                    x4b1Var2.f258047b.f247774d = new Paint(x4b1Var.f258047b.f247774d);
                }
                x4b1Var2.f258048c = x4b1Var.f258048c;
                x4b1Var2.f258049d = x4b1Var.f258049d;
                x4b1Var2.f258050e = x4b1Var.f258050e;
            }
            this.f279194b = x4b1Var2;
            this.f279197e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        x4b1 x4b1Var = this.f279194b;
        ColorStateList colorStateList = x4b1Var.f258048c;
        if (colorStateList == null || (mode = x4b1Var.f258049d) == null) {
            z = false;
        } else {
            this.f279195c = m95342b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        w4b1 w4b1Var = x4b1Var.f258047b;
        if (w4b1Var.f247784n == null) {
            w4b1Var.f247784n = Boolean.valueOf(w4b1Var.f247777g.mo77192a());
        }
        if (w4b1Var.f247784n.booleanValue()) {
            boolean zMo77193b = x4b1Var.f258047b.f247777g.mo77193b(iArr);
            x4b1Var.f258056k |= zMo77193b;
            if (zMo77193b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f279194b.f258047b.getRootAlpha() != i) {
            this.f279194b.f258047b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            svg1.m79454H(drawable, z);
        } else {
            this.f279194b.f258050e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f279196d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            svg1.m79458L(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            svg1.m79459M(drawable, colorStateList);
            return;
        }
        x4b1 x4b1Var = this.f279194b;
        if (x4b1Var.f258048c != colorStateList) {
            x4b1Var.f258048c = colorStateList;
            this.f279195c = m95342b(colorStateList, x4b1Var.f258049d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            svg1.m79460N(drawable, mode);
            return;
        }
        x4b1 x4b1Var = this.f279194b;
        if (x4b1Var.f258049d != mode) {
            x4b1Var.f258049d = mode;
            this.f279195c = m95342b(x4b1Var.f258048c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f185136a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        char c;
        char c2;
        Resources resources2 = resources;
        Drawable drawable = this.f185136a;
        if (drawable != null) {
            svg1.m79448B(drawable, resources2, xmlPullParser, attributeSet, theme);
            return;
        }
        x4b1 x4b1Var = this.f279194b;
        x4b1Var.f258047b = new w4b1();
        TypedArray typedArrayM52803y = ja61.m52803y(resources2, theme, attributeSet, e95.f57362a);
        x4b1 x4b1Var2 = this.f279194b;
        w4b1 w4b1Var = x4b1Var2.f258047b;
        int iM52799u = ja61.m52799u(typedArrayM52803y, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = 3;
        int i4 = 5;
        if (iM52799u == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iM52799u != 5) {
            if (iM52799u != 9) {
                switch (iM52799u) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        x4b1Var2.f258049d = mode;
        ColorStateList colorStateListM52796r = ja61.m52796r(typedArrayM52803y, xmlPullParser, theme);
        if (colorStateListM52796r != null) {
            x4b1Var2.f258048c = colorStateListM52796r;
        }
        x4b1Var2.f258050e = ja61.m52795q(typedArrayM52803y, xmlPullParser, x4b1Var2.f258050e);
        w4b1Var.f247780j = ja61.m52798t(typedArrayM52803y, xmlPullParser, "viewportWidth", 7, w4b1Var.f247780j);
        float fM52798t = ja61.m52798t(typedArrayM52803y, xmlPullParser, "viewportHeight", 8, w4b1Var.f247781k);
        w4b1Var.f247781k = fM52798t;
        if (w4b1Var.f247780j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM52803y.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fM52798t > 0.0f) {
            w4b1Var.f247778h = typedArrayM52803y.getDimension(3, w4b1Var.f247778h);
            int i5 = 2;
            float dimension = typedArrayM52803y.getDimension(2, w4b1Var.f247779i);
            w4b1Var.f247779i = dimension;
            if (w4b1Var.f247778h <= 0.0f) {
                throw new XmlPullParserException(typedArrayM52803y.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                w4b1Var.setAlpha(ja61.m52798t(typedArrayM52803y, xmlPullParser, "alpha", 4, w4b1Var.getAlpha()));
                String string = typedArrayM52803y.getString(0);
                if (string != null) {
                    w4b1Var.f247783m = string;
                    w4b1Var.f247785o.put(string, w4b1Var);
                }
                typedArrayM52803y.recycle();
                x4b1Var.f258046a = getChangingConfigurations();
                int i6 = 1;
                x4b1Var.f258056k = true;
                x4b1 x4b1Var3 = this.f279194b;
                w4b1 w4b1Var2 = x4b1Var3.f258047b;
                ArrayDeque arrayDeque = new ArrayDeque();
                t4b1 t4b1Var = w4b1Var2.f247777g;
                uj5 uj5Var = w4b1Var2.f247785o;
                arrayDeque.push(t4b1Var);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i3)) {
                    if (eventType == i5) {
                        String name = xmlPullParser.getName();
                        t4b1 t4b1Var2 = (t4b1) arrayDeque.peek();
                        if ("path".equals(name)) {
                            s4b1 s4b1Var = new s4b1();
                            s4b1Var.m77194e(resources2, xmlPullParser, attributeSet, theme);
                            t4b1Var2.f216962b.add(s4b1Var);
                            if (s4b1Var.getPathName() != null) {
                                uj5Var.put(s4b1Var.getPathName(), s4b1Var);
                            }
                            x4b1Var3.f258046a = x4b1Var3.f258046a;
                            c2 = 4;
                            z = false;
                        } else {
                            if ("clip-path".equals(name)) {
                                r4b1 r4b1Var = new r4b1();
                                r4b1Var.m74745e(resources2, xmlPullParser, attributeSet, theme);
                                t4b1Var2.f216962b.add(r4b1Var);
                                if (r4b1Var.getPathName() != null) {
                                    uj5Var.put(r4b1Var.getPathName(), r4b1Var);
                                }
                                x4b1Var3.f258046a = x4b1Var3.f258046a;
                            } else if ("group".equals(name)) {
                                t4b1 t4b1Var3 = new t4b1();
                                TypedArray typedArrayM52803y2 = ja61.m52803y(resources2, theme, attributeSet, e95.f57363b);
                                t4b1Var3.f216963c = ja61.m52798t(typedArrayM52803y2, xmlPullParser, "rotation", i4, t4b1Var3.f216963c);
                                t4b1Var3.f216964d = typedArrayM52803y2.getFloat(1, t4b1Var3.f216964d);
                                t4b1Var3.f216965e = typedArrayM52803y2.getFloat(2, t4b1Var3.f216965e);
                                t4b1Var3.f216966f = ja61.m52798t(typedArrayM52803y2, xmlPullParser, "scaleX", 3, t4b1Var3.f216966f);
                                c2 = 4;
                                t4b1Var3.f216967g = ja61.m52798t(typedArrayM52803y2, xmlPullParser, "scaleY", 4, t4b1Var3.f216967g);
                                t4b1Var3.f216968h = ja61.m52798t(typedArrayM52803y2, xmlPullParser, "translateX", 6, t4b1Var3.f216968h);
                                t4b1Var3.f216969i = ja61.m52798t(typedArrayM52803y2, xmlPullParser, "translateY", 7, t4b1Var3.f216969i);
                                String string2 = typedArrayM52803y2.getString(0);
                                if (string2 != null) {
                                    t4b1Var3.f216971k = string2;
                                }
                                t4b1Var3.m80059c();
                                typedArrayM52803y2.recycle();
                                t4b1Var2.f216962b.add(t4b1Var3);
                                arrayDeque.push(t4b1Var3);
                                if (t4b1Var3.getGroupName() != null) {
                                    uj5Var.put(t4b1Var3.getGroupName(), t4b1Var3);
                                }
                                x4b1Var3.f258046a = x4b1Var3.f258046a;
                            }
                            c2 = 4;
                        }
                        c = c2;
                        i2 = 3;
                        i = 1;
                    } else {
                        i = i6;
                        i2 = i3;
                        c = 4;
                        if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    resources2 = resources;
                    i3 = i2;
                    i6 = i;
                    i5 = 2;
                    i4 = 5;
                }
                if (!z) {
                    this.f279195c = m95342b(x4b1Var.f258048c, x4b1Var.f258049d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM52803y.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM52803y.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public z4b1(x4b1 x4b1Var) {
        this.f279198f = true;
        this.f279199g = new float[9];
        this.f279200h = new Matrix();
        this.f279201i = new Rect();
        this.f279194b = x4b1Var;
        this.f279195c = m95342b(x4b1Var.f258048c, x4b1Var.f258049d);
    }
}
