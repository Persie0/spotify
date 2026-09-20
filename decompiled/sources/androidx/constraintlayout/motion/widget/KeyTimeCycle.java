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
import p204p.pt60;
import p204p.vu60;
import p204p.wnc1;
import p204p.znc1;

/* JADX INFO: loaded from: classes3.dex */
public class KeyTimeCycle extends pt60 {

    /* JADX INFO: renamed from: e */
    public int f597e = -1;

    /* JADX INFO: renamed from: f */
    public float f598f = Float.NaN;

    /* JADX INFO: renamed from: g */
    public float f599g = Float.NaN;

    /* JADX INFO: renamed from: h */
    public float f600h = Float.NaN;

    /* JADX INFO: renamed from: i */
    public float f601i = Float.NaN;

    /* JADX INFO: renamed from: j */
    public float f602j = Float.NaN;

    /* JADX INFO: renamed from: k */
    public float f603k = Float.NaN;

    /* JADX INFO: renamed from: l */
    public float f604l = Float.NaN;

    /* JADX INFO: renamed from: m */
    public float f605m = Float.NaN;

    /* JADX INFO: renamed from: n */
    public float f606n = Float.NaN;

    /* JADX INFO: renamed from: o */
    public float f607o = Float.NaN;

    /* JADX INFO: renamed from: p */
    public float f608p = Float.NaN;

    /* JADX INFO: renamed from: q */
    public float f609q = Float.NaN;

    /* JADX INFO: renamed from: r */
    public int f610r = 0;

    /* JADX INFO: renamed from: s */
    public float f611s = Float.NaN;

    /* JADX INFO: renamed from: t */
    public float f612t = 0.0f;

