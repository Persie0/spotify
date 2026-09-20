package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.checkout.proto.model.p044v1.proto.GetCheckoutPageResponse;
import com.spotify.concertpageview.p048v1.GetTicketingTimelineRequest;
import com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class e99 implements v4p0, Function, d3z0, dso0, lir, rdc1, dn6, g3e, l591, knx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57393a;

    /* JADX INFO: renamed from: b */
    public Object f57394b;

    public /* synthetic */ e99(Object obj, int i) {
        this.f57393a = i;
        this.f57394b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ HashMap m38222a(e99 e99Var) {
        return (HashMap) e99Var.f57394b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: d */
    public static final Object m38223d(e99 e99Var, MediaMetadataRetriever mediaMetadataRetriever, long j, ibk ibkVar) {
        qrb qrbVar;
        Bitmap frameAtTime;
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmap;
        int i;
        String string;
        e99Var.getClass();
        if (ibkVar instanceof qrb) {
            qrbVar = (qrb) ibkVar;
            int i2 = qrbVar.f191796f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrbVar.f191796f = i2 - Integer.MIN_VALUE;
            } else {
                qrbVar = new qrb(e99Var, ibkVar);
            }
        } else {
            qrbVar = new qrb(e99Var, ibkVar);
        }
        Object objM39086b = qrbVar.f191794d;
        int i3 = qrbVar.f191796f;
        w940 w940Var = null;
        if (i3 == 0) {
            bga.m29073P(objM39086b);
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(j);
            if (frameAtTime == null) {
                return null;
            }
            Bitmap bitmap2 = frameAtTime;
            while (true) {
                try {
                    if (bitmap2.getWidth() <= 1 && bitmap2.getHeight() <= 1) {
                        break;
                    }
                    Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmap2, Math.max(1, bitmap2.getWidth() / 2), Math.max(1, bitmap2.getHeight() / 2), true);
                    if (bitmap2 != frameAtTime) {
                        bitmap2.recycle();
                    }
                    bitmap2 = bitmapCreateScaledBitmap2;
                } catch (Throwable th) {
                    if (!frameAtTime.isRecycled()) {
                        frameAtTime.recycle();
                    }
                    throw th;
                }
            }
            int pixel = bitmap2.getPixel(0, 0);
            if (bitmap2 != frameAtTime) {
                bitmap2.recycle();
            }
            int iM75429D = rfg1.m75429D(rfg1.m75432b(pixel));
            if (frameAtTime.getWidth() > 1024 || frameAtTime.getHeight() > 1024) {
                float fMax = 1024 / Math.max(frameAtTime.getWidth(), frameAtTime.getHeight());
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, (int) (frameAtTime.getWidth() * fMax), (int) (frameAtTime.getHeight() * fMax), true);
                frameAtTime.recycle();
            } else {
                bitmapCreateScaledBitmap = frameAtTime;
            }
            try {
                ei9 ei9Var = (ei9) e99Var.f57394b;
                qrbVar.f191791a = frameAtTime;
                qrbVar.f191792b = bitmapCreateScaledBitmap;
                qrbVar.f191793c = iM75429D;
                qrbVar.f191796f = 1;
                objM39086b = ei9Var.m39086b(bitmapCreateScaledBitmap, Bitmap.CompressFormat.PNG, 100, qrbVar);
                yuk yukVar = yuk.f276404a;
                if (objM39086b == yukVar) {
                    return yukVar;
                }
                i = iM75429D;
                bitmap = bitmapCreateScaledBitmap;
            } catch (Throwable th2) {
                th = th2;
                bitmap = bitmapCreateScaledBitmap;
                bitmap.recycle();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = qrbVar.f191793c;
            bitmap = qrbVar.f191792b;
            frameAtTime = qrbVar.f191791a;
            try {
                bga.m29073P(objM39086b);
            } catch (Throwable th3) {
                th = th3;
                bitmap.recycle();
                throw th;
            }
        }
        Uri uri = (Uri) objM39086b;
        if (uri != null && (string = uri.toString()) != null) {
            w940Var = new w940(string, string, i);
        }
        bitmap.recycle();
        if (!frameAtTime.isRecycled()) {
            frameAtTime.recycle();
        }
        return w940Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f57393a) {
            case 5:
                Map map = (Map) obj;
                ConcurrentHashMap.KeySetView keySetView = ((wza) this.f57394b).f256544b;
                Boolean boolValueOf = Boolean.FALSE;
                Iterator it = keySetView.iterator();
                while (it.hasNext()) {
                    boolValueOf = Boolean.valueOf(map.keySet().contains((String) it.next()) || boolValueOf.booleanValue());
                }
                return boolValueOf;
            case 7:
                return new CompletableFromAction(new ok0(14, (hv31) obj, (ghb) this.f57394b));
            case 13:
                return new w8e(((e8e) this.f57394b).f57151c.f88442b, (GetCheckoutPageResponse) obj);
            case 16:
                w9r0 w9r0Var = ((a1f) this.f57394b).f11400e;
                return ((jrw) w9r0Var.f249253c).m54195a(ContextTrack.create(((u0f) obj).f225474a.f64885b.f108599a)).flatMapCompletable(new xuk0(w9r0Var, 29));
            case 21:
                return cxb.m34242g((cxb) this.f57394b, ((GetEntityResponse) obj).m15422n().m15411o().m15433s());
            default:
                return ((lt2) ((icl) this.f57394b).f100838b).m59856c().map(lew0.f132738S0).toObservable();
        }
    }

    @Override // p204p.dso0
    /* JADX INFO: renamed from: b */
    public cso0 mo36780b(d0w d0wVar, vvg1 vvg1Var, a5x0 a5x0Var) {
        bxb bxbVar = (bxb) this.f57394b;
        int iM80437o = ((tc5) bxbVar.f31814c).m80437o(d0wVar, ehf1.m38949o(d0wVar.f44079k, d0wVar.f44080l), a5x0Var);
        String str = d0wVar.f44069a;
        boolean zM30768N = bxb.m30768N(vvg1Var, str, (voc1) bxbVar.f31813b);
        boolean z = vvg1Var instanceof f1w;
        f1w f1wVar = z ? (f1w) vvg1Var : null;
        boolean z2 = false;
        if (f1wVar != null) {
            String str2 = f1wVar.f64982b;
            if (str2.length() > 0 && str2.equals(str)) {
                f1w f1wVar2 = z ? (f1w) vvg1Var : null;
                if (f1wVar2 != null ? f1wVar2.f64986f : false) {
                    z2 = true;
                }
            }
        }
        return new cso0(iM80437o, ((long) bxb.m30769w(vvg1Var)) * 1000, zM30768N, z2);
    }

    @Override // p204p.d3z0
    /* JADX INFO: renamed from: c */
    public void mo31906c(String str) {
        icb icbVarM13294t0 = ((CallingCodePickerActivity) this.f57394b).m13294t0();
        if (str.length() > 0 && !icbVarM13294t0.f100773i) {
            icbVarM13294t0.f100773i = true;
            kv91 kv91Var = icbVarM13294t0.f100768d;
            cbh0 cbh0Var = icbVarM13294t0.f100771g;
            cbh0Var.getClass();
            yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("country_field", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            kv91Var.mo57452p(new av91("", "", new dv91("key_stroke", 1), new bv91("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()));
        }
        CallingCodePickerActivity callingCodePickerActivity = icbVarM13294t0.f100774j;
        if (callingCodePickerActivity != null) {
            y250 y250Var = callingCodePickerActivity.f5341d1;
            y250Var.getClass();
            y250Var.f268460t = str.toLowerCase(new Locale(ihf1.m50632p()));
            y250Var.m92690B();
        }
    }

    /* JADX INFO: renamed from: e */
    public dam m38224e() {
        return new dam(this);
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: f */
    public Bitmap mo33239f(Bitmap bitmap, Integer num, Integer num2) {
        ((m57) this.f57394b).getClass();
        int iM69888k = pgg1.m69888k(new geu(bitmap).m44523a());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixel(0, 0, iM69888k);
        return bitmapCreateBitmap;
    }

    @Override // p204p.dn6
    /* JADX INFO: renamed from: g */
    public Single mo25091g(Intent intent, e301 e301Var) {
        cj8 cj8Var = (cj8) this.f57394b;
        return vjf1.m85770t((luk) cj8Var.f38520d, new xha(cj8Var, intent, e301Var, null, 23)).onErrorReturn(oet.f164529N0).observeOn((Scheduler) cj8Var.f38518b);
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (LinearLayout) this.f57394b;
    }

    @Override // p204p.d3z0
    /* JADX INFO: renamed from: h */
    public boolean mo31910h() {
        return false;
    }

    @Override // p204p.knx0
    /* JADX INFO: renamed from: i */
    public Intent mo28051i(Intent intent) {
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(intent.getDataString());
        int i = CulturalMomentsStoryActivity.f3561e1;
        Context context = ((m2m) this.f57394b).f139380b;
        String strM35712j = dd41VarM74726U.m35712j();
        if (strM35712j == null) {
            strM35712j = "";
        }
        String strM35694A = dd41VarM74726U.m35694A();
        String str = strM35694A != null ? strM35694A : "";
        Intent intent2 = new Intent(context, (Class<?>) CulturalMomentsStoryActivity.class);
        intent2.setFlags(268435456);
        intent2.putExtra("cultural_moments.story.id", strM35712j);
        intent2.putExtra("cultural_moments.story.uri", str);
        return intent2;
    }

    /* JADX INFO: renamed from: j */
    public f5k m38225j(String str) {
        return new f5k("genalpha_block", (wwu) mru.f146615c, (c5k) null, Integer.valueOf(R.string.gen_alpha_blocking_context_menu_item), (String) null, false, (p221) null, new e5k(new y4k(2), 1, new d5k(iq9.f104693c, iq9.f104695d), new cn8(11, this, str)), 244);
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: k */
    public String mo33244k() {
        return "color_extract";
    }

    @Override // p204p.g3e
    /* JADX INFO: renamed from: l */
    public fiz mo28356l(boolean z) {
        return z ? ((dse) this.f57394b).f52554c.f195132a.m86024a("child-can-request-account-closure", false) : new ysk(Boolean.TRUE, 27);
    }

    /* JADX INFO: renamed from: m */
    public Object m38226m(vqb vqbVar, l1y l1yVar) {
        int i = vqbVar.f243911d;
        String str = vqbVar.f243909b;
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return Collections.singletonList(new w940(str, str, 0));
        }
        if (iM38547C == 1 || iM38547C == 2 || iM38547C == 3) {
            return x0h1.m89557A(tlp.f221498c, new rrb(str, this, null), l1yVar);
        }
        if (iM38547C == 4 || iM38547C == 5) {
            return lau.f131415a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n */
    public Single m38227n(String str) {
        return ((al9) this.f57394b).m26277a(str).map(wqb0.f253962M0);
    }

    /* JADX INFO: renamed from: o */
    public Object m38228o(String str, boolean z, g5i g5iVar) {
        vb10 vb10VarM7051p = GetTicketingTimelineRequest.m7051p();
        vb10VarM7051p.m85089q(str);
        vb10VarM7051p.m85088m(mje.CLIENT_CAPABILITY_EVENT_PAGE_TICKETING_TIMELINE_V1);
        if (z) {
            vb10VarM7051p.m85088m(mje.CLIENT_CAPABILITY_EVENT_PAGE_RESERVED_SHARE_V1);
        }
        return ((dfi) this.f57394b).m35895a((GetTicketingTimelineRequest) vb10VarM7051p.build(), g5iVar);
    }

    /* JADX INFO: renamed from: p */
    public void m38229p(rvw0 rvw0Var, Thread thread, Throwable th) {
        y7h1 y7h1VarMo1513e;
        v2l v2lVar = (v2l) this.f57394b;
        synchronized (v2lVar) {
            Objects.toString(th);
            thread.getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
            long jCurrentTimeMillis = System.currentTimeMillis();
            q4l q4lVar = (q4l) v2lVar.f236682e.f197471b;
            t2l t2lVar = new t2l(v2lVar, jCurrentTimeMillis, th, thread, rvw0Var);
            synchronized (q4lVar.f185236b) {
                y7h1VarMo1513e = q4lVar.f185237c.mo1513e(q4lVar.f185235a, new ori(t2lVar, 12));
                q4lVar.f185237c = y7h1VarMo1513e;
            }
            try {
                v0b1.m84373a(y7h1VarMo1513e);
            } catch (TimeoutException | Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m38230q(String str, String str2) {
        ((HashMap) this.f57394b).put(str, str2);
    }

    /* JADX INFO: renamed from: r */
    public Object m38231r(String str, cg9 cg9Var, hrs hrsVar) {
        Object objM56684z = kk40.m56684z(new wj0(str, cg9Var, this, (fbk) null), hrsVar);
        return objM56684z == yuk.f276404a ? objM56684z : w2a1.f247311a;
    }

    @Override // p204p.lir
    public boolean test(Object obj, Object obj2) {
        xt81 xt81Var = (xt81) obj;
        xt81 xt81Var2 = (xt81) obj2;
        if (xt81Var.f265800b == xt81Var2.f265800b) {
            e5x0 e5x0Var = xt81Var.f265801c;
            boolean z = e5x0Var.f56492c;
            e5x0 e5x0Var2 = xt81Var2.f265801c;
            if (z == e5x0Var2.f56492c && e5x0Var.f56490a == e5x0Var2.f56490a) {
                List list = xt81Var.f265799a;
                List list2 = xt81Var2.f265799a;
                Resources resources = (Resources) this.f57394b;
                if (list.size() == list2.size()) {
                    Iterator it = list.iterator();
                    Iterator it2 = list2.iterator();
                    ArrayList arrayList = new ArrayList(Math.min(i6f.m49804T(list, 10), i6f.m49804T(list2, 10)));
                    while (true) {
                        boolean z2 = false;
                        if (!it.hasNext() || !it2.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        ts81 ts81Var = (ts81) it2.next();
                        ts81 ts81Var2 = (ts81) next;
                        if (wj50.m88271j(ts81Var2.f223242a, ts81Var.f223242a) && wj50.m88271j(ts81Var2.f223244c.invoke(resources), ts81Var.f223244c.invoke(resources)) && ts81Var2.f223245d.invoke(resources).equals(ts81Var.f223245d.invoke(resources)) && wj50.m88271j(ts81Var2.f223246e, ts81Var.f223246e) && ts81Var2.f223248g == ts81Var.f223248g && ts81Var2.f223251j.equals(ts81Var.f223251j) && ts81Var2.f223252k == ts81Var.f223252k) {
                            z2 = true;
                        }
                        arrayList.add(Boolean.valueOf(z2));
                    }
                    if (!arrayList.contains(Boolean.FALSE)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public e99(int i) {
        this.f57393a = i;
        switch (i) {
            case 26:
                this.f57394b = new HashMap();
                break;
            case 27:
                break;
            default:
                this.f57394b = new l9g0(27);
                break;
        }
    }

    public e99(ei9 ei9Var) {
        this.f57393a = 8;
        tlp tlpVar = tlp.f221498c;
        this.f57394b = ei9Var;
    }

    public e99(eju ejuVar, z9j0 z9j0Var, k5m0 k5m0Var, ztz ztzVar, t2n t2nVar, s44 s44Var) {
        this.f57393a = 24;
        this.f57394b = ztzVar;
    }

    @Override // p204p.v4p0
    public void apply(long j) {
        i99 i99Var = (i99) this.f57394b;
        i99Var.f99950v1 = d99.m35349a(i99Var.f99950v1, null, j, false, false, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, null, null, 262141);
        ((wy3) i99Var.f99946r1).getClass();
        i99.m49977V(i99Var, System.currentTimeMillis(), null, 6);
    }
}
