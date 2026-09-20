package p204p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class v13 implements k4k {

    /* JADX INFO: renamed from: a */
    public final v300 f236227a;

    /* JADX INFO: renamed from: b */
    public final tjo f236228b;

    /* JADX INFO: renamed from: c */
    public final tjo f236229c;

    public v13(v300 v300Var) {
        this.f236227a = v300Var;
        jqv0 jqv0Var = qpv0.f191387a;
        this.f236228b = pag1.m69487w(new rko(new jqx(jqv0Var.mo54112b(w46.class)), 2, m13.f138828g, new pko(lz2.f138232c1), m13.f138829h), m13.f138821b);
        this.f236229c = pag1.m69487w(new rko(new jqx(jqv0Var.mo54112b(w46.class)), 1, m13.f138830i, new pko(m13.f138823c), m13.f138831t), m13.f138825d);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.k4k
    /* JADX INFO: renamed from: a */
    public final Object mo55376a(vhe0 vhe0Var, pgo pgoVar, fbk fbkVar) {
        o13 o13Var;
        hz80 hz80Var;
        if (fbkVar instanceof o13) {
            o13Var = (o13) fbkVar;
            int i = o13Var.f160580d;
            if ((i & Integer.MIN_VALUE) != 0) {
                o13Var.f160580d = i - Integer.MIN_VALUE;
            } else {
                o13Var = new o13(this, (ibk) fbkVar);
            }
        } else {
            o13Var = new o13(this, (ibk) fbkVar);
        }
        Object objM56684z = o13Var.f160578b;
        int i2 = o13Var.f160580d;
        if (i2 == 0) {
            bga.m29073P(objM56684z);
            hz80Var = vhe0Var.f241505d;
            fbk fbkVar2 = null;
            if (hz80Var == null) {
                hz80Var = null;
            } else if (((w300) this.f236227a).m87094a(hz80Var.f96829e) != u300.ALBUM) {
                hz80Var = null;
            }
            if (hz80Var == null) {
                return null;
            }
            String str = (String) hz80Var.f96822X.get("artistUris");
            List listM88477a1 = str != null ? wl51.m88477a1(str, new String[]{","}, 0, 6) : null;
            if (listM88477a1 == null) {
                listM88477a1 = lau.f131415a;
            }
            ArrayList arrayList = new ArrayList(i6f.m49804T(listM88477a1, 10));
            Iterator it = listM88477a1.iterator();
            while (it.hasNext()) {
                arrayList.add(wl51.m88491o1((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            C1977ig c1977ig = new C1977ig(arrayList2, this, pgoVar, fbkVar2, 13);
            o13Var.f160577a = hz80Var;
            o13Var.f160580d = 1;
            objM56684z = kk40.m56684z(c1977ig, o13Var);
            yuk yukVar = yuk.f276404a;
            if (objM56684z == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hz80Var = o13Var.f160577a;
            bga.m29073P(objM56684z);
        }
        return new f4k(hz80Var.f96825a, new t3k(Uri.parse(hz80Var.f96826b.m84311c(2))), (String) objM56684z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // p204p.k4k
    /* JADX INFO: renamed from: b */
    public final fiz mo55377b(vhe0 vhe0Var, pgo pgoVar) {
        Object yskVar;
        hz80 hz80Var = vhe0Var.f241505d;
        if (hz80Var != null) {
            if (((w300) this.f236227a).m87094a(hz80Var.f96829e) != u300.ALBUM) {
                hz80Var = null;
            }
        } else {
            hz80Var = null;
        }
        if (hz80Var == null) {
            return new ysk(null, 27);
        }
        String str = (String) hz80Var.f96822X.get("artistUris");
        List listM88477a1 = str != null ? wl51.m88477a1(str, new String[]{","}, 0, 6) : null;
        if (listM88477a1 == null || listM88477a1.isEmpty()) {
            yskVar = new ysk("", 27);
        } else {
            ArrayList arrayList = new ArrayList(i6f.m49804T(listM88477a1, 10));
            Iterator it = listM88477a1.iterator();
            while (it.hasNext()) {
                arrayList.add(fag1.m41173v(pgoVar, this.f236228b, (String) it.next()));
            }
            yskVar = new r13((fiz[]) g6f.m43728j1(arrayList).toArray(new fiz[0]), listM88477a1, 0);
        }
        return new pj1(yskVar, this, hz80Var, 4);
    }
}