    public KeyTimeCycle() {
        this.f181056d = new HashMap();
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: a */
    public final void mo316a(HashMap map) {
        throw null;
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: b */
    public final pt60 clone() {
        KeyTimeCycle keyTimeCycle = new KeyTimeCycle();
        super.m70909c(this);
        keyTimeCycle.f597e = this.f597e;
        keyTimeCycle.f610r = this.f610r;
        keyTimeCycle.f611s = this.f611s;
        keyTimeCycle.f612t = this.f612t;
        keyTimeCycle.f609q = this.f609q;
        keyTimeCycle.f598f = this.f598f;
        keyTimeCycle.f599g = this.f599g;
        keyTimeCycle.f600h = this.f600h;
        keyTimeCycle.f603k = this.f603k;
        keyTimeCycle.f601i = this.f601i;
        keyTimeCycle.f602j = this.f602j;
        keyTimeCycle.f604l = this.f604l;
        keyTimeCycle.f605m = this.f605m;
        keyTimeCycle.f606n = this.f606n;
        keyTimeCycle.f607o = this.f607o;
        keyTimeCycle.f608p = this.f608p;
        return keyTimeCycle;
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: d */
    public final void mo318d(HashSet hashSet) {
        if (!Float.isNaN(this.f598f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f599g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f600h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f601i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f602j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f606n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f607o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f608p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f603k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f604l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f605m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f609q)) {
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b2u0.f22704h);
        SparseIntArray sparseIntArray = vu60.f244877a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = vu60.f244877a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f598f = typedArrayObtainStyledAttributes.getFloat(index, this.f598f);
                    break;
                case 2:
                    this.f599g = typedArrayObtainStyledAttributes.getDimension(index, this.f599g);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f600h = typedArrayObtainStyledAttributes.getFloat(index, this.f600h);
                    break;
                case 5:
                    this.f601i = typedArrayObtainStyledAttributes.getFloat(index, this.f601i);
                    break;
                case 6:
                    this.f602j = typedArrayObtainStyledAttributes.getFloat(index, this.f602j);
                    break;
                case 7:
                    this.f604l = typedArrayObtainStyledAttributes.getFloat(index, this.f604l);
                    break;
                case 8:
                    this.f603k = typedArrayObtainStyledAttributes.getFloat(index, this.f603k);
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
                    this.f597e = typedArrayObtainStyledAttributes.getInteger(index, this.f597e);
                    break;
                case 14:
                    this.f605m = typedArrayObtainStyledAttributes.getFloat(index, this.f605m);
                    break;
                case 15:
                    this.f606n = typedArrayObtainStyledAttributes.getDimension(index, this.f606n);
                    break;
                case 16:
                    this.f607o = typedArrayObtainStyledAttributes.getDimension(index, this.f607o);
                    break;
                case 17:
                    this.f608p = typedArrayObtainStyledAttributes.getDimension(index, this.f608p);
                    break;
                case 18:
                    this.f609q = typedArrayObtainStyledAttributes.getFloat(index, this.f609q);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.f610r = 7;
                    } else {
                        this.f610r = typedArrayObtainStyledAttributes.getInt(index, this.f610r);
                    }
                    break;
                case 20:
                    this.f611s = typedArrayObtainStyledAttributes.getFloat(index, this.f611s);
                    break;
                case 21:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f612t = typedArrayObtainStyledAttributes.getDimension(index, this.f612t);
                    } else {
                        this.f612t = typedArrayObtainStyledAttributes.getFloat(index, this.f612t);
                    }
                    break;
            }
        }
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: f */
    public final void mo320f(HashMap map) {
        if (this.f597e == -1) {
            return;
        }
        if (!Float.isNaN(this.f598f)) {
            map.put("alpha", Integer.valueOf(this.f597e));
        }
        if (!Float.isNaN(this.f599g)) {
            map.put("elevation", Integer.valueOf(this.f597e));
        }
        if (!Float.isNaN(this.f600h)) {
            map.put("rotation", Integer.valueOf(this.f597e));
        }
        if (!Float.isNaN(this.f601i)) {
            map.put("rotationX", Integer.valueOf(this.f597e));
        }
        if (!Float.isNaN(this.f602j)) {
            map.put("rotationY", Integer.valueOf(this.f597e));
        }
        if (!Float.isNaN(this.f606n)) {
            map.put("translationX", Integer.valueOf(this.f597e));
        }
        if (!Float.isNaN(this.f607o)) {
            map.put("translationY", Integer.valueOf(this.f597e));
        }
        if (!Float.isNaN(this.f608p)) {
            map.put("translationZ", Integer.valueOf(this.f597e));
        }
        if (!Float.isNaN(this.f603k)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f597e));
        }
        if (!Float.isNaN(this.f604l)) {
            map.put("scaleX", Integer.valueOf(this.f597e));
        }
        if (!Float.isNaN(this.f604l)) {
            map.put("scaleY", Integer.valueOf(this.f597e));
        }
        if (!Float.isNaN(this.f609q)) {
            map.put("progress", Integer.valueOf(this.f597e));
        }
        if (this.f181056d.size() > 0) {
            Iterator it = this.f181056d.keySet().iterator();
            while (it.hasNext()) {
                map.put(edb.m38564m("CUSTOM,", (String) it.next()), Integer.valueOf(this.f597e));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m322g(HashMap map) {
        for (String str : map.keySet()) {
            znc1 znc1Var = (znc1) map.get(str);
            if (znc1Var != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f601i)) {
                                break;
                            } else {
                                znc1Var.mo88593c(this.f601i, this.f611s, this.f612t, this.f181053a, this.f610r);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f602j)) {
                                break;
                            } else {
                                znc1Var.mo88593c(this.f602j, this.f611s, this.f612t, this.f181053a, this.f610r);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f606n)) {
                                break;
                            } else {
                                znc1Var.mo88593c(this.f606n, this.f611s, this.f612t, this.f181053a, this.f610r);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f607o)) {
                                break;
                            } else {
                                znc1Var.mo88593c(this.f607o, this.f611s, this.f612t, this.f181053a, this.f610r);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f608p)) {
                                break;
                            } else {
                                znc1Var.mo88593c(this.f608p, this.f611s, this.f612t, this.f181053a, this.f610r);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f609q)) {
                                break;
                            } else {
                                znc1Var.mo88593c(this.f609q, this.f611s, this.f612t, this.f181053a, this.f610r);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f604l)) {
                                break;
                            } else {
                                znc1Var.mo88593c(this.f604l, this.f611s, this.f612t, this.f181053a, this.f610r);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f605m)) {
                                break;
                            } else {
                                znc1Var.mo88593c(this.f605m, this.f611s, this.f612t, this.f181053a, this.f610r);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f600h)) {
                                break;
                            } else {
                                znc1Var.mo88593c(this.f600h, this.f611s, this.f612t, this.f181053a, this.f610r);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f599g)) {
                                break;
                            } else {
                                znc1Var.mo88593c(this.f599g, this.f611s, this.f612t, this.f181053a, this.f610r);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f603k)) {
                                break;
                            } else {
                                znc1Var.mo88593c(this.f603k, this.f611s, this.f612t, this.f181053a, this.f610r);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f598f)) {
                                break;
                            } else {
                                znc1Var.mo88593c(this.f598f, this.f611s, this.f612t, this.f181053a, this.f610r);
                                break;
                            }
                            break;
                    }
                } else {
                    d6j d6jVar = (d6j) this.f181056d.get(str.substring(7));
                    if (d6jVar != null) {
                        wnc1 wnc1Var = (wnc1) znc1Var;
                        int i = this.f181053a;
                        float f = this.f611s;
                        int i2 = this.f610r;
                        float f2 = this.f612t;
                        wnc1Var.f253151l.append(i, d6jVar);
                        wnc1Var.f253152m.append(i, new float[]{f, f2});
                        wnc1Var.f284469b = Math.max(wnc1Var.f284469b, i2);
                    }
                }
            }
        }
    }
}
