package p204p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class dj10 implements yh00, Function, x920 {

    /* JADX INFO: renamed from: c */
    public static final byte[] f49526c = {26, 4, 77, 83, 70, 84, 34, 6, 69, 97, 114, 98, 117, 100};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49527a;

    /* JADX INFO: renamed from: b */
    public final List f49528b;

    public /* synthetic */ dj10(int i, List list) {
        this.f49527a = i;
        this.f49528b = list;
    }

    @Override // p204p.yh00
    public Object apply(Object obj) {
        switch (this.f49527a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : this.f49528b) {
                    if (obj2 instanceof wze) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j6f.m52564V(((wze) it.next()).mo51590a(), arrayList2);
                }
                return g6f.m43736n1(arrayList2);
            case 2:
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (!this.f49528b.contains(((AbstractC1961i) obj3).getUri())) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            default:
                Map map = (Map) obj;
                List<String> list = this.f49528b;
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(list, 10));
                for (String str : list) {
                    d0w d0wVar = (d0w) map.get(str);
                    arrayList4.add(d0wVar != null ? new t1p0(d0wVar) : new s1p0(str));
                }
                return arrayList4;
        }
    }

    @Override // p204p.x920
    /* JADX INFO: renamed from: b */
    public Object mo36147b(Object obj) {
        return ((ddu0) obj).f47870a;
    }

    @Override // p204p.x920
    /* JADX INFO: renamed from: g */
    public Iterator mo36148g() {
        return this.f49528b.iterator();
    }

    public dj10(int i) {
        this.f49527a = i;
        switch (i) {
            case 6:
                this.f49528b = bk5.m29582E0(new yif1[0]);
                break;
            default:
                this.f49528b = Collections.singletonList(new pko0());
                break;
        }
    }
}
