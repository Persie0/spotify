package p204p;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.spotify.base.java.logging.Logger;
import com.spotify.clientrestrictions.p046v1.RestrictedIntegrationsResponse;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.notifications.datasource.proto.GetPushNotificationContentRequest;
import com.spotify.notifications.datasource.proto.GetPushNotificationContentResponse;
import com.spotify.notifications.datasource.proto.MediaContent;
import com.spotify.searchview.proto.MainViewResponse;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import p196j$.net.URLEncoder;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class djs0 implements ant, InterfaceC2207oa, Function, Producer, wb70, SingleOnSubscribe, l591, r340, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49739a;

    /* JADX INFO: renamed from: b */
    public final Object f49740b;

    public /* synthetic */ djs0(Object obj, int i) {
        this.f49739a = i;
        this.f49740b = obj;
    }

    /* JADX INFO: renamed from: A */
    public void m36214A(gua guaVar, int i) {
        m36218b((gua) this.f49740b, z2t0.SIZE_DELIMITED.m95233a(i), l2t0.f129074b);
        m36233z(guaVar);
    }

    /* JADX INFO: renamed from: B */
    public void m36215B(int i, String str) {
        m36224p(str.getBytes(vuc.f244913a), i);
    }

    /* JADX INFO: renamed from: C */
    public void m36216C(String str) {
        m36223n(str.getBytes(vuc.f244913a));
    }

    /* JADX INFO: renamed from: a */
    public ye30 m36217a() {
        return new ye30((am71) this.f49740b, 2);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((kss0) this.f49740b).m57254e();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f49739a) {
            case 3:
                c9t0 c9t0Var = (c9t0) this.f49740b;
                Integer num = (Integer) ((gv31) obj).f84602a;
                int iIntValue = num != null ? num.intValue() : d9t0.f46899b.ordinal();
                c9t0Var.getClass();
                vc20 vc20Var = (vc20) bk5.m29587J0(iIntValue, vc20.values());
                return vc20Var == null ? vc20.f239646g : vc20Var;
            case 5:
                ArrayList arrayList = ((jmt0) this.f49740b).f113946c;
                int iM31820L = c95.m31820L(i6f.m49804T(arrayList, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(obj2, null);
                }
                return new tpt0(linkedHashMap);
            case 9:
                Boolean bool = (Boolean) obj;
                kgv0 kgv0Var = (kgv0) this.f49740b;
                return (!kgv0Var.f122468a.m92873H() || bool.booleanValue()) ? lau.f131415a : kgv0Var.f122470c.f91230a;
            case 10:
                ciq0 ciq0Var = (ciq0) obj;
                return ciq0Var instanceof aiq0 ? ((amv0) this.f49740b).f17206a.mo39110a() : Single.just(ciq0Var);
            case 11:
                return (hx00) ((abs0) this.f49740b).f14180d;
            case 14:
                return new lku0(((sju0) this.f49740b).f209932a, (Throwable) obj);
            case 20:
                return Observable.combineLatest(((w0j) obj).f246744b.f230608c.filter(u6j0.f227368Z), ((mcu0) this.f49740b).m61498e(), tnq0.f222050t);
            case 23:
                return ((tzy0) this.f49740b).m82077a((MainViewResponse) obj);
            case 25:
                return wyy0.m89383a((wyy0) this.f49740b, (Throwable) obj);
            case 26:
                return xgz0.m90940b((xgz0) this.f49740b, (lcf) obj);
            default:
                mx21 mx21Var = (mx21) obj;
                jx21 jx21Var = (jx21) this.f49740b;
                int i = mx21Var.f147937c;
                zxc zxcVar = mx21Var.f147938d;
                i031 i031Var = (i031) jx21Var;
                i031Var.getClass();
                return new CompletableFromAction(new al1(i031Var, i, zxcVar, 7)).m23308z(new yx21(true, mx21Var)).onErrorReturnItem(new yx21(false, mx21Var)).toObservable();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m36218b(gua guaVar, int i, l2t0 l2t0Var) {
        int iOrdinal = l2t0Var.ordinal();
        if (iOrdinal == 0) {
            long j = i;
            int i2 = gua.f84421c[Long.numberOfLeadingZeros(j)];
            guaVar.m45732b(i2 + 1);
            guaVar.m45731a(i2, j);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ((gua) this.f49740b).m45733c(Integer.reverseBytes(i));
            return;
        }
        int i3 = (i >> 31) ^ (i << 1);
        guaVar.m45732b(5);
        if ((i3 & (-128)) != 0) {
            long j2 = i3;
            guaVar.m45731a(gua.f84421c[Long.numberOfLeadingZeros(j2)], j2);
        } else {
            byte[] bArr = guaVar.f84422a;
            int i4 = guaVar.f84423b;
            guaVar.f84423b = i4 + 1;
            bArr[i4] = (byte) i3;
        }
    }

    @Override // p204p.r340
    /* JADX INFO: renamed from: d */
    public void mo36219d(u601 u601Var) {
        ody0 ody0Var = (ody0) this.f49740b;
        x0h1.m89578u(l5h1.m58232p(ody0Var.f164272a.getLifecycle()), ody0Var.f164280i, 0, new xay0(ody0Var, u601Var, null, 1), 2);
    }

    @Override // p204p.wb70
    /* JADX INFO: renamed from: e */
    public void mo34293e(qti0 qti0Var, Object obj) {
        kqu0 kqu0Var = (kqu0) this.f49740b;
        String strM73844b = qti0Var.m73844b();
        if ("k".equals(strM73844b)) {
            if (obj instanceof Integer) {
                jb70 jb70Var = (jb70) jb70.f110679b.get((Integer) obj);
                if (jb70Var == null) {
                    jb70Var = jb70.UNKNOWN;
                }
                kqu0Var.f125446g = jb70Var;
                return;
            }
            return;
        }
        if ("mv".equals(strM73844b)) {
            if (obj instanceof int[]) {
                kqu0Var.f125440a = (int[]) obj;
            }
        } else {
            if ("xs".equals(strM73844b)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    kqu0Var.f125441b = str;
                    return;
                }
                return;
            }
            if (!"xi".equals(strM73844b)) {
                "pn".equals(strM73844b);
            } else if (obj instanceof Integer) {
                kqu0Var.f125442c = ((Integer) obj).intValue();
            }
        }
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: f */
    public Bitmap mo33239f(Bitmap bitmap, Integer num, Integer num2) {
        int iIntValue = num != null ? num.intValue() : bitmap.getWidth();
        Integer num3 = (Integer) this.f49740b;
        float fIntValue = num3 != null ? num3.intValue() : iIntValue * 0.1f;
        Paint paint = new Paint(3);
        int iIntValue2 = num != null ? num.intValue() : bitmap.getWidth();
        int iIntValue3 = num2 != null ? num2.intValue() : bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue2, iIntValue3, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float fMax = (float) Math.max(((double) iIntValue2) / ((double) bitmap.getWidth()), ((double) iIntValue3) / ((double) bitmap.getHeight()));
        float f = 2;
        matrix.setTranslate((iIntValue2 - (bitmap.getWidth() * fMax)) / f, (iIntValue3 - (bitmap.getHeight() * fMax)) / f);
        matrix.preScale(fMax, fMax);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float[] fArr = {fIntValue, fIntValue, fIntValue, fIntValue, fIntValue, fIntValue, fIntValue, fIntValue};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: g */
    public void m36220g(gua guaVar, long j, l2t0 l2t0Var) {
        int iOrdinal = l2t0Var.ordinal();
        if (iOrdinal == 0) {
            int i = gua.f84421c[Long.numberOfLeadingZeros(j)];
            guaVar.m45732b(i + 1);
            guaVar.m45731a(i, j);
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ((gua) this.f49740b).m45734d(Long.reverseBytes(j));
        } else {
            long j2 = (j >> 63) ^ (j << 1);
            int i2 = gua.f84421c[Long.numberOfLeadingZeros(j2)];
            guaVar.m45732b(i2 + 1);
            guaVar.m45731a(i2, j2);
        }
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return new DispatcherWorker(((zqt0) this.f49740b).f285457d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: i */
    public Object m36221i(String str, String str2, ibk ibkVar) {
        pet0 pet0Var;
        if (ibkVar instanceof pet0) {
            pet0Var = (pet0) ibkVar;
            int i = pet0Var.f176847d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pet0Var.f176847d = i - Integer.MIN_VALUE;
            } else {
                pet0Var = new pet0(this, ibkVar);
            }
        } else {
            pet0Var = new pet0(this, ibkVar);
        }
        Object objM61594a = pet0Var.f176845b;
        int i2 = pet0Var.f176847d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM61594a);
                na10 na10VarM15965p = GetPushNotificationContentRequest.m15965p();
                na10VarM15965p.m63943q(str);
                na10VarM15965p.m63942m(str2);
                GetPushNotificationContentRequest getPushNotificationContentRequest = (GetPushNotificationContentRequest) na10VarM15965p.build();
                met0 met0Var = (met0) this.f49740b;
                wj50.m88279p(getPushNotificationContentRequest);
                pet0Var.f176844a = str;
                pet0Var.f176847d = 1;
                objM61594a = met0Var.m61594a(getPushNotificationContentRequest, pet0Var);
                yuk yukVar = yuk.f276404a;
                if (objM61594a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = pet0Var.f176844a;
                bga.m29073P(objM61594a);
            }
            GetPushNotificationContentResponse getPushNotificationContentResponse = (GetPushNotificationContentResponse) objM61594a;
            int i3 = oet0.f164558a[getPushNotificationContentResponse.m15966n().m15973n().ordinal()];
            if (i3 == 1) {
                return new let0(getPushNotificationContentResponse.m15966n().m15975q().m15977n());
            }
            if (i3 == 2) {
                MediaContent mediaContentM15974p = getPushNotificationContentResponse.m15966n().m15974p();
                return new ket0(mediaContentM15974p.m15971r(), mediaContentM15974p.getUrl(), mediaContentM15974p.m15969p(), mediaContentM15974p.m15970q(), mediaContentM15974p.m15968n());
            }
            Logger.m3973i("Notifications: unexpected content type " + getPushNotificationContentResponse.m15966n().m15973n() + " for " + str, new Object[0]);
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3974j(e2, edb.m38566o("Notifications: failed to fetch push notification content for ", str, ": ", e2.getMessage()), new Object[0]);
            return null;
        }
    }

    @Override // p204p.wb70
    /* JADX INFO: renamed from: j */
    public wb70 mo34298j(vfe vfeVar, qti0 qti0Var) {
        return null;
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: k */
    public String mo33244k() {
        return "rounded_corner(radius=" + ((Integer) this.f49740b) + ")";
    }

    @Override // p204p.wb70
    /* JADX INFO: renamed from: l */
    public xb70 mo34300l(qti0 qti0Var) {
        String strM73844b = qti0Var.m73844b();
        if ("d1".equals(strM73844b)) {
            return new iqu0(this, 0);
        }
        if ("d2".equals(strM73844b)) {
            return new iqu0(this, 1);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public Object m36222m(String str, String str2, String str3, ibk ibkVar) throws IOException {
        ecx0 ecx0Var;
        if (ibkVar instanceof ecx0) {
            ecx0Var = (ecx0) ibkVar;
            int i = ecx0Var.f58408c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ecx0Var.f58408c = i - Integer.MIN_VALUE;
            } else {
                ecx0Var = new ecx0(this, ibkVar);
            }
        } else {
            ecx0Var = new ecx0(this, ibkVar);
        }
        Object objM80983a = ecx0Var.f58406a;
        int i2 = ecx0Var.f58408c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM80983a);
                String strM29801l0 = bm51.m29801l0(URLEncoder.encode(str, "UTF-8"), "+", "%20");
                tje tjeVar = (tje) this.f49740b;
                ecx0Var.f58408c = 1;
                objM80983a = tjeVar.m80983a(str3, str2, strM29801l0, ecx0Var);
                yuk yukVar = yuk.f276404a;
                if (objM80983a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM80983a);
            }
            o2x0 o2x0Var = (o2x0) objM80983a;
            try {
                n2x0 n2x0Var = o2x0Var.f161171a;
                if (!n2x0Var.f149852O0) {
                    throw new HttpException(o2x0Var);
                }
                String str4 = n2x0Var.f149857a.f20037a.f177464i;
                p3x0 p3x0Var = (p3x0) o2x0Var.f161172b;
                if (p3x0Var != null) {
                    p3x0Var.close();
                }
                p3x0 p3x0Var2 = o2x0Var.f161173c;
                if (p3x0Var2 != null) {
                    p3x0Var2.close();
                }
                return str4;
            } catch (Throwable th) {
                p3x0 p3x0Var3 = (p3x0) o2x0Var.f161172b;
                if (p3x0Var3 != null) {
                    p3x0Var3.close();
                }
                p3x0 p3x0Var4 = o2x0Var.f161173c;
                if (p3x0Var4 != null) {
                    p3x0Var4.close();
                }
                throw th;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException("Cue audio request failed", e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m36223n(byte[] bArr) {
        gua guaVar = (gua) this.f49740b;
        m36218b(guaVar, bArr.length, l2t0.f129074b);
        int length = bArr.length;
        if (length == 0) {
            return;
        }
        guaVar.m45732b(length);
        bk5.m29625n0(guaVar.f84423b, 0, length, bArr, guaVar.f84422a);
        guaVar.f84423b += length;
    }

    /* JADX INFO: renamed from: p */
    public void m36224p(byte[] bArr, int i) {
        m36218b((gua) this.f49740b, z2t0.SIZE_DELIMITED.m95233a(i), l2t0.f129074b);
        m36223n(bArr);
    }

    /* JADX INFO: renamed from: q */
    public void m36225q(double d) {
        ((gua) this.f49740b).m45734d(Long.reverseBytes(Double.doubleToRawLongBits(d)));
    }

    /* JADX INFO: renamed from: r */
    public void m36226r(double d, int i) {
        gua guaVar = (gua) this.f49740b;
        m36218b(guaVar, z2t0.i64.m95233a(i), l2t0.f129074b);
        guaVar.m45734d(Long.reverseBytes(Double.doubleToRawLongBits(d)));
    }

    /* JADX INFO: renamed from: s */
    public void m36227s(float f) {
        ((gua) this.f49740b).m45733c(Integer.reverseBytes(Float.floatToRawIntBits(f)));
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        k7q0 k7q0Var = (k7q0) this.f49740b;
        if (singleEmitter.isDisposed()) {
            return;
        }
        File file = ((lqr) ((er70) k7q0Var.f120178b).get()).f136118a;
        if (!file.exists() || file.lastModified() == 0) {
            singleEmitter.onSuccess(j4x0.f108810a);
        }
        RestrictedIntegrationsResponse restrictedIntegrationsResponseM6799s = RestrictedIntegrationsResponse.m6799s(pxy.m71563W(file));
        wj50.m88279p(restrictedIntegrationsResponseM6799s);
        if (System.currentTimeMillis() - file.lastModified() >= restrictedIntegrationsResponseM6799s.m6800o() * ((long) 1000)) {
            singleEmitter.onSuccess(new i4x0(restrictedIntegrationsResponseM6799s));
        } else {
            singleEmitter.onSuccess(new k4x0(restrictedIntegrationsResponseM6799s));
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f49739a) {
            case 0:
                pqm0 pqm0Var = (pqm0) obj;
                x1p0 x1p0Var = (x1p0) this.f49740b;
                String str = (String) pqm0Var.f180350a;
                boolean zBooleanValue = ((Boolean) pqm0Var.f180351b).booleanValue();
                tw80 tw80Var = (tw80) x1p0Var.f257249d;
                ShapeableImageView shapeableImageView = (ShapeableImageView) tw80Var.f224367c;
                SeeMoreTextView seeMoreTextView = (SeeMoreTextView) tw80Var.f224369e;
                shapeableImageView.setVisibility((str == null || !zBooleanValue) ? 8 : 0);
                if (((InterfaceC2609yd) x1p0Var.f257248c).mo76359a(2)) {
                    ((ProgressBar) tw80Var.f224368d).setVisibility(zBooleanValue ? 0 : 8);
                }
                if (str != null) {
                    seeMoreTextView.animate().translationY(-(seeMoreTextView.getHeight() / 2)).alpha(0.0f).setDuration(450L).withEndAction(new cjs0(new uvp0(25, x1p0Var, str), 0)).start();
                } else {
                    seeMoreTextView.setVisibility(8);
                }
                seeMoreTextView.f3746t = new ajs0(x1p0Var, 1);
                return;
            case 15:
                dhr0 dhr0Var = (dhr0) obj;
                mqw0 mqw0Var = ((uqw0) this.f49740b).f233139a;
                if (((RadioGroup) mqw0Var.f146376t).getCheckedRadioButtonId() == -1) {
                    bhr0 bhr0Var = bhr0.f27231a;
                    if (wj50.m88271j(dhr0Var, bhr0Var)) {
                        return;
                    }
                    if (wj50.m88271j(dhr0Var, zgr0.f282699a)) {
                        ((MaterialRadioButton) mqw0Var.f146375i).setChecked(true);
                        return;
                    }
                    if (dhr0Var instanceof ahr0) {
                        String str2 = ((ahr0) dhr0Var).f15758a;
                        ((MaterialRadioButton) mqw0Var.f146373g).setChecked(true);
                        ((EditText) mqw0Var.f146371e).setText(str2);
                        return;
                    } else if (wj50.m88271j(dhr0Var, bhr0Var)) {
                        ((RadioGroup) mqw0Var.f146376t).clearCheck();
                        return;
                    } else {
                        if (!wj50.m88271j(dhr0Var, chr0.f38071a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((MaterialRadioButton) mqw0Var.f146374h).setChecked(true);
                        return;
                    }
                }
                return;
            default:
                ((be41) this.f49740b).m28874A((List) obj);
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        nn40 nn40Var;
        qko0 qko0Var = (qko0) obj;
        x4b x4bVar = ((exz0) this.f49740b).f63878e;
        wj50.m88279p(qko0Var);
        mqr mqrVar = (mqr) x4bVar.f258040e;
        String str = qko0Var.f189626a;
        boolean z = true;
        if (((e74) x4bVar.f258037b).m38033b()) {
            if (!((hg40) x4bVar.f258039d).contains(str)) {
                mqrVar.m62591l(qko0Var.m73136f(), 4);
                mqr.m62582m((mqr) x4bVar.f258040e, qko0Var.f189630e, qko0Var.f189626a, qko0Var.f189628c, qko0Var.f189627b, qko0Var.f189629d, SearchEndpointResponseKt.RESULT_ERROR, "UNAUTHORIZED_CLIENT_ID", null, 128);
                return false;
            }
            e74 e74Var = ((xi10) x4bVar.f258038c).f261745a;
            switch (str) {
                case "76642c7bcc9c466bb99a44ce206edbbe":
                    nn40Var = new nn40(e74Var.m38044m(), 11);
                    break;
                case "c2d7f5fe99d84e04b64cbc1d012d457a":
                    nn40Var = new nn40(e74Var.m38036e(), 11);
                    break;
                case "ce581542d24c47ff957d86f7e1b286ce":
                    nn40Var = new nn40(e74Var.m38039h(), 11);
                    break;
                case "3e3c91ea35fd41f8925d7bb68f07d3da":
                    nn40Var = new nn40(e74Var.m38052u(), 11);
                    break;
                case "a56a9ca4c3224149844c062bbebf64a4":
                    nn40Var = new nn40(e74Var.m38046o(), 11);
                    break;
                case "212b005bde914f2c97ab6f310c28ad98":
                    nn40Var = new nn40(e74Var.m38051t(), 11);
                    break;
                case "microsoft-surface-buds-legacy-client-id":
                    nn40Var = new nn40(e74Var.m38048q(), 11);
                    break;
                case "ddc0016fed8048ad8c61d32f69afb6f1":
                    nn40Var = new nn40(e74Var.m38055x(), 11);
                    break;
                case "c7204c31f95344a6872edd10937c12b3":
                    nn40Var = new nn40(e74Var.m38045n(), 11);
                    break;
                case "434d885d509143d9b772a0d46a9e5804":
                    nn40Var = new nn40(e74Var.m38047p(), 11);
                    break;
                case "82c4b4cd1a034256bd2a190cdcafdd0a":
                    nn40Var = new nn40(e74Var.m38050s(), 11);
                    break;
                case "3e46a9fbac3c4e14b342390f6dcbc9c1":
                    nn40Var = new nn40(e74Var.m38049r(), 11);
                    break;
                case "0f6ab2c3f985452a83b1609ce37afc65":
                    nn40Var = new nn40(e74Var.m38042k(), 11);
                    break;
                case "e11b1a8713164f739d2a9d9fed5a4c01":
                    nn40Var = new nn40(e74Var.m38041j(), 11);
                    break;
                case "bdbbbe571cef4b148a51a0defb957475":
                    nn40Var = new nn40(e74Var.m38043l(), 11);
                    break;
                case "2a1cd724fd0446d389b39036a6323547":
                    nn40Var = new nn40(e74Var.m38034c(), 11);
                    break;
                case "1d2cf25b1643474983fae381b00cea3c":
                    nn40Var = new nn40(e74Var.m38035d(), 11);
                    break;
                default:
                    nn40Var = new nn40(z, 11);
                    break;
            }
            if (!nn40Var.f156326b) {
                mqrVar.m62591l(qko0Var.m73136f(), 3);
                mqr.m62582m((mqr) x4bVar.f258040e, qko0Var.f189630e, qko0Var.f189626a, qko0Var.f189628c, qko0Var.f189627b, qko0Var.f189629d, SearchEndpointResponseKt.RESULT_ERROR, "DISABLED_CLIENT_ID", null, 128);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public void m36228u(float f, int i) {
        gua guaVar = (gua) this.f49740b;
        m36218b(guaVar, z2t0.i32.m95233a(i), l2t0.f129074b);
        guaVar.m45733c(Integer.reverseBytes(Float.floatToRawIntBits(f)));
    }

    /* JADX INFO: renamed from: v */
    public void m36229v(int i) {
        m36218b((gua) this.f49740b, i, l2t0.f129074b);
    }

    /* JADX INFO: renamed from: w */
    public void m36230w(int i, int i2, l2t0 l2t0Var) {
        gua guaVar = (gua) this.f49740b;
        m36218b(guaVar, (l2t0Var == l2t0.f129076d ? z2t0.i32 : z2t0.VARINT).m95233a(i2), l2t0.f129074b);
        m36218b(guaVar, i, l2t0Var);
    }

    /* JADX INFO: renamed from: x */
    public void m36231x(long j) {
        m36220g((gua) this.f49740b, j, l2t0.f129074b);
    }

    /* JADX INFO: renamed from: y */
    public void m36232y(long j, int i, l2t0 l2t0Var) {
        gua guaVar = (gua) this.f49740b;
        m36218b(guaVar, (l2t0Var == l2t0.f129076d ? z2t0.i64 : z2t0.VARINT).m95233a(i), l2t0.f129074b);
        m36220g(guaVar, j, l2t0Var);
    }

    /* JADX INFO: renamed from: z */
    public void m36233z(gua guaVar) {
        gua guaVar2 = (gua) this.f49740b;
        m36218b(guaVar2, guaVar.f84423b, l2t0.f129074b);
        int i = guaVar.f84423b;
        guaVar2.m45732b(i);
        bk5.m29625n0(guaVar2.f84423b, 0, i, guaVar.f84422a, guaVar2.f84422a);
        guaVar2.f84423b += i;
    }

    @Override // p204p.wb70
    /* JADX INFO: renamed from: c */
    public void mo34292c() {
    }

    @Override // p204p.wb70
    /* JADX INFO: renamed from: o */
    public void mo34303o(qti0 qti0Var, yfe yfeVar) {
    }

    @Override // p204p.wb70
    /* JADX INFO: renamed from: h */
    public void mo34296h(qti0 qti0Var, vfe vfeVar, qti0 qti0Var2) {
    }
}
