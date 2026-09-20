package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import com.spotify.music.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class u1i0 {

    /* JADX INFO: renamed from: a */
    public final int f225829a;

    /* JADX INFO: renamed from: b */
    public final boolean f225830b;

    /* JADX INFO: renamed from: c */
    public int f225831c;

    /* JADX INFO: renamed from: d */
    public int f225832d;

    /* JADX INFO: renamed from: e */
    public int f225833e;

    /* JADX INFO: renamed from: f */
    public String f225834f;

    /* JADX INFO: renamed from: g */
    public int f225835g;

    /* JADX INFO: renamed from: h */
    public int f225836h;

    /* JADX INFO: renamed from: i */
    public final float f225837i;

    /* JADX INFO: renamed from: j */
    public final v1i0 f225838j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f225839k;

    /* JADX INFO: renamed from: l */
    public fa81 f225840l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f225841m;

    /* JADX INFO: renamed from: n */
    public final int f225842n;

    /* JADX INFO: renamed from: o */
    public final boolean f225843o;

    /* JADX INFO: renamed from: p */
    public int f225844p;

    /* JADX INFO: renamed from: q */
    public final int f225845q;

    /* JADX INFO: renamed from: r */
    public final int f225846r;

    public u1i0(v1i0 v1i0Var, u1i0 u1i0Var) {
        this.f225829a = -1;
        this.f225830b = false;
        this.f225831c = -1;
        this.f225832d = -1;
        this.f225833e = 0;
        this.f225834f = null;
        this.f225835g = -1;
        this.f225836h = 400;
        this.f225837i = 0.0f;
        this.f225839k = new ArrayList();
        this.f225840l = null;
        this.f225841m = new ArrayList();
        this.f225842n = 0;
        this.f225843o = false;
        this.f225844p = -1;
        this.f225845q = 0;
        this.f225846r = 0;
        this.f225838j = v1i0Var;
        this.f225836h = v1i0Var.f236378j;
        if (u1i0Var != null) {
            this.f225844p = u1i0Var.f225844p;
            this.f225833e = u1i0Var.f225833e;
            this.f225834f = u1i0Var.f225834f;
            this.f225835g = u1i0Var.f225835g;
            this.f225836h = u1i0Var.f225836h;
            this.f225839k = u1i0Var.f225839k;
            this.f225837i = u1i0Var.f225837i;
            this.f225845q = u1i0Var.f225845q;
        }
    }

    public u1i0(v1i0 v1i0Var, int i) {
        this.f225829a = -1;
        this.f225830b = false;
        this.f225831c = -1;
        this.f225832d = -1;
        this.f225833e = 0;
        this.f225834f = null;
        this.f225835g = -1;
        this.f225836h = 400;
        this.f225837i = 0.0f;
        this.f225839k = new ArrayList();
        this.f225840l = null;
        this.f225841m = new ArrayList();
        this.f225842n = 0;
        this.f225843o = false;
        this.f225844p = -1;
        this.f225845q = 0;
        this.f225846r = 0;
        this.f225829a = -1;
        this.f225838j = v1i0Var;
        this.f225832d = R.id.view_transition;
        this.f225831c = i;
        this.f225836h = v1i0Var.f236378j;
        this.f225845q = v1i0Var.f236379k;
    }

    public u1i0(v1i0 v1i0Var, Context context, XmlResourceParser xmlResourceParser) {
        this.f225829a = -1;
        this.f225830b = false;
        this.f225831c = -1;
        this.f225832d = -1;
        this.f225833e = 0;
        this.f225834f = null;
        this.f225835g = -1;
        this.f225836h = 400;
        this.f225837i = 0.0f;
        this.f225839k = new ArrayList();
        this.f225840l = null;
        this.f225841m = new ArrayList();
        this.f225842n = 0;
        this.f225843o = false;
        this.f225844p = -1;
        this.f225846r = 0;
        int i = v1i0Var.f236378j;
        SparseArray sparseArray = v1i0Var.f236375g;
        this.f225836h = i;
        this.f225845q = v1i0Var.f236379k;
        this.f225838j = v1i0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), b2u0.f22716t);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 2) {
                this.f225831c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f225831c);
                if ("layout".equals(resourceTypeName)) {
                    c7j c7jVar = new c7j();
                    c7jVar.m31742n(context, this.f225831c);
                    sparseArray.append(this.f225831c, c7jVar);
                } else if ("xml".equals(resourceTypeName)) {
                    this.f225831c = v1i0Var.m84473j(context, this.f225831c);
                }
            } else if (index == 3) {
                this.f225832d = typedArrayObtainStyledAttributes.getResourceId(index, this.f225832d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.f225832d);
                if ("layout".equals(resourceTypeName2)) {
                    c7j c7jVar2 = new c7j();
                    c7jVar2.m31742n(context, this.f225832d);
                    sparseArray.append(this.f225832d, c7jVar2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.f225832d = v1i0Var.m84473j(context, this.f225832d);
                }
            } else if (index == 6) {
                int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i3 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f225835g = resourceId;
                    if (resourceId != -1) {
                        this.f225833e = -2;
                    }
                } else if (i3 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f225834f = string;
                    if (string != null) {
                        if (string.indexOf("/") > 0) {
                            this.f225835g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f225833e = -2;
                        } else {
                            this.f225833e = -1;
                        }
                    }
                } else {
                    this.f225833e = typedArrayObtainStyledAttributes.getInteger(index, this.f225833e);
                }
            } else if (index == 4) {
                int i4 = typedArrayObtainStyledAttributes.getInt(index, this.f225836h);
                this.f225836h = i4;
                if (i4 < 8) {
                    this.f225836h = 8;
                }
            } else if (index == 8) {
                this.f225837i = typedArrayObtainStyledAttributes.getFloat(index, this.f225837i);
            } else if (index == 1) {
                this.f225842n = typedArrayObtainStyledAttributes.getInteger(index, this.f225842n);
            } else if (index == 0) {
                this.f225829a = typedArrayObtainStyledAttributes.getResourceId(index, this.f225829a);
            } else if (index == 9) {
                this.f225843o = typedArrayObtainStyledAttributes.getBoolean(index, this.f225843o);
            } else if (index == 7) {
                this.f225844p = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.f225845q = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.f225846r = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.f225832d == -1) {
            this.f225830b = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
