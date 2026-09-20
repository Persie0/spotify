package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import p204p.aqs;
import p204p.b2u0;
import p204p.ou60;
import p204p.pt60;

/* JADX INFO: loaded from: classes3.dex */
public class KeyPosition extends KeyPositionBase {

    /* JADX INFO: renamed from: f */
    public String f586f = null;

    /* JADX INFO: renamed from: g */
    public int f587g = -1;

    /* JADX INFO: renamed from: h */
    public int f588h = 0;

    /* JADX INFO: renamed from: i */
    public float f589i = Float.NaN;

    /* JADX INFO: renamed from: j */
    public float f590j = Float.NaN;

    /* JADX INFO: renamed from: k */
    public float f591k = Float.NaN;

    /* JADX INFO: renamed from: l */
    public float f592l = Float.NaN;

    /* JADX INFO: renamed from: m */
    public float f593m = Float.NaN;

    /* JADX INFO: renamed from: n */
    public float f594n = Float.NaN;

    /* JADX INFO: renamed from: o */
    public int f595o = 0;

    @Override // p204p.pt60
    /* JADX INFO: renamed from: a */
    public final void mo316a(HashMap map) {
        throw null;
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: b */
    public final pt60 clone() {
        KeyPosition keyPosition = new KeyPosition();
        super.m70909c(this);
        keyPosition.f586f = this.f586f;
        keyPosition.f587g = this.f587g;
        keyPosition.f588h = this.f588h;
        keyPosition.f589i = this.f589i;
        keyPosition.f590j = Float.NaN;
        keyPosition.f591k = this.f591k;
        keyPosition.f592l = this.f592l;
        keyPosition.f593m = this.f593m;
        keyPosition.f594n = this.f594n;
        return keyPosition;
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: e */
    public final void mo319e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b2u0.f22703g);
        SparseIntArray sparseIntArray = ou60.f170181a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = ou60.f170181a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.f633V1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f181054b);
                        this.f181054b = resourceId;
                        if (resourceId == -1) {
                            this.f181055c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f181055c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f181054b = typedArrayObtainStyledAttributes.getResourceId(index, this.f181054b);
                    }
                    break;
                case 2:
                    this.f181053a = typedArrayObtainStyledAttributes.getInt(index, this.f181053a);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f586f = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f586f = aqs.f18771d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f596e = typedArrayObtainStyledAttributes.getInteger(index, this.f596e);
                    break;
                case 5:
                    this.f588h = typedArrayObtainStyledAttributes.getInt(index, this.f588h);
                    break;
                case 6:
                    this.f591k = typedArrayObtainStyledAttributes.getFloat(index, this.f591k);
                    break;
                case 7:
                    this.f592l = typedArrayObtainStyledAttributes.getFloat(index, this.f592l);
                    break;
                case 8:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f590j);
                    this.f589i = f;
                    this.f590j = f;
                    break;
                case 9:
                    this.f595o = typedArrayObtainStyledAttributes.getInt(index, this.f595o);
                    break;
                case 10:
                    this.f587g = typedArrayObtainStyledAttributes.getInt(index, this.f587g);
                    break;
                case 11:
                    this.f589i = typedArrayObtainStyledAttributes.getFloat(index, this.f589i);
                    break;
                case 12:
                    this.f590j = typedArrayObtainStyledAttributes.getFloat(index, this.f590j);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }
}
