package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p204p.b2u0;
import p204p.d6j;
import p204p.edb;
import p204p.jlc1;
import p204p.mlc1;
import p204p.pt60;
import p204p.vt60;

/* JADX INFO: loaded from: classes3.dex */
public class KeyAttributes extends pt60 {

    /* JADX INFO: renamed from: e */
    public int f552e = -1;

    /* JADX INFO: renamed from: f */
    public float f553f = Float.NaN;

    /* JADX INFO: renamed from: g */
    public float f554g = Float.NaN;

    /* JADX INFO: renamed from: h */
    public float f555h = Float.NaN;

    /* JADX INFO: renamed from: i */
    public float f556i = Float.NaN;

    /* JADX INFO: renamed from: j */
    public float f557j = Float.NaN;

    /* JADX INFO: renamed from: k */
    public float f558k = Float.NaN;

    /* JADX INFO: renamed from: l */
    public float f559l = Float.NaN;

    /* JADX INFO: renamed from: m */
    public float f560m = Float.NaN;

    /* JADX INFO: renamed from: n */
    public float f561n = Float.NaN;

    /* JADX INFO: renamed from: o */
    public float f562o = Float.NaN;

    /* JADX INFO: renamed from: p */
    public float f563p = Float.NaN;

    /* JADX INFO: renamed from: q */
    public float f564q = Float.NaN;

    /* JADX INFO: renamed from: r */
    public float f565r = Float.NaN;

    /* JADX INFO: renamed from: s */
    public float f566s = Float.NaN;

