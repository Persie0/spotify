package p204p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e130 extends f130 {

    /* JADX INFO: renamed from: o */
    public static final e130 f55103o;

    /* JADX INFO: renamed from: d */
    public final List f55104d;

    /* JADX INFO: renamed from: e */
    public final List f55105e;

    /* JADX INFO: renamed from: f */
    public final List f55106f;

    /* JADX INFO: renamed from: g */
    public final List f55107g;

    /* JADX INFO: renamed from: h */
    public final List f55108h;

    /* JADX INFO: renamed from: i */
    public final List f55109i;

    /* JADX INFO: renamed from: j */
    public final r300 f55110j;

    /* JADX INFO: renamed from: k */
    public final List f55111k;

    /* JADX INFO: renamed from: l */
    public final Map f55112l;

    /* JADX INFO: renamed from: m */
    public final List f55113m;

    /* JADX INFO: renamed from: n */
    public final tey f55114n;

    static {
        List list = Collections.EMPTY_LIST;
        f55103o = new e130("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list, null);
    }

    public e130(String str, List list, List list2, List list3, List list4, List list5, List list6, r300 r300Var, List list7, boolean z, Map map, List list8, tey teyVar) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((d130) list2.get(i)).f44142a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m37516b(arrayList, list3);
        m37516b(arrayList, list4);
        m37516b(arrayList, list5);
        m37516b(arrayList, list6);
        this.f55104d = Collections.unmodifiableList(arrayList);
        this.f55105e = Collections.unmodifiableList(list2);
        this.f55106f = Collections.unmodifiableList(list3);
        this.f55107g = Collections.unmodifiableList(list4);
        this.f55108h = Collections.unmodifiableList(list5);
        this.f55109i = Collections.unmodifiableList(list6);
        this.f55110j = r300Var;
        this.f55111k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f55112l = Collections.unmodifiableMap(map);
        this.f55113m = Collections.unmodifiableList(list8);
        this.f55114n = teyVar;
    }

    /* JADX INFO: renamed from: b */
    public static void m37516b(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((c130) list.get(i)).f32958a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m37517c(int i, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                ji51 ji51Var = (ji51) list2.get(i3);
                if (ji51Var.f112669b == i && ji51Var.f112670c == i2) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // p204p.x6z
    /* JADX INFO: renamed from: a */
    public final Object mo24415a(List list) {
        ArrayList arrayListM37517c = m37517c(0, this.f55105e, list);
        List list2 = Collections.EMPTY_LIST;
        return new e130(this.f64777a, this.f64778b, arrayListM37517c, list2, m37517c(1, this.f55107g, list), m37517c(2, this.f55108h, list), list2, this.f55110j, this.f55111k, this.f64779c, this.f55112l, this.f55113m, this.f55114n);
    }
}
