package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class dh01 {

    /* JADX INFO: renamed from: a */
    public fem f48937a = ytg1.m94617h();

    /* JADX INFO: renamed from: b */
    public fem f48938b = ytg1.m94617h();

    /* JADX INFO: renamed from: c */
    public fem f48939c = ytg1.m94617h();

    /* JADX INFO: renamed from: d */
    public fem f48940d = ytg1.m94617h();

    /* JADX INFO: renamed from: e */
    public euk f48941e = new C2281q5(0.0f);

    /* JADX INFO: renamed from: f */
    public euk f48942f = new C2281q5(0.0f);

    /* JADX INFO: renamed from: g */
    public euk f48943g = new C2281q5(0.0f);

    /* JADX INFO: renamed from: h */
    public euk f48944h = new C2281q5(0.0f);

    /* JADX INFO: renamed from: i */
    public crs f48945i = ytg1.m94618i();

    /* JADX INFO: renamed from: j */
    public crs f48946j = ytg1.m94618i();

    /* JADX INFO: renamed from: k */
    public crs f48947k = ytg1.m94618i();

    /* JADX INFO: renamed from: l */
    public crs f48948l = ytg1.m94618i();

    /* JADX INFO: renamed from: a */
    public static qyy0 m35957a(Context context, int i, int i2, C2281q5 c2281q5) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, h1u0.f86719H);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            euk eukVarM35959c = m35959c(typedArrayObtainStyledAttributes, 5, c2281q5);
            euk eukVarM35959c2 = m35959c(typedArrayObtainStyledAttributes, 8, eukVarM35959c);
            euk eukVarM35959c3 = m35959c(typedArrayObtainStyledAttributes, 9, eukVarM35959c);
            euk eukVarM35959c4 = m35959c(typedArrayObtainStyledAttributes, 7, eukVarM35959c);
            euk eukVarM35959c5 = m35959c(typedArrayObtainStyledAttributes, 6, eukVarM35959c);
            qyy0 qyy0Var = new qyy0();
            qyy0Var.m74247N(i4, eukVarM35959c2);
            qyy0Var.m74249P(i5, eukVarM35959c3);
            qyy0Var.m74242I(i6, eukVarM35959c4);
            qyy0Var.m74240G(i7, eukVarM35959c5);
            return qyy0Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static qyy0 m35958b(Context context, AttributeSet attributeSet, int i, int i2) {
        C2281q5 c2281q5 = new C2281q5(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1u0.f86713B, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m35957a(context, resourceId, resourceId2, c2281q5);
    }

    /* JADX INFO: renamed from: c */
    public static euk m35959c(TypedArray typedArray, int i, euk eukVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C2281q5(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new l0w0(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return eukVar;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m35960d(RectF rectF) {
        boolean z = this.f48948l.getClass().equals(crs.class) && this.f48946j.getClass().equals(crs.class) && this.f48945i.getClass().equals(crs.class) && this.f48947k.getClass().equals(crs.class);
        float fMo40076a = this.f48941e.mo40076a(rectF);
        return z && ((this.f48942f.mo40076a(rectF) > fMo40076a ? 1 : (this.f48942f.mo40076a(rectF) == fMo40076a ? 0 : -1)) == 0 && (this.f48944h.mo40076a(rectF) > fMo40076a ? 1 : (this.f48944h.mo40076a(rectF) == fMo40076a ? 0 : -1)) == 0 && (this.f48943g.mo40076a(rectF) > fMo40076a ? 1 : (this.f48943g.mo40076a(rectF) == fMo40076a ? 0 : -1)) == 0) && ((this.f48938b instanceof imx0) && (this.f48937a instanceof imx0) && (this.f48939c instanceof imx0) && (this.f48940d instanceof imx0));
    }

    /* JADX INFO: renamed from: e */
    public final dh01 m35961e(float f) {
        qyy0 qyy0Var = new qyy0(this);
        qyy0Var.m74238E(f);
        return qyy0Var.m74257d();
    }
}
