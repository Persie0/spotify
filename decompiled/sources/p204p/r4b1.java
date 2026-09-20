package p204p;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public final class r4b1 extends v4b1 {
    public r4b1() {
    }

    /* JADX INFO: renamed from: e */
    public final void m74745e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            TypedArray typedArrayM52803y = ja61.m52803y(resources, theme, attributeSet, e95.f57365d);
            String string = typedArrayM52803y.getString(0);
            if (string != null) {
                this.f237111b = string;
            }
            String string2 = typedArrayM52803y.getString(1);
            if (string2 != null) {
                this.f237110a = n0e1.m63445v(string2);
            }
            this.f237112c = ja61.m52800v(xmlPullParser, "fillType") ? typedArrayM52803y.getInt(2, 0) : 0;
            typedArrayM52803y.recycle();
        }
    }

    public r4b1(r4b1 r4b1Var) {
        super(r4b1Var);
    }
}
