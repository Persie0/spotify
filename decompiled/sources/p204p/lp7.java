package p204p;

import android.content.Intent;
import android.os.Bundle;
import android.util.JsonReader;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.media3.common.VideoFrameProcessingException;
import com.spotify.interapp.model.AppProtocol$Context;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lp7 implements Predicate, Function, Init, yd10, suy0, w1j0, nqb, mb40, oxb, j4l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135647a;

    public /* synthetic */ lp7(int i) {
        this.f135647a = i;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ AutofillId m59591e(Object obj) {
        return (AutofillId) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ ContentCaptureSession m59592f(Object obj) {
        return (ContentCaptureSession) obj;
    }

    @Override // p204p.yd10, p204p.rxb1
    /* JADX INFO: renamed from: a */
    public void mo38874a(VideoFrameProcessingException videoFrameProcessingException) {
        yif1.m93810s("Exception caught by default BaseGlShaderProgram errorListener.", videoFrameProcessingException);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f135647a) {
            case 1:
                return new lq7((b040) obj);
            case 2:
                return new nq7((e301) obj);
            case 3:
                return new kq7((er7) obj);
            case 4:
                return new jq7((tzi) obj);
            case 11:
                HashMap map = new HashMap(1);
                if (!((Boolean) obj).booleanValue()) {
                    map.put("Cache-Control", String.format(Locale.getDefault(), "max-stale=%d", 604800L));
                }
                return map;
            default:
                qqm0 qqm0Var = (qqm0) obj;
                Object obj2 = qqm0Var.f191620a;
                Object obj3 = qqm0Var.f191621b;
                if (obj2 == null || obj3 == null) {
                    return AppProtocol$Context.f4294n;
                }
                PlayerState playerState = (PlayerState) qqm0Var.f191620a;
                playerState.getClass();
                return new AppProtocol$Context((v4j0) obj3, playerState);
        }
    }

    @Override // p204p.j4l
    /* JADX INFO: renamed from: b */
    public Object mo49677b(JsonReader jsonReader) throws IOException {
        yy7 yy7Var = new yy7();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    yy7Var.m94870f(jsonReader.nextString());
                    break;
                case "arch":
                    yy7Var.m94868d(jsonReader.nextString());
                    break;
                case "buildId":
                    yy7Var.m94869e(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return yy7Var.m94866a();
    }

    @Override // p204p.suy0
    /* JADX INFO: renamed from: c */
    public boolean mo59593c() {
        return false;
    }

    @Override // p204p.nqb
    public void cancel() {
    }

    /* JADX INFO: renamed from: d */
    public Object m59594d(Object obj, Object obj2) {
        l3n l3nVar = (l3n) obj;
        switch (this.f135647a) {
            case 16:
                l3nVar.getClass();
                ((cu50) obj2).getClass();
                return new kvc(0);
            case 17:
                l3nVar.getClass();
                ((cu50) obj2).getClass();
                return new nvc(0);
            case 18:
                l3nVar.getClass();
                ((cu50) obj2).getClass();
                return new pvc(0);
            case 19:
                esq esqVar = (esq) obj2;
                l3nVar.getClass();
                esqVar.getClass();
                pjm pjmVar = new pjm(4);
                pgo pgoVar = esqVar.f62453a;
                jg31.m53271i(pgoVar);
                kq80 kq80Var = esqVar.f62457e;
                jg31.m53271i(kq80Var);
                return new lqe(pgoVar, kq80Var, l3nVar.m58011d(), pjmVar);
            case 20:
                mrq mrqVar = (mrq) obj2;
                l3nVar.getClass();
                mrqVar.getClass();
                suj sujVar = new suj();
                sujVar.f214135a = mrqVar;
                sujVar.f214136b = l3nVar;
                sujVar.f214137c = new akm(sujVar, 22);
                return new zqe((akm) sujVar.f214137c);
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                l3nVar.getClass();
                ((cu50) obj2).getClass();
                return new pak(l3nVar.m58011d(), (vrm) be21.m28868a(new pjm(9)).get());
            case 25:
                orq orqVar = (orq) obj2;
                l3nVar.getClass();
                orqVar.getClass();
                return new g4k(orqVar, (trm) be21.m28868a(new pjm(7)).get());
            case 26:
                bsq bsqVar = (bsq) obj2;
                l3nVar.getClass();
                bsqVar.getClass();
                return new b7k(bsqVar, (trm) be21.m28868a(new pjm(8)).get());
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        int i = hg40.f91023c;
        return First.m15575c((tq7) obj, new zh21(yp7.f274864a));
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        String string = intent.getData().toString();
        Set set = dd41.f47702f;
        String strM35694A = r46.m74726U(string).m35694A();
        strM35694A.getClass();
        voc1 voc1VarM83614b = xoc1.f263950O.m83614b(strM35694A);
        Bundle bundle = new Bundle();
        bundle.putParcelable(ContextTrack.Metadata.KEY_ARTIST_URI, voc1VarM83614b);
        return new s1j0(bundle, eg9.class);
    }

    @Override // p204p.mb40
    /* JADX INFO: renamed from: i */
    public void mo55851i(nb40 nb40Var) throws Exception {
        try {
            ua40 ua40VarMo26025a = nb40Var.mo26025a();
            if (ua40VarMo26025a != null) {
                hxg1.m49006s();
                ua40VarMo26025a.toString();
                vie1.m85617F("CaptureNode");
                ua40VarMo26025a.close();
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // p204p.oxb
    public void onStopRecording() {
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return ((ehy0) obj) instanceof chy0;
    }

    public /* synthetic */ lp7(Object obj, int i) {
        this.f135647a = i;
    }
}
