package p204p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public final class s4b1 extends v4b1 {

    /* JADX INFO: renamed from: d */
    public zk1 f205545d;

    /* JADX INFO: renamed from: e */
    public float f205546e;

    /* JADX INFO: renamed from: f */
    public zk1 f205547f;

    /* JADX INFO: renamed from: g */
    public float f205548g;

    /* JADX INFO: renamed from: h */
    public float f205549h;

    /* JADX INFO: renamed from: i */
    public float f205550i;

    /* JADX INFO: renamed from: j */
    public float f205551j;

    /* JADX INFO: renamed from: k */
    public float f205552k;

    /* JADX INFO: renamed from: l */
    public Paint.Cap f205553l;

    /* JADX INFO: renamed from: m */
    public Paint.Join f205554m;

    /* JADX INFO: renamed from: n */
    public float f205555n;

    public s4b1() {
        this.f205546e = 0.0f;
        this.f205548g = 1.0f;
        this.f205549h = 1.0f;
        this.f205550i = 0.0f;
        this.f205551j = 1.0f;
        this.f205552k = 0.0f;
        this.f205553l = Paint.Cap.BUTT;
        this.f205554m = Paint.Join.MITER;
        this.f205555n = 4.0f;
    }

    @Override // p204p.u4b1
    /* JADX INFO: renamed from: a */
    public final boolean mo77192a() {
        return this.f205547f.m96260C() || this.f205545d.m96260C();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // p204p.u4b1
    /* JADX INFO: renamed from: b */
    public final boolean mo77193b(int[] iArr) {
        boolean z;
        zk1 zk1Var = this.f205547f;
        boolean z2 = true;
        if (zk1Var.m96260C()) {
            ColorStateList colorStateList = (ColorStateList) zk1Var.f283579b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != zk1Var.f283580c) {
                zk1Var.f283580c = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        zk1 zk1Var2 = this.f205545d;
        if (zk1Var2.m96260C()) {
            ColorStateList colorStateList2 = (ColorStateList) zk1Var2.f283579b;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != zk1Var2.f283580c) {
                zk1Var2.f283580c = colorForState2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return z | z2;
    }

    /* JADX INFO: renamed from: e */
    public final void m77194e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayM52803y = ja61.m52803y(resources, theme, attributeSet, e95.f57364c);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            String string = typedArrayM52803y.getString(0);
            if (string != null) {
                this.f237111b = string;
            }
            String string2 = typedArrayM52803y.getString(2);
            if (string2 != null) {
                this.f237110a = n0e1.m63445v(string2);
            }
            this.f205547f = ja61.m52797s(typedArrayM52803y, xmlPullParser, theme, "fillColor", 1);
            float f = this.f205549h;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                f = typedArrayM52803y.getFloat(12, f);
            }
            this.f205549h = f;
            int i = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM52803y.getInt(8, -1) : -1;
            Paint.Cap cap = this.f205553l;
            if (i == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i == 1) {
                cap = Paint.Cap.ROUND;
            } else if (i == 2) {
                cap = Paint.Cap.SQUARE;
            }
            this.f205553l = cap;
            int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM52803y.getInt(9, -1) : -1;
            Paint.Join join = this.f205554m;
            if (i2 == 0) {
                join = Paint.Join.MITER;
            } else if (i2 == 1) {
                join = Paint.Join.ROUND;
            } else if (i2 == 2) {
                join = Paint.Join.BEVEL;
            }
            this.f205554m = join;
            float f2 = this.f205555n;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                f2 = typedArrayM52803y.getFloat(10, f2);
            }
            this.f205555n = f2;
            this.f205545d = ja61.m52797s(typedArrayM52803y, xmlPullParser, theme, "strokeColor", 3);
            float f3 = this.f205548g;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                f3 = typedArrayM52803y.getFloat(11, f3);
            }
            this.f205548g = f3;
            float f4 = this.f205546e;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                f4 = typedArrayM52803y.getFloat(4, f4);
            }
            this.f205546e = f4;
            float f5 = this.f205551j;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                f5 = typedArrayM52803y.getFloat(6, f5);
            }
            this.f205551j = f5;
            float f6 = this.f205552k;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                f6 = typedArrayM52803y.getFloat(7, f6);
            }
            this.f205552k = f6;
            float f7 = this.f205550i;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                f7 = typedArrayM52803y.getFloat(5, f7);
            }
            this.f205550i = f7;
            int i3 = this.f237112c;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                i3 = typedArrayM52803y.getInt(13, i3);
            }
            this.f237112c = i3;
        }
        typedArrayM52803y.recycle();
    }

    public float getFillAlpha() {
        return this.f205549h;
    }

    public int getFillColor() {
        return this.f205547f.f283580c;
    }

    public float getStrokeAlpha() {
        return this.f205548g;
    }

    public int getStrokeColor() {
        return this.f205545d.f283580c;
    }

    public float getStrokeWidth() {
        return this.f205546e;
    }

    public float getTrimPathEnd() {
        return this.f205551j;
    }

    public float getTrimPathOffset() {
        return this.f205552k;
    }

    public float getTrimPathStart() {
        return this.f205550i;
    }

    public void setFillAlpha(float f) {
        this.f205549h = f;
    }

    public void setFillColor(int i) {
        this.f205547f.f283580c = i;
    }

    public void setStrokeAlpha(float f) {
        this.f205548g = f;
    }

    public void setStrokeColor(int i) {
        this.f205545d.f283580c = i;
    }

    public void setStrokeWidth(float f) {
        this.f205546e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f205551j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f205552k = f;
    }

    public void setTrimPathStart(float f) {
        this.f205550i = f;
    }

    public s4b1(s4b1 s4b1Var) {
        super(s4b1Var);
        this.f205546e = 0.0f;
        this.f205548g = 1.0f;
        this.f205549h = 1.0f;
        this.f205550i = 0.0f;
        this.f205551j = 1.0f;
        this.f205552k = 0.0f;
        this.f205553l = Paint.Cap.BUTT;
        this.f205554m = Paint.Join.MITER;
        this.f205555n = 4.0f;
        this.f205545d = s4b1Var.f205545d;
        this.f205546e = s4b1Var.f205546e;
        this.f205548g = s4b1Var.f205548g;
        this.f205547f = s4b1Var.f205547f;
        this.f237112c = s4b1Var.f237112c;
        this.f205549h = s4b1Var.f205549h;
        this.f205550i = s4b1Var.f205550i;
        this.f205551j = s4b1Var.f205551j;
        this.f205552k = s4b1Var.f205552k;
        this.f205553l = s4b1Var.f205553l;
        this.f205554m = s4b1Var.f205554m;
        this.f205555n = s4b1Var.f205555n;
    }
}
