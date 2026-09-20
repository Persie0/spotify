package p204p;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.music.R;
import com.spotify.share.chatpreviews.core.impl.proto.Color;
import com.spotify.share.chatpreviews.core.impl.proto.Image;
import com.spotify.share.chatpreviews.core.impl.proto.ImageBytes;
import com.spotify.share.chatpreviews.core.impl.proto.ShareFormat;
import com.spotify.share.chatpreviews.core.impl.proto.UploadBackground;
import com.spotify.share.chatpreviews.core.impl.proto.UploadChatPreviewRequest;
import com.spotify.share.chatpreviews.core.impl.proto.UploadImage;
import com.spotify.share.chatpreviews.core.impl.proto.Video;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class gl8 implements g9f, v4p0, Function, qox, pc81, t6l0, bk20, lp3, ant, tst0 {

    /* JADX INFO: renamed from: c */
    public static gl8 f81016c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f81017a;

    /* JADX INFO: renamed from: b */
    public Object f81018b;

    public /* synthetic */ gl8(int i) {
        this.f81017a = i;
    }

    /* JADX INFO: renamed from: j */
    public static gl8 m45088j(Context context) {
        if (f81016c == null) {
            gl8 gl8Var = new gl8(4);
            gl8Var.f81018b = null;
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("branch.json")));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    gl8Var.f81018b = new JSONObject(sb.toString());
                } catch (FileNotFoundException unused) {
                }
            } catch (IOException e) {
                e.getMessage();
            } catch (JSONException e2) {
                e2.getMessage();
            }
            f81016c = gl8Var;
        }
        return f81016c;
    }

    @Override // p204p.g9f
    /* JADX INFO: renamed from: a */
    public void mo44024a(int i) {
        y8f y8fVar = (y8f) ((nh61) this.f81018b).f153887e;
        if (y8fVar != null) {
            y8fVar.mo46605a(i);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int i;
        switch (this.f81017a) {
            case 3:
                o070 o070Var = (o070) obj;
                int iM38547C = edb.m38547C(((wg9) this.f81018b).f251008b.m32750c(o070Var.f160255b, o070Var.f160257d, o070Var.f160256c));
                if (iM38547C != 0) {
                    i = 2;
                    if (iM38547C != 1 && iM38547C != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i = 3;
                }
                return Observable.just(new r070(i));
            case 10:
                return Collections.singletonMap(((e0c) this.f81018b).f54935a, (d3c) obj);
            case 13:
                return ((x3f) this.f81018b).f257804e.getString(R.string.snackbar_banned_track_hide_generic);
            case 19:
                return ((t7q) this.f81018b).m80241h((x4q0) obj);
            default:
                y5f y5fVar = (y5f) ((Map) obj).get(((j5m) this.f81018b).f109004c);
                return Boolean.valueOf(y5fVar != null ? y5fVar.f269418b : false);
        }
    }

    @Override // p204p.tst0
    /* JADX INFO: renamed from: b */
    public Flowable mo45089b() {
        Flowable flowableMo44814b = ((k8h0) ((d2n) this.f81018b).f44590e).mo44814b();
        jg31.m53271i(flowableMo44814b);
        return flowableMo44814b;
    }

    @Override // p204p.bk20
    /* JADX INFO: renamed from: c */
    public void mo29573c(yj20 yj20Var) {
        if (yj20Var.equals(uj20.f230868a)) {
            ((gh00) ((kqi0) this.f81018b).getValue()).invoke(knh.f124411a);
        }
    }

    @Override // p204p.lp3
    /* JADX INFO: renamed from: d */
    public void mo31098d(Bundle bundle) {
        ((ip3) ((gp3) this.f81018b)).m51227a("clx", "_ae", bundle);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public Object m45090e(lnd lndVar, String str, ibk ibkVar) {
        iod iodVar;
        lnd lndVar2;
        jea1 jea1Var;
        jea1 jea1Var2;
        lnd lndVar3;
        if (ibkVar instanceof iod) {
            iodVar = (iod) ibkVar;
            int i = iodVar.f104190g;
            if ((i & Integer.MIN_VALUE) != 0) {
                iodVar.f104190g = i - Integer.MIN_VALUE;
            } else {
                iodVar = new iod(this, ibkVar);
            }
        } else {
            iodVar = new iod(this, ibkVar);
        }
        Object objM45104s = iodVar.f104188e;
        int i2 = iodVar.f104190g;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM45104s);
            jea1 jea1VarM20991r = UploadChatPreviewRequest.m20991r();
            mnd mndVar = lndVar.f135144a;
            iodVar.f104184a = lndVar;
            iodVar.f104185b = str;
            iodVar.f104186c = jea1VarM20991r;
            iodVar.f104190g = 1;
            Object objM45103r = m45103r(mndVar, iodVar);
            if (objM45103r != obj) {
                lndVar2 = lndVar;
                jea1Var = jea1VarM20991r;
                objM45104s = objM45103r;
            }
            return obj;
        }
        if (i2 == 1) {
            jea1Var = iodVar.f104186c;
            str = iodVar.f104185b;
            lndVar2 = iodVar.f104184a;
            bga.m29073P(objM45104s);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jea1Var = iodVar.f104187d;
            jea1Var2 = iodVar.f104186c;
            lndVar3 = iodVar.f104184a;
            bga.m29073P(objM45104s);
        }
        jea1Var.m53089s((UploadImage) objM45104s);
        jea1Var = jea1Var2;
        lndVar2 = lndVar3;
        pr01 pr01Var = lndVar2.f135146c;
        or01 or01VarM20981o = ShareFormat.m20981o();
        or01VarM20981o.m67657m(pr01Var.f180461a.m91911g());
        jea1Var.m53088r((ShareFormat) or01VarM20981o.build());
        return jea1Var.build();
        jea1Var.m53086m((UploadBackground) objM45104s);
        jea1Var.m53087q(str);
        und undVar = lndVar2.f135145b;
        if (undVar != null) {
            iodVar.f104184a = lndVar2;
            iodVar.f104185b = null;
            iodVar.f104186c = jea1Var;
            iodVar.f104187d = jea1Var;
            iodVar.f104190g = 2;
            objM45104s = m45104s(undVar, iodVar);
            if (objM45104s != obj) {
                jea1Var2 = jea1Var;
                lndVar3 = lndVar2;
                jea1Var.m53089s((UploadImage) objM45104s);
                jea1Var = jea1Var2;
                lndVar2 = lndVar3;
            }
            return obj;
        }
        pr01 pr01Var2 = lndVar2.f135146c;
        or01 or01VarM20981o2 = ShareFormat.m20981o();
        or01VarM20981o2.m67657m(pr01Var2.f180461a.m91911g());
        jea1Var.m53088r((ShareFormat) or01VarM20981o2.build());
        return jea1Var.build();
    }

    @Override // p204p.qox
    /* JADX INFO: renamed from: f */
    public ioi0 mo25090f() {
        throw null;
    }

    @Override // p204p.tst0
    /* JADX INFO: renamed from: g */
    public kv91 mo45091g() {
        kv91 kv91VarMo44820g = ((k8h0) ((d2n) this.f81018b).f44590e).mo44820g();
        jg31.m53271i(kv91VarMo44820g);
        return kv91VarMo44820g;
    }

    @Override // p204p.tst0
    /* JADX INFO: renamed from: g0 */
    public ydk0 mo45092g0() {
        ydk0 ydk0VarMo44821g0 = ((k8h0) ((d2n) this.f81018b).f44590e).mo44821g0();
        jg31.m53271i(ydk0VarMo44821g0);
        return ydk0VarMo44821g0;
    }

    /* JADX INFO: renamed from: h */
    public String m45093h() {
        JSONObject jSONObject = (JSONObject) this.f81018b;
        String string = null;
        if (!m45100o(1) && (!m45100o(3) || !m45100o(2) || !m45100o(4))) {
            return null;
        }
        try {
            if (m45100o(1)) {
                return jSONObject.getString("branchKey");
            }
            if (!m45096k().booleanValue()) {
                if (!m45100o(3)) {
                    return null;
                }
                try {
                    string = jSONObject.getString("liveKey");
                    return string;
                } catch (JSONException e) {
                    e.getMessage();
                    return null;
                }
            }
            if (jSONObject == null) {
                return null;
            }
            try {
                if (!jSONObject.has("testKey")) {
                    return null;
                }
                string = jSONObject.getString("testKey");
                return string;
            } catch (JSONException e2) {
                e2.getMessage();
                return null;
            }
            e.getMessage();
            return string;
        } catch (JSONException e3) {
            e3.getMessage();
            return string;
        }
    }

    @Override // p204p.tst0
    /* JADX INFO: renamed from: i0 */
    public tfm0 mo45094i0() {
        return ((k8h0) ((d2n) this.f81018b).f44590e).mo44825i0();
    }

    @Override // p204p.tst0
    /* JADX INFO: renamed from: j0 */
    public x54 mo45095j0() {
        return ((k8h0) ((d2n) this.f81018b).f44590e).mo44827j0();
    }

    /* JADX INFO: renamed from: k */
    public Boolean m45096k() {
        if (!m45100o(4)) {
            return null;
        }
        try {
            return Boolean.valueOf(((JSONObject) this.f81018b).getBoolean("useTestInstance"));
        } catch (JSONException e) {
            e.getMessage();
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: l */
    public x1e1 m45097l() {
        return (gz70) this.f81018b;
    }

    @Override // p204p.tst0
    /* JADX INFO: renamed from: m */
    public q831 mo45098m() {
        q831 q831VarMo44832m = ((k8h0) ((d2n) this.f81018b).f44590e).mo44832m();
        jg31.m53271i(q831VarMo44832m);
        return q831VarMo44832m;
    }

    /* JADX INFO: renamed from: n */
    public boolean m45099n() {
        return ((JSONObject) this.f81018b) != null;
    }

    /* JADX INFO: renamed from: o */
    public boolean m45100o(int i) {
        String str;
        JSONObject jSONObject = (JSONObject) this.f81018b;
        if (jSONObject == null) {
            return false;
        }
        switch (i) {
            case 1:
                str = "branchKey";
                break;
            case 2:
                str = "testKey";
                break;
            case 3:
                str = "liveKey";
                break;
            case 4:
                str = "useTestInstance";
                break;
            case 5:
                str = "enableLogging";
                break;
            case 6:
                str = "deferInitForPluginRuntime";
                break;
            case 7:
                str = "apiUrl";
                break;
            case 8:
                str = "fbAppId";
                break;
            case 9:
                str = "cppLevel";
                break;
            case 10:
                str = "installReferrerFetchTimeout";
                break;
            default:
                throw null;
        }
        return jSONObject.has(str);
    }

    /* JADX INFO: renamed from: p */
    public void m45101p(CaptureRequest.Key key, Object obj) {
        ((lpi0) this.f81018b).m59674w(sdb.m77825m0(key), nhi.f154012b, obj);
    }

    /* JADX INFO: renamed from: q */
    public void m45102q(String str, String str2, d850 d850Var, vaz0 vaz0Var) {
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        cqj0 cqj0Var = null;
        boolean z4 = false;
        ((v5k) ((t5k) this.f81018b)).m84731a(new uy2(str, new voc1(str2), str2, new h23(z, z2, z3, cqj0Var, str, z4, 0, false, false, vaz0Var, false, null, 226549)), d850Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public Object m45103r(mnd mndVar, ibk ibkVar) throws IOException {
        jod jodVar;
        mnd mndVar2;
        hea1 hea1Var;
        if (ibkVar instanceof jod) {
            jodVar = (jod) ibkVar;
            int i = jodVar.f114392e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jodVar.f114392e = i - Integer.MIN_VALUE;
            } else {
                jodVar = new jod(this, ibkVar);
            }
        } else {
            jodVar = new jod(this, ibkVar);
        }
        Object objM45104s = jodVar.f114390c;
        int i2 = jodVar.f114392e;
        if (i2 == 0) {
            bga.m29073P(objM45104s);
            ckf1 ckf1Var = mndVar.f145405a;
            String str = mndVar.f145406b.f270516a;
            if (ckf1Var instanceof tnd) {
                hea1 hea1VarM20986r = UploadBackground.m20986r();
                tnd tndVar = (tnd) ckf1Var;
                l6f l6fVarM20974p = Color.m20974p();
                l6fVarM20974p.m58335m(String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(tndVar.f221944j)}, 1)));
                l6fVarM20974p.m58336q(String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(tndVar.f221945k.intValue())}, 1)));
                hea1VarM20986r.m47298q((Color) l6fVarM20974p.build());
                hea1VarM20986r.m47297m(str);
                return (UploadBackground) hea1VarM20986r.build();
            }
            if (!(ckf1Var instanceof und)) {
                if (!(ckf1Var instanceof vnd)) {
                    throw new NoWhenBranchMatchedException();
                }
                Uri uri = ((vnd) ckf1Var).f243060j;
                if (xuf1.m92171j(uri)) {
                    throw new IllegalArgumentException(("Cannot upload local view as chat preview - " + uri).toString());
                }
                hea1 hea1VarM20986r2 = UploadBackground.m20986r();
                dhb1 dhb1VarM20997o = Video.m20997o();
                dhb1VarM20997o.m36008m(uri.toString());
                hea1VarM20986r2.m47300s((Video) dhb1VarM20997o.build());
                hea1VarM20986r2.m47297m(str);
                return (UploadBackground) hea1VarM20986r2.build();
            }
            hea1 hea1VarM20986r3 = UploadBackground.m20986r();
            jodVar.f114388a = mndVar;
            jodVar.f114389b = hea1VarM20986r3;
            jodVar.f114392e = 1;
            objM45104s = m45104s((und) ckf1Var, jodVar);
            Object obj = yuk.f276404a;
            if (objM45104s == obj) {
                return obj;
            }
            mndVar2 = mndVar;
            hea1Var = hea1VarM20986r3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hea1Var = jodVar.f114389b;
            mndVar2 = jodVar.f114388a;
            bga.m29073P(objM45104s);
        }
        hea1Var.m47299r((UploadImage) objM45104s);
        hea1Var.m47297m(mndVar2.f145406b.f270516a);
        return (UploadBackground) hea1Var.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public Object m45104s(und undVar, ibk ibkVar) throws IOException {
        kod kodVar;
        if (ibkVar instanceof kod) {
            kodVar = (kod) ibkVar;
            int i = kodVar.f124766c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kodVar.f124766c = i - Integer.MIN_VALUE;
            } else {
                kodVar = new kod(this, ibkVar);
            }
        } else {
            kodVar = new kod(this, ibkVar);
        }
        Object objM62589j = kodVar.f124764a;
        int i2 = kodVar.f124766c;
        if (i2 == 0) {
            bga.m29073P(objM62589j);
            Uri uri = undVar.f232150j;
            if (!xuf1.m92171j(uri)) {
                tfa1 tfa1VarM20995p = UploadImage.m20995p();
                s240 s240VarM20976o = Image.m20976o();
                s240VarM20976o.m77033m(uri.toString());
                tfa1VarM20995p.m80638q((Image) s240VarM20976o.build());
                return (UploadImage) tfa1VarM20995p.build();
            }
            mqr mqrVar = (mqr) this.f81018b;
            kodVar.f124766c = 1;
            objM62589j = mqrVar.m62589j(uri, kodVar);
            yuk yukVar = yuk.f276404a;
            if (objM62589j == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62589j);
        }
        byte[] bArr = (byte[]) objM62589j;
        String strGuessContentTypeFromStream = URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(bArr));
        if (strGuessContentTypeFromStream == null) {
            strGuessContentTypeFromStream = "application/octet-stream";
        }
        tfa1 tfa1VarM20995p2 = UploadImage.m20995p();
        n440 n440VarM20979p = ImageBytes.m20979p();
        n440VarM20979p.m63653m(gva.m45886d(0, bArr, bArr.length));
        n440VarM20979p.m63654q(strGuessContentTypeFromStream);
        tfa1VarM20995p2.m80637m((ImageBytes) n440VarM20979p.build());
        return (UploadImage) tfa1VarM20995p2.build();
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f81017a) {
            case 21:
                jel jelVar = (jel) obj;
                cgl cglVar = (cgl) this.f81018b;
                u12 u12Var = cglVar.f37718T0;
                if (jelVar instanceof gel) {
                    ((BehaviorRetainingAppBarLayout) u12Var.f225648b).m1529e(false, false, true);
                    return;
                }
                if (!(jelVar instanceof hel)) {
                    if (!(jelVar instanceof iel)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((AppBarLayout.Behavior) ((BehaviorRetainingAppBarLayout) u12Var.f225648b).getBehavior()).m61964v(((iel) jelVar).f101433a);
                    return;
                } else {
                    if (cglVar.f37732c == null) {
                        ((BehaviorRetainingAppBarLayout) u12Var.f225648b).m1529e(true, ((hel) jelVar).f90452a, true);
                        return;
                    }
                    boolean z = ((hel) jelVar).f90452a;
                    BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) u12Var.f225650d;
                    inl0.m51135a(behaviorRetainingAppBarLayout, new gdb(behaviorRetainingAppBarLayout, cglVar, z, 1));
                    return;
                }
            case 28:
                j5p j5pVar = (j5p) this.f81018b;
                d03 d03Var = j5pVar.f109054e;
                ArrayList arrayList = new ArrayList();
                for (String str : (List) obj) {
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                int size = arrayList.size();
                List listSubList = arrayList;
                if (size > 3) {
                    listSubList = arrayList.subList(0, 3);
                }
                j5pVar.f109056g.setAdapter(new C2655zm(((ConstraintLayout) d03Var.f43726b).getContext(), listSubList, j5pVar.f109047Z));
                return;
            default:
                w9p w9pVar = (w9p) this.f81018b;
                w9pVar.f249223g.setContent(new fyf(new u9p(w9pVar, (rjl) obj, 3), true, -144433785));
                return;
        }
    }

    @Override // p204p.pc81
    /* JADX INFO: renamed from: u */
    public lkv0 mo45105u(ViewGroup viewGroup, Object obj, t9p0 t9p0Var, gxj0 gxj0Var) {
        c9n c9nVar = ((vsb) this.f81018b).f244399b;
        fiz fizVar = obj instanceof fiz ? (fiz) obj : null;
        switch (c9nVar.f35604a) {
            case 0:
                hmm hmmVar = (hmm) c9nVar.f35605b;
                ebn ebnVar = (ebn) hmmVar.f93000c;
                oe50 oe50Var = (oe50) ((son) ebnVar.f58032b.f273756b).f211804Vn.get();
                jg31.m53271i(oe50Var);
                px0 px0Var = new px0(new ci5((bji) ebnVar.f58044f.get()), 21);
                l89 l89Var = (l89) ((son) ebnVar.f58032b.f273756b).f211821Wd.get();
                jg31.m53271i(l89Var);
                ra9 ra9VarM94109y = ebnVar.f58032b.m94109y();
                jg31.m53271i(ra9VarM94109y);
                t2n t2nVar = (t2n) hmmVar.f93001d;
                qp0 qp0Var = new qp0((qre0) ((ebn) t2nVar.f216597f).f58001M.get());
                ebn ebnVar2 = (ebn) t2nVar.f216597f;
                C2529wd c2529wd = new C2529wd((Flowable) ebnVar2.f58059k.get(), (qre0) ebnVar2.f58001M.get());
                e940 e940VarM94055d0 = ebnVar.f58032b.m94055d0();
                jg31.m53271i(e940VarM94055d0);
                Random random = (Random) ((son) ((ebn) t2nVar.f216597f).f58032b.f273756b).f212251m2.get();
                jg31.m53271i(random);
                return new ctb(oe50Var, px0Var, l89Var, ra9VarM94109y, qp0Var, c2529wd, e940VarM94055d0, new jsa(random, 4), (hc80) ((h4t0) t2nVar.f216594c).get(), new ci5((bji) ebnVar.f58044f.get()), viewGroup, fizVar, gxj0Var);
            default:
                wfn wfnVar = (wfn) c9nVar.f35605b;
                son sonVar = wfnVar.f250873b;
                oe50 oe50Var2 = (oe50) sonVar.f211804Vn.get();
                px0 px0VarM78688G = sonVar.m78688G();
                l89 l89Var2 = (l89) sonVar.f211821Wd.get();
                ra9 ra9Var = (ra9) sonVar.f212012d9.get();
                rk0 rk0Var = (rk0) wfnVar.f250876e;
                qp0 qp0Var2 = new qp0((qre0) ((son) rk0Var.f199935c).f212305o2.get());
                son sonVar2 = (son) rk0Var.f199935c;
                return new ctb(oe50Var2, px0VarM78688G, l89Var2, ra9Var, qp0Var2, new C2529wd((Flowable) sonVar2.f211306D4.get(), (qre0) sonVar2.f212305o2.get()), (e940) sonVar.f211626P7.get(), new jsa((Random) ((son) rk0Var.f199935c).f212251m2.get(), 4), (hc80) ((h4t0) rk0Var.f199941i).get(), sonVar.m78670A(), viewGroup, fizVar, gxj0Var);
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        switch (this.f81017a) {
            case 12:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.f81018b;
                WeakHashMap weakHashMap = mec1.f142677a;
                swd1 swd1Var2 = collapsingToolbarLayout.getFitsSystemWindows() ? swd1Var : null;
                if (!Objects.equals(collapsingToolbarLayout.f1962Z0, swd1Var2)) {
                    collapsingToolbarLayout.f1962Z0 = swd1Var2;
                    collapsingToolbarLayout.requestLayout();
                }
                return swd1Var.f214650a.mo54432c();
            default:
                dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(519);
                ContentPickerFragment contentPickerFragment = (ContentPickerFragment) this.f81018b;
                e6a0 e6a0Var = contentPickerFragment.f2805L1;
                wj50.m88279p(e6a0Var);
                LinearLayout linearLayout = (LinearLayout) ((bmx) e6a0Var.f56599c).f28644b;
                linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), contentPickerFragment.m49721t0().getDimensionPixelSize(R.dimen.allboarding_action_button_padding) + dx40VarMo51806g.f53851d);
                e6a0 e6a0Var2 = contentPickerFragment.f2805L1;
                wj50.m88279p(e6a0Var2);
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) e6a0Var2.f56598b;
                coordinatorLayout.setPadding(dx40VarMo51806g.f53848a, coordinatorLayout.getPaddingTop(), dx40VarMo51806g.f53850c, coordinatorLayout.getPaddingBottom());
                return swd1.f214649b;
        }
    }

    public /* synthetic */ gl8(int i, Object obj, Object obj2) {
        this.f81017a = i;
        this.f81018b = obj;
    }

    public /* synthetic */ gl8(Object obj, int i) {
        this.f81017a = i;
        this.f81018b = obj;
    }

    public gl8() {
        this.f81017a = 7;
        this.f81018b = lpi0.m59671t();
    }

    @Override // p204p.v4p0
    public void apply(long j) {
        ia9.m50046W((ia9) this.f81018b, 4, Long.valueOf(j), 4);
    }
}
