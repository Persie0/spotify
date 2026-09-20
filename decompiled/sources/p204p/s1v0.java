package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class s1v0 {

    /* JADX INFO: renamed from: e */
    public static final fv31 f204809e = fv31.f73628b.m78183U("chat_content_picker_recent_searches");

    /* JADX INFO: renamed from: a */
    public final Single f204810a;

    /* JADX INFO: renamed from: b */
    public final fk60 f204811b;

    /* JADX INFO: renamed from: c */
    public final edv f204812c;

    /* JADX INFO: renamed from: d */
    public final mj5 f204813d = new mj5(z0v0.Companion.serializer(), 0);

    public s1v0(Single single, fk60 fk60Var, edv edvVar) {
        this.f204810a = single;
        this.f204811b = fk60Var;
        this.f204812c = edvVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m76992a(ibk ibkVar) {
        p1v0 p1v0Var;
        if (ibkVar instanceof p1v0) {
            p1v0Var = (p1v0) ibkVar;
            int i = p1v0Var.f173173c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p1v0Var.f173173c = i - Integer.MIN_VALUE;
            } else {
                p1v0Var = new p1v0(this, ibkVar);
            }
        } else {
            p1v0Var = new p1v0(this, ibkVar);
        }
        Object objM96567o = p1v0Var.f173171a;
        int i2 = p1v0Var.f173173c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            p1v0Var.f173173c = 1;
            objM96567o = zn91.m96567o(this.f204810a, p1v0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        lv31 lv31VarEdit = ((hv31) objM96567o).edit();
        lv31VarEdit.m60053f(f204809e);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085 A[LOOP:0: B:28:0x007f->B:30:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Serializable m76993b(ibk ibkVar) {
        q1v0 q1v0Var;
        List<z0v0> list;
        List list2;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (ibkVar instanceof q1v0) {
            q1v0Var = (q1v0) ibkVar;
            int i = q1v0Var.f184416d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q1v0Var.f184416d = i - Integer.MIN_VALUE;
            } else {
                q1v0Var = new q1v0(this, ibkVar);
            }
        } else {
            q1v0Var = new q1v0(this, ibkVar);
        }
        Object objM96567o = q1v0Var.f184414b;
        int i2 = q1v0Var.f184416d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            q1v0Var.f184416d = 1;
            objM96567o = zn91.m96567o(this.f204810a, q1v0Var);
            if (objM96567o != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM96567o);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = q1v0Var.f184413a;
            bga.m29073P(objM96567o);
        }
        list2 = (List) objM96567o;
        arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (z0v0 z0v0Var : list) {
            arrayList.add(new vbv(z0v0Var.f278174a, z0v0Var.f278175b));
        }
        arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (list2.contains(((vbv) obj).f239586b)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
        String strMo48710e = ((hv31) objM96567o).mo48710e(f204809e, null);
        if (strMo48710e == null) {
            return lau.f131415a;
        }
        List list3 = (List) this.f204811b.m41880a(strMo48710e, this.f204813d);
        q1v0Var.f184413a = list3;
        q1v0Var.f184416d = 2;
        Object objM38621a = this.f204812c.m38621a(q1v0Var);
        if (objM38621a != yukVar) {
            list = list3;
            objM96567o = objM38621a;
            list2 = (List) objM96567o;
            arrayList = new ArrayList(i6f.m49804T(list, 10));
            while (r0.hasNext()) {
                arrayList.add(new vbv(z0v0Var.f278174a, z0v0Var.f278175b));
            }
            arrayList2 = new ArrayList();
            while (r1.hasNext()) {
                if (list2.contains(((vbv) obj).f239586b)) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092 A[Catch: Exception -> 0x002f, LOOP:0: B:31:0x008c->B:33:0x0092, LOOP_END, TryCatch #0 {Exception -> 0x002f, blocks: (B:13:0x002b, B:30:0x0063, B:31:0x008c, B:33:0x0092, B:34:0x00a5, B:20:0x003c, B:26:0x0050, B:23:0x0043), top: B:39:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m76994c(vbv vbvVar, ibk ibkVar) {
        r1v0 r1v0Var;
        vbv vbvVar2;
        hv31 hv31Var;
        ArrayList arrayList;
        if (ibkVar instanceof r1v0) {
            r1v0Var = (r1v0) ibkVar;
            int i = r1v0Var.f194932e;
            if ((i & Integer.MIN_VALUE) != 0) {
                r1v0Var.f194932e = i - Integer.MIN_VALUE;
            } else {
                r1v0Var = new r1v0(this, ibkVar);
            }
        } else {
            r1v0Var = new r1v0(this, ibkVar);
        }
        Object objM96567o = r1v0Var.f194930c;
        int i2 = r1v0Var.f194932e;
        Serializable serializable = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single single = this.f204810a;
                r1v0Var.f194928a = vbvVar;
                r1v0Var.f194932e = 1;
                objM96567o = zn91.m96567o(single, r1v0Var);
                if (objM96567o == serializable) {
                }
                return serializable;
            }
            if (i2 == 1) {
                vbvVar = r1v0Var.f194928a;
                bga.m29073P(objM96567o);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hv31Var = r1v0Var.f194929b;
                vbvVar2 = r1v0Var.f194928a;
                bga.m29073P(objM96567o);
            }
            ArrayList arrayList2 = new ArrayList((Collection) objM96567o);
            j6f.m52567Y(arrayList2, new i8u0(vbvVar2, 19));
            arrayList2.add(0, vbvVar2);
            List<vbv> listM43714b1 = g6f.m43714b1(arrayList2, 15);
            arrayList = new ArrayList(i6f.m49804T(listM43714b1, 10));
            for (vbv vbvVar3 : listM43714b1) {
                arrayList.add(new z0v0(vbvVar3.f239585a, vbvVar3.f239586b));
            }
            lv31 lv31VarEdit = hv31Var.edit();
            lv31VarEdit.m60051d(f204809e, this.f204811b.m41881b(this.f204813d, arrayList));
            lv31VarEdit.m60054g();
            return w2a1.f247311a;
            hv31 hv31Var2 = (hv31) objM96567o;
            r1v0Var.f194928a = vbvVar;
            r1v0Var.f194929b = hv31Var2;
            r1v0Var.f194932e = 2;
            Serializable serializableM76993b = m76993b(r1v0Var);
            if (serializableM76993b != serializable) {
                vbvVar2 = vbvVar;
                hv31Var = hv31Var2;
                objM96567o = serializableM76993b;
                ArrayList arrayList3 = new ArrayList((Collection) objM96567o);
                j6f.m52567Y(arrayList3, new i8u0(vbvVar2, 19));
                arrayList3.add(0, vbvVar2);
                List<vbv> listM43714b2 = g6f.m43714b1(arrayList3, 15);
                arrayList = new ArrayList(i6f.m49804T(listM43714b2, 10));
                while (r9.hasNext()) {
                    arrayList.add(new z0v0(vbvVar3.f239585a, vbvVar3.f239586b));
                }
                lv31 lv31VarEdit2 = hv31Var.edit();
                lv31VarEdit2.m60051d(f204809e, this.f204811b.m41881b(this.f204813d, arrayList));
                lv31VarEdit2.m60054g();
                return w2a1.f247311a;
            }
            return serializable;
        } catch (Exception e) {
            Logger.m3967c(e, "ChatContentPicker: Failed to save recent search", new Object[0]);
        }
    }
}
