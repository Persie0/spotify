package p204p;

import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xi70 {

    /* JADX INFO: renamed from: c */
    public static final fv31 f261785c;

    /* JADX INFO: renamed from: d */
    public static final fv31 f261786d;

    /* JADX INFO: renamed from: a */
    public final Single f261787a;

    /* JADX INFO: renamed from: b */
    public final fk60 f261788b;

    static {
        si5 si5Var = fv31.f73628b;
        f261785c = si5Var.m78183U("where_to_play_new_last_active_device_id");
        f261786d = si5Var.m78183U("where_to_play_active_device_history");
    }

    public xi70(Single single, fk60 fk60Var) {
        this.f261787a = single;
        this.f261788b = fk60Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m91087a(ibk ibkVar) {
        ui70 ui70Var;
        xi70 xi70Var;
        if (ibkVar instanceof ui70) {
            ui70Var = (ui70) ibkVar;
            int i = ui70Var.f230612d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ui70Var.f230612d = i - Integer.MIN_VALUE;
            } else {
                ui70Var = new ui70(this, ibkVar);
            }
        } else {
            ui70Var = new ui70(this, ibkVar);
        }
        Object objM96567o = ui70Var.f230610b;
        int i2 = ui70Var.f230612d;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            ui70Var.f230609a = this;
            ui70Var.f230612d = 1;
            objM96567o = zn91.m96567o(this.f261787a, ui70Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
            xi70Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xi70Var = ui70Var.f230609a;
            bga.m29073P(objM96567o);
        }
        List<jpn0> listM91089c = xi70Var.m91089c((hv31) objM96567o);
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM91089c, 10));
        for (jpn0 jpn0Var : listM91089c) {
            arrayList.add(new ea0(jpn0Var.m53971b(), jpn0Var.m53970a()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m91088b(ibk ibkVar) {
        vi70 vi70Var;
        if (ibkVar instanceof vi70) {
            vi70Var = (vi70) ibkVar;
            int i = vi70Var.f241638c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vi70Var.f241638c = i - Integer.MIN_VALUE;
            } else {
                vi70Var = new vi70(this, ibkVar);
            }
        } else {
            vi70Var = new vi70(this, ibkVar);
        }
        Object objM96567o = vi70Var.f241636a;
        int i2 = vi70Var.f241638c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            vi70Var.f241638c = 1;
            objM96567o = zn91.m96567o(this.f261787a, vi70Var);
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
        return ((hv31) objM96567o).mo48710e(f261785c, null);
    }

    /* JADX INFO: renamed from: c */
    public final List m91089c(hv31 hv31Var) {
        Object c6x0Var;
        String strMo48710e = hv31Var.mo48710e(f261786d, null);
        lau lauVar = lau.f131415a;
        if (strMo48710e == null) {
            return lauVar;
        }
        try {
            c6x0Var = ((gpn0) this.f261788b.m41880a(strMo48710e, gpn0.Companion.serializer())).m45375a();
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Object obj = lauVar;
        if (!(c6x0Var instanceof c6x0)) {
            obj = c6x0Var;
        }
        return (List) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m91090d(long j, String str, ibk ibkVar) {
        wi70 wi70Var;
        if (ibkVar instanceof wi70) {
            wi70Var = (wi70) ibkVar;
            int i = wi70Var.f251549e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wi70Var.f251549e = i - Integer.MIN_VALUE;
            } else {
                wi70Var = new wi70(this, ibkVar);
            }
        } else {
            wi70Var = new wi70(this, ibkVar);
        }
        Object objM96567o = wi70Var.f251547c;
        int i2 = wi70Var.f251549e;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            wi70Var.f251545a = str;
            wi70Var.f251546b = j;
            wi70Var.f251549e = 1;
            objM96567o = zn91.m96567o(this.f261787a, wi70Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = wi70Var.f251546b;
            str = wi70Var.f251545a;
            bga.m29073P(objM96567o);
        }
        hv31 hv31Var = (hv31) objM96567o;
        List listM91089c = m91089c(hv31Var);
        jpn0 jpn0Var = (jpn0) g6f.m43745s0(listM91089c);
        boolean zM88271j = wj50.m88271j(jpn0Var != null ? jpn0Var.m53971b() : null, str);
        w2a1 w2a1Var = w2a1.f247311a;
        if (zM88271j) {
            return w2a1Var;
        }
        ArrayList arrayListM43700N0 = g6f.m43700N0(listM91089c, geg1.m44518y(new jpn0(str, j)));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM43700N0) {
            if (hashSet.add(((jpn0) obj).m53971b())) {
                arrayList.add(obj);
            }
        }
        List listM43714b1 = g6f.m43714b1(arrayList, 2);
        lv31 lv31VarEdit = hv31Var.edit();
        lv31VarEdit.m60051d(f261785c, str);
        lv31VarEdit.m60051d(f261786d, this.f261788b.m41881b(gpn0.Companion.serializer(), new gpn0(listM43714b1)));
        lv31VarEdit.m60054g();
        g6f.m43753y0(listM43714b1, null, null, null, sg70.f208756e, 31);
        return w2a1Var;
    }
}
