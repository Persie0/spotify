package p204p;

import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class wgw0 {

    /* JADX INFO: renamed from: a */
    public final y3l0 f251192a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m88078a(mhl0 mhl0Var, ibk ibkVar) {
        vgw0 vgw0Var;
        if (ibkVar instanceof vgw0) {
            vgw0Var = (vgw0) ibkVar;
            int i = vgw0Var.f241332d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vgw0Var.f241332d = i - Integer.MIN_VALUE;
            } else {
                vgw0Var = new vgw0(this, ibkVar);
            }
        } else {
            vgw0Var = new vgw0(this, ibkVar);
        }
        Object obj = vgw0Var.f241330b;
        int i2 = vgw0Var.f241332d;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Completable completableM92768c = this.f251192a.m92768c(mhl0Var.f143834a, mhl0Var.f143835b);
                vgw0Var.f241329a = mhl0Var;
                vgw0Var.f241332d = 1;
                Object objM96565n = zn91.m96565n(completableM92768c, vgw0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mhl0Var = vgw0Var.f241329a;
                bga.m29073P(obj);
            }
            return new ejl0(mhl0Var.f143835b.f66136a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3966b(edb.m38564m("Remove download failed for: ", mhl0Var.f143834a), e2);
            return new kjl0(mhl0Var.f143834a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m88079b(nhl0 nhl0Var, ibk ibkVar) {
        zyw0 zyw0Var;
        Object next;
        if (ibkVar instanceof zyw0) {
            zyw0Var = (zyw0) ibkVar;
            int i = zyw0Var.f287692d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zyw0Var.f287692d = i - Integer.MIN_VALUE;
            } else {
                zyw0Var = new zyw0(this, ibkVar);
            }
        } else {
            zyw0Var = new zyw0(this, ibkVar);
        }
        Object objM96567o = zyw0Var.f287690b;
        int i2 = zyw0Var.f287692d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                if (!wl51.m88460J0(nhl0Var.f154029a)) {
                    Single map = this.f251192a.f268961a.callSingle("spotify.offline_esperanto.proto.Offline", "GetDevices", Empty.m1933n()).map(hcj0.f89820d).map(new mab0(new b5r[]{b5r.SMARTWATCH}, 11));
                    zyw0Var.f287689a = nhl0Var;
                    zyw0Var.f287692d = 1;
                    objM96567o = zn91.m96567o(map, zyw0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM96567o == yukVar) {
                        return yukVar;
                    }
                }
                return yil0.f273163a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nhl0Var = zyw0Var.f287689a;
            bga.m29073P(objM96567o);
            Iterator it = ((List) objM96567o).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!wj50.m88271j(((f5r) next).f66138c, nhl0Var.f154029a));
            f5r f5rVar = (f5r) next;
            if (f5rVar != null) {
                return new zil0(f5rVar);
            }
        } catch (Exception unused) {
        }
        return yil0.f273163a;
    }
}
