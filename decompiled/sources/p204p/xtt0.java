package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class xtt0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f265922a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f265923b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f265924c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f265925d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fyf f265926e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f265927f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f265928g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtt0(int i, int i2, int i3, int i4, fyf fyfVar, int i5, int i6) {
        super(2);
        this.f265922a = i;
        this.f265923b = i2;
        this.f265924c = i3;
        this.f265925d = i4;
        this.f265926e = fyfVar;
        this.f265927f = i5;
        this.f265928g = i6;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        zr51 zr51Var = (zr51) obj;
        long j = ((b8j) obj2).f24596a;
        List listMo73431S = zr51Var.mo73431S(cs21.f41449b, new fyf(new lh70(this.f265926e, 21), true, -1421242355));
        int size = listMo73431S.size();
        if (size < 1) {
            size = 1;
        }
        int iMin = Math.min(3, size);
        int i = this.f265922a;
        int i2 = this.f265923b;
        int i3 = this.f265924c;
        int i4 = ((i2 - i3) - ((iMin - 1) * i)) / iMin;
        Iterator it = listMo73431S.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int iMo39620d = ((h6d0) it.next()).mo39620d(i4);
        while (it.hasNext()) {
            int iMo39620d2 = ((h6d0) it.next()).mo39620d(i4);
            if (iMo39620d < iMo39620d2) {
                iMo39620d = iMo39620d2;
            }
        }
        if (!((iMo39620d >= 0) & (i4 >= 0))) {
            ot40.m67767a("width and height must be >= 0");
        }
        long jM38117h = e8j.m38117h(i4, i4, iMo39620d, iMo39620d);
        ArrayList arrayList = new ArrayList(i6f.m49804T(listMo73431S, 10));
        Iterator it2 = listMo73431S.iterator();
        while (it2.hasNext()) {
            arrayList.add(((h6d0) it2.next()).mo39619B(jM38117h));
        }
        return zr51Var.mo44714T(((arrayList.size() - 1) * i) + (arrayList.size() * i4) + i3, iMo39620d + this.f265925d, nau.f152117a, new wtt0(this.f265927f, this.f265928g, i, arrayList));
    }
}
