package p204p;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class tjc extends Property {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f220885a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tjc(int i, Class cls, String str) {
        super(cls, str);
        this.f220885a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f220885a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((zde) obj).f281703t);
            case 6:
                return Float.valueOf(((zde) obj).f281696X);
            case 7:
                return Float.valueOf(((egs) obj).m38876b());
            case 8:
                return Float.valueOf(((zk80) obj).f283682t);
            case 9:
                return Float.valueOf(((bl80) obj).f28119X);
            case 10:
                return Integer.valueOf(((xoy0) obj).getLevel());
            case 11:
                return Float.valueOf(((SwitchCompat) obj).f280a1);
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f220885a) {
            case 0:
                wjc wjcVar = (wjc) obj;
                PointF pointF = (PointF) obj2;
                wjcVar.getClass();
                wjcVar.f251932a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                wjcVar.f251933b = iRound;
                int i = wjcVar.f251937f + 1;
                wjcVar.f251937f = i;
                if (i == wjcVar.f251938g) {
                    bpc1.m30114a(wjcVar.f251936e, wjcVar.f251932a, iRound, wjcVar.f251934c, wjcVar.f251935d);
                    wjcVar.f251937f = 0;
                    wjcVar.f251938g = 0;
                }
                break;
            case 1:
                wjc wjcVar2 = (wjc) obj;
                PointF pointF2 = (PointF) obj2;
                wjcVar2.getClass();
                wjcVar2.f251934c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                wjcVar2.f251935d = iRound2;
                int i2 = wjcVar2.f251938g + 1;
                wjcVar2.f251938g = i2;
                if (wjcVar2.f251937f == i2) {
                    bpc1.m30114a(wjcVar2.f251936e, wjcVar2.f251932a, wjcVar2.f251933b, wjcVar2.f251934c, iRound2);
                    wjcVar2.f251937f = 0;
                    wjcVar2.f251938g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                bpc1.m30114a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                bpc1.m30114a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                bpc1.m30114a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                zde zdeVar = (zde) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                zdeVar.f281703t = fFloatValue;
                int i3 = (int) (5400.0f * fFloatValue);
                ydy ydyVar = zdeVar.f281700g;
                float[] fArr = (float[]) zdeVar.f226862c;
                float f = fFloatValue * 1520.0f;
                boolean z = false;
                fArr[0] = (-20.0f) + f;
                fArr[1] = f;
                for (int i4 = 0; i4 < 4; i4++) {
                    float f2 = 667;
                    fArr[1] = (ydyVar.getInterpolation((i3 - zde.f281695Z[i4]) / f2) * 250.0f) + fArr[1];
                    fArr[0] = (ydyVar.getInterpolation((i3 - zde.f281691L0[i4]) / f2) * 250.0f) + fArr[0];
                }
                float f3 = fArr[0];
                float f4 = fArr[1];
                float f5 = ((f4 - f3) * zdeVar.f281696X) + f3;
                fArr[0] = f5;
                fArr[0] = f5 / 360.0f;
                fArr[1] = f4 / 360.0f;
                gee geeVar = zdeVar.f281701h;
                int i5 = 0;
                while (i5 < 4) {
                    float f6 = (i3 - zde.f281692M0[i5]) / 333;
                    if (f6 >= 0.0f && f6 <= 1.0f) {
                        int i6 = i5 + zdeVar.f281702i;
                        int[] iArr = geeVar.f107387c;
                        int length = i6 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        int iM86385l = vtg1.m86385l(iArr[length], ((tn40) zdeVar.f226861b).f59398t);
                        int iM86385l2 = vtg1.m86385l(geeVar.f107387c[length2], ((tn40) zdeVar.f226861b).f59398t);
                        float interpolation = ydyVar.getInterpolation(f6);
                        int[] iArr2 = (int[]) zdeVar.f226863d;
                        Integer numValueOf = Integer.valueOf(iM86385l);
                        Integer numValueOf2 = Integer.valueOf(iM86385l2);
                        int iIntValue = numValueOf.intValue();
                        float f7 = ((iIntValue >> 24) & 255) / 255.0f;
                        int iIntValue2 = numValueOf2.intValue();
                        float f8 = ((iIntValue2 >> 24) & 255) / 255.0f;
                        boolean z2 = z;
                        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
                        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
                        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
                        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
                        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
                        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
                        float fM38555d = edb.m38555d(f8, f7, interpolation, f7);
                        float fM38555d2 = edb.m38555d(fPow4, fPow, interpolation, fPow);
                        float fM38555d3 = edb.m38555d(fPow5, fPow2, interpolation, fPow2);
                        float fM38555d4 = edb.m38555d(fPow6, fPow3, interpolation, fPow3);
                        float fPow7 = ((float) Math.pow(fM38555d2, 0.45454545454545453d)) * 255.0f;
                        float fPow8 = ((float) Math.pow(fM38555d3, 0.45454545454545453d)) * 255.0f;
                        iArr2[z2 ? 1 : 0] = Integer.valueOf(Math.round(((float) Math.pow(fM38555d4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM38555d * 255.0f) << 24) | (Math.round(fPow8) << 8)).intValue();
                        ((tn40) zdeVar.f226861b).invalidateSelf();
                    } else {
                        i5++;
                        z = z;
                    }
                    break;
                }
                ((tn40) zdeVar.f226861b).invalidateSelf();
                break;
            case 6:
                ((zde) obj).f281696X = ((Float) obj2).floatValue();
                break;
            case 7:
                egs egsVar = (egs) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (egsVar.f59396h != fFloatValue2) {
                    egsVar.f59396h = fFloatValue2;
                    egsVar.invalidateSelf();
                }
                break;
            case 8:
                zk80 zk80Var = (zk80) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                zk80Var.f283682t = fFloatValue3;
                float[] fArr2 = (float[]) zk80Var.f226862c;
                fArr2[0] = 0.0f;
                float f9 = ((int) (fFloatValue3 * 333.0f)) / 667;
                ydy ydyVar2 = zk80Var.f283678f;
                float interpolation2 = ydyVar2.getInterpolation(f9);
                fArr2[2] = interpolation2;
                fArr2[1] = interpolation2;
                float interpolation3 = ydyVar2.getInterpolation(f9 + 0.49925038f);
                fArr2[4] = interpolation3;
                fArr2[3] = interpolation3;
                fArr2[5] = 1.0f;
                if (zk80Var.f283681i && interpolation3 < 1.0f) {
                    int[] iArr3 = (int[]) zk80Var.f226863d;
                    iArr3[2] = iArr3[1];
                    iArr3[1] = iArr3[0];
                    iArr3[0] = vtg1.m86385l(zk80Var.f283679g.f107387c[zk80Var.f283680h], ((tn40) zk80Var.f226861b).f59398t);
                    zk80Var.f283681i = false;
                }
                ((tn40) zk80Var.f226861b).invalidateSelf();
                break;
            case 9:
                bl80 bl80Var = (bl80) obj;
                float fFloatValue4 = ((Float) obj2).floatValue();
                bl80Var.f28119X = fFloatValue4;
                int i7 = (int) (fFloatValue4 * 1800.0f);
                for (int i8 = 0; i8 < 4; i8++) {
                    ((float[]) bl80Var.f226862c)[i8] = Math.max(0.0f, Math.min(1.0f, bl80Var.f28123g[i8].getInterpolation((i7 - bl80.f28116L0[i8]) / bl80.f28118Z[i8])));
                }
                if (bl80Var.f28126t) {
                    Arrays.fill((int[]) bl80Var.f226863d, vtg1.m86385l(bl80Var.f28124h.f107387c[bl80Var.f28125i], ((tn40) bl80Var.f226861b).f59398t));
                    bl80Var.f28126t = false;
                }
                ((tn40) bl80Var.f226861b).invalidateSelf();
                break;
            case 10:
                ((xoy0) obj).setLevel(((Integer) obj2).intValue());
                break;
            case 11:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjc(int i) {
        super(PointF.class, "topLeft");
        this.f220885a = i;
        switch (i) {
            case 1:
                super(PointF.class, "bottomRight");
                break;
            case 2:
                super(PointF.class, "bottomRight");
                break;
            case 3:
                super(PointF.class, "topLeft");
                break;
            case 4:
                super(PointF.class, "position");
                break;
            case 11:
                super(Float.class, "thumbPos");
                break;
            case 12:
                super(Rect.class, "clipBounds");
                break;
            default:
                break;
        }
    }
}