    public KeyAttributes() {
        this.f181056d = new HashMap();
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: a */
    public final void mo316a(HashMap map) {
        for (String str : map.keySet()) {
            mlc1 mlc1Var = (mlc1) map.get(str);
            if (mlc1Var != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f556i)) {
                                break;
                            } else {
                                mlc1Var.mo53671b(this.f556i, this.f181053a);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f557j)) {
                                break;
                            } else {
                                mlc1Var.mo53671b(this.f557j, this.f181053a);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f563p)) {
                                break;
                            } else {
                                mlc1Var.mo53671b(this.f563p, this.f181053a);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f564q)) {
                                break;
                            } else {
                                mlc1Var.mo53671b(this.f564q, this.f181053a);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f565r)) {
                                break;
                            } else {
                                mlc1Var.mo53671b(this.f565r, this.f181053a);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f566s)) {
                                break;
                            } else {
                                mlc1Var.mo53671b(this.f566s, this.f181053a);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f561n)) {
                                break;
                            } else {
                                mlc1Var.mo53671b(this.f561n, this.f181053a);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f562o)) {
                                break;
                            } else {
                                mlc1Var.mo53671b(this.f562o, this.f181053a);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.f556i)) {
                                break;
                            } else {
                                mlc1Var.mo53671b(this.f558k, this.f181053a);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.f557j)) {
                                break;
                            } else {
                                mlc1Var.mo53671b(this.f559l, this.f181053a);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f555h)) {
                                break;
                            } else {
                                mlc1Var.mo53671b(this.f555h, this.f181053a);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f554g)) {
                                break;
                            } else {
                                mlc1Var.mo53671b(this.f554g, this.f181053a);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f560m)) {
                                break;
                            } else {
                                mlc1Var.mo53671b(this.f560m, this.f181053a);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f553f)) {
                                break;
                            } else {
                                mlc1Var.mo53671b(this.f553f, this.f181053a);
                                break;
                            }
                            break;
                    }
                } else {
                    d6j d6jVar = (d6j) this.f181056d.get(str.substring(7));
                    if (d6jVar != null) {
                        ((jlc1) mlc1Var).f113581f.append(this.f181053a, d6jVar);
                    }
                }
            }
        }
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: b */
    public final pt60 clone() {
        KeyAttributes keyAttributes = new KeyAttributes();
        super.m70909c(this);
        keyAttributes.f552e = this.f552e;
        keyAttributes.f553f = this.f553f;
        keyAttributes.f554g = this.f554g;
        keyAttributes.f555h = this.f555h;
        keyAttributes.f556i = this.f556i;
        keyAttributes.f557j = this.f557j;
        keyAttributes.f558k = this.f558k;
        keyAttributes.f559l = this.f559l;
        keyAttributes.f560m = this.f560m;
        keyAttributes.f561n = this.f561n;
        keyAttributes.f562o = this.f562o;
        keyAttributes.f563p = this.f563p;
        keyAttributes.f564q = this.f564q;
        keyAttributes.f565r = this.f565r;
        keyAttributes.f566s = this.f566s;
        return keyAttributes;
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: d */
    public final void mo318d(HashSet hashSet) {
        if (!Float.isNaN(this.f553f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f554g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f555h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f556i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f557j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f558k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f559l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f563p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f564q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f565r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f560m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f561n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f562o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f566s)) {
            hashSet.add("progress");
        }
        if (this.f181056d.size() > 0) {
            Iterator it = this.f181056d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: e */
    public final void mo319e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b2u0.f22701e);
        SparseIntArray sparseIntArray = vt60.f244562a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = vt60.f244562a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f553f = typedArrayObtainStyledAttributes.getFloat(index, this.f553f);
                    break;
                case 2:
                    this.f554g = typedArrayObtainStyledAttributes.getDimension(index, this.f554g);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f555h = typedArrayObtainStyledAttributes.getFloat(index, this.f555h);
                    break;
                case 5:
                    this.f556i = typedArrayObtainStyledAttributes.getFloat(index, this.f556i);
                    break;
                case 6:
                    this.f557j = typedArrayObtainStyledAttributes.getFloat(index, this.f557j);
                    break;
                case 7:
                    this.f561n = typedArrayObtainStyledAttributes.getFloat(index, this.f561n);
                    break;
                case 8:
                    this.f560m = typedArrayObtainStyledAttributes.getFloat(index, this.f560m);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f181053a = typedArrayObtainStyledAttributes.getInt(index, this.f181053a);
                    break;
                case 13:
                    this.f552e = typedArrayObtainStyledAttributes.getInteger(index, this.f552e);
                    break;
                case 14:
                    this.f562o = typedArrayObtainStyledAttributes.getFloat(index, this.f562o);
                    break;
                case 15:
                    this.f563p = typedArrayObtainStyledAttributes.getDimension(index, this.f563p);
                    break;
                case 16:
                    this.f564q = typedArrayObtainStyledAttributes.getDimension(index, this.f564q);
                    break;
                case 17:
                    this.f565r = typedArrayObtainStyledAttributes.getDimension(index, this.f565r);
                    break;
                case 18:
                    this.f566s = typedArrayObtainStyledAttributes.getFloat(index, this.f566s);
                    break;
                case 19:
                    this.f558k = typedArrayObtainStyledAttributes.getDimension(index, this.f558k);
                    break;
                case 20:
                    this.f559l = typedArrayObtainStyledAttributes.getDimension(index, this.f559l);
                    break;
            }
        }
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: f */
    public final void mo320f(HashMap map) {
        if (this.f552e == -1) {
            return;
        }
        if (!Float.isNaN(this.f553f)) {
            map.put("alpha", Integer.valueOf(this.f552e));
        }
        if (!Float.isNaN(this.f554g)) {
            map.put("elevation", Integer.valueOf(this.f552e));
        }
        if (!Float.isNaN(this.f555h)) {
            map.put("rotation", Integer.valueOf(this.f552e));
        }
        if (!Float.isNaN(this.f556i)) {
            map.put("rotationX", Integer.valueOf(this.f552e));
        }
        if (!Float.isNaN(this.f557j)) {
            map.put("rotationY", Integer.valueOf(this.f552e));
        }
        if (!Float.isNaN(this.f558k)) {
            map.put("transformPivotX", Integer.valueOf(this.f552e));
        }
        if (!Float.isNaN(this.f559l)) {
            map.put("transformPivotY", Integer.valueOf(this.f552e));
        }
        if (!Float.isNaN(this.f563p)) {
            map.put("translationX", Integer.valueOf(this.f552e));
        }
        if (!Float.isNaN(this.f564q)) {
            map.put("translationY", Integer.valueOf(this.f552e));
        }
        if (!Float.isNaN(this.f565r)) {
            map.put("translationZ", Integer.valueOf(this.f552e));
        }
        if (!Float.isNaN(this.f560m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f552e));
        }
        if (!Float.isNaN(this.f561n)) {
            map.put("scaleX", Integer.valueOf(this.f552e));
        }
        if (!Float.isNaN(this.f562o)) {
            map.put("scaleY", Integer.valueOf(this.f552e));
        }
        if (!Float.isNaN(this.f566s)) {
            map.put("progress", Integer.valueOf(this.f552e));
        }
        if (this.f181056d.size() > 0) {
            Iterator it = this.f181056d.keySet().iterator();
            while (it.hasNext()) {
                map.put(edb.m38564m("CUSTOM,", (String) it.next()), Integer.valueOf(this.f552e));
            }
        }
    }
}
