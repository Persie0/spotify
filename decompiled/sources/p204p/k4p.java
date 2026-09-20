package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class k4p {

    /* JADX INFO: renamed from: a */
    public final s4k f119278a;

    /* JADX INFO: renamed from: b */
    public final voc1 f119279b;

    /* JADX INFO: renamed from: c */
    public final q4k f119280c;

    /* JADX INFO: renamed from: d */
    public final pgo f119281d;

    /* JADX INFO: renamed from: e */
    public final String f119282e;

    /* JADX INFO: renamed from: f */
    public final c851 f119283f;

    /* JADX INFO: renamed from: g */
    public final oqc f119284g;

    /* JADX INFO: renamed from: h */
    public final pzs0 f119285h;

    /* JADX INFO: renamed from: i */
    public final luk f119286i;

    /* JADX INFO: renamed from: j */
    public final boolean f119287j;

    /* JADX INFO: renamed from: k */
    public final boolean f119288k;

    /* JADX INFO: renamed from: l */
    public final grc f119289l;

    /* JADX INFO: renamed from: m */
    public final b6b f119290m;

    /* JADX INFO: renamed from: n */
    public final fs9 f119291n = new fs9(this, 28);

    public k4p(s4k s4kVar, voc1 voc1Var, q4k q4kVar, pgo pgoVar, String str, c851 c851Var, oqc oqcVar, pzs0 pzs0Var, luk lukVar, boolean z, boolean z2, grc grcVar, b6b b6bVar) {
        this.f119278a = s4kVar;
        this.f119279b = voc1Var;
        this.f119280c = q4kVar;
        this.f119281d = pgoVar;
        this.f119282e = str;
        this.f119283f = c851Var;
        this.f119284g = oqcVar;
        this.f119285h = pzs0Var;
        this.f119286i = lukVar;
        this.f119287j = z;
        this.f119288k = z2;
        this.f119289l = grcVar;
        this.f119290m = b6bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Serializable m55403a(k4p k4pVar, ibk ibkVar) throws Throwable {
        h4p h4pVar;
        if (ibkVar instanceof h4p) {
            h4pVar = (h4p) ibkVar;
            int i = h4pVar.f87578c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h4pVar.f87578c = i - Integer.MIN_VALUE;
            } else {
                h4pVar = new h4p(k4pVar, ibkVar);
            }
        } else {
            h4pVar = new h4p(k4pVar, ibkVar);
        }
        Object objM89557A = h4pVar.f87576a;
        int i2 = h4pVar.f87578c;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            c851 c851Var = k4pVar.f119283f;
            luk lukVar = k4pVar.f119286i;
            h4pVar.f87578c = 1;
            objM89557A = x0h1.m89557A(lukVar, new cg5(c851Var, (fbk) null, 27), h4pVar);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89557A);
        }
        Iterable iterable = (Iterable) objM89557A;
        ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((boc) it.next()).f29065a);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m55404b(k4p k4pVar, String str, ibk ibkVar) {
        i4p i4pVar;
        if (ibkVar instanceof i4p) {
            i4pVar = (i4p) ibkVar;
            int i = i4pVar.f98555d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i4pVar.f98555d = i - Integer.MIN_VALUE;
            } else {
                i4pVar = new i4p(k4pVar, ibkVar);
            }
        } else {
            i4pVar = new i4p(k4pVar, ibkVar);
        }
        Object objM89557A = i4pVar.f98553b;
        int i2 = i4pVar.f98555d;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            c851 c851Var = k4pVar.f119283f;
            luk lukVar = k4pVar.f119286i;
            i4pVar.f98552a = str;
            i4pVar.f98555d = 1;
            objM89557A = x0h1.m89557A(lukVar, new cg5(c851Var, (fbk) null, 27), i4pVar);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = i4pVar.f98552a;
            bga.m29073P(objM89557A);
        }
        List list = (List) objM89557A;
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (wj50.m88271j(((boc) it.next()).f29065a, str)) {
                return i3 >= 0 ? list.subList(i3, list.size()) : Collections.singletonList(new boc(str, ""));
            }
            i3++;
        }
        i3 = -1;
        if (i3 >= 0) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m55405c(k4p k4pVar, String str, ibk ibkVar) throws Throwable {
        j4p j4pVar;
        if (ibkVar instanceof j4p) {
            j4pVar = (j4p) ibkVar;
            int i = j4pVar.f108755d;
            if ((i & Integer.MIN_VALUE) != 0) {
                j4pVar.f108755d = i - Integer.MIN_VALUE;
            } else {
                j4pVar = new j4p(k4pVar, ibkVar);
            }
        } else {
            j4pVar = new j4p(k4pVar, ibkVar);
        }
        Object objM89557A = j4pVar.f108753b;
        int i2 = j4pVar.f108755d;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            c851 c851Var = k4pVar.f119283f;
            luk lukVar = k4pVar.f119286i;
            j4pVar.f108752a = str;
            j4pVar.f108755d = 1;
            objM89557A = x0h1.m89557A(lukVar, new cg5(c851Var, (fbk) null, 27), j4pVar);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = j4pVar.f108752a;
            bga.m29073P(objM89557A);
        }
        List list = (List) objM89557A;
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (wj50.m88271j(((boc) it.next()).f29065a, str)) {
                return i3 >= 0 ? list.subList(0, i3 + 1) : Collections.singletonList(new boc(str, ""));
            }
            i3++;
        }
        i3 = -1;
        if (i3 >= 0) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final q4k m55406d(boc bocVar) {
        boolean z = this.f119287j;
        q4k q4kVar = this.f119280c;
        if (!z) {
            return q4k.m72168a(q4kVar, false, false, 0, false, null, null, false, 1073741819);
        }
        return q4k.m72168a(q4kVar, false, false, 0, false, k2z0.m55212n(this.f119284g, this.f119281d, this.f119285h, this.f119291n, this.f119289l, bocVar, this.f119282e, this.f119288k, new f4p(this, bocVar, null), new g4p(this, bocVar, null)), null, false, 1040187391);
    }
}
