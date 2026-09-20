package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p204p.au60;
import p204p.b2u0;
import p204p.d6j;
import p204p.pt60;
import p204p.zjc1;
import p204p.zt60;

/* JADX INFO: loaded from: classes3.dex */
public class KeyCycle extends pt60 {

    /* JADX INFO: renamed from: e */
    public int f567e = 0;

    /* JADX INFO: renamed from: f */
    public int f568f = -1;

    /* JADX INFO: renamed from: g */
    public String f569g = null;

    /* JADX INFO: renamed from: h */
    public float f570h = Float.NaN;

    /* JADX INFO: renamed from: i */
    public float f571i = 0.0f;

    /* JADX INFO: renamed from: j */
    public float f572j = 0.0f;

    /* JADX INFO: renamed from: k */
    public float f573k = Float.NaN;

    /* JADX INFO: renamed from: l */
    public int f574l = -1;

    /* JADX INFO: renamed from: m */
    public float f575m = Float.NaN;

    /* JADX INFO: renamed from: n */
    public float f576n = Float.NaN;

    /* JADX INFO: renamed from: o */
    public float f577o = Float.NaN;

    /* JADX INFO: renamed from: p */
    public float f578p = Float.NaN;

    /* JADX INFO: renamed from: q */
    public float f579q = Float.NaN;

    /* JADX INFO: renamed from: r */
    public float f580r = Float.NaN;

    /* JADX INFO: renamed from: s */
    public float f581s = Float.NaN;

    /* JADX INFO: renamed from: t */
    public float f582t = Float.NaN;

    /* JADX INFO: renamed from: u */
    public float f583u = Float.NaN;

    /* JADX INFO: renamed from: v */
    public float f584v = Float.NaN;

    /* JADX INFO: renamed from: w */
    public float f585w = Float.NaN;

    public KeyCycle() {
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
        KeyCycle keyCycle = new KeyCycle();
        super.m70909c(this);
        keyCycle.f567e = this.f567e;
        keyCycle.f568f = this.f568f;
        keyCycle.f569g = this.f569g;
        keyCycle.f570h = this.f570h;
        keyCycle.f571i = this.f571i;
        keyCycle.f572j = this.f572j;
        keyCycle.f573k = this.f573k;
        keyCycle.f574l = this.f574l;
        keyCycle.f575m = this.f575m;
        keyCycle.f576n = this.f576n;
        keyCycle.f577o = this.f577o;
        keyCycle.f578p = this.f578p;
        keyCycle.f579q = this.f579q;
        keyCycle.f580r = this.f580r;
        keyCycle.f581s = this.f581s;
        keyCycle.f582t = this.f582t;
        keyCycle.f583u = this.f583u;
        keyCycle.f584v = this.f584v;
        keyCycle.f585w = this.f585w;
        return keyCycle;
    }

