package p204p;

import androidx.compose.p002ui.text.font.FontWeight;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class qsu0 {

    /* JADX INFO: renamed from: a */
    public final File f192188a;

    /* JADX INFO: renamed from: b */
    public final w8b f192189b;

    /* JADX INFO: renamed from: c */
    public final juk f192190c;

    /* JADX INFO: renamed from: d */
    public final zv41 f192191d;

    /* JADX INFO: renamed from: e */
    public final nuu0 f192192e;

    public qsu0(File file, w8b w8bVar, juk jukVar) {
        this.f192188a = file;
        this.f192189b = w8bVar;
        this.f192190c = jukVar;
        zv41 zv41VarM52819d = jag1.m52819d(nau.f152117a);
        this.f192191d = zv41VarM52819d;
        this.f192192e = bzf1.m31021m(zv41VarM52819d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m73760a(ibk ibkVar) throws Throwable {
        psu0 psu0Var;
        zv41 zv41Var;
        Iterator it;
        Object obj;
        yuk yukVar;
        if (ibkVar instanceof psu0) {
            psu0Var = (psu0) ibkVar;
            int i = psu0Var.f180966d;
            if ((i & Integer.MIN_VALUE) != 0) {
                psu0Var.f180966d = i - Integer.MIN_VALUE;
            } else {
                psu0Var = new psu0(this, ibkVar);
            }
        } else {
            psu0Var = new psu0(this, ibkVar);
        }
        Object obj2 = psu0Var.f180964b;
        int i2 = psu0Var.f180966d;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzv nzvVar = osu0.f168899g;
            ArrayList<osu0> arrayList = new ArrayList();
            nzvVar.getClass();
            C2042k7 c2042k7 = new C2042k7(nzvVar, 0);
            while (true) {
                boolean zHasNext = c2042k7.hasNext();
                zv41Var = this.f192191d;
                if (!zHasNext) {
                    break;
                }
                Object next = c2042k7.next();
                osu0 osu0Var = (osu0) next;
                if (osu0Var.f168901b.length() > 0 && !((Map) zv41Var.getValue()).containsKey(osu0Var)) {
                    arrayList.add(next);
                }
            }
            for (osu0 osu0Var2 : arrayList) {
                File file = new File(new File(this.f192188a, "EReaderFonts"), osu0Var2.f168902c);
                if (file.exists()) {
                    m73761b(osu0Var2, file);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (!((Map) zv41Var.getValue()).containsKey((osu0) obj3)) {
                    arrayList2.add(obj3);
                }
            }
            it = arrayList2.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = psu0Var.f180963a;
            bga.m29073P(obj2);
        }
        do {
            boolean zHasNext2 = it.hasNext();
            obj = w2a1.f247311a;
            if (!zHasNext2) {
                return obj;
            }
            osu0 osu0Var3 = (osu0) it.next();
            psu0Var.f180963a = it;
            psu0Var.f180966d = 1;
            Object objM89557A = x0h1.m89557A(this.f192190c, new s6r0(osu0Var3, this, null, 27), psu0Var);
            yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                obj = objM89557A;
            }
        } while (obj != yukVar);
        return yukVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m73761b(osu0 osu0Var, File file) {
        zv41 zv41Var = this.f192191d;
        Map map = (Map) zv41Var.getValue();
        FontWeight fontWeight = FontWeight.f532t;
        Map mapM56701n0 = kkc0.m56701n0(map, new pqm0(osu0Var, g0b1.m43263d(new z74(file, fontWeight, n0e1.m63419a(fontWeight, new h000[0])))));
        zv41Var.getClass();
        zv41Var.m97091m(null, mapM56701n0);
    }
}
