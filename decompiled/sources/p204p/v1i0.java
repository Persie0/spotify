package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.C0043a;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import com.spotify.music.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class v1i0 {

    /* JADX INFO: renamed from: a */
    public final MotionLayout f236369a;

    /* JADX INFO: renamed from: b */
    public final sgz f236370b;

    /* JADX INFO: renamed from: c */
    public u1i0 f236371c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f236372d;

    /* JADX INFO: renamed from: e */
    public final u1i0 f236373e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f236374f;

    /* JADX INFO: renamed from: g */
    public final SparseArray f236375g;

    /* JADX INFO: renamed from: h */
    public final HashMap f236376h;

    /* JADX INFO: renamed from: i */
    public final SparseIntArray f236377i;

    /* JADX INFO: renamed from: j */
    public int f236378j;

    /* JADX INFO: renamed from: k */
    public int f236379k;

    /* JADX INFO: renamed from: l */
    public MotionEvent f236380l;

    /* JADX INFO: renamed from: m */
    public boolean f236381m;

    /* JADX INFO: renamed from: n */
    public boolean f236382n;

    /* JADX INFO: renamed from: o */
    public vbu0 f236383o;

    /* JADX INFO: renamed from: p */
    public boolean f236384p;

    /* JADX INFO: renamed from: q */
    public final x1p0 f236385q;

    /* JADX INFO: renamed from: r */
    public float f236386r;

    /* JADX INFO: renamed from: s */
    public float f236387s;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public v1i0(Context context, MotionLayout motionLayout, int i) {
        this.f236370b = null;
        this.f236371c = null;
        ArrayList arrayList = new ArrayList();
        this.f236372d = arrayList;
        this.f236373e = null;
        this.f236374f = new ArrayList();
        this.f236375g = new SparseArray();
        this.f236376h = new HashMap();
        this.f236377i = new SparseIntArray();
        this.f236378j = 400;
        this.f236379k = 0;
        this.f236381m = false;
        this.f236382n = false;
        this.f236369a = motionLayout;
        this.f236385q = new x1p0(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            u1i0 u1i0Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                m84472i(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                gu60 gu60Var = new gu60(context, xml);
                                if (u1i0Var != null) {
                                    u1i0Var.f225839k.add(gu60Var);
                                }
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                m84474k(context, xml);
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                boc1 boc1Var = new boc1(context, xml);
                                x1p0 x1p0Var = this.f236385q;
                                ((ArrayList) x1p0Var.f257248c).add(boc1Var);
                                x1p0Var.f257249d = null;
                                int i2 = boc1Var.f29074b;
                                if (i2 == 4) {
                                    x1p0.m89643F(boc1Var);
                                } else if (i2 == 5) {
                                    x1p0.m89643F(boc1Var);
                                }
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                u1i0Var = new u1i0(this, context, xml);
                                arrayList.add(u1i0Var);
                                if (this.f236371c == null && !u1i0Var.f225830b) {
                                    this.f236371c = u1i0Var;
                                    fa81 fa81Var = u1i0Var.f225840l;
                                    if (fa81Var != null) {
                                        fa81Var.m41147c(this.f236384p);
                                    }
                                }
                                if (u1i0Var.f225830b) {
                                    if (u1i0Var.f225831c == -1) {
                                        this.f236373e = u1i0Var;
                                    } else {
                                        this.f236374f.add(u1i0Var);
                                    }
                                    arrayList.remove(u1i0Var);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick") && u1i0Var != null && !motionLayout.isInEditMode()) {
                                u1i0Var.f225841m.add(new t1i0(context, u1i0Var, xml));
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (u1i0Var == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                if (u1i0Var != null) {
                                    u1i0Var.f225840l = new fa81(context, motionLayout, xml);
                                }
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                m84475l(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.f236370b = new sgz(context, xml);
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                m84474k(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        this.f236375g.put(R.id.motion_base, new c7j());
        this.f236376h.put("motion_base", Integer.valueOf(R.id.motion_base));
    }

    /* JADX INFO: renamed from: d */
    public static int m84464d(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m84465a(int i, MotionLayout motionLayout) {
        u1i0 u1i0Var;
        if (this.f236383o != null) {
            return false;
        }
        for (u1i0 u1i0Var2 : this.f236372d) {
            int i2 = u1i0Var2.f225842n;
            if (i2 != 0 && ((u1i0Var = this.f236371c) != u1i0Var2 || (u1i0Var.f225846r & 2) == 0)) {
                int i3 = u1i0Var2.f225832d;
                o1i0 o1i0Var = o1i0.f160767d;
                o1i0 o1i0Var2 = o1i0.f160766c;
                o1i0 o1i0Var3 = o1i0.f160765b;
                if (i == i3 && (i2 == 4 || i2 == 2)) {
                    motionLayout.setState(o1i0Var);
                    motionLayout.setTransition(u1i0Var2);
                    if (u1i0Var2.f225842n == 4) {
                        motionLayout.m345z(1.0f);
                        motionLayout.f646M1 = null;
                        motionLayout.setState(o1i0Var3);
                        motionLayout.setState(o1i0Var2);
                        return true;
                    }
                    motionLayout.setProgress(1.0f);
                    motionLayout.m328C(true);
                    motionLayout.setState(o1i0Var3);
                    motionLayout.setState(o1i0Var2);
                    motionLayout.setState(o1i0Var);
                    motionLayout.m333H();
                    return true;
                }
                if (i == u1i0Var2.f225831c && (i2 == 3 || i2 == 1)) {
                    motionLayout.setState(o1i0Var);
                    motionLayout.setTransition(u1i0Var2);
                    if (u1i0Var2.f225842n == 3) {
                        motionLayout.m345z(0.0f);
                        motionLayout.setState(o1i0Var3);
                        motionLayout.setState(o1i0Var2);
                        return true;
                    }
                    motionLayout.setProgress(0.0f);
                    motionLayout.m328C(true);
                    motionLayout.setState(o1i0Var3);
                    motionLayout.setState(o1i0Var2);
                    motionLayout.setState(o1i0Var);
                    motionLayout.m333H();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final c7j m84466b(int i) {
        int iM78122j;
        sgz sgzVar = this.f236370b;
        if (sgzVar != null && (iM78122j = sgzVar.m78122j(i)) != -1) {
            i = iM78122j;
        }
        SparseArray sparseArray = this.f236375g;
        if (sparseArray.get(i) != null) {
            return (c7j) sparseArray.get(i);
        }
        mif1.m61890y(this.f236369a.getContext(), i);
        return (c7j) sparseArray.get(sparseArray.keyAt(0));
    }

    /* JADX INFO: renamed from: c */
    public final int m84467c() {
        u1i0 u1i0Var = this.f236371c;
        return u1i0Var != null ? u1i0Var.f225836h : this.f236378j;
    }

    /* JADX INFO: renamed from: e */
    public final Interpolator m84468e() {
        u1i0 u1i0Var = this.f236371c;
        int i = u1i0Var.f225833e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f236369a.getContext(), this.f236371c.f225835g);
        }
        if (i == -1) {
            return new d1i0(aqs.m26892e(u1i0Var.f225834f), 1);
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* JADX INFO: renamed from: f */
    public final void m84469f(C0043a c0043a) {
        u1i0 u1i0Var = this.f236371c;
        if (u1i0Var != null) {
            Iterator it = u1i0Var.f225839k.iterator();
            while (it.hasNext()) {
                ((gu60) it.next()).m45725a(c0043a);
            }
        } else {
            u1i0 u1i0Var2 = this.f236373e;
            if (u1i0Var2 != null) {
                Iterator it2 = u1i0Var2.f225839k.iterator();
                while (it2.hasNext()) {
                    ((gu60) it2.next()).m45725a(c0043a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final float m84470g() {
        fa81 fa81Var;
        u1i0 u1i0Var = this.f236371c;
        if (u1i0Var == null || (fa81Var = u1i0Var.f225840l) == null) {
            return 0.0f;
        }
        return fa81Var.f67484t;
    }

    /* JADX INFO: renamed from: h */
    public final int m84471h() {
        u1i0 u1i0Var = this.f236371c;
        if (u1i0Var == null) {
            return -1;
        }
        return u1i0Var.f225832d;
    }

    /* JADX INFO: renamed from: i */
    public final int m84472i(Context context, XmlResourceParser xmlResourceParser) {
        c7j c7jVar = new c7j();
        c7jVar.f34937f = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iM84464d = -1;
        int iM84464d2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iM84464d2 = m84464d(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        c7jVar.f34935d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                c7jVar.f34935d = 4;
                                break;
                            case "left":
                                c7jVar.f34935d = 2;
                                break;
                            case "none":
                                c7jVar.f34935d = 0;
                                break;
                            case "right":
                                c7jVar.f34935d = 1;
                                break;
                            case "x_right":
                                c7jVar.f34935d = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iM84464d = m84464d(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.f236376h.put(attributeValue, Integer.valueOf(iM84464d));
                    c7jVar.f34932a = mif1.m61890y(context, iM84464d);
                    break;
                case "stateLabels":
                    c7jVar.f34934c = attributeValue.split(",");
                    int i2 = 0;
                    while (true) {
                        String[] strArr = c7jVar.f34934c;
                        if (i2 < strArr.length) {
                            strArr[i2] = strArr[i2].trim();
                            i2++;
                        }
                    }
                    break;
            }
        }
        if (iM84464d != -1) {
            int i3 = this.f236369a.f674k1;
            c7jVar.m31743o(context, xmlResourceParser);
            if (iM84464d2 != -1) {
                this.f236377i.put(iM84464d, iM84464d2);
            }
            this.f236375g.put(iM84464d, c7jVar);
        }
        return iM84464d;
    }

    /* JADX INFO: renamed from: j */
    public final int m84473j(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return m84472i(context, xml);
                }
            }
            return -1;
        } catch (IOException | XmlPullParserException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m84474k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), b2u0.f22719w);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                m84473j(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: l */
    public final void m84475l(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), b2u0.f22709m);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f236378j);
                this.f236378j = i2;
                if (i2 < 8) {
                    this.f236378j = 8;
                }
            } else if (index == 1) {
                this.f236379k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: m */
    public final void m84476m(int i, MotionLayout motionLayout) {
        SparseArray sparseArray = this.f236375g;
        c7j c7jVar = (c7j) sparseArray.get(i);
        String str = c7jVar.f34932a;
        HashMap map = c7jVar.f34938g;
        c7jVar.f34933b = str;
        int i2 = this.f236377i.get(i);
        if (i2 > 0) {
            m84476m(i2, motionLayout);
            c7j c7jVar2 = (c7j) sparseArray.get(i2);
            if (c7jVar2 == null) {
                mif1.m61890y(this.f236369a.getContext(), i2);
                return;
            }
            HashMap map2 = c7jVar2.f34938g;
            c7jVar.f34933b += "/" + c7jVar2.f34933b;
            for (Integer num : map2.keySet()) {
                num.getClass();
                x6j x6jVar = (x6j) map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new x6j());
                }
                x6j x6jVar2 = (x6j) map.get(num);
                if (x6jVar2 != null) {
                    y6j y6jVar = x6jVar2.f258686e;
                    if (!y6jVar.f269823b) {
                        y6jVar.m92955a(x6jVar.f258686e);
                    }
                    a7j a7jVar = x6jVar2.f258684c;
                    if (!a7jVar.f13060a) {
                        a7jVar.m24941a(x6jVar.f258684c);
                    }
                    b7j b7jVar = x6jVar2.f258687f;
                    if (!b7jVar.f24285a) {
                        b7jVar.m28378a(x6jVar.f258687f);
                    }
                    z6j z6jVar = x6jVar2.f258685d;
                    if (!z6jVar.f279926a) {
                        z6jVar.m95507a(x6jVar.f258685d);
                    }
                    for (String str2 : x6jVar.f258688g.keySet()) {
                        if (!x6jVar2.f258688g.containsKey(str2)) {
                            x6jVar2.f258688g.put(str2, (d6j) x6jVar.f258688g.get(str2));
                        }
                    }
                }
            }
        } else {
            c7jVar.f34933b = dq60.m36616p(c7jVar.f34933b, "  layout", new StringBuilder());
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                h6j h6jVar = (h6j) childAt.getLayoutParams();
                int id = childAt.getId();
                if (c7jVar.f34937f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!map.containsKey(Integer.valueOf(id))) {
                    map.put(Integer.valueOf(id), new x6j());
                }
                x6j x6jVar3 = (x6j) map.get(Integer.valueOf(id));
                if (x6jVar3 != null) {
                    a7j a7jVar2 = x6jVar3.f258684c;
                    y6j y6jVar2 = x6jVar3.f258686e;
                    b7j b7jVar2 = x6jVar3.f258687f;
                    if (!y6jVar2.f269823b) {
                        x6j.m90091a(x6jVar3, id, h6jVar);
                        if (childAt instanceof f6j) {
                            y6jVar2.f269840j0 = ((f6j) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                y6jVar2.f269850o0 = barrier.getAllowsGoneWidget();
                                y6jVar2.f269834g0 = barrier.getType();
                                y6jVar2.f269836h0 = barrier.getMargin();
                            }
                        }
                        y6jVar2.f269823b = true;
                    }
                    if (!a7jVar2.f13060a) {
                        a7jVar2.f13061b = childAt.getVisibility();
                        a7jVar2.f13063d = childAt.getAlpha();
                        a7jVar2.f13060a = true;
                    }
                    if (!b7jVar2.f24285a) {
                        b7jVar2.f24285a = true;
                        b7jVar2.f24286b = childAt.getRotation();
                        b7jVar2.f24287c = childAt.getRotationX();
                        b7jVar2.f24288d = childAt.getRotationY();
                        b7jVar2.f24289e = childAt.getScaleX();
                        b7jVar2.f24290f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            b7jVar2.f24291g = pivotX;
                            b7jVar2.f24292h = pivotY;
                        }
                        b7jVar2.f24294j = childAt.getTranslationX();
                        b7jVar2.f24295k = childAt.getTranslationY();
                        b7jVar2.f24296l = childAt.getTranslationZ();
                        if (b7jVar2.f24297m) {
                            b7jVar2.f24298n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (x6j x6jVar4 : map.values()) {
            if (x6jVar4.f258689h != null) {
                if (x6jVar4.f258683b == null) {
                    x6jVar4.f258689h.m87292e(c7jVar.m31741m(x6jVar4.f258682a));
                } else {
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        x6j x6jVarM31741m = c7jVar.m31741m(((Integer) it.next()).intValue());
                        String str3 = x6jVarM31741m.f258686e.f269844l0;
                        if (str3 != null && x6jVar4.f258683b.matches(str3)) {
                            x6jVar4.f258689h.m87292e(x6jVarM31741m);
                            x6jVarM31741m.f258688g.putAll((HashMap) x6jVar4.f258688g.clone());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0033  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public final void m84477n(int i, int i2) {
        int iM78122j;
        int iM78122j2;
        u1i0 u1i0Var;
        ArrayList arrayList;
        Iterator it;
        u1i0 u1i0Var2;
        u1i0 u1i0Var3;
        u1i0 u1i0Var4;
        int i3;
        fa81 fa81Var;
        sgz sgzVar = this.f236370b;
        if (sgzVar != null) {
            iM78122j = sgzVar.m78122j(i);
            if (iM78122j == -1) {
                iM78122j = i;
            }
            iM78122j2 = this.f236370b.m78122j(i2);
            if (iM78122j2 == -1) {
            }
            u1i0Var = this.f236371c;
            if (u1i0Var == null && u1i0Var.f225831c == i2 && u1i0Var.f225832d == i) {
                return;
            }
            arrayList = this.f236372d;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    u1i0Var2 = this.f236373e;
                    for (u1i0 u1i0Var5 : this.f236374f) {
                        if (u1i0Var5.f225831c == i2) {
                            u1i0Var2 = u1i0Var5;
                        }
                    }
                    u1i0Var3 = new u1i0(this, u1i0Var2);
                    u1i0Var3.f225832d = iM78122j;
                    u1i0Var3.f225831c = iM78122j2;
                    if (iM78122j != -1) {
                        arrayList.add(u1i0Var3);
                    }
                    this.f236371c = u1i0Var3;
                    return;
                }
                u1i0Var4 = (u1i0) it.next();
                i3 = u1i0Var4.f225831c;
                if ((i3 != iM78122j2 && u1i0Var4.f225832d == iM78122j) || (i3 == i2 && u1i0Var4.f225832d == i)) {
                    break;
                }
            }
            this.f236371c = u1i0Var4;
            fa81Var = u1i0Var4.f225840l;
            if (fa81Var != null) {
                fa81Var.m41147c(this.f236384p);
            }
        }
        iM78122j = i;
        iM78122j2 = i2;
        u1i0Var = this.f236371c;
        if (u1i0Var == null) {
        }
        arrayList = this.f236372d;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                u1i0Var2 = this.f236373e;
                while (r9.hasNext()) {
                    if (u1i0Var5.f225831c == i2) {
                        u1i0Var2 = u1i0Var5;
                    }
                }
                u1i0Var3 = new u1i0(this, u1i0Var2);
                u1i0Var3.f225832d = iM78122j;
                u1i0Var3.f225831c = iM78122j2;
                if (iM78122j != -1) {
                    arrayList.add(u1i0Var3);
                }
                this.f236371c = u1i0Var3;
                return;
            }
            u1i0Var4 = (u1i0) it.next();
            i3 = u1i0Var4.f225831c;
            if (i3 != iM78122j2) {
            }
        }
        this.f236371c = u1i0Var4;
        fa81Var = u1i0Var4.f225840l;
        if (fa81Var != null) {
            fa81Var.m41147c(this.f236384p);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m84478o() {
        Iterator it = this.f236372d.iterator();
        while (it.hasNext()) {
            if (((u1i0) it.next()).f225840l != null) {
                return true;
            }
        }
        u1i0 u1i0Var = this.f236371c;
        return (u1i0Var == null || u1i0Var.f225840l == null) ? false : true;
    }
}