    @Override // p204p.pt60
    /* JADX INFO: renamed from: d */
    public final void mo318d(HashSet hashSet) {
        if (!Float.isNaN(this.f575m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f576n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f577o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f579q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f580r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f581s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f582t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f578p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f583u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f584v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f585w)) {
            hashSet.add("translationZ");
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b2u0.f22702f);
        SparseIntArray sparseIntArray = zt60.f286076a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = zt60.f286076a;
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
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f567e = typedArrayObtainStyledAttributes.getInteger(index, this.f567e);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f569g = typedArrayObtainStyledAttributes.getString(index);
                        this.f568f = 7;
                    } else {
                        this.f568f = typedArrayObtainStyledAttributes.getInt(index, this.f568f);
                    }
                    break;
                case 6:
                    this.f570h = typedArrayObtainStyledAttributes.getFloat(index, this.f570h);
                    break;
                case 7:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f571i = typedArrayObtainStyledAttributes.getDimension(index, this.f571i);
                    } else {
                        this.f571i = typedArrayObtainStyledAttributes.getFloat(index, this.f571i);
                    }
                    break;
                case 8:
                    this.f574l = typedArrayObtainStyledAttributes.getInt(index, this.f574l);
                    break;
                case 9:
                    this.f575m = typedArrayObtainStyledAttributes.getFloat(index, this.f575m);
                    break;
                case 10:
                    this.f576n = typedArrayObtainStyledAttributes.getDimension(index, this.f576n);
                    break;
                case 11:
                    this.f577o = typedArrayObtainStyledAttributes.getFloat(index, this.f577o);
                    break;
                case 12:
                    this.f579q = typedArrayObtainStyledAttributes.getFloat(index, this.f579q);
                    break;
                case 13:
                    this.f580r = typedArrayObtainStyledAttributes.getFloat(index, this.f580r);
                    break;
                case 14:
                    this.f578p = typedArrayObtainStyledAttributes.getFloat(index, this.f578p);
                    break;
                case 15:
                    this.f581s = typedArrayObtainStyledAttributes.getFloat(index, this.f581s);
                    break;
                case 16:
                    this.f582t = typedArrayObtainStyledAttributes.getFloat(index, this.f582t);
                    break;
                case 17:
                    this.f583u = typedArrayObtainStyledAttributes.getDimension(index, this.f583u);
                    break;
                case 18:
                    this.f584v = typedArrayObtainStyledAttributes.getDimension(index, this.f584v);
                    break;
                case 19:
                    this.f585w = typedArrayObtainStyledAttributes.getDimension(index, this.f585w);
                    break;
                case 20:
                    this.f573k = typedArrayObtainStyledAttributes.getFloat(index, this.f573k);
                    break;
                case 21:
                    this.f572j = typedArrayObtainStyledAttributes.getFloat(index, this.f572j) / 360.0f;
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m321g(HashMap map) {
        zjc1 zjc1Var;
        float f;
        zjc1 zjc1Var2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                d6j d6jVar = (d6j) this.f181056d.get(str.substring(7));
                if (d6jVar != null && d6jVar.f45706c == 2 && (zjc1Var = (zjc1) map.get(str)) != null) {
                    int i = this.f181053a;
                    int i2 = this.f568f;
                    String str2 = this.f569g;
                    int i3 = this.f574l;
                    zjc1Var.f283421f.add(new au60(this.f570h, this.f571i, this.f572j, d6jVar.m35118b(), i));
                    if (i3 != -1) {
                        zjc1Var.f283420e = i3;
                    }
                    zjc1Var.f283418c = i2;
                    zjc1Var.mo88289c(d6jVar);
                    zjc1Var.f283419d = str2;
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f = this.f579q;
                        break;
                    case "rotationY":
                        f = this.f580r;
                        break;
                    case "translationX":
                        f = this.f583u;
                        break;
                    case "translationY":
                        f = this.f584v;
                        break;
                    case "translationZ":
                        f = this.f585w;
                        break;
                    case "progress":
                        f = this.f573k;
                        break;
                    case "scaleX":
                        f = this.f581s;
                        break;
                    case "scaleY":
                        f = this.f582t;
                        break;
                    case "rotation":
                        f = this.f577o;
                        break;
                    case "elevation":
                        f = this.f576n;
                        break;
                    case "transitionPathRotate":
                        f = this.f578p;
                        break;
                    case "alpha":
                        f = this.f575m;
                        break;
                    case "waveOffset":
                        f = this.f571i;
                        break;
                    case "wavePhase":
                        f = this.f572j;
                        break;
                    default:
                        str.startsWith("CUSTOM");
                        f = Float.NaN;
                        break;
                }
                float f2 = f;
                if (!Float.isNaN(f2) && (zjc1Var2 = (zjc1) map.get(str)) != null) {
                    int i4 = this.f181053a;
                    int i5 = this.f568f;
                    String str3 = this.f569g;
                    int i6 = this.f574l;
                    zjc1Var2.f283421f.add(new au60(this.f570h, this.f571i, this.f572j, f2, i4));
                    if (i6 != -1) {
                        zjc1Var2.f283420e = i6;
                    }
                    zjc1Var2.f283418c = i5;
                    zjc1Var2.f283419d = str3;
                }
            }
        }
    }
}
