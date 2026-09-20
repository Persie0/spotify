package p204p;

import android.content.SharedPreferences;
import android.graphics.Matrix;
import com.google.android.recaptcha.internal.zzhg;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class c4d1 implements k1e, Init, kdl0, s4h1, oal0, k7l0, r9w0, rsg1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33926a;

    /* JADX INFO: renamed from: b */
    public Object f33927b;

    public /* synthetic */ c4d1(Object obj, int i) {
        this.f33926a = i;
        this.f33927b = obj;
    }

    @Override // p204p.k1e
    /* JADX INFO: renamed from: a */
    public void mo31129a() {
        ((gh00) this.f33927b).invoke(i5d1.f98899a);
    }

    @Override // p204p.r9w0
    public /* synthetic */ void accept(Object obj, Object obj2) {
        cbh1 cbh1Var = (cbh1) obj;
        ((gbf1) cbh1Var.m37438q()).m44221k2(((lkf1) this.f33927b).f134352l, gif1.m44803n());
        ((gbf1) cbh1Var.m37438q()).m44220j2(gif1.m44803n());
        ((ev61) obj2).m40097b(null);
    }

    @Override // p204p.k7l0
    /* JADX INFO: renamed from: b */
    public void mo31435b() {
        ((CountDownLatch) this.f33927b).countDown();
    }

    @Override // p204p.rsg1
    /* JADX INFO: renamed from: c */
    public Object mo31436c(String str, fbk fbkVar) {
        return ((C2011jd) this.f33927b).f111211a.getString(str, null);
    }

    @Override // p204p.rsg1
    /* JADX INFO: renamed from: d */
    public Object mo31437d(String str, String str2, fbk fbkVar) {
        Map mapM31821M = c95.m31821M(pft0.m69840u(str, str2));
        SharedPreferences.Editor editorEdit = ((C2011jd) this.f33927b).f111211a.edit();
        wj50.m88279p(editorEdit);
        for (Map.Entry entry : mapM31821M.entrySet()) {
            editorEdit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        editorEdit.commit();
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: e */
    public void m31438e(dxe1 dxe1Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-1063622525);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(dxe1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? xq00Var.m91766g(this) : xq00Var.m91770i(this) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            cxh0 cxh0Var = cxh0.f43038a;
            xq00Var2 = xq00Var;
            vig1.m85649d(cxh0Var, rkk.m75772x(436683446, new fcb1(2, gh00Var), xq00Var), null, null, rkk.m75772x(-1155026820, new bx61(dxe1Var, gh00Var, this, 15), xq00Var), xq00Var2, ((i3 >> 6) & 14) | 24624, 12);
            fxh0Var = cxh0Var;
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qce1(this, dxe1Var, gh00Var, fxh0Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m31439f(g7d1 g7d1Var) {
        b9k b9kVar = (b9k) this.f33927b;
        b9kVar.f24955a = g7d1Var;
        Iterator it = ((LinkedList) b9kVar.f24956b).iterator();
        while (it.hasNext()) {
            ((w3f1) it.next()).m87109a();
        }
        ((LinkedList) b9kVar.f24956b).clear();
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        j6d1 j6d1Var = (j6d1) obj;
        fs41 fs41Var = (fs41) this.f33927b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (j6d1Var.m52563b() == 1) {
            linkedHashSet.add(new l4d1(fs41Var.m42539a()));
        }
        if (j6d1Var.m52563b() == 1) {
            linkedHashSet.add(x4d1.f258068a);
            if (fs41Var.m42540b().getHasAudio()) {
                linkedHashSet.add(new o4d1(true));
            }
        }
        return First.m15575c(j6d1Var, linkedHashSet);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public Object m31440g(String str, iff1 iff1Var, ibk ibkVar) throws zzhg {
        zog1 zog1Var;
        if (ibkVar instanceof zog1) {
            zog1Var = (zog1) ibkVar;
            int i = zog1Var.f284789c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zog1Var.f284789c = i - Integer.MIN_VALUE;
            } else {
                zog1Var = new zog1(this, ibkVar);
            }
        } else {
            zog1Var = new zog1(this, ibkVar);
        }
        Object objM45436a = zog1Var.f284787a;
        int i2 = zog1Var.f284789c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM45436a);
                gqg1 gqg1Var = (gqg1) this.f33927b;
                byte[] bArrM55800d = iff1Var.m55800d();
                zog1Var.f284789c = 1;
                objM45436a = gqg1Var.m45436a(str, bArrM55800d, zog1Var);
                yuk yukVar = yuk.f276404a;
                if (objM45436a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM45436a);
            }
            return ((jqg1) objM45436a).m54091b(kff1.m56263z());
        } catch (zzhg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzhg(zz11.f287826e2, zz11.f287781L0, e2.getMessage(), 8);
        }
    }

    @Override // p204p.oal0
    /* JADX INFO: renamed from: o */
    public void mo27479o(Exception exc) {
        ((CountDownLatch) this.f33927b).countDown();
    }

    @Override // p204p.kdl0
    public void onSuccess(Object obj) {
        switch (this.f33926a) {
            case 5:
                ((b8i) this.f33927b).invoke(obj);
                break;
            case 8:
                ((ev61) ((c4d1) this.f33927b).f33927b).f63172a.m92997r();
                break;
            default:
                ((CountDownLatch) this.f33927b).countDown();
                break;
        }
    }

    @Override // p204p.s4h1
    public Object zza(Object obj) {
        return new a171((f6h1) obj, (Matrix) this.f33927b);
    }

    public c4d1(int i) {
        this.f33926a = i;
        switch (i) {
            case 10:
                this.f33927b = new CountDownLatch(1);
                break;
            case 11:
            case 14:
            default:
                this.f33927b = new kqd1(0);
                break;
            case 12:
                break;
            case 13:
                this.f33927b = new y7h1();
                break;
            case 15:
                this.f33927b = new AtomicReference(null);
                break;
        }
    }
}
