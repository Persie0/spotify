package p204p;

import android.content.Context;
import com.spotify.listplatform.sortingimpl.ListSortingProto$ListSortingStore;
import com.spotify.listplatform.sortingimpl.ListSortingProto$UserSortOrders;
import com.spotify.listplatform.sortingimpl.SortingModel;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class u490 {

    /* JADX INFO: renamed from: a */
    public final String f226630a;

    /* JADX INFO: renamed from: b */
    public final o3e0 f226631b;

    /* JADX INFO: renamed from: c */
    public final wko f226632c;

    /* JADX INFO: renamed from: d */
    public final njp0 f226633d;

    public u490(Context context, String str, mjp0 mjp0Var, o3e0 o3e0Var) {
        this.f226630a = str;
        this.f226631b = o3e0Var;
        this.f226632c = (wko) v490.f237097b.m91366a(context, v490.f237096a[0]);
        this.f226633d = mjp0Var.mo61982a(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m82316a(String str, fbk fbkVar) {
        r490 r490Var;
        Map mapM13026r;
        if (fbkVar instanceof r490) {
            r490Var = (r490) fbkVar;
            int i = r490Var.f195704d;
            if ((i & Integer.MIN_VALUE) != 0) {
                r490Var.f195704d = i - Integer.MIN_VALUE;
            } else {
                r490Var = new r490(this, fbkVar);
            }
        } else {
            r490Var = new r490(this, fbkVar);
        }
        Object objM86755t = r490Var.f195702b;
        int i2 = r490Var.f195704d;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            fiz data = this.f226632c.getData();
            r490Var.f195701a = str;
            r490Var.f195704d = 1;
            objM86755t = vyf1.m86755t(data, r490Var);
            if (objM86755t != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
            return objM86755t;
        }
        str = r490Var.f195701a;
        bga.m29073P(objM86755t);
        ListSortingProto$UserSortOrders listSortingProto$UserSortOrders = (ListSortingProto$UserSortOrders) ((ListSortingProto$ListSortingStore) objM86755t).m13014p().get(this.f226630a);
        String str2 = (listSortingProto$UserSortOrders == null || (mapM13026r = listSortingProto$UserSortOrders.m13026r()) == null) ? null : (String) mapM13026r.get(str);
        if (str2 != null) {
            return ysj0.m94497l(str2, v490.m84639a(listSortingProto$UserSortOrders, str));
        }
        r490Var.f195701a = null;
        r490Var.f195704d = 2;
        Object objM82317b = m82317b(str, r490Var);
        return objM82317b == obj ? obj : objM82317b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m82317b(String str, ibk ibkVar) {
        s490 s490Var;
        i490 i490VarM70161a;
        Map map;
        if (ibkVar instanceof s490) {
            s490Var = (s490) ibkVar;
            int i = s490Var.f205522e;
            if ((i & Integer.MIN_VALUE) != 0) {
                s490Var.f205522e = i - Integer.MIN_VALUE;
            } else {
                s490Var = new s490(this, ibkVar);
            }
        } else {
            s490Var = new s490(this, ibkVar);
        }
        Object obj = s490Var.f205520c;
        int i2 = s490Var.f205522e;
        njp0 njp0Var = this.f226633d;
        if (i2 == 0) {
            bga.m29073P(obj);
            i490VarM70161a = ((pjp0) njp0Var).m70161a(str);
            if (!i490VarM70161a.equals(this.f226631b.invoke(str))) {
                s490Var.f205518a = str;
                s490Var.f205519b = i490VarM70161a;
                s490Var.f205522e = 1;
                Object objM82319d = m82319d(str, i490VarM70161a, s490Var);
                Object obj2 = yuk.f276404a;
                if (objM82319d == obj2) {
                    return obj2;
                }
            }
            return i490VarM70161a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i490 i490Var = s490Var.f205519b;
        String str2 = s490Var.f205518a;
        bga.m29073P(obj);
        i490VarM70161a = i490Var;
        str = str2;
        String json = null;
        pjp0 pjp0Var = njp0Var instanceof pjp0 ? (pjp0) njp0Var : null;
        if (pjp0Var != null) {
            wg61 wg61Var = pjp0Var.f178297c;
            fv31 fv31Var = pjp0.f178294e;
            s9k s9kVarM55351k = k47.m55351k(str);
            if (s9kVarM55351k != null && (map = ((SortingModel) wg61Var.getValue()).f5116a) != null && map.remove(s9kVarM55351k) != null) {
                try {
                    json = pjp0Var.f178298d.toJson((SortingModel) wg61Var.getValue());
                } catch (AssertionError e) {
                    na6.m63957e("Failed to write sorting for items: " + e);
                }
                if (json != null) {
                    lv31 lv31VarEdit = pjp0Var.f178296b.edit();
                    lv31VarEdit.m60051d(pjp0.f178294e, json);
                    lv31VarEdit.m60054g();
                }
            }
        }
        return i490VarM70161a;
    }

    /* JADX INFO: renamed from: c */
    public final fiz m82318c(String str) {
        return mvl0.m62953p(new zux(this.f226632c.getData(), this, str, 4));
    }

    /* JADX INFO: renamed from: d */
    public final Object m82319d(String str, i490 i490Var, ibk ibkVar) {
        Object objMo29190a = this.f226632c.mo29190a(new kp1(this, str, i490Var, null, 25), ibkVar);
        return objMo29190a == yuk.f276404a ? objMo29190a : w2a1.f247311a;
    }
}
