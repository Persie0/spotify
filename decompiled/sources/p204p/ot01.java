package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.campfire.datasource.impl.proto.CreateGroupOptions;
import com.spotify.campfire.sharelist.impl.proto.C0463a;
import com.spotify.campfire.sharelist.impl.proto.C0464b;
import com.spotify.campfire.sharelist.impl.proto.ShareListRequest;
import com.spotify.campfire.sharelist.impl.proto.SharelistItem;
import com.spotify.campfire.sharelist.impl.proto.SharelistResponse;
import com.spotify.campfire.sharelist.impl.proto.SharelistUser;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class ot01 implements ft01 {

    /* JADX INFO: renamed from: a */
    public final ht01 f168934a;

    /* JADX INFO: renamed from: b */
    public final Observable f168935b;

    /* JADX INFO: renamed from: c */
    public final zrr0 f168936c;

    /* JADX INFO: renamed from: d */
    public final pgq0 f168937d;

    /* JADX INFO: renamed from: e */
    public final Context f168938e;

    /* JADX INFO: renamed from: f */
    public final ynb f168939f;

    /* JADX INFO: renamed from: g */
    public final j8a f168940g;

    public ot01(ht01 ht01Var, Observable observable, zrr0 zrr0Var, pgq0 pgq0Var, rt01 rt01Var, Context context, ynb ynbVar, j8a j8aVar) {
        this.f168934a = ht01Var;
        this.f168935b = observable;
        this.f168936c = zrr0Var;
        this.f168937d = pgq0Var;
        this.f168938e = context;
        this.f168939f = ynbVar;
        this.f168940g = j8aVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6 A[EDGE_INSN: B:56:0x00e6->B:48:0x00e6 BREAK  A[LOOP:0: B:39:0x00bb->B:58:0x00bb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r11 == r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
    
        if (r11 == r4) goto L53;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m67754b(ae50 ae50Var, boolean z, ibk ibkVar) {
        it01 it01Var;
        Map map;
        boolean z2;
        ae50 ae50Var2;
        Map map2;
        ArrayList arrayList;
        Iterator<E> it;
        String agentUri;
        SharelistItem sharelistItem;
        if (ibkVar instanceof it01) {
            it01Var = (it01) ibkVar;
            int i = it01Var.f105389f;
            if ((i & Integer.MIN_VALUE) != 0) {
                it01Var.f105389f = i - Integer.MIN_VALUE;
            } else {
                it01Var = new it01(this, ibkVar);
            }
        } else {
            it01Var = new it01(this, ibkVar);
        }
        Object objM96769g = it01Var.f105387d;
        int i2 = it01Var.f105389f;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                z = it01Var.f105386c;
                ae50Var = it01Var.f105384a;
                bga.m29073P(objM96769g);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map2 = it01Var.f105385b;
                bga.m29073P(objM96769g);
            }
            return kkc0.m56700m0(map2, (Map) objM96769g);
        }
        bga.m29073P(objM96769g);
        x401 x401Var = new x401();
        Iterator<E> it2 = ae50Var.iterator();
        while (it2.hasNext()) {
            SharelistItem sharelistItem2 = (SharelistItem) it2.next();
            if (sharelistItem2.hasUser() && (!z || !sharelistItem2.m5497o().m5509u())) {
                x401Var.add(sharelistItem2.m5497o().getUsername());
            } else if (sharelistItem2.hasGroup()) {
                x401Var.addAll(sharelistItem2.m5496n().m5493p());
            }
        }
        x401 x401VarM63425d = n0e1.m63425d(x401Var);
        if (x401VarM63425d.f257925a.isEmpty()) {
            map = nau.f152117a;
            z2 = z;
            ae50Var2 = ae50Var;
            map2 = map;
            if (z2) {
                arrayList = new ArrayList();
                it = ae50Var2.iterator();
                while (true) {
                    agentUri = null;
                    if (it.hasNext()) {
                        break;
                    }
                    sharelistItem = (SharelistItem) it.next();
                    if (sharelistItem.hasUser() && sharelistItem.m5497o().m5509u()) {
                        agentUri = sharelistItem.m5497o().getAgentUri();
                    }
                    if (agentUri != null) {
                        arrayList.add(agentUri);
                    }
                }
                if (!arrayList.isEmpty()) {
                    it01Var.f105384a = null;
                    it01Var.f105385b = map2;
                    it01Var.f105386c = z2;
                    it01Var.f105389f = 2;
                    objM96769g = this.f168937d.m69915o(arrayList, it01Var);
                }
            }
            return map2;
        }
        List listM43728j1 = g6f.m43728j1(x401VarM63425d);
        it01Var.f105384a = ae50Var;
        it01Var.f105386c = z;
        it01Var.f105389f = 1;
        objM96769g = this.f168936c.m96769g(listM43728j1, it01Var);
        return yukVar;
        map = (Map) objM96769g;
        z2 = z;
        ae50Var2 = ae50Var;
        map2 = map;
        if (z2) {
            arrayList = new ArrayList();
            it = ae50Var2.iterator();
            while (true) {
                agentUri = null;
                if (it.hasNext()) {
                    break;
                    break;
                }
                sharelistItem = (SharelistItem) it.next();
                if (sharelistItem.hasUser()) {
                    agentUri = sharelistItem.m5497o().getAgentUri();
                }
                if (agentUri != null) {
                    arrayList.add(agentUri);
                }
            }
            if (!arrayList.isEmpty()) {
                it01Var.f105384a = null;
                it01Var.f105385b = map2;
                it01Var.f105386c = z2;
                it01Var.f105389f = 2;
                objM96769g = this.f168937d.m69915o(arrayList, it01Var);
            }
        }
        return map2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m67755c(String str, ibk ibkVar) {
        jt01 jt01Var;
        pla1 pla1Var;
        boolean zM94241n;
        Object objM48567a;
        boolean z;
        pla1 pla1Var2;
        SharelistResponse sharelistResponse;
        ae50 ae50VarM5499o;
        Object objM67754b;
        ae50 ae50Var;
        pla1 pla1Var3;
        int iM5498n;
        if (ibkVar instanceof jt01) {
            jt01Var = (jt01) ibkVar;
            int i = jt01Var.f115683i;
            if ((i & Integer.MIN_VALUE) != 0) {
                jt01Var.f115683i = i - Integer.MIN_VALUE;
            } else {
                jt01Var = new jt01(this, ibkVar);
            }
        } else {
            jt01Var = new jt01(this, ibkVar);
        }
        Object objM96571q = jt01Var.f115681g;
        int i2 = jt01Var.f115683i;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            jt01Var.f115675a = str;
            jt01Var.f115683i = 1;
            objM96571q = zn91.m96571q(this.f168935b, 1, null, jt01Var);
            if (objM96571q != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = jt01Var.f115675a;
            bga.m29073P(objM96571q);
        } else {
            if (i2 == 2) {
                str = jt01Var.f115675a;
                bga.m29073P(objM96571q);
                pla1Var = (pla1) objM96571q;
                zM94241n = this.f168939f.m94241n();
                C0463a c0463aM5488p = ShareListRequest.m5488p();
                c0463aM5488p.m5514q(str);
                ShareListRequest shareListRequest = (ShareListRequest) c0463aM5488p.build();
                jt01Var.f115675a = null;
                jt01Var.f115676b = pla1Var;
                jt01Var.f115680f = zM94241n;
                jt01Var.f115683i = 3;
                objM48567a = this.f168934a.m48567a(shareListRequest, jt01Var);
                if (objM48567a != obj) {
                    objM96571q = objM48567a;
                    z = zM94241n;
                    pla1Var2 = pla1Var;
                    sharelistResponse = (SharelistResponse) objM96571q;
                    ae50VarM5499o = sharelistResponse.m5499o();
                    ae50 ae50VarM5499o2 = sharelistResponse.m5499o();
                    jt01Var.f115675a = null;
                    jt01Var.f115676b = pla1Var2;
                    jt01Var.f115677c = sharelistResponse;
                    jt01Var.f115678d = ae50VarM5499o;
                    jt01Var.f115679e = pla1Var2;
                    jt01Var.f115680f = z;
                    jt01Var.f115683i = 4;
                    objM67754b = m67754b(ae50VarM5499o2, z, jt01Var);
                    if (objM67754b != obj) {
                        ae50Var = ae50VarM5499o;
                        objM96571q = objM67754b;
                        pla1Var3 = pla1Var2;
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                z = jt01Var.f115680f;
                pla1Var2 = jt01Var.f115676b;
                bga.m29073P(objM96571q);
                sharelistResponse = (SharelistResponse) objM96571q;
                ae50VarM5499o = sharelistResponse.m5499o();
                ae50 ae50VarM5499o3 = sharelistResponse.m5499o();
                jt01Var.f115675a = null;
                jt01Var.f115676b = pla1Var2;
                jt01Var.f115677c = sharelistResponse;
                jt01Var.f115678d = ae50VarM5499o;
                jt01Var.f115679e = pla1Var2;
                jt01Var.f115680f = z;
                jt01Var.f115683i = 4;
                objM67754b = m67754b(ae50VarM5499o3, z, jt01Var);
                if (objM67754b != obj) {
                    ae50Var = ae50VarM5499o;
                    objM96571q = objM67754b;
                    pla1Var3 = pla1Var2;
                }
                return obj;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = jt01Var.f115680f;
            pla1Var2 = jt01Var.f115679e;
            ae50Var = jt01Var.f115678d;
            sharelistResponse = jt01Var.f115677c;
            pla1Var3 = jt01Var.f115676b;
            bga.m29073P(objM96571q);
        }
        ArrayList arrayListM73779b = qt01.m73779b(ae50Var, pla1Var2, (Map) objM96571q, this.f168938e.getResources(), z);
        boolean zM5500p = sharelistResponse.m5500p();
        if (sharelistResponse.m5501q() || sharelistResponse.m5498n() <= 2) {
            iM5498n = 10;
        } else {
            iM5498n = sharelistResponse.m5498n();
        }
        return new gt01(arrayListM73779b, zM5500p, iM5498n, pla1Var3);
        jt01Var.f115675a = str;
        jt01Var.f115683i = 2;
        objM96571q = m67759g((String) objM96571q, jt01Var);
        if (objM96571q != obj) {
            pla1Var = (pla1) objM96571q;
            zM94241n = this.f168939f.m94241n();
            C0463a c0463aM5488p2 = ShareListRequest.m5488p();
            c0463aM5488p2.m5514q(str);
            ShareListRequest shareListRequest2 = (ShareListRequest) c0463aM5488p2.build();
            jt01Var.f115675a = null;
            jt01Var.f115676b = pla1Var;
            jt01Var.f115680f = zM94241n;
            jt01Var.f115683i = 3;
            objM48567a = this.f168934a.m48567a(shareListRequest2, jt01Var);
            if (objM48567a != obj) {
                objM96571q = objM48567a;
                z = zM94241n;
                pla1Var2 = pla1Var;
                sharelistResponse = (SharelistResponse) objM96571q;
                ae50VarM5499o = sharelistResponse.m5499o();
                ae50 ae50VarM5499o4 = sharelistResponse.m5499o();
                jt01Var.f115675a = null;
                jt01Var.f115676b = pla1Var2;
                jt01Var.f115677c = sharelistResponse;
                jt01Var.f115678d = ae50VarM5499o;
                jt01Var.f115679e = pla1Var2;
                jt01Var.f115680f = z;
                jt01Var.f115683i = 4;
                objM67754b = m67754b(ae50VarM5499o4, z, jt01Var);
                if (objM67754b != obj) {
                    ae50Var = ae50VarM5499o;
                    objM96571q = objM67754b;
                    pla1Var3 = pla1Var2;
                    ArrayList arrayListM73779b2 = qt01.m73779b(ae50Var, pla1Var2, (Map) objM96571q, this.f168938e.getResources(), z);
                    boolean zM5500p2 = sharelistResponse.m5500p();
                    if (sharelistResponse.m5501q()) {
                        iM5498n = 10;
                    } else {
                        iM5498n = 10;
                    }
                    return new gt01(arrayListM73779b2, zM5500p2, iM5498n, pla1Var3);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m67756d(ibk ibkVar) {
        kt01 kt01Var;
        pla1 pla1Var;
        boolean zM94241n;
        Object objM48568b;
        pla1 pla1Var2;
        SharelistResponse sharelistResponse;
        ae50 ae50VarM5499o;
        Object objM67754b;
        pla1 pla1Var3;
        ae50 ae50Var;
        pla1 pla1Var4;
        CreateGroupOptions createGroupOptions;
        int iM5498n;
        String hierarchyId;
        if (ibkVar instanceof kt01) {
            kt01Var = (kt01) ibkVar;
            int i = kt01Var.f126109h;
            if ((i & Integer.MIN_VALUE) != 0) {
                kt01Var.f126109h = i - Integer.MIN_VALUE;
            } else {
                kt01Var = new kt01(this, ibkVar);
            }
        } else {
            kt01Var = new kt01(this, ibkVar);
        }
        Object objM96571q = kt01Var.f126107f;
        int i2 = kt01Var.f126109h;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            kt01Var.f126109h = 1;
            objM96571q = zn91.m96571q(this.f168935b, 1, null, kt01Var);
            if (objM96571q != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objM96571q);
        } else {
            if (i2 == 2) {
                bga.m29073P(objM96571q);
                pla1Var = (pla1) objM96571q;
                zM94241n = this.f168939f.m94241n();
                ShareListRequest shareListRequest = (ShareListRequest) ShareListRequest.m5488p().build();
                kt01Var.f126102a = pla1Var;
                kt01Var.f126106e = zM94241n;
                kt01Var.f126109h = 3;
                objM48568b = this.f168934a.m48568b(shareListRequest, kt01Var);
                if (objM48568b != obj) {
                    pla1Var2 = pla1Var;
                    objM96571q = objM48568b;
                    sharelistResponse = (SharelistResponse) objM96571q;
                    ae50VarM5499o = sharelistResponse.m5499o();
                    ae50 ae50VarM5499o2 = sharelistResponse.m5499o();
                    kt01Var.f126102a = pla1Var2;
                    kt01Var.f126103b = sharelistResponse;
                    kt01Var.f126104c = ae50VarM5499o;
                    kt01Var.f126105d = pla1Var2;
                    kt01Var.f126106e = zM94241n;
                    kt01Var.f126109h = 4;
                    objM67754b = m67754b(ae50VarM5499o2, zM94241n, kt01Var);
                    if (objM67754b != obj) {
                        pla1Var3 = pla1Var2;
                        ae50Var = ae50VarM5499o;
                        objM96571q = objM67754b;
                        pla1Var4 = pla1Var3;
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                zM94241n = kt01Var.f126106e;
                pla1Var2 = kt01Var.f126102a;
                bga.m29073P(objM96571q);
                sharelistResponse = (SharelistResponse) objM96571q;
                ae50VarM5499o = sharelistResponse.m5499o();
                ae50 ae50VarM5499o3 = sharelistResponse.m5499o();
                kt01Var.f126102a = pla1Var2;
                kt01Var.f126103b = sharelistResponse;
                kt01Var.f126104c = ae50VarM5499o;
                kt01Var.f126105d = pla1Var2;
                kt01Var.f126106e = zM94241n;
                kt01Var.f126109h = 4;
                objM67754b = m67754b(ae50VarM5499o3, zM94241n, kt01Var);
                if (objM67754b != obj) {
                    pla1Var3 = pla1Var2;
                    ae50Var = ae50VarM5499o;
                    objM96571q = objM67754b;
                    pla1Var4 = pla1Var3;
                }
                return obj;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zM94241n = kt01Var.f126106e;
            pla1Var3 = kt01Var.f126105d;
            ae50Var = kt01Var.f126104c;
            sharelistResponse = kt01Var.f126103b;
            pla1Var4 = kt01Var.f126102a;
            bga.m29073P(objM96571q);
        }
        ArrayList arrayListM73779b = qt01.m73779b(ae50Var, pla1Var3, (Map) objM96571q, this.f168938e.getResources(), zM94241n);
        if (sharelistResponse.hasCreateGroupOptions()) {
            createGroupOptions = sharelistResponse.getCreateGroupOptions();
        } else {
            createGroupOptions = null;
        }
        boolean zM5500p = sharelistResponse.m5500p();
        if (sharelistResponse.m5501q() || sharelistResponse.m5498n() <= 2) {
            iM5498n = 10;
        } else {
            iM5498n = sharelistResponse.m5498n();
        }
        gt01 gt01Var = new gt01(arrayListM73779b, zM5500p, iM5498n, pla1Var4);
        if (createGroupOptions != null) {
            hierarchyId = createGroupOptions.getHierarchyId();
        } else {
            hierarchyId = null;
        }
        return new s7l(hierarchyId, createGroupOptions != null ? createGroupOptions.getRequestToken() : null, gt01Var);
        kt01Var.f126109h = 2;
        objM96571q = m67759g((String) objM96571q, kt01Var);
        if (objM96571q != obj) {
            pla1Var = (pla1) objM96571q;
            zM94241n = this.f168939f.m94241n();
            ShareListRequest shareListRequest2 = (ShareListRequest) ShareListRequest.m5488p().build();
            kt01Var.f126102a = pla1Var;
            kt01Var.f126106e = zM94241n;
            kt01Var.f126109h = 3;
            objM48568b = this.f168934a.m48568b(shareListRequest2, kt01Var);
            if (objM48568b != obj) {
                pla1Var2 = pla1Var;
                objM96571q = objM48568b;
                sharelistResponse = (SharelistResponse) objM96571q;
                ae50VarM5499o = sharelistResponse.m5499o();
                ae50 ae50VarM5499o4 = sharelistResponse.m5499o();
                kt01Var.f126102a = pla1Var2;
                kt01Var.f126103b = sharelistResponse;
                kt01Var.f126104c = ae50VarM5499o;
                kt01Var.f126105d = pla1Var2;
                kt01Var.f126106e = zM94241n;
                kt01Var.f126109h = 4;
                objM67754b = m67754b(ae50VarM5499o4, zM94241n, kt01Var);
                if (objM67754b != obj) {
                    pla1Var3 = pla1Var2;
                    ae50Var = ae50VarM5499o;
                    objM96571q = objM67754b;
                    pla1Var4 = pla1Var3;
                    ArrayList arrayListM73779b2 = qt01.m73779b(ae50Var, pla1Var3, (Map) objM96571q, this.f168938e.getResources(), zM94241n);
                    if (sharelistResponse.hasCreateGroupOptions()) {
                        createGroupOptions = sharelistResponse.getCreateGroupOptions();
                    } else {
                        createGroupOptions = null;
                    }
                    boolean zM5500p2 = sharelistResponse.m5500p();
                    if (sharelistResponse.m5501q()) {
                        iM5498n = 10;
                    } else {
                        iM5498n = 10;
                    }
                    gt01 gt01Var2 = new gt01(arrayListM73779b2, zM5500p2, iM5498n, pla1Var4);
                    if (createGroupOptions != null) {
                        hierarchyId = createGroupOptions.getHierarchyId();
                    } else {
                        hierarchyId = null;
                    }
                    return new s7l(hierarchyId, createGroupOptions != null ? createGroupOptions.getRequestToken() : null, gt01Var2);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:105:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:111:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:35:0x0103  */
    /* JADX WARN: Code duplicated, block: B:36:0x010a  */
    /* JADX WARN: Code duplicated, block: B:38:0x010d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0115  */
    /* JADX WARN: Code duplicated, block: B:56:0x014d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0176  */
    /* JADX WARN: Code duplicated, block: B:64:0x0196  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x0200  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0235  */
    /* JADX WARN: Code duplicated, block: B:83:0x023a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0242  */
    /* JADX WARN: Code duplicated, block: B:86:0x024b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0262  */
    /* JADX WARN: Code duplicated, block: B:93:0x0275  */
    /* JADX WARN: Code duplicated, block: B:95:0x027b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0297  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a3  */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x024b, please report this as an issue */
    /* JADX INFO: renamed from: e */
    public final Object m67757e(dd41 dd41Var, int i, boolean z, String str, ibk ibkVar) {
        lt01 lt01Var;
        String str2;
        int i2;
        boolean z2;
        dd41 dd41Var2;
        int i3;
        String str3;
        pla1 pla1Var;
        boolean zM94241n;
        Object objM48569c;
        boolean z3;
        String str4;
        pla1 pla1Var2;
        int i4;
        SharelistResponse sharelistResponse;
        dd41 dd41VarM74726U;
        int i5;
        ae50 ae50VarM5499o;
        Object objM67754b;
        boolean z4;
        int i6;
        dd41 dd41Var3;
        ae50<SharelistItem> ae50Var;
        SharelistResponse sharelistResponse2;
        pla1 pla1Var3;
        dd41 dd41Var4;
        l44 l44Var;
        Map map;
        Resources resources;
        ArrayList arrayList;
        dd41 dd41Var5;
        int i7;
        List listM44506m;
        ro80 ro80VarM44508o;
        int i8;
        ro80 ro80VarM44508o2;
        int i9;
        Object objM73783f;
        pla1 pla1Var4;
        SharelistUser sharelistUserM5497o;
        String strM38566o;
        if (ibkVar instanceof lt01) {
            lt01Var = (lt01) ibkVar;
            int i10 = lt01Var.f136654L0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lt01Var.f136654L0 = i10 - Integer.MIN_VALUE;
            } else {
                lt01Var = new lt01(this, ibkVar);
            }
        } else {
            lt01Var = new lt01(this, ibkVar);
        }
        Object objM67759g = lt01Var.f136656Y;
        int i11 = lt01Var.f136654L0;
        ynb ynbVar = this.f168939f;
        int i12 = 0;
        String str5 = null;
        Object obj = yuk.f276404a;
        if (i11 == 0) {
            bga.m29073P(objM67759g);
            lt01Var.f136658a = dd41Var;
            str2 = str;
            lt01Var.f136659b = str2;
            i2 = i;
            lt01Var.f136665h = i2;
            z2 = z;
            lt01Var.f136667t = z2;
            lt01Var.f136654L0 = 1;
            Object objM96571q = zn91.m96571q(this.f168935b, 1, null, lt01Var);
            if (objM96571q != obj) {
                dd41Var2 = dd41Var;
                objM67759g = objM96571q;
            }
            return obj;
        }
        if (i11 == 1) {
            boolean z5 = lt01Var.f136667t;
            i2 = lt01Var.f136665h;
            String str6 = lt01Var.f136659b;
            dd41Var2 = lt01Var.f136658a;
            bga.m29073P(objM67759g);
            z2 = z5;
            str2 = str6;
        } else {
            if (i11 == 2) {
                boolean z6 = lt01Var.f136667t;
                i3 = lt01Var.f136665h;
                str3 = lt01Var.f136659b;
                dd41 dd41Var6 = lt01Var.f136658a;
                bga.m29073P(objM67759g);
                dd41Var2 = dd41Var6;
                z2 = z6;
                pla1Var = (pla1) objM67759g;
                zM94241n = ynbVar.m94241n();
                C0463a c0463aM5488p = ShareListRequest.m5488p();
                C0464b c0464bM5490o = ShareListRequest.ShareListFilter.m5490o();
                c0464bM5490o.m5515m(z2);
                c0463aM5488p.m5513m((ShareListRequest.ShareListFilter) c0464bM5490o.build());
                ShareListRequest shareListRequest = (ShareListRequest) c0463aM5488p.build();
                wj50.m88279p(shareListRequest);
                lt01Var.f136658a = dd41Var2;
                lt01Var.f136659b = str3;
                lt01Var.f136660c = pla1Var;
                lt01Var.f136665h = i3;
                lt01Var.f136667t = z2;
                lt01Var.f136655X = zM94241n;
                lt01Var.f136654L0 = 3;
                objM48569c = this.f168934a.m48569c(shareListRequest, lt01Var);
                if (objM48569c != obj) {
                    z3 = z2;
                    str4 = str3;
                    pla1Var2 = pla1Var;
                    objM67759g = objM48569c;
                    i4 = i3;
                    sharelistResponse = (SharelistResponse) objM67759g;
                    if (str4 != null) {
                        Set set = dd41.f47702f;
                        dd41VarM74726U = r46.m74726U(str4);
                    } else {
                        dd41VarM74726U = null;
                    }
                    if (dd41VarM74726U != null) {
                        l44Var = ynbVar.f274426a;
                        if (!l44Var.m58075h()) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                        }
                    } else {
                        i5 = 0;
                    }
                    ae50VarM5499o = sharelistResponse.m5499o();
                    ae50 ae50VarM5499o2 = sharelistResponse.m5499o();
                    lt01Var.f136658a = dd41Var2;
                    lt01Var.f136659b = null;
                    lt01Var.f136660c = pla1Var2;
                    lt01Var.f136661d = sharelistResponse;
                    lt01Var.f136662e = dd41VarM74726U;
                    lt01Var.f136663f = ae50VarM5499o;
                    lt01Var.f136664g = pla1Var2;
                    lt01Var.f136665h = i4;
                    lt01Var.f136667t = z3;
                    lt01Var.f136655X = zM94241n;
                    lt01Var.f136666i = i5;
                    lt01Var.f136654L0 = 4;
                    objM67754b = m67754b(ae50VarM5499o2, zM94241n, lt01Var);
                    if (objM67754b != obj) {
                        z4 = zM94241n;
                        i6 = i5;
                        dd41Var3 = dd41VarM74726U;
                        ae50Var = ae50VarM5499o;
                        sharelistResponse2 = sharelistResponse;
                        objM67759g = objM67754b;
                        pla1Var3 = pla1Var2;
                        dd41Var4 = dd41Var2;
                    }
                }
                return obj;
            }
            if (i11 == 3) {
                zM94241n = lt01Var.f136655X;
                z3 = lt01Var.f136667t;
                i3 = lt01Var.f136665h;
                pla1Var2 = lt01Var.f136660c;
                str4 = lt01Var.f136659b;
                dd41Var2 = lt01Var.f136658a;
                bga.m29073P(objM67759g);
                i4 = i3;
                sharelistResponse = (SharelistResponse) objM67759g;
                if (str4 != null) {
                    Set set2 = dd41.f47702f;
                    dd41VarM74726U = r46.m74726U(str4);
                } else {
                    dd41VarM74726U = null;
                }
                if (dd41VarM74726U != null) {
                    l44Var = ynbVar.f274426a;
                    if (!l44Var.m58075h() && l44Var.m58090o0() && this.f168940g.isEnabled()) {
                        Set set3 = mjd.f144234a;
                        String strM35717o = dd41VarM74726U.m35717o(1);
                        String strM35712j = dd41VarM74726U.m35712j();
                        if (dd41VarM74726U.f47709c == gn80.VTEC_FEATURE_WITH_DATA && g6f.m43725i0(mjd.f144234a, strM35717o) && strM35712j != null && !bm51.m29803n0(strM35712j, "share-", false)) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                    } else {
                        i5 = 0;
                    }
                } else {
                    i5 = 0;
                }
                ae50VarM5499o = sharelistResponse.m5499o();
                ae50 ae50VarM5499o3 = sharelistResponse.m5499o();
                lt01Var.f136658a = dd41Var2;
                lt01Var.f136659b = null;
                lt01Var.f136660c = pla1Var2;
                lt01Var.f136661d = sharelistResponse;
                lt01Var.f136662e = dd41VarM74726U;
                lt01Var.f136663f = ae50VarM5499o;
                lt01Var.f136664g = pla1Var2;
                lt01Var.f136665h = i4;
                lt01Var.f136667t = z3;
                lt01Var.f136655X = zM94241n;
                lt01Var.f136666i = i5;
                lt01Var.f136654L0 = 4;
                objM67754b = m67754b(ae50VarM5499o3, zM94241n, lt01Var);
                if (objM67754b != obj) {
                    z4 = zM94241n;
                    i6 = i5;
                    dd41Var3 = dd41VarM74726U;
                    ae50Var = ae50VarM5499o;
                    sharelistResponse2 = sharelistResponse;
                    objM67759g = objM67754b;
                    pla1Var3 = pla1Var2;
                    dd41Var4 = dd41Var2;
                }
                return obj;
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i6 = lt01Var.f136666i;
            z4 = lt01Var.f136655X;
            i4 = lt01Var.f136665h;
            pla1Var3 = lt01Var.f136664g;
            ae50Var = lt01Var.f136663f;
            dd41Var3 = lt01Var.f136662e;
            sharelistResponse2 = lt01Var.f136661d;
            pla1Var2 = lt01Var.f136660c;
            dd41Var4 = lt01Var.f136658a;
            bga.m29073P(objM67759g);
        }
        map = (Map) objM67759g;
        resources = this.f168938e.getResources();
        arrayList = new ArrayList();
        for (SharelistItem sharelistItem : ae50Var) {
            if (sharelistItem.hasUser()) {
                dd41Var4 = dd41Var4;
                if (sharelistItem.hasGroup()) {
                    objM73783f = qt01.m73783f(sharelistItem.m5496n(), pla1Var3, map, resources);
                } else {
                    i9 = 0;
                    Logger.m3966b("Unknown ShareListItem type: " + sharelistItem, new Object[0]);
                    objM73783f = null;
                }
                if (objM73783f != null) {
                    arrayList.add(objM73783f);
                }
                i12 = i9;
                str5 = null;
                dd41Var4 = dd41Var4;
            } else if (z4 || !sharelistItem.m5497o().m5509u()) {
                pla1Var4 = (pla1) map.get(sharelistItem.m5497o().getUsername());
                if (pla1Var4 != null) {
                    sharelistUserM5497o = sharelistItem.m5497o();
                    if (sharelistUserM5497o.m5503o().m5511o()) {
                        strM38566o = mjd.m61968d(6, sharelistUserM5497o.m5503o().getHierarchyId(), str5);
                    } else {
                        String hierarchyId = sharelistUserM5497o.m5503o().getHierarchyId();
                        String username = sharelistUserM5497o.getUsername();
                        Set set4 = mjd.f144234a;
                        strM38566o = edb.m38566o("spotify:chat:", hierarchyId, "?username=", Uri.encode(username));
                    }
                    objM73783f = new ubl0(pla1Var4, strM38566o, sharelistUserM5497o.m5504p(), qt01.m73784g(sharelistUserM5497o), qt01.m73781d(sharelistUserM5497o), qt01.m73782e(sharelistUserM5497o));
                } else {
                    dd41Var4 = dd41Var4;
                    objM73783f = null;
                }
            } else {
                pla1 pla1Var5 = (pla1) map.get(sharelistItem.m5497o().getAgentUri());
                if (pla1Var5 != null) {
                    objM73783f = qt01.m73778a(sharelistItem.m5497o(), pla1Var5);
                    dd41Var4 = dd41Var4;
                } else {
                    dd41Var4 = dd41Var4;
                    objM73783f = str5;
                }
            }
            i9 = 0;
            if (objM73783f != null) {
                arrayList.add(objM73783f);
            }
            i12 = i9;
            str5 = null;
            dd41Var4 = dd41Var4;
        }
        dd41Var5 = dd41Var4;
        i7 = i12;
        listM44506m = arrayList;
        if (i4 != -1) {
            if (arrayList.isEmpty()) {
                ro80VarM44508o2 = geg1.m44508o();
                ro80VarM44508o2.add(new rbl0(R.drawable.encore_icon_plus_24, R.string.on_platform_destination_invite_title, 3, mjd.m61970f(dd41Var5), true));
                if (i6 != 0) {
                    ro80VarM44508o2.add(rt01.m76358a(dd41Var3));
                }
                listM44506m = geg1.m44506m(ro80VarM44508o2);
            } else {
                ro80VarM44508o = geg1.m44508o();
                ro80VarM44508o.add(new tbl0(R.drawable.encore_icon_search_24, R.string.on_platform_destination_search_title, 3, mjd.m61970f(dd41Var5), true));
                if (i6 != 0) {
                    ro80VarM44508o.add(rt01.m76358a(dd41Var3));
                }
                ro80VarM44508o.add(new pbl0(R.drawable.encore_icon_group_24, R.string.on_platform_destination_create_group, 3, mjd.m61969e(dd41Var5), true));
                if (i4 < 0) {
                    i8 = i7;
                } else {
                    i8 = i4;
                }
                ro80VarM44508o.addAll(g6f.m43714b1(arrayList, i8));
                listM44506m = geg1.m44506m(ro80VarM44508o);
            }
        }
        return new gt01(listM44506m, sharelistResponse2.m5500p(), 10, pla1Var2);
        lt01Var.f136658a = dd41Var2;
        lt01Var.f136659b = str2;
        lt01Var.f136665h = i2;
        lt01Var.f136667t = z2;
        lt01Var.f136654L0 = 2;
        objM67759g = m67759g((String) objM67759g, lt01Var);
        if (objM67759g != obj) {
            i3 = i2;
            str3 = str2;
            pla1Var = (pla1) objM67759g;
            zM94241n = ynbVar.m94241n();
            C0463a c0463aM5488p2 = ShareListRequest.m5488p();
            C0464b c0464bM5490o2 = ShareListRequest.ShareListFilter.m5490o();
            c0464bM5490o2.m5515m(z2);
            c0463aM5488p2.m5513m((ShareListRequest.ShareListFilter) c0464bM5490o2.build());
            ShareListRequest shareListRequest2 = (ShareListRequest) c0463aM5488p2.build();
            wj50.m88279p(shareListRequest2);
            lt01Var.f136658a = dd41Var2;
            lt01Var.f136659b = str3;
            lt01Var.f136660c = pla1Var;
            lt01Var.f136665h = i3;
            lt01Var.f136667t = z2;
            lt01Var.f136655X = zM94241n;
            lt01Var.f136654L0 = 3;
            objM48569c = this.f168934a.m48569c(shareListRequest2, lt01Var);
            if (objM48569c != obj) {
                z3 = z2;
                str4 = str3;
                pla1Var2 = pla1Var;
                objM67759g = objM48569c;
                i4 = i3;
                sharelistResponse = (SharelistResponse) objM67759g;
                if (str4 != null) {
                    Set set5 = dd41.f47702f;
                    dd41VarM74726U = r46.m74726U(str4);
                } else {
                    dd41VarM74726U = null;
                }
                if (dd41VarM74726U != null) {
                    l44Var = ynbVar.f274426a;
                    if (!l44Var.m58075h()) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i5 = 0;
                }
                ae50VarM5499o = sharelistResponse.m5499o();
                ae50 ae50VarM5499o4 = sharelistResponse.m5499o();
                lt01Var.f136658a = dd41Var2;
                lt01Var.f136659b = null;
                lt01Var.f136660c = pla1Var2;
                lt01Var.f136661d = sharelistResponse;
                lt01Var.f136662e = dd41VarM74726U;
                lt01Var.f136663f = ae50VarM5499o;
                lt01Var.f136664g = pla1Var2;
                lt01Var.f136665h = i4;
                lt01Var.f136667t = z3;
                lt01Var.f136655X = zM94241n;
                lt01Var.f136666i = i5;
                lt01Var.f136654L0 = 4;
                objM67754b = m67754b(ae50VarM5499o4, zM94241n, lt01Var);
                if (objM67754b != obj) {
                    z4 = zM94241n;
                    i6 = i5;
                    dd41Var3 = dd41VarM74726U;
                    ae50Var = ae50VarM5499o;
                    sharelistResponse2 = sharelistResponse;
                    objM67759g = objM67754b;
                    pla1Var3 = pla1Var2;
                    dd41Var4 = dd41Var2;
                    map = (Map) objM67759g;
                    resources = this.f168938e.getResources();
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        if (sharelistItem.hasUser()) {
                            dd41Var4 = dd41Var4;
                            if (sharelistItem.hasGroup()) {
                                objM73783f = qt01.m73783f(sharelistItem.m5496n(), pla1Var3, map, resources);
                            } else {
                                i9 = 0;
                                Logger.m3966b("Unknown ShareListItem type: " + sharelistItem, new Object[0]);
                                objM73783f = null;
                            }
                            if (objM73783f != null) {
                                arrayList.add(objM73783f);
                            }
                            i12 = i9;
                            str5 = null;
                            dd41Var4 = dd41Var4;
                        } else if (z4) {
                            pla1Var4 = (pla1) map.get(sharelistItem.m5497o().getUsername());
                            if (pla1Var4 != null) {
                                sharelistUserM5497o = sharelistItem.m5497o();
                                if (sharelistUserM5497o.m5503o().m5511o()) {
                                    strM38566o = mjd.m61968d(6, sharelistUserM5497o.m5503o().getHierarchyId(), str5);
                                } else {
                                    String hierarchyId2 = sharelistUserM5497o.m5503o().getHierarchyId();
                                    String username2 = sharelistUserM5497o.getUsername();
                                    Set set6 = mjd.f144234a;
                                    strM38566o = edb.m38566o("spotify:chat:", hierarchyId2, "?username=", Uri.encode(username2));
                                }
                                objM73783f = new ubl0(pla1Var4, strM38566o, sharelistUserM5497o.m5504p(), qt01.m73784g(sharelistUserM5497o), qt01.m73781d(sharelistUserM5497o), qt01.m73782e(sharelistUserM5497o));
                            } else {
                                dd41Var4 = dd41Var4;
                                objM73783f = null;
                            }
                        } else {
                            pla1Var4 = (pla1) map.get(sharelistItem.m5497o().getUsername());
                            if (pla1Var4 != null) {
                                sharelistUserM5497o = sharelistItem.m5497o();
                                if (sharelistUserM5497o.m5503o().m5511o()) {
                                    strM38566o = mjd.m61968d(6, sharelistUserM5497o.m5503o().getHierarchyId(), str5);
                                } else {
                                    String hierarchyId3 = sharelistUserM5497o.m5503o().getHierarchyId();
                                    String username3 = sharelistUserM5497o.getUsername();
                                    Set set7 = mjd.f144234a;
                                    strM38566o = edb.m38566o("spotify:chat:", hierarchyId3, "?username=", Uri.encode(username3));
                                }
                                objM73783f = new ubl0(pla1Var4, strM38566o, sharelistUserM5497o.m5504p(), qt01.m73784g(sharelistUserM5497o), qt01.m73781d(sharelistUserM5497o), qt01.m73782e(sharelistUserM5497o));
                            } else {
                                dd41Var4 = dd41Var4;
                                objM73783f = null;
                            }
                        }
                        i9 = 0;
                        if (objM73783f != null) {
                            arrayList.add(objM73783f);
                        }
                        i12 = i9;
                        str5 = null;
                        dd41Var4 = dd41Var4;
                    }
                    dd41Var5 = dd41Var4;
                    i7 = i12;
                    listM44506m = arrayList;
                    if (i4 != -1) {
                        if (arrayList.isEmpty()) {
                            ro80VarM44508o2 = geg1.m44508o();
                            ro80VarM44508o2.add(new rbl0(R.drawable.encore_icon_plus_24, R.string.on_platform_destination_invite_title, 3, mjd.m61970f(dd41Var5), true));
                            if (i6 != 0) {
                                ro80VarM44508o2.add(rt01.m76358a(dd41Var3));
                            }
                            listM44506m = geg1.m44506m(ro80VarM44508o2);
                        } else {
                            ro80VarM44508o = geg1.m44508o();
                            ro80VarM44508o.add(new tbl0(R.drawable.encore_icon_search_24, R.string.on_platform_destination_search_title, 3, mjd.m61970f(dd41Var5), true));
                            if (i6 != 0) {
                                ro80VarM44508o.add(rt01.m76358a(dd41Var3));
                            }
                            ro80VarM44508o.add(new pbl0(R.drawable.encore_icon_group_24, R.string.on_platform_destination_create_group, 3, mjd.m61969e(dd41Var5), true));
                            if (i4 < 0) {
                                i8 = i7;
                            } else {
                                i8 = i4;
                            }
                            ro80VarM44508o.addAll(g6f.m43714b1(arrayList, i8));
                            listM44506m = geg1.m44506m(ro80VarM44508o);
                        }
                    }
                    return new gt01(listM44506m, sharelistResponse2.m5500p(), 10, pla1Var2);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x015c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0172  */
    /* JADX WARN: Code duplicated, block: B:64:0x017b  */
    /* JADX WARN: Code duplicated, block: B:75:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Serializable m67758f(ibk ibkVar) {
        mt01 mt01Var;
        boolean zM94241n;
        SharelistResponse sharelistResponse;
        Set set;
        Map map;
        ArrayList arrayList;
        pla1 pla1Var;
        ubl0 ubl0VarM73780c;
        SharelistItem sharelistItem;
        if (ibkVar instanceof mt01) {
            mt01Var = (mt01) ibkVar;
            int i = mt01Var.f146928f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mt01Var.f146928f = i - Integer.MIN_VALUE;
            } else {
                mt01Var = new mt01(this, ibkVar);
            }
        } else {
            mt01Var = new mt01(this, ibkVar);
        }
        Object objM48569c = mt01Var.f146926d;
        int i2 = mt01Var.f146928f;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM48569c);
            zM94241n = this.f168939f.m94241n();
            ShareListRequest shareListRequest = (ShareListRequest) ShareListRequest.m5488p().build();
            mt01Var.f146923a = zM94241n;
            mt01Var.f146928f = 1;
            objM48569c = this.f168934a.m48569c(shareListRequest, mt01Var);
            if (objM48569c != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            zM94241n = mt01Var.f146923a;
            bga.m29073P(objM48569c);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = mt01Var.f146925c;
            sharelistResponse = mt01Var.f146924b;
            bga.m29073P(objM48569c);
        }
        map = (Map) objM48569c;
        ae50 ae50VarM5499o = sharelistResponse.m5499o();
        ArrayList<SharelistItem> arrayList2 = new ArrayList();
        for (Object obj : ae50VarM5499o) {
            sharelistItem = (SharelistItem) obj;
            if (!sharelistItem.hasUser() && set.contains(sharelistItem.m5497o().getUsername())) {
                arrayList2.add(obj);
            }
        }
        arrayList = new ArrayList();
        for (SharelistItem sharelistItem2 : arrayList2) {
            pla1Var = (pla1) map.get(sharelistItem2.m5497o().getUsername());
            if (pla1Var != null) {
                ubl0VarM73780c = qt01.m73780c(sharelistItem2.m5497o(), pla1Var);
            } else {
                ubl0VarM73780c = null;
            }
            if (ubl0VarM73780c != null) {
                arrayList.add(ubl0VarM73780c);
            }
        }
        return arrayList;
        SharelistResponse sharelistResponse2 = (SharelistResponse) objM48569c;
        ae50 ae50VarM5499o2 = sharelistResponse2.m5499o();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : ae50VarM5499o2) {
            if (((SharelistItem) obj2).hasUser()) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            SharelistUser sharelistUserM5497o = ((SharelistItem) obj3).m5497o();
            boolean z = false;
            boolean z2 = sharelistUserM5497o.m5507s() == a6z0.SECTION_SUGGESTED;
            if (sharelistUserM5497o.m5507s() == a6z0.SECTION_ACTIVE && !sharelistUserM5497o.m5503o().m5512p()) {
                z = true;
            }
            if (z2 || z) {
                if (sharelistUserM5497o.m5508t() != kxa1.USER_STATUS_SUGGESTED_BUT_DISABLED) {
                    arrayList4.add(obj3);
                }
            }
        }
        ArrayList arrayList5 = new ArrayList(i6f.m49804T(arrayList4, 10));
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            arrayList5.add(((SharelistItem) it.next()).m5497o().getUsername());
        }
        Set setM43736n1 = g6f.m43736n1(arrayList5);
        List listM43728j1 = g6f.m43728j1(setM43736n1);
        mt01Var.f146924b = sharelistResponse2;
        mt01Var.f146925c = setM43736n1;
        mt01Var.f146923a = zM94241n;
        mt01Var.f146928f = 2;
        Object objM96769g = this.f168936c.m96769g(listM43728j1, mt01Var);
        if (objM96769g != yukVar) {
            sharelistResponse = sharelistResponse2;
            objM48569c = objM96769g;
            set = setM43736n1;
            map = (Map) objM48569c;
            ae50 ae50VarM5499o3 = sharelistResponse.m5499o();
            ArrayList<SharelistItem> arrayList6 = new ArrayList();
            while (r0.hasNext()) {
                sharelistItem = (SharelistItem) obj;
                if (!sharelistItem.hasUser()) {
                }
            }
            arrayList = new ArrayList();
            while (r1.hasNext()) {
                pla1Var = (pla1) map.get(sharelistItem2.m5497o().getUsername());
                if (pla1Var != null) {
                    ubl0VarM73780c = qt01.m73780c(sharelistItem2.m5497o(), pla1Var);
                } else {
                    ubl0VarM73780c = null;
                }
                if (ubl0VarM73780c != null) {
                    arrayList.add(ubl0VarM73780c);
                }
            }
            return arrayList;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m67759g(String str, ibk ibkVar) {
        nt01 nt01Var;
        if (ibkVar instanceof nt01) {
            nt01Var = (nt01) ibkVar;
            int i = nt01Var.f157949d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nt01Var.f157949d = i - Integer.MIN_VALUE;
            } else {
                nt01Var = new nt01(this, ibkVar);
            }
        } else {
            nt01Var = new nt01(this, ibkVar);
        }
        Object objM96769g = nt01Var.f157947b;
        int i2 = nt01Var.f157949d;
        if (i2 == 0) {
            bga.m29073P(objM96769g);
            List listSingletonList = Collections.singletonList(str);
            nt01Var.f157946a = str;
            nt01Var.f157949d = 1;
            objM96769g = this.f168936c.m96769g(listSingletonList, nt01Var);
            yuk yukVar = yuk.f276404a;
            if (objM96769g == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = nt01Var.f157946a;
            bga.m29073P(objM96769g);
        }
        pla1 pla1Var = (pla1) ((Map) objM96769g).get(str);
        return pla1Var == null ? pla1.f178680f : pla1Var;
    }
}
