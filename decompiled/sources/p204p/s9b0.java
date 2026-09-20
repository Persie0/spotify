package p204p;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s9b0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f206900a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f206901b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f206902c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f206903d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f206904e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f206905f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f206906g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f206907h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f206908i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f206909j;

    public s9b0(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((t9b0) obj).f218236a instanceof Integer) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((t9b0) obj2).f218236a instanceof PointF) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (((t9b0) obj3).f218236a instanceof Float) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (((t9b0) obj4).f218236a instanceof eby0) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list) {
            if (((t9b0) obj5).f218236a instanceof ColorFilter) {
                arrayList5.add(obj5);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : list) {
            if (((t9b0) obj6).f218236a instanceof Object[]) {
                arrayList6.add(obj6);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : list) {
            if (((t9b0) obj7).f218236a instanceof Typeface) {
                arrayList7.add(obj7);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj8 : list) {
            if (((t9b0) obj8).f218236a instanceof Bitmap) {
                arrayList8.add(obj8);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj9 : list) {
            if (((t9b0) obj9).f218236a instanceof CharSequence) {
                arrayList9.add(obj9);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        for (Object obj10 : list) {
            if (((t9b0) obj10).f218236a instanceof Path) {
                arrayList10.add(obj10);
            }
        }
        this.f206900a = arrayList;
        this.f206901b = arrayList2;
        this.f206902c = arrayList3;
        this.f206903d = arrayList4;
        this.f206904e = arrayList5;
        this.f206905f = arrayList6;
        this.f206906g = arrayList7;
        this.f206907h = arrayList8;
        this.f206908i = arrayList9;
        this.f206909j = arrayList10;
    }
}
